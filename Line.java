public class Line extends Shape {
    private int countPoints;
    private double angleFactor;
    private boolean isArgumentConst;

    public Line (Position position, char fillCharacter, int countPoints, double angleFactor, boolean isArgumentConst) throws Exception {
        super(position, fillCharacter);

        if (countPoints <= 0) {
            throw new IllegalArgumentException("countPoints can't be less or equal zero");
        }

        this.countPoints = countPoints;
        this.angleFactor = angleFactor;
        this.isArgumentConst = isArgumentConst;
    }

    @Override
    public void draw(String[] drawArea) {
        int correctCountPoints = countPoints;
        int y = -1, x = -1 * (correctCountPoints / 2);

        while (correctCountPoints != 0) {
            boolean flag = true;
            if (!isArgumentConst) {
                x++;
                y = (int)(-1 * angleFactor * x);
                flag = ((-1 * angleFactor * x) - (int)(-1 * angleFactor * x)) == 0;
            }
            else {
                x = 0;
                y++;
            }

            if (flag) {
                correctCountPoints--;
                if ((x + position.getX()) < drawArea[0].length() && (y + position.getY()) < drawArea.length) {
                    char[] str = drawArea[y + position.getY()].toCharArray();
                    str[x + position.getX()] = fillCharacter;
                    drawArea[y + position.getY()] = new String(str);
                }
            }
        }
    }
}
