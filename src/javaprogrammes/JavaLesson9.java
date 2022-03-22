package javaprogrammes;

import java.util.Scanner;

public class JavaLesson9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter any alphabet between A to F :");
        char alpha = input.next().charAt(0);
        //nested if else
        if (alpha == 'A'){
        System.out.println("Ahmedabad");}
        else if (alpha == 'B'){
            System.out.println("Baroda");
        }else if (alpha =='C'){
            System.out.println("Chennai");
        }else if(alpha == 'D'){
            System.out.println("Delhi");
        }else if (alpha == 'E'){
            System.out.println("England");
        }else if(alpha =='F'){
            System.out.println("France");
        }else{
            System.out.println("invalid alphabet");
        }









    }


}
