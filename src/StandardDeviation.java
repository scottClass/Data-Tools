
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
public class StandardDeviation {

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
            System.out.println("3. Flush data");
            System.out.println("4. Quit");
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

                    }
                }
            } else if (choice == 2) {
                //get the average first
                float sum = 0;
                for (float f : data) {
                    sum += f;
                }
                float mean = sum / numItems;
                //the sum of the upper half of the fraction
                float sSum = 0;
                for (float f : data) {
                    sSum += (f - mean) * (f - mean);
                }
                float sigma = sSum / (numItems - 1);
                sigma = (float) (Math.sqrt(sigma));
                System.out.println("The standard deveation of the data is " + sigma);
            } else if (choice == 3) {
                data.clear();
                numItems = 0;
            } else if (choice == 4) {
                System.exit(0);
            } else if (choice == 5) {
                for (float f : data) {
                    System.out.println(f);
                }
                System.out.println(numItems);
            } else {
                System.out.println("Enter a valid option");
            }
        }
    }

}
