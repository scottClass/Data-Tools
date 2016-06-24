
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
public class ZScore {

    public static float findZ(float toZ, List<Float> data) {
        //Find mean
        int numItems = data.size();
        float mean = Mean.FindMean(data);
        //find standard deviation
        float sigma = StandardDeviation.findSigma(data);
        //find zscore
        float ZScore = (toZ - mean) / sigma;
        return ZScore;
    }
}
