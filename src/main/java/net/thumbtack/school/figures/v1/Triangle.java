package net.thumbtack.school.figures.v1;

public class Triangle {

    private Point2D point1;
    private Point2D point2;
    private Point2D point3;


    //1. Создает Triangle по координатам трех точек.
    public Triangle(Point2D point1, Point2D point2, Point2D point3){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    //2. Возвращает точку 1 треугольника.
    public Point2D getPoint1(){
        return point1;
    }

    //3. Возвращает точку 2 треугольника.
    public Point2D getPoint2(){
        return point2;
    }

    //4. Возвращает точку 3 треугольника.
    public Point2D getPoint3(){
        return point3;
    }


    //5. Устанавливает точку 1 треугольника.
    public void setPoint1(Point2D point){
        point1 = point;
    }

    //6. Устанавливает точку 2 треугольника.
    public void setPoint2(Point2D point){
        point2 = point;
    }

    //7. Устанавливает точку 3 треугольника.
    public void setPoint3(Point2D point){
        point3 = point;
    }

    //8. Возвращает длину стороны 1-2.
    public double getSide12(){
        return Math.sqrt(Math.pow(point2.getX() - point1.getX(),2)+(Math.pow(point2.getY() - point1.getY(),2)));

    }

    //9. Возвращает длину стороны 1-3.
    public double getSide13(){
        return Math.sqrt(Math.pow(point3.getX() - point1.getX(),2)+(Math.pow(point3.getY() - point1.getY(),2)));
    }

    //10. Возвращает длину стороны 2-3.
    public double getSide23(){
        return Math.sqrt(Math.pow(point3.getX() - point2.getX(),2)+(Math.pow(point3.getY() - point2.getY(),2)));
    }

    //11. Передвигает Triangle на (dx, dy).
    public void moveRel(int dx, int dy){
        point1.moveRel(dx, dy);
        point2.moveRel(dx, dy);
        point3.moveRel(dx, dy);
    }

    //12. Возвращает площадь треугольника.
    public double getArea(){
        double semiPerimeter = getPerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - getSide12()) * (semiPerimeter - getSide13()) * (semiPerimeter - getSide23()));
    }

    //13. Возвращает периметр треугольника.
    public double getPerimeter(){
        return getSide12() + getSide13() + getSide23();
    }

    //14. Определяет, лежит ли точка (x, y) внутри Triangle. Если точка лежит на стороне треугольника, считается, что она лежит внутри.
    public boolean isInside(int x, int y){
       int a = (point1.getX() - x) * (point2.getY() - point1.getY()) - (point1.getY() - y) * (point2.getX() - point1.getX());
       int b = (point2.getX() - x) * (point3.getY() - point2.getY()) - (point2.getY() - y) * (point3.getX() - point2.getX());
       int c = (point3.getX() - x) * (point1.getY() - point3.getY()) - (point3.getY() - y) * (point1.getX() - point3.getX());

       return ((a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0));
    }

    //15. Определяет, лежит ли точка point внутри Triangle. Если точка лежит на стороне треугольника, считается, что она лежит внутри.
    public boolean isInside(Point2D point){
        return isInside(point.getX(), point.getY());
    }

    //16. методы equals и hashCode. Не пишите эти методы сами, используйте средства IDEA.
    // Обращаем внимание на то, что треугольники считаются равными только если попарно совпадают точки 1, 2 и 3 для обоих треугольников.
    // Треугольники, созданные на основе тех же точек, но в ином порядке, равными не считаются.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (!point1.equals(triangle.point1)) return false;
        if (!point2.equals(triangle.point2)) return false;
        return point3.equals(triangle.point3);
    }

    @Override
    public int hashCode() {
        int result = point1.hashCode();
        result = 31 * result + point2.hashCode();
        result = 31 * result + point3.hashCode();
        return result;
    }
}
