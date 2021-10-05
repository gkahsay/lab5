package Assignment4;

import java.util.Scanner;

public class Lab5Num2 {
    public static final double HOURLY =7.25;
    public static void main(String[] args){
        System.out.println(wage(299.9,0.1));
    }
   public static double wage(double salesVolume,double commission){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter total hours you work");
        double totalHours = input.nextDouble();
       double salary;

        if(commission > 1 && commission<99.99){
            salary=totalHours * (HOURLY + HOURLY * 1.5) + 0.05* salesVolume;
        }
        else if(commission>100.00 && commission<299.99){
           salary =totalHours * (HOURLY + HOURLY * 1.5) + 0.1* salesVolume;
        }
        else{
            salary=totalHours * (HOURLY + HOURLY * 1.5) + 0.15* salesVolume;
        }

        return salary;

   }
}
