package Exercise_3;

/*
3. Write a Java program to create a class called
"Rectangle" with width and height attributes.
Calculate the area and perimeter of the rectangle.
 */
public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,5);

        System.out.println("R1 area: " + r1.Area());
    }
}

 class Rectangle{
    int width;
    int height;

    Rectangle(int width,int height){
        this.width = width;
        this.height = height;
    }

    public double Area(){
        return width * height;
    }
}
