import java.util.Scanner;
public class pytho{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if (a*a+b*b==c*c){
            System.out.println("Pythagorean Triplet");
        }
        else if (b*b+c*c==a*a){
            System.out.println("Pythagorean Triplet");
        }
        else if (c*c+a*a==b*b){
            System.out.println("Pythagorean Triplet");
        }
        else{
            System.out.println("Not a Pythagorean Triplet");
        }
    }
}