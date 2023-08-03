package class4;

import java.util.Scanner;

public class E8scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your Name");
        String name=scanner.next();
        if(name.equals("Jamel")){
            System.out.println("Senioe SDET in Years");
        } else if (name.equals("Ayesha")){
            System.out.println("I live in Canada");
        }else if(name.equals("Depal")){
            System.out.println("She likes Java");
        }

    }
}
