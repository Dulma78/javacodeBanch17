package class4;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        System.out.println("Please Enter your name");
        Scanner scanner=new Scanner(System.in);
        // creating the object of the Scanner class so that we can  reuse the logic from
        // this class which is already written for us by Java developers

        String name=scanner.next();//taking a scanner from the user and storing in int a name variable
        if(name.equals("Asgar")){
            System.out.println("Java instraktor");
        }else {
            System.out.println("I dont know you");
        }
        System.out.println("hello "+name);
    }
}
