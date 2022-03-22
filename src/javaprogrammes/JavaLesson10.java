package javaprogrammes;

import java.util.Scanner;

public class JavaLesson10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any alphabet between A to F :");
        char alpha = input.next().charAt(0);
        //switch case statement
        switch (alpha) {
            case 'A':
                System.out.println("Ahmedabad");
                break;
            case'B':
                System.out.println("Baroda");
                break;
            case'c':
                System.out.println("Chennai");
                break;
            case'D':
                System.out.println("Delhi");
                break;
            case'E':
                System.out.println("England");
                break;
            case'F':
                System.out.println("France");
                break;
            default:
                System.out.println("invalid alphabet");
                break;


        }

    }

}
