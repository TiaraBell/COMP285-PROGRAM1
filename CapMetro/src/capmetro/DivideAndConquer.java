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

        int n = values.length;

        if (n == 1) {
            return values[0];
        }
        int leftSize = n / 2;
        int rightSize = n - leftSize;

        int[] B = new int[leftSize];
        int[] C = new int[rightSize];

        //Initializing left side array
        for (int i = 0; i < leftSize; i++) {
            B[i] = values[i];
        }
        //Initializing right side array
        for (int i = leftSize; i < n; i++) {
            C[i - leftSize] = values[i];
        }

        int rB = findHighestPassengerDensity(B);
        int rC = findHighestPassengerDensity(C);
        int rA = findCrossPassengerDensity(B, C);
        return (max(rA, rB, rC));
    }

    public static int findCrossPassengerDensity(int[] B, int[] C) {
        int maxDensity = 0;
        int currMax = 0;
        for (int j = 0; j < B.length; j++) {
            if (currMax >= maxDensity) {
                maxDensity = currMax;
            }
            if (B[j] >= 0) {
                currMax += B[j];
            } else if (currMax > B[j]) {
                currMax += B[j];
            } else if (currMax < B[j]) {
                currMax += B[j];
            }
        }

        for (int j = 0; j < C.length; j++) {
            if (currMax >= maxDensity) {
                maxDensity = currMax;
            }
            if (C[j] >= 0) {
                currMax += C[j];
            } else if (currMax > C[j]) {
                currMax += C[j];
            } else if (currMax < C[j]) {
                currMax += C[j];
            }
        };
        return maxDensity;
    }

    public static int max(int rA, int rB, int rC) {
        if (rA >= rB && rA >= rC) {
            return rA;
        } else if (rB >= rA && rB >= rC) {
            return rB;
        } else {
            return rC;
        }
    }

}
