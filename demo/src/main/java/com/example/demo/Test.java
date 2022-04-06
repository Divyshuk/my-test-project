package com.example.demo;

import java.util.Arrays;

public class Test {

	public static int num_maxEvents(int[] arr, int[]durr) {
		
		int drop =0;
		int numberOfEvents = arr.length;
		
		int [][] interval = new int[numberOfEvents][2];
		
		for (int i = 1;i<numberOfEvents;i++) {	
			interval[i] = new int[]{arr[i],arr[i]+durr[i]};
		}
	
		
		Arrays.sort(interval,(a,b)->a[1]-b[1]);
		
		int presentTime = interval[0][1];
		
		//1,2,  2,3 6,4 3,5
		
		for (int i =1; i<numberOfEvents;i++) {
			int [] schTime = interval[i];
			
			if(schTime[0]<presentTime) {
				drop++;
				
			}
			else {
				
				presentTime = schTime[1];
			}							
		}		
			
		return numberOfEvents-drop;		
	
	}
	
	public static void main(String[] args) {
		   int[] arrival1 = {1,3,3,5,7};
	        int[] duration1 = {2,2,1,2,1};
	        System.out.println(num_maxEvents(arrival1, duration1));
	        int[] arrival2 = {1,3,3,5,7, 6, 9};
	        int[] duration2 = {2,2,1,2,1, 10, 2};
	        System.out.println(num_maxEvents(arrival2, duration2));
	        int[] arrival = {1,3,35,7};
	        int[] duration = {2,2,1,2,1};
	        System.out.println(num_maxEvents(arrival, duration));
	}
}
