package net.thumbtack.school.figures.v1;

public class Rectangle {
    private Point2D leftTop, rightBottom;

    //1.  Создает Rectangle по координатам углов - левого верхнего и правого нижнего.
    public Rectangle(Point2D leftTop, Point2D rightBottom) {
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
    }

    //2. Создает Rectangle по координатам углов - левого верхнего и правого нижнего.
    public Rectangle(int xLeft, int yTop, int xRight, int yBottom) {
        this(new Point2D(xLeft, yTop), new Point2D(xRight, yBottom));
    }

    //3. Создает Rectangle, левый нижний угол которого находится в начале координат, а длина (по оси X) и ширина (по оси Y) задаются.
    public Rectangle(int length, int width) {
        this(0, -width, length, 0);
    }

    //4. Создает Rectangle с размерами (1,1), левый нижний угол которого находится в начале координат.
    public Rectangle() {
        this(1, 1);
    }

    //5. Возвращает левую верхнюю точку Rectangle.
    public Point2D getTopLeft() {
        return leftTop;
    }

    //6. Возвращает правую нижнюю точку Rectangle.
    public Point2D getBottomRight() {
        return rightBottom;
    }

    //7. Устанавливает левую верхнюю точку Rectangle.
    public void setTopLeft(Point2D topLeft) {
        leftTop = topLeft;
    }

    //8. Устанавливает правую нижнюю точку Rectangle.
    public void setBottomRight(Point2D bottomRight) {
        rightBottom = bottomRight;
    }

    //9. Возвращает длину прямоугольника.
    public int getLength() {
        return rightBottom.getX() - leftTop.getX();
    }

    //10. Возвращает ширину прямоугольника.
    public int getWidth() {
        return rightBottom.getY() - leftTop.getY();
    }

    //11. Передвигает Rectangle на (dx, dy).
    public void moveRel(int dx, int dy) {
        leftTop.moveRel(dx, dy);
        rightBottom.moveRel(dx, dy);
    }

    //12. Увеличивает стороны Rectangle в (nx, ny) раз при сохранении координат левой верхней вершины.
    public void enlarge(int nx, int ny) {
        rightBottom.moveRel(getLength() * (nx - 1) , getWidth() * (ny - 1));
    }

    //13. Возвращает площадь прямоугольника.
    public double getArea() {
        return getLength() * getWidth();
    }

    //14. Возвращает периметр прямоугольника.
    public double getPerimeter() {
        return (getLength() + getWidth()) * 2;
    }

    //15. Определяет, лежит ли точка (x, y) внутри Rectangle. Если точка лежит на стороне, считается, что она лежит внутри.
    public boolean isInside(int x, int y) {
        return (x >= leftTop.getX() && x <= rightBottom.getX() && y >= leftTop.getY() && y <= rightBottom.getY());
    }

    // 16. Определяет, лежит ли точка point внутри Rectangle. Если точка лежит на стороне, считается, что она лежит внутри.
    public boolean isInside(Point2D point) {
          return (point.getX() >= leftTop.getX() && point.getX() <= rightBottom.getX() && point.getY() >= leftTop.getY() && point.getY() <= rightBottom.getY());
    }

    //17. Определяет, пересекается  ли Rectangle с другим Rectangle. Считается, что прямоугольники пересекаются, если у них есть хоть одна общая точка.
    public boolean isIntersects(Rectangle rectangle) {
      return (((leftTop.getX() >= rectangle.getTopLeft().getX() && leftTop.getX() <= rectangle.getBottomRight().getX()) ||
                leftTop.getX() < rectangle.getTopLeft().getX() && rightBottom.getX() > rectangle.getTopLeft().getX()) &&
                ((leftTop.getY() >= rectangle.getTopLeft().getY() && leftTop.getY() <= rectangle.getBottomRight().getY()) ||
                leftTop.getY() < rectangle.getTopLeft().getY() && rightBottom.getY() > rectangle.getTopLeft().getY()));
    }

    //18. Определяет, лежит ли rectangle целиком внутри текущего Rectangle.
    public boolean isInside(Rectangle rectangle) {
        return leftTop.getX() <= rectangle.getTopLeft().getX() && leftTop.getY() <= rectangle.getTopLeft().getY() &&
                rightBottom.getX() >= rectangle.getBottomRight().getX() && rightBottom.getY() >= rectangle.getBottomRight().getY();
    }

    //19. методы equals и hashCode. Не пишите эти методы сами, используйте средства IDEA.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (!leftTop.equals(rectangle.leftTop)) return false;
        return rightBottom.equals(rectangle.rightBottom);
    }

    @Override
    public int hashCode() {
        int result = leftTop.hashCode();
        result = 31 * result + rightBottom.hashCode();
        return result;
    }
}
