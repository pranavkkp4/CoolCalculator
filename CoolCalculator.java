
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
    public double multiply(){
        return this.a*this.b;
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
        if(choice==1||choice==2||choice==3||choice==4||choice==5||choice==6||choice==7||choice==8){
            if(choice==1){
                System.out.println("The sum of your numbers is "+myCalculator.add());
            }
            else if(choice==2){
                System.out.println("The difference of your numbers is "+myCalculator.subtract());
            }
            else if(choice==3){
                System.out.println("The product of your numbers is "+myCalculator.multiply());
            }
            else if(choice==4){
                System.out.println("The quotient of your numbers is "+myCalculator.divide());
            }
            else if(choice==5){
                System.out.println("The remainder of your numbers is "+myCalculator.modulo());
            }
        }
    }
}
