public class Circle implements Shape {
    private double radius;

    Circle(double _radius){
        this.radius = _radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }



    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
