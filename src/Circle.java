public class Circle extends Shape {
    private double radius;

    Circle() {
        this.radius = 10.5;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Круг\nРадиус: " + radius + "\nПлощадь: " + getArea() + "\nПериметр: " + getPerimeter()
                + "\nЦвет: " + getColor() + "\nЗаполненность: " + isFilled();
    }
}
