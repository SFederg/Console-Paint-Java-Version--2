public class Circle extends Shape {
    private int radius;

    public Circle(Position position, char fillCharacter, int radius) throws Exception {
        super(position, fillCharacter);

        if (radius < 3) {
            throw new Exception("Incorrect radius");
        }

        this.radius = radius;
    }

    @Override
    public void draw(String[] drawArea) {
        int radius = this.radius;
        int centerX = position.getX();
        int centerY = position.getY();

        for (int y = -radius; y <= radius + centerY; y++) {
            for (int x = -radius; x <= radius + centerX; x++) {
                if (((x - centerX) * (x - centerX) + (y - centerY) * (y - centerY)) <= (radius * radius)) {
                    if ((x + centerX) < drawArea[0].length() && (y + centerY) < drawArea.length) {
                        char[] str = drawArea[y + centerY].toCharArray();
                        str[x + centerX] = fillCharacter;
                        drawArea[y + centerY] = new String(str);
                    }
                }
            }
        }
    }
}
