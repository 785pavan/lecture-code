package de.ovgu.icse.lecture02;

import java.util.Arrays;

public class Main {

    public static int var;
    public static void say(String s) {

        System.out.print("Welcome to" + s);
    }

    /*
     * For two given numbers, compute the next 10 fibonacci numbers
     * */
    public static int[] computeFibonacci(int first, int second) {
        int[] resultArray = new int[12];
        resultArray[0] = first;
        resultArray[1] = second;

        for(int i=0;i<10; i++) {
            resultArray[i+2] = resultArray[i+1] + resultArray[i];
        }

        return resultArray;
    }

    public static void display(int x, int y) {
        if (x == 3) {
            System.out.println("Message_X");
            if (y==2)
                System.out.println("Message_Y");
            else
                System.out.println("Message_Z");
        }
        else
            System.out.println("Message_Z");
    }


    public static void main(String[] args) {
        say("ICSE!");
//		int[] numArray = {3,6,11,101};
//    	String numText = "[" + Arrays.toString(numArray) + "]";
//    	System.out.println(numText);

    }

}
