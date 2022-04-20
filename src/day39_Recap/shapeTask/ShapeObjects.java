package day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square = new Square( 5);
        System.out.println(square);

        System.out.println();

        Rectangle rectangle = new Rectangle( 8,4.5);
        System.out.println(rectangle);
        System.out.println(rectangle.getName());
        rectangle.setLength(10);
        System.out.println( "Rectangle Length: " + rectangle.getLength());
        System.out.println(rectangle);

        System.out.println();

        Circle circle = new Circle( 4.5);
        System.out.println(circle);





    }

}
