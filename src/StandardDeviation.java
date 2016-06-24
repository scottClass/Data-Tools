
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author scott
 */
public class StandardDeviation {

    public static float findSigma(List<Float> data, int numItems) {
        //get the average first
        float mean = Mean.FindMean(data, numItems);
        //the sum of the upper half of the fraction
        float sSum = 0;
        for (float f : data) {
            sSum += (f - mean) * (f - mean);
        }
        float sigma = sSum / (numItems - 1);
        sigma = (float) (Math.sqrt(sigma));
        return sigma;
    }
}
