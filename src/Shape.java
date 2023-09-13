abstract public class Shape {
    private String color;
    private boolean filled;

    Shape() {
        this.color = "yellow";
        this.filled = true;
    }

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "Цвет: " + color + "\n" + "Заполненный: " + filled;
    }

    abstract public double getArea();

    abstract public double getPerimeter();
}