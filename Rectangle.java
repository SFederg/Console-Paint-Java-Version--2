public class Rectangle extends Shape {
    private int verticalSidesLength;
    private int horizontalSidesLength;
    private Line firstSide;
    private Line secondSide;
    private Line thirdSide;
    private Line fourthSide;

    public Rectangle (Position position, char fillCharacter, int verticalSidesLength, int horizontalSidesLength) throws Exception {
        super(position, fillCharacter);

        if (verticalSidesLength < 2 || horizontalSidesLength < 2) {
            throw new IllegalArgumentException("verticalSidesLength and horizontalSidesLength can't be less than 2");
        }

        this.verticalSidesLength = verticalSidesLength;
        this.horizontalSidesLength = horizontalSidesLength;

        firstSide = new Line(position, fillCharacter, horizontalSidesLength, 0, false);
        secondSide = new Line(new Position(
                position.getX() - (horizontalSidesLength / 2 - 1),
                position.getY()
        ), fillCharacter, verticalSidesLength, 0, true);
        thirdSide = new Line(new Position(
                horizontalSidesLength % 2 == 0 ? position.getX() + (horizontalSidesLength / 2) : position.getX() + (horizontalSidesLength / 2) + 1,
                position.getY()
        ), fillCharacter, verticalSidesLength, 0, true);
        fourthSide = new Line(new Position(
                position.getX(),
                position.getY() + (verticalSidesLength - 1)
        ), fillCharacter, horizontalSidesLength, 0, false);
    }

    @Override
    public void draw(String[] drawArea) {
        firstSide.draw(drawArea);
        secondSide.draw(drawArea);
        thirdSide.draw(drawArea);
        fourthSide.draw(drawArea);
    }
}
