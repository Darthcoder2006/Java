import java.util.Scanner;

public class Max{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("No1: ");
        int a=scanner.nextInt();
        System.out.print("No2: ");
        int b=scanner.nextInt();
        System.out.print("No3: ");
        int c=scanner.nextInt();
        int max=a;
        if(b>max){
            max=b;
        }
        if (c>max){
            max=c;
        }
        System.out.println("Max: " + max);
        scanner.close();
    }
}