package shapes;

public class ShapeFactory {
    public static void main(String[] args) {

////        step 5 create obj
//        Triangle triangle = new Triangle(3.0, 4.0);
//
//
//        triangle.setSide(60.0);
//        triangle.calculatePerimeter();
//        triangle.calculateArea();
//
//        System.out.println(triangle);
////        Step 7 Then Print out


        Circle Circle = new Circle(2, 5);

        Circle.getRadius(5);
        Circle.getArea(3.14);
        Circle.calculateCircumference();
        Circle.calculateArea();
        System.out.println(Circle);


//        Rectangle defaultRect = new Rectangle();
//
//        System.out.println(defaultRect);
//
//        defaultRect.calcArea();
//
//        Rectangle colorfulRect = new Rectangle("red", 200, 200);
//        colorfulRect.color = "pink";
//        colorfulRect.setName("pink rectangle");
//
//        System.out.println(colorfulRect.getName());
//
//        System.out.println(colorfulRect);
//
//        colorfulRect.calcArea();
//
//        Rectangle.addObject(300,300);



    }
}
