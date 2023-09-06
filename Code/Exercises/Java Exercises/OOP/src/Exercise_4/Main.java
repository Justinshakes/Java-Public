package Exercise_4;

/*
4. Write a Java program to create a class called "Circle" with a radius attribute.
You can access and modify this attribute. Calculate the area and circumference of the circle.
 */
public class Main {
    public static void main(String[] args) {
        circle c1 = new circle(5);
        System.out.println("Radius: 5 Area = " + c1.area());
        System.out.println("Radius: 5 getCircumference = " + c1.getCircumference());
        c1.setRadius(2);
        System.out.println("Radius: 2 Area = " +c1.area());
        System.out.println("Radius: 2 getCircumference = " +c1.getCircumference());
    }
}

class circle{
    double radius;

    public circle(double radius){
        this.radius = radius;
    }

    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
