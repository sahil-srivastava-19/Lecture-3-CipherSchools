import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a=sc.nextInt();
        if(a<0){
            System.out.println("-ve!");
        }else if(a==0){
            System.out.println("Neutral!");
        }else {
            System.out.println("+ve!");
        }
    }
}
