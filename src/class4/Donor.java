package class4;

public class Donor {
    public static void main(String[] args) {
        int age=24;
        double weight=170;
        if (age>18){
            System.out.println("You are eligible to donate your blood");
            if(weight>110){
                System.out.println("You are eligible");
            }else{
                System.out.println("You cant accept sucn a patient");
            }
        }
    }
}
