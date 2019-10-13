/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capmetro;

/**
 *
 * @author tiara
 */
public class Iterative {

    public static int findHighestPassengerDensity(int[] values) {
        int n = values.length;

        if (n == 1) {
            return values[0];
        }
        
        int maxDensity = 0;
        int currMax = 0;
        for (int i = 0; i < values.length; i++) {
            if (currMax >= maxDensity) {
                maxDensity = currMax;
            }
            currMax += values[i];
            if (values[i] < 0) {
                currMax += 0;
            }
            
        }
        return maxDensity;
    }

}
