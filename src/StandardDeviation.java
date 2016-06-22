
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
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

            switch (choice) {
                case 1:
                    boolean done = false;
                    System.out.println("Type something other than a number to exit");
                    while (!done) {
                        System.out.print("Enter a number to add to the data: ");
                        try {
                            data.add(input.nextFloat());
                            numItems++;
                        } catch (Exception e) {
                            done = true;
                        }
                    }
                case 2:

                case 3:
                    data.clear();
                    numItems = 0;
                case 4:
                    System.exit(0);
                case 5:
                    for (float f : data) {
                        System.out.println(f);
                    }
                    System.out.println(numItems);
                default:
                    System.out.println("Enter a valid option");
            }

        }
    }

}
