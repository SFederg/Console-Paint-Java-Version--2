public class Triangle extends Shape {
    private int sidesLength;
    private Line firstSide;
    private Line secondSide;
    private Line thirdSide;

    public Triangle (Position position, char fillCharacter, int sidesLength) throws Exception {
        super(position, fillCharacter);
        if (sidesLength < 2) {
            throw new IllegalArgumentException("sidesLength can't be less than 2");
        }
        this.sidesLength = sidesLength;

        firstSide = new Line(position, fillCharacter, sidesLength, 1, false);
        secondSide = new Line(new Position(
                position.getX() + sidesLength - 1,
                sidesLength % 2 == 0 ? position.getY() - 1 : position.getY() - 2
        ), fillCharacter, sidesLength, -1, false);
        thirdSide = new Line(new Position(
                sidesLength % 2 == 0 ? position.getX() + sidesLength / 2 - 1 : position.getX() + sidesLength / 2,
                position.getY() + sidesLength / 2 - 1
        ), fillCharacter, sidesLength * 2 - 1, 0, false);
    }

    @Override
    public void draw(String[] drawArea) {
        firstSide.draw(drawArea);
        secondSide.draw(drawArea);
        thirdSide.draw(drawArea);
    }
}
