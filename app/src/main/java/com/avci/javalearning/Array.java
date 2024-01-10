package com.avci.javalearning;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Array {

    public static void main(String[] args){

       String[] myStringArray = new String[3];
       myStringArray[0]="james";
       myStringArray[1]="james1";
       myStringArray[2]="james2";
        System.out.println(myStringArray[2]);

        int[] myIntArray = new int[3];
        myIntArray[0]=20;
        myIntArray[1]=21;
        myIntArray[2]=22;
        System.out.println("İsim: "+myStringArray[1]+" "+"Yaş: "+ myIntArray[1]);

        int[] myNumberArray = {1,2,3};
        System.out.println(myNumberArray[2]);

        ArrayList<String> myMusicians = new ArrayList<>();

        myMusicians.add(0,"ornek0");
        myMusicians.add(1,"ornek1");
        myMusicians.add(2,"ornek2");

        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.size());


        HashMap<String,String> myHashmap= new HashMap<>();
        myHashmap.put("name","james");
        myHashmap.put("instrument","guitar");

        System.out.println(myHashmap.get("instrument"));

        HashMap<String,Integer> myHashmap2 = new HashMap<>();
        myHashmap2.put("emre",1998);
        myHashmap2.put("mehmet",1999);
        System.out.println(myHashmap2.get("emre"));

        int x = 5;
        int y = 6;

        if (x>y){
            System.out.println("x, y'den büyük");
        }
        else {
            System.out.println("x, y'den büyük değil");
        }

        int a,b,c;
        a=10;
        b=20;
        c=30;

        System.out.println(a>b && b<c);


        int day=2;
        String dayString = "";

        if (day==1){
            dayString = ("monday");
        } else if (day==2) {
            dayString = ("tuesday");
        } else {
            dayString = ("wednesday");
        }
        System.out.println(dayString);

        switch (day){
            case 1: {
                System.out.println("monday");
                break;
            }
            case 2: {
                System.out.println("tuesday");
                break;
            }
            case 3: {
                System.out.println("wednesday");
                break;
            }
            case 4: {
                System.out.println("thursday");
                break;
            }
        }

        switch (day){
            case 1:
                dayString = ("monday");
                break;

            case 2:
                dayString = ("tuesday");
                break;

            case 3:
                dayString = ("wednesday");
                break;

            default:
                dayString = ("thursday");
                break;
        }
        System.out.println(dayString);



    }
}

