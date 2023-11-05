public class Program {
    public static void main(String[] args) throws Exception {
        Canvas canvas = new Canvas(100, 50, ' ');

        Line line1 = new Line(new Position(74, 34), '*', 9, 0, true);
        canvas.Add(line1);

        Line line2 = new Line(new Position(86, 34), '*', 9, 0, true);
        canvas.Add(line2);

        Line line3 = new Line(new Position(86, 25), '*', 9, 1, false);
        canvas.Add(line3);

        Line line4 = new Line(new Position(71, 22), '*', 9, -1, false);
        canvas.Add(line4);

        Triangle triangle1 = new Triangle(new Position(75, 30), '0', 9);
        canvas.Add(triangle1);

        Circle circle = new Circle(new Position(40, 10), '#', 5);
        canvas.Add(circle);

        Rectangle rectangle = new Rectangle(new Position(30 , 20), '=', 20, 40);
        canvas.Add(rectangle);

        Triangle triangle2 = new Triangle(new Position(19, 11), '0', 21);
        canvas.Add(triangle2);

        canvas.Display();
    }
}
