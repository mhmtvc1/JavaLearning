package com.avci.javalearning;

public class Loops {

    public static void main(String[] args)  {

        int[] myNumbers = {11,12,13,14,15};
        int x = (myNumbers[0]  +5)    *2;

        // System.out.println(x);

        for (int i =0; i<myNumbers.length; i++) {

            int y = (myNumbers[i] +5) *2;
        //    System.out.println(y);
        }

        for (int number : myNumbers){
           // System.out.println((number+5)*2);
        }
        for (int a =0; a<10; a++) {
            // System.out.println("test");
        }

        int j = 0;
        while (j<10){
          System.out.println("test");
          j++;
        }
    }
}


