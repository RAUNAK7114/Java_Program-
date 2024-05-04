
import java.util.Scanner;


public class AgeGroup {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int age = Sc.nextInt();

        if(age <= 12){
            System.out.println("child");
        } else if(age > 12 && age < 18){
            System.out.println("teenager");
        } else {
            System.out.println("adult");
        }

    }
}
