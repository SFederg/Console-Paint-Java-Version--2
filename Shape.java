public abstract class Shape {
    protected Position position;
    protected char fillCharacter;

    public Shape(Position position, char fillCharacter) {
        this.position = position;
        this.fillCharacter = fillCharacter;
    }

    public abstract void draw(String[] drawArea);
}
