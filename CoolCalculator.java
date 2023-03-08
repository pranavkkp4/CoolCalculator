
import java.util.*;
public class CoolCalculator {
    public double a;
    public double b;
    public CoolCalculator(double a, double b){
        this.a = a;
        this.b = b;
    }
    public void add(){
        double sum = this.a+this.b;
        System.out.println("The sum of " + this.a + " and "+ this.b + sum);
    }
    public void subtract(){
        double difference = this.a-this.b;
        System.out.println("The difference between " + this.a + " and " + this.b + difference);
    }
    public void multiply(){
        double product = this.a*this.b;
        System.out.println("The product of "+this.a + " and " + this.b + " is " +product);
    }
    public void divide(){
        double quotient = this.a/this.b;
        System.out.println("The quotient of "+ this.a + " divided by "+this.b+ " is " + quotient);
    }
    public void modulo(){
        double remainder = this.a%this.b;
        System.out.println("The remainder of "+ this.a + " divided by "+this.b+ " is " + remainder);
    }
    public void isPrime(){
        boolean aStatus = true;
        boolean bStatus = true;
        //if number is 2, then is prime, if less than 2 can't be prime
        if(this.a<2){
            aStatus = false;
        }
        if(this.b<2){
            bStatus = false;
        }
        for(int i = 2; i < this.a; i++){
            if(this.a%i==0){
                aStatus = false;
            }
        }
        for(int i = 2; i < this.b; i++){
            if(this.b%i==0){
                bStatus = false;
            }
        }
        if(aStatus==true){
            System.out.println("The number "+this.a+" is prime");
        }
        else{
            System.out.println("The number "+this.a+" is not prime");
        }
        if(bStatus==true){
            System.out.println("The number "+this.b+" is prime");
        }
        else{
            System.out.println("The number "+this.b+ " is not prime");
        }
    }
    public void Fibonacci(){
        double num1 = this.a;
        double num2 = this.b;
        double temp1 = 0;
        double temp2 = 0;
        double[] seq = new double[20];
        for(int i = 0; i < 18; i = i+2){
            seq[i] = num1;
            seq[i+1] = num2;
            temp1 = num1;
            temp2 = num2;
            num1 = temp1 + temp2;
            num2 = num1 + temp2;
        }
        System.out.println("The Fibonacci sequence is "+Arrays.toString(seq));
    }
    public void all(){
        this.add();
        this.subtract();
        this.multiply();
        this.divide();
        this.modulo();
        this.isPrime();
        this.Fibonacci();
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
        System.out.println("1. Addition \n 2. Subtraction \n 3.Multiplication 4. Division \n 5. Modulo \n " +
                "6. Prime Check \n 7. Fibonacci \n 8. Run all operations");
        int choice = input.nextInt();
        System.out.println("Your numbers were " + myCalculator.a+ " and "+ myCalculator.b);
        if(choice==1||choice==2||choice==3||choice==4||choice==5||choice==6||choice==7||choice==8){
            if(choice==1){
                myCalculator.add();
            }
            else if(choice==2){
                myCalculator.subtract();
            }
            else if(choice==3){
                myCalculator.multiply();
            }
            else if(choice==4){
                myCalculator.divide();
            }
            else if(choice==5){
                myCalculator.modulo();
            }
            else if(choice==6){
                myCalculator.isPrime();
            }
            else if(choice==7){
                myCalculator.Fibonacci();
            }
            else if(choice==8){
                myCalculator.all();
            }
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
