package net.thumbtack.school.figures.v1;

public class Circle {
    private Point2D center;
    private int radius;

    //1. Создает Circle по координатам центра и значению радиуса.
    public Circle(Point2D center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    //2. Создает Circle по координатам центра и значению радиуса.
    public Circle(int xCenter, int yCenter, int radius) {
        this(new Point2D(xCenter,yCenter),radius);
    }

    //3. Создает Circle с центром в точке (0,0) указанного радиуса.
    public Circle(int radius) {
        this(0,0, radius);
    }

    //4. Создает Circle с центром в точке (0,0) с радиусом 1.
    public Circle() {
        this(1);
    }

    //5. Возвращает центр Circle.
    public Point2D getCenter() {
        return center;
    }

    //6. Возвращает радиус Circle.
    public int getRadius() {
        return radius;
    }

    //7. Устанавливает центр Circle.
    public void setCenter(Point2D center) {
        this.center = center;
    }

    //8. Устанавливает радиус Circle.
    public void setRadius(int radius) {
        this.radius = radius;
    }

    //9. Передвигает Circle на (dx, dy).
    public void moveRel(int dx, int dy) {
        center.moveRel(dx, dy);
    }

    //10. Увеличивает радиус Circle в n раз, не изменяя центра.
    public void enlarge(int n) {
        radius *= n;
    }

    //11. Возвращает площадь круга.
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //12. Возвращает периметр окружности (длину окружности).
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    //13. Определяет, лежит ли точка (x, y) внутри Circle. Если точка лежит на окружности, считается, что она лежит внутри.
    public boolean isInside(int x, int y) {
        return Math.pow(x - center.getX(), 2) + Math.pow(y - center.getY(), 2) <= radius * radius;
    }

    //14. Определяет, лежит ли точка point внутри Circle. Если точка лежит на окружности, считается, что она лежит внутри.
    public boolean isInside(Point2D point) {
        return isInside(point.getX(), point.getY());
    }

    //15. методы equals и hashCode. Не пишите эти методы сами, используйте средства IDEA.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (radius != circle.radius) return false;
        return center.equals(circle.center);
    }

    @Override
    public int hashCode() {
        int result = center.hashCode();
        result = 31 * result + radius;
        return result;
    }
}
