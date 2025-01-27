package labsheet;

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
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
}}