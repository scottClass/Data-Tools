
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
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Float> data = new ArrayList<Float>();

        while (true) {
            System.out.println("1. Add data");
            System.out.println("2. Find standard deviation with data already entered");
            System.out.println("3. Find the Z-Score of a number in the data");
            System.out.println("4. Find a factorial");
            System.out.println("5. Delete data");
            System.out.println("6. Quit");
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
                        }
                    } catch (Exception e) {
                        System.out.println("Input a valid entry");
                    }
                }
            } else if (choice == 2) {
                float sigma = StandardDeviation.findSigma(data);
                System.out.println("The standard deveation of the data is " + sigma);
            } else if (choice == 3) {
                System.out.println("1. Enter mean and standard deviation manually");
                System.out.println("2. Use data set");
                System.out.print(":: ");
                float newChoice = input.nextFloat();
                if (newChoice == 1) {
                    System.out.print("Enter the mean: ");
                    float mean = input.nextFloat();
                    System.out.print("Enter the standard deviation: ");
                    float sigma = input.nextFloat();
                    System.out.print("Enter the value you want to find the Z Score of: ");
                    float toZ = input.nextFloat();
                    ZScore.findZ(toZ, mean, sigma);
                } else if (newChoice == 2) {
                    if (data.isEmpty()) {
                        System.out.println("Opps! No data!");
                    } else {
                        System.out.println("Enter the value of the data you want to find the Z Score of (The number"
                                + " entered has to be in the set of data)");
                        System.out.print(":: ");
                        float toZ = input.nextFloat();
                        boolean good = false;
                        for (float f : data) {
                            if (f == toZ) {
                                good = true;
                            }
                        }
                        //if the number entered is in the data
                        if (good) {
                            float zscore = ZScore.findZ(toZ, data);
                            System.out.println("The Z Score of " + toZ + " is " + zscore);
                        } else {
                            System.out.println("That number does not appear in the data!");
                        }
                    }
                } else {
                    System.out.println("Invalid input");
                }
            } else if (choice == 4) {
                System.out.println("1. Enter a number to find the factorial of");
                System.out.println("2. Combinations");
                System.out.println("3. Permutations");
                float newChoice = input.nextFloat();
                if (newChoice == 1) {
                    System.out.println("Enter the number you want to find a factorial of");
                    System.out.print(":: ");
                    float temp = input.nextFloat();
                    float factorial = Factorial.factorial(temp);
                    System.out.println(temp + " factorial is " + factorial);
                } else if (newChoice == 2) {
                    //combinations
                    System.out.println("Enter the first number ");
                    System.out.print(":: ");
                    float x = input.nextFloat();
                    System.out.println("Enter the second number ");
                    System.out.print(":: ");
                    float y = input.nextFloat();
                    float combin = Combination.combination(x, y);
                    System.out.println(x + "P" + y + "= " + combin);
                } else if (newChoice == 3) {
                    //permutations
                    System.out.println("Enter the first number ");
                    System.out.print(":: ");
                    float x = input.nextFloat();
                    System.out.println("Enter the second number ");
                    System.out.print(":: ");
                    float y = input.nextFloat();
                    float permu = Permutation.permutation(x, y);
                    System.out.println(x + "P" + y + "= " + permu);
                } else {
                    System.out.println("Invalid input");
                }

            } else if (choice == 5) {
                data.clear();
                System.out.println("Data Cleared");
            } else if (choice == 6) {
                System.exit(0);
            }
        }
    }
}
