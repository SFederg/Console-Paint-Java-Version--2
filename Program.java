public class Program {
    public static void main(String[] args) throws Exception {
        Line line1 = new Line(new Position(74, 34), '*', 9, 0, true);
        Line line2 = new Line(new Position(86, 34), '*', 9, 0, true);
        Line line3 = new Line(new Position(86, 25), '*', 9, 1, false);
        Line line4 = new Line(new Position(71, 22), '*', 9, -1, false);
        Triangle triangle1 = new Triangle(new Position(75, 30), '0', 9);
        Circle circle = new Circle(new Position(40, 10), '#', 5);
        Rectangle rectangle = new Rectangle(new Position(30 , 20), '=', 20, 40);
        Triangle triangle2 = new Triangle(new Position(19, 11), '0', 21);
        Shape[] shapes = {line1, line2, line3, line4, triangle1, circle, rectangle, triangle2};

        Canvas.Clear();
        for(int i = 0; i < shapes.length; i++)
        {
            Canvas.Add(shapes[i]);
        }
        Canvas.Display();
    }
}
