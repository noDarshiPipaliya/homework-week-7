package javaprogrammes;

import java.util.Scanner;

public class JavaLesson8 {
    public static void main(String[] args) {
        double commissionrate;
        double totalsales, commission;

        Scanner read = new Scanner(System.in);
        System.out.println("please enter  total sales ");

        totalsales = read.nextDouble();

        if (totalsales>=50000){
            commissionrate = 0.35;
        }else if (totalsales >=30000) {
            commissionrate = 0.20;
        }else if (totalsales>=20000){
            commissionrate=0.10;
        }else if (totalsales>=10000) {
            commissionrate = 0.5;
        }else {
        }
            commissionrate=0.2;

        commission = commissionrate *totalsales;
        System.out.println("the commission is  :" +   commission);


        }

    }








