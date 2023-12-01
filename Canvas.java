public class Canvas {
    private static final int width = 100;
    private static final int height = 50;
    private static final char fillCharacter = ' ';
    private static String[] drawArea = new String[height];

    public static void Clear() {
        char [] str = new char[width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
				str[j] = fillCharacter;
            }
            drawArea[i] = new String(str);
        }
    }

    public static void Add (Shape shape) {
        shape.draw(drawArea);
    }

    public static void Display() {
        for (int i = 0; i < height; i++) {
            System.out.print(drawArea[i] + "\n");
        }
    }
}
