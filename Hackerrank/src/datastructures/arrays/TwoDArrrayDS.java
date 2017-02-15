package datastructures.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrrayDS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int num[] = new int[36];
        int hourglassSum[] = new int[16];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int count = 0;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
            	num[count] = arr[i][j];
            	count++;
            }
        }
        
        for(int i=0; i<=21; i++){
        	count = 1; 
        	for(int j=i; j<i+15; j++){
        		if(count == 1 || count == 2 || count == 3 || count == 8 || count == 13 || count == 14 || count == 15 )
        			
        		count++;
        	}
        }
        Arrays.sort(hourglassSum);
        System.out.println(hourglassSum[hourglassSum.length-1]);
        in.close();
	}

}
