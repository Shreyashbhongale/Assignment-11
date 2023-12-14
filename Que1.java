import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre 1st no = ");                 
        int n1 = sc.nextInt();     

        System.out.println("Entre 2ndt no = ");                 
        int n2 = sc.nextInt();                                    
        Calculator c = new Calculator(n1,n2);
        System.out.println("Addition = "+ c.addition());
        System.out.println("substraction = "+ c.substraction());
        System.out.println("multiplication = "+ c.multiplication());
        System.out.println("substraction = "+ c.substraction());
        }
        } 
    class Calculator {
    private double num1 ;
    private double num2 ;
   
    public Calculator(double num1 , double num2) {  
            this.num1 = num1;
            this.num2 = num2;
        }
        public double addition() {
            return this.num1 + this.num2;
        }
        public double substraction() {
            return this.num1 - this.num2;
        }
        public double multiplication() {
            return this.num1 * this.num2;
        }
        public double division() {
            return this.num1 / this.num2;
        }
        
    }
