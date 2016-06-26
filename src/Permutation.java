/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author scott
 */
public class Permutation {
    public static float permutation(float x, float y) {
        x = Factorial.factorial(x);
        float temp = x - y;
        temp = Factorial.factorial(temp);
        float total = x / temp;
        return total;
    }
}
