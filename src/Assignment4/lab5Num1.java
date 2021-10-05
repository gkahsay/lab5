package Assignment4;

import java.util.Scanner;

public class lab5Num1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number to  power");
        int num=input.nextInt();
         Math.pow(10,num);
            if(num==6){
                System.out.println(Math.pow(10,6)+ " Million");
            }
            else if(num==9){
                System.out.println(Math.pow(10,9)+ " billion");

            }
            else if(num==12){
                System.out.println(Math.pow(10,12)+ " Trillion");
            }
            else if(num==15){
                System.out.println(Math.pow(10,15)+ " Quadrillion");
            }
            else if(num==18){
                System.out.println(Math.pow(10,18)+ " Quintillion");
            }
            else if(num==21){
                System.out.println(Math.pow(10,21)+ " Sextillion");
            }
            else if (num==30){
                System.out.println(Math.pow(10,30)+ " Nonillion");
            }
            else if(num==100){
                System.out.println(Math.pow(10,100)+ " Googol");
            }
        }
    }

