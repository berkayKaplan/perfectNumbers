package com.berkaykaplan.perfectnumbers;

public class Main {
    public static void main  (String[] args){
        int number=6;
        int total=0;
        for (int i=1;i<number;i++){
            if (number%i==0){
                total=total+i;
            }
        }
        if (total==number){
            System.out.println("mükkemmel sayıdır");
        }
        else{
            System.out.println("mükemmel sayı değildir");
        }


    }
}
