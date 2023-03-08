
import java.util.*;
public class CoolCalculator {
    public double a;
    public double b;
    public CoolCalculator(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double add(){
        return this.a + this.b;
    }
    public double subtract(){
        return this.a-this.b;
    }
    public double divide(){
        return this.a/this.b;
    }
    public double modulo(){
        return this.a%this.b;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("This program will let you do different operations with two numbers ");
        System.out.println("Enter your first number ");
        double num1 = input.nextDouble();
        System.out.println("Enter your next number");
        double num2 = input.nextDouble();
        CoolCalculator myCalculator = new CoolCalculator(num1,num2);
        System.out.println("Enter the number that matches the operation you want to do ");
        System.out.println("1. Addition \n 2. Subtraction \n 3.Multiplication 4. Division \n 5. Modulo");
        int choice = input.nextInt();
        System.out.println("Your numbers were " + myCalculator.a+ " and "+ myCalculator.b);
    }
}
