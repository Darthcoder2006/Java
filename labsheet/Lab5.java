package labsheet;

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        System.out.println("A");
        Scanner scanner=new Scanner(System.in);
        double length, width, height;
        System.out.println("Enter length: ");
        length=scanner.nextDouble();
        System.out.println("Enter width: ");
        width=scanner.nextDouble();
        System.out.println("Enter height: ");
        height=scanner.nextDouble();
        double volume=length*width*height;
        System.out.println("Volume: "+volume);
        System.out.println("B");
        if (volume>80) {
            System.out.println("Not Suitable");
        } else {
            System.out.println("Suitable");
        }
        System.out.println("C");
        height=height+4;
        volume=length*width*height;
        System.out.println("Volume: "+volume);
        if (volume>80) {
            System.out.println("New is Not Suitable");
        } else {
            System.out.println("New is Suitable");
        }
        scanner.close();
}}