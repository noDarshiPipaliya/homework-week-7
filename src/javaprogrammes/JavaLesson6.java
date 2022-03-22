package javaprogrammes;

public class JavaLesson6 {

    public static void main(String[] args) {
        int salary = 25000;
        double DA = 8 / 100.0 * salary;
        double HRA = 10 / 100.0 * salary;
        double TA = 9 / 100.0 * salary;
        double PF = 20 / 100.0 * salary;
        double gross = salary + DA + HRA + TA-PF;
        System.out.println("gross salary = "+  gross);

        System.out.println("---------------------------------");
        System.out.println("|   Employee ID     :       3073|");
        System.out.println("|  Employee name   :      Jay   |");
        System.out.println("| ------------------------------|");
        System.out.println("| basic salary "+          salary );
        System.out.println("|  HRA          :"    +     HRA   );
        System.out.println("TA              :"    +     TA    );
        System.out.println("DA              :  "  +     DA    );
        System.out.println("PF              :"    +     PF    );
        System.out.println("|-------------------------------|");
        System.out.println("gross salary   : "  +      gross  );
        System.out.println("|-------------------------------|");







    }


}
