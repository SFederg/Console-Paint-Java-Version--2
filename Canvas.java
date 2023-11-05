public class Canvas {
    private int width;
    private int height;
    private char fillCharacter;
    private char[][] drawArea;

    public Canvas(int width, int height, char fillCharacter) {
        this.width = width;
        this.height = height;
        this.fillCharacter = fillCharacter;
        drawArea = new char[height][width];
        Clear();
    }

    public void Clear() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
				drawArea[i][j] = fillCharacter;
            }
        }
    }

    public void Add (Shape shape) {
        shape.draw(drawArea);
    }

    public  void Display() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(drawArea[i][j]);
            }
            System.out.println();
        }
    }
}
