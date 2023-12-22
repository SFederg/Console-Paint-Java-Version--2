import java.util.ArrayList;

public abstract class Shape implements IGroupable {
    protected Position position;
    protected char fillCharacter;
    private ArrayList<Shape> groupShapes = new ArrayList<Shape>();

    public Shape(Position position, char fillCharacter) {
        this.position = position;
        this.fillCharacter = fillCharacter;
    }

    public abstract void draw(String[] drawArea);

    public void Group(Shape shape) {
        groupShapes.add(shape);
    }

    public void DrawGroup(String[] drawArea) {
        draw(drawArea);
        for (Shape shape : groupShapes) {
            shape.DrawGroup(drawArea);
        }
    }
}
