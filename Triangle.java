package shapes;

public class Triangle {
    //Step 1
    // Instant Variables
    private double side;
    private double base;

    //Step 3
    public Triangle(double side, double base){
        this.side = side;
        this.base = base;
    }

    //Step 2
    //Getter
    public double getSide(){
        return side;
    }

    //Setter
    public void setSide(double side){
        this.side = side;
    }

    //Getter
    public double getBase(){
        return base;
    }

    //Setter
    public void setBase(double base){
        this.base = base;
    }

    //Step 4
    //Method
    public void calculatePerimeter(){
        double perimeter = side + base + side;
        System.out.println(perimeter);
    }

    //Method #2
    public void calculateArea(){
        double area = side * base / 2;
        System.out.println("the area is: " + area);
    }



    //Step 6 (Right click, generate, toString, make sure they all highlighted, hit okay.)
    @Override
    public String toString() {
        return "Triangle{" +
                "side=" + side +
                ", base=" + base +
                '}';
    }
}

