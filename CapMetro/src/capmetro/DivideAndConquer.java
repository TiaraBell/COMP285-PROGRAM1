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
public class DivideAndConquer {

    public static int findHighestPassengerDensity(int[] values) {
        int a = 0;
        int z = values.length - 1;
        if (values.length == 1) {
            return values[1];
        }
        int mid = (a + z) / 2;

        int[] B = new int[100];
        int[] C = new int[100];
        for (int i = 0; i <= mid; i++) {
            B[i] = values[a];
        }
        
        for (int j = mid + 1; j <= values.length; j++) {
            C[j] = values[j];
        }
          
        

        int rB = findHighestPassengerDensity(B);
        int rC = findHighestPassengerDensity(C);
        int rA = findCrossPassengerDensity(B, C);
        return (max(rA, rB, rC));
    }
    
    public static int findCrossPassengerDensity(int[] B, int[] C) {
        return -1;
    }
    
    public static int max(int[] values, int[] B, int[] C) {
        return -1;
    }
    
}
