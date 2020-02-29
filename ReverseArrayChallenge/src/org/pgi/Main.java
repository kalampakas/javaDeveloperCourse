package org.pgi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] anarray=new int[]{2,4,8,11,33,44,77,3,3,10,12,32,-33,23,11,43};
        System.out.println(Arrays.toString(anarray));
        reverse(anarray);
        System.out.println(Arrays.toString(anarray));
    }

    private static void reverse (int[] array){
        int scratch=0;
        for(int i=0;i<=array.length/2;i++){
            scratch=array[i];
            array[i]=array[array.length-(i+1)];
            array[array.length-(i+1)]=scratch;
        }
    }
}
