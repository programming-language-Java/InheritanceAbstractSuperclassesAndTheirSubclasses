public class Rectangle extends Shape {
    private double width;
    private double length;

    Rectangle() {
        super("lime", true);
        this.width = 1.5;
        this.length = 1.5;
    }

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return width * 2 + length * 2;
    }

    public String toString() {
        return "Прямоугольник\nШирина: " + width + "\nДлина: " + length
                + "\nПлощадь: " + getArea() + "\nПериметр: " + getPerimeter()
                + "\nЦвет: " + getColor() + "\nЗаполненность: " + isFilled();
    }
}
