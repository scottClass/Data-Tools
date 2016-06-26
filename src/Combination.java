/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author scott
 */
public class Combination {
    public static float combination(float x, float y) {
        x = Factorial.factorial(x);
        float temp1 = Factorial.factorial(y);
        float temp2 = Factorial.factorial(x - y);
        float total = x / (temp1 * temp2);
        return total;
    }
}
