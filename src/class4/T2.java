package class4;

public class T2 {
    public static void main(String[] args) {
        double mortgageRate=3.0;
        double mortgagePrice=40000.5;
        if(mortgageRate>4.5){
            System.out.println("You will not buy house");
        }else{
            System.out.println("You will consider buying house");
            if (mortgagePrice>50000){
                System.out.println("You Will take a loan");
            }else{
                    System.out.println("You will pay cash");
                }
        }
    }
}
