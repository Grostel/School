package net.thumbtack.school.figures.v1;

public class Rectangle {
    private Point2D leftTop, rightBottom;

    //1.  Создает Rectangle по координатам углов - левого верхнего и правого нижнего.
    public Rectangle(Point2D leftTop, Point2D rightBottom) {
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
    }

    //2. Создает Rectangle по координатам углов - левого верхнего и правого нижнего.
    public Rectangle(int xLeft, int yTop, int xRight, int yBottom){
        this(new Point2D(xLeft, yTop), new Point2D(xRight, yBottom));
    }

    //3. Создает Rectangle, левый нижний угол которого находится в начале координат, а длина (по оси X) и ширина (по оси Y) задаются.
    public Rectangle(int length, int width){
        this(0, -width, length, 0);
    }

    //4. Создает Rectangle с размерами (1,1), левый нижний угол которого находится в начале координат.
    public Rectangle(){
        this(1,1);
    }

    //5. Возвращает левую верхнюю точку Rectangle.
    public Point2D getTopLeft(){
        return leftTop;
    }

    //6. Возвращает правую нижнюю точку Rectangle.
    public Point2D getBottomRight(){
        return rightBottom;
    }

    //7. Устанавливает левую верхнюю точку Rectangle.
    public void setTopLeft(Point2D topLeft){
        leftTop = topLeft;
    }

    //8. Устанавливает правую нижнюю точку Rectangle.
    public void setBottomRight(Point2D bottomRight){
        rightBottom = bottomRight;
    }

    //9. Возвращает длину прямоугольника.
    public int getLength(){
        return rightBottom.getX() - leftTop.getX();
    }

    //10. Возвращает ширину прямоугольника.
    public int getWidth(){
        return rightBottom.getY() - leftTop.getY();
    }


}
