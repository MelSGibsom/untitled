package ua.Romanov.Alexander.geometry;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getSegment(int x1, int y1, int x2, int y2) {
        return super.getSegment(x1, y1, x2, y2);
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();


    }

}
