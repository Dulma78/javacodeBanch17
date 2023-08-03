package class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your Gender F/M");
        char gender=scanner.next().charAt(0);//Dulma D=0 u=1 l=2 m=3 a=4
        System.out.println("Your  Gender is "+gender);

    }
}


