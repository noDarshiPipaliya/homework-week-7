package javaprogrammes;

import java.util.Calendar;

public class JavaLesson5 {


        public static void main(String []args){
            Calendar cal = Calendar.getInstance();
            int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            System.out.println();
            System.out.println("get days in month : " + days);
            System.out.println();
        }
    }



