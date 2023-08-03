package class4;

public class T1 {
    public static void main(String[] args) {
        boolean hasDegree=true;
        double gpaScore=5.0;
        if(hasDegree==true){
            System.out.println("Congratulation!");
            if(gpaScore>=3.5){
                System.out.println("You should eligible for scholarship");
            }else {
                System.out.println("You should have studied harder");
            }
        }else{
            System.out.println("You should get a degree");
        }
    }
}
