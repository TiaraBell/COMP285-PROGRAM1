/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package capmetro;

import capmetro.DivideAndConquer;
import capmetro.Iterative;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
/**
 *
 * @author tiara
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();

	    /*Test0: An array with one positve element
	     *   expect: 10
	     */
	    values.clear();
	    values.add(10);
	    runAlgs(values);
	    
	    /*Test1:  An array with one negative element
	     *   expect: -5
	     */
	    values.clear();
	    values.add(-5);
	    runAlgs(values);
	    
	    /*Test2:  An array with two elements
	     *   expect: 7
	     */
	    values.clear();
	    values.add(7);
	    values.add(-7);
	    runAlgs(values);

	    /*Test3: An array with multiple elements 
	     *   expect: 13
	     */
	    values.clear();
	    values.add(1);
	    values.add(7);
	    values.add(-11);
	    values.add(13);
	    runAlgs(values);
	    
	    /*Test4: An array with multiple elements 
	     *   expect: 12
	     */
	    values.clear();
	    values.add(1);
	    values.add(-5);
	    values.add(1);
	    values.add(9);
	    values.add(-7);
	    values.add(9);
	    values.add(-4);
	    runAlgs(values);
            
            /*Test5: An array with one element 
	     *   expect: 0
	     */
	    values.clear();
	    values.add(0);
	    runAlgs(values);
            
            /*Test6: An array with multiple elements 
	     *   expect: -1
	     */
	    values.clear();
	    values.add(-4);
            values.add(-7);
            values.add(-2);
            values.add(-1);
            values.add(-11);
	    runAlgs(values);
            
            /*Test7: An array with multiple elements
	     *   expect: 0
	     */
	    values.clear();
	    values.add(-5);
            values.add(-8);
            values.add(0);
            values.add(-3);
            values.add(-2);
            values.add(0);
	    runAlgs(values);
            
            /*Test8: An array with multiple elements
	     *   expect: 2
	     */
	    values.clear();
	    values.add(0);
            values.add(2);
            values.add(-1);
            values.add(-5);
            values.add(-9);
            values.add(-10);
            values.add(2);
            values.add(-2);
	    runAlgs(values);
            
            /*Test9: An array with multiple elements
	     *   expect: 0
	     */
	    values.clear();
	    values.add(0);
	    runAlgs(values);
	}
	
	static void runAlgs(ArrayList<Integer> values) {
		// Run divide-and-conquer algorithm
		Date startTime = new Date(); //start clock since data is created
		int highestPassengerDensity = DivideAndConquer.findHighestPassengerDensity(createValueArray(values));
		Date endTime = new Date(); //stop clock since max computed
		System.out.println("   --- The elapsed time for the DivideAndConquer algorithm is "
				+ (endTime.getTime() - startTime.getTime()) + " milliseconds,");
		System.out.println("           and the answer is " + highestPassengerDensity);
		System.out.println("");
		
		// Run iterative algorithm
		startTime = new Date(); //start clock since data is created
		highestPassengerDensity = Iterative.findHighestPassengerDensity(createValueArray(values));
		endTime = new Date(); //stop clock since max computed
		System.out.println("   --- The elapsed time for the Iterative algorithm is "
				+ (endTime.getTime() - startTime.getTime()) + " milliseconds,");
		System.out.println("           and the answer is " + highestPassengerDensity);
		System.out.println("");
	}

	//turn an ArrayList<Integer> into an int[]
    public static int[] createValueArray(ArrayList<Integer> list){
		int n = list.size();
		int[] values = new int[n];
	    for(int i = 0; i<n; i++){
	    	values[i] = list.get(i).intValue();
	    }
		return values;
    }
}
