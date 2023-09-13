class Main {
    public static void main(String[] args) {
        System.out.println("��� ���������� Rectangle");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle.setWidth(15);
        System.out.println("������ " + rectangle.getWidth());
        rectangle.setLength(20);
        System.out.println("����� " + rectangle.getLength());

        System.out.println("\n� ����������� Rectangle width � length");
        Rectangle rectangle2 = new Rectangle(17.12, 18.78);
        System.out.println(rectangle2);
        rectangle2.setWidth(7);
        System.out.println("������ " + rectangle2.getWidth());
        rectangle2.setLength(10);
        System.out.println("����� " + rectangle2.getLength());

        System.out.println("\n� ����������� Rectangle width, length, color, filled");
        Rectangle rectangle3 = new Rectangle(4, 4.4, "green", false);
        System.out.println(rectangle3);
        rectangle3.setWidth(17);
        System.out.println("������ " + rectangle3.getWidth());
        rectangle3.setLength(25);
        System.out.println("����� " + rectangle3.getLength());
        rectangle3.setColor("red");
        System.out.println("���� " + rectangle3.getColor());
        rectangle3.setFilled(true);
        System.out.println("����������� " + rectangle3.isFilled());


        System.out.println("\n��� ���������� Circle");
        Circle circle = new Circle();
        System.out.println(circle);
        circle.setRadius(5.5);
        System.out.println("������ " + circle.getRadius());

        System.out.println("\n� ����������� Circle radius");
        Circle circle2 = new Circle(3);
        System.out.println(circle2);
        circle2.setRadius(3.5);
        System.out.println("������ " + circle2.getRadius());

        System.out.println("\n� ����������� Circle radius, color, filled");
        Circle circle3 = new Circle(3, "red", true);
        System.out.println(circle3);
        circle3.setRadius(4.5);
        System.out.println("������ " + circle3.getRadius());
        circle3.setColor("gray");
        System.out.println("���� " + circle3.getColor());
        circle3.setFilled(false);
        System.out.println("����������� " + circle3.isFilled());
    }
}
