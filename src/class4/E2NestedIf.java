package class4;

public class E2NestedIf {
    public static void main(String[] args) {
        boolean winter=true;
        String jacketColor="Black";
        if(winter==true){
            System.out.println("Its Very cold");

            if(jacketColor.equals("Red")){
                System.out.println("Lets go with Red Nike shoes");
            }else{
                System.out.println("Lets go with the blue ones");
            }


        }else{

            System.out.println("NO need to wear jackets");
        }
    }
}
