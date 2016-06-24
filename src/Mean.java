
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
public class Mean {

    public static float FindMean(List<Float> data) {
        float sum = 0;
        for(float f : data) {
            sum += f;
        }
        int numItems = data.size();
        float mean = sum/numItems;
        return mean;
    }
}
