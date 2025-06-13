import java.util.*;
public class function {
    public static void calculatesum(int a, int b){
        int Sum;
        Sum = a + b;
        System.out.println("Sum is:" +Sum);
    }
    
    public static void main(String args[]){
        var sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        System.out.println("Enter the value of B");
        b= sc.nextInt();
        calculatesum(a, b);
    }
}
