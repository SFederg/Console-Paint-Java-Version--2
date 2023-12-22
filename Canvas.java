public class Canvas implements Cloneable {
    private int width;
    private int height;
    private char fillCharacter;
    private String[] drawArea;

    public Canvas(int width, int height, char fillCharacter) {
        this.width = width;
        this.height = height;
        this.fillCharacter = fillCharacter;
        drawArea = new String[height];
        Clear();
    }

    public void Clear() {
        char [] str = new char[width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
				str[j] = fillCharacter;
            }
            drawArea[i] = new String(str);
        }
    }

    public void Add (Shape shape) {
        shape.draw(drawArea);
    }

    public void Add (IGroupable group) {
        group.DrawGroup(drawArea);
    }

    @Override
    public String toString() {
        StringBuilder drawAreaStr = new StringBuilder();

        for (int i = 0; i < height; i++) {
            drawAreaStr.append(drawArea[i]).append("\n");
        }

        return drawAreaStr.toString();
    }

    @Override
    public Canvas clone() {
        try {
            Canvas clone = (Canvas) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}