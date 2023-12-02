public class Program {
    public static void main(String[] args) throws Exception {
        try {
            Line line1 = new Line(new Position(74, 34), '*', 9, 0, true);
            Line line2 = new Line(new Position(86, 34), '*', 9, 0, true);
            Line line3 = new Line(new Position(86, 25), '*', 9, 1, false);
            Line line4 = new Line(new Position(71, 22), '*', 9, -1, false);
            Triangle triangle1 = new Triangle(new Position(75, 30), '0', 9);
            Circle circle = new Circle(new Position(40, 10), '#', 5);
            Rectangle rectangle = new Rectangle(new Position(30, 20), '=', 20, 40);
            Triangle triangle2 = new Triangle(new Position(19, 11), '0', 21);

            Line[] lines = {line1, line2, line3, line4};
            Triangle[] triangles = {triangle1, triangle2};
            Rectangle[] rectangles = {rectangle};
            Circle[] circles = {circle};
            Shape[][] shapes2 = {lines, triangles, rectangles, circles};
            Shape[] shapes = new Shape[8];

            for (int i = 0, k = 0; i < shapes2.length; i++)
            {
                for (int j = 0; j < shapes2[i].length; j++, k++)
                {
                    shapes[k] = shapes2[i][j];
                }
            }

            Canvas.Clear();

            for (int i = 0; i < shapes.length; i++) {
                Canvas.Add(shapes[i]);
            }
            Canvas.Display();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
    }
}
