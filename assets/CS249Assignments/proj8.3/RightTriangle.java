public class RightTriangle implements Shape {
    private double length;
    private double width;

    RightTriangle(double _length, double _width){
        this.length = _length;
        this.width = _width;
    }

    @Override
    public double area() {
        return length * width * .5;
    }


    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
}
