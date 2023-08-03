package class3;

public class E10ElseIf {
    public static void main(String[] args) {
        String fruit="Kiwi";

        if(fruit.equals("Mango")){//fruit=="Mango"
            System.out.println("Price is $5");
        }else if(fruit.equals("Orangr")){
            System.out.println("Price is $4");
        }else if (fruit.equals("Apple")){
            System.out.println("Price is $10");
        }else if(fruit.equals("Kiwi")){
            System.out.println("$6");
        }else{
            System.out.println("This fruit is not available");
        }
    }
}
