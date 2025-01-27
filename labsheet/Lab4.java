package labsheet;

public class Lab4 { 
    public static void main(String[] args)    {
        float t1 = Float.parseFloat(args[0]); 
        float t2 = Float.parseFloat(args[1]); 
        float avg=(t1+t2)/2;
        System.out.println("average temperature is  " + avg);
    }
}
