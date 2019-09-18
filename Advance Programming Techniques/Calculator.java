import java.util.Scanner;
public class Calculator{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float a = scan.nextFloat();
        System.out.print("Enter second number: ");
        float b = scan.nextFloat();
        System.out.print("Select operation:\n\n\t1. Add\n\t2. Subtract\n\t3. Multiply\n\t4. Divide\n>>> ");
        int option = scan.nextInt();
        System.out.print("Result is ");
        switch(option){
            case 1:
                System.out.print(add(a,b));
                break;
            case 2:
                System.out.print(subtract(a,b));
                break;
            case 3:
                System.out.print(multiply(a,b));
                break;
            case 4:
                System.out.print(divide(a,b));
                break;
        }
    }
    private static float add(float a, float b){
        return a + b;
    }
    private static float subtract(float a, float b){
        return a - b;
    }
    private static float multiply(float a, float b){
        return a * b;
    }
    private static float divide(float a, float b){
        return a / b;
    }
}