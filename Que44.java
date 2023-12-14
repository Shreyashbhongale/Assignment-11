import java.util.Scanner;

class Que44{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("put radius of circle = ");
        double radius = sc.nextDouble();

        System.out.println("put side of square =");
        int side = sc.nextInt();

        System.out.println("put length & breath = "); 
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        Geometry g = new Geometry ();
        System.out.println("Area Of Circle = " + g.Area(radius));
        System.out.println("Area Of Square = " + g.Area(side));
        System.out.println("Area Of Rectangle = " + g.Area (length, breadth));
    }
}
class Geometry{
        public double Area (double radius) {
        return (3.14 * radius);
        }
        public float Area(float side) {
        return (side * side);
        }
        public double Area (double length , double breadth) {
        return (length * breadth);
        }
   
        }
    




































































