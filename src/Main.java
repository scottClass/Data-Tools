
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Scott
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Float> data = new ArrayList<Float>();
        int numItems = 0;

        while (true) {
            System.out.println("1. Add data");
            System.out.println("2. Find standard deviation with data already entered");
            System.out.println("3. Find the Z-Score of a number in the data");
            System.out.println("4. Delete data");
            System.out.println("5. Quit");
            System.out.print(":: ");
            int choice = input.nextInt();

            if (choice == 1) {
                boolean done = false;
                System.out.println("Type -0 to Exit");
                while (!done) {
                    System.out.print("Enter a number to add to the data: ");
                    try {
                        float toAdd = input.nextFloat();
                        if (toAdd == -0) {
                            done = true;
                        } else {
                            data.add(toAdd);
                            numItems++;
                        }
                    } catch (Exception e) {
                        System.out.println("Input a valid entry");
                    }
                }
            } else if (choice == 2) {
                float sigma = StandardDeviation.findSigma(data, numItems);
                System.out.println("The standard deveation of the data is " + sigma);
            } else if (choice == 3) {
                //find z score
                if (numItems == 0) {
                    System.out.println("Opps! No data!");
                } else {
                    System.out.println("Enter the value of the data you want to find the Z Score of (The number"
                            + " entered has to be in the set of data)");
                    System.out.print(":: ");
                    float toZ = input.nextFloat();
                    boolean good = false;
                    for(float f : data) {
                        if (f == toZ) {
                            good = true;
                        }
                    }
                    //if the number entered is in the data
                    if(good) {
                        float zscore = ZScore.findZ(toZ, data, numItems);
                        System.out.println("The Z Score of " + toZ + " is " + zscore);
                    } else {
                        System.out.println("That number does not appear in the data!");
                    }
                }
            } else if (choice == 4) {
                data.clear();
                numItems = 0;
                System.out.println("Data Cleared");
            } else if (choice == 5) {
                System.exit(0);
            }
        }
    }
}
