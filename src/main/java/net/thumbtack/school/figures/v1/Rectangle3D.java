package net.thumbtack.school.figures.v1;

public class Rectangle3D extends Rectangle{

    private int height;


    //1. Создает Rectangle3D по координатам углов основания (левого верхнего и правого нижнего) и высотой.
    public Rectangle3D(Point2D leftTop, Point2D rightBottom, int height){
        super(leftTop, rightBottom);
        this.height = height;
    }


    //2. Создает Rectangle3D по координатам углов основания (левого верхнего и правого нижнего) и высотой.
    public Rectangle3D(int xLeft, int yTop, int xRight, int yBottom, int height){
        super(xLeft, yTop, xRight, yBottom);
        this.height = height;
    }


    //3. Создает Rectangle3D, левый нижний угол которого находится в начале координат, а длина, ширина и высота задаются.
    public Rectangle3D(int length, int width, int height){
        super(length, width);
        this.height = height;
    }


    //4. Создает Rectangle3D с размерами (1, 1, 1), левый нижний угол которого находится в начале координат.
    public Rectangle3D(){
        super();
        this.height = 1;
    }


    //5. Возвращает левую верхнюю точку Rectangle основания.
    public Point2D getTopLeft(){
        return super.getTopLeft();
    }


    //6. Возвращает правую нижнюю точку Rectangle основания.
    public Point2D getBottomRight(){
        return super.getBottomRight();
    }


    //7. Возвращает высоту параллелепипеда.
    public int getHeight(){
        return height;
    }


    //8. Устанавливает левую верхнюю точку Rectangle основания.
    public void setTopLeft(Point2D topLeft){
        super.setTopLeft(topLeft);
    }


    //9. Устанавливает правую нижнюю точку Rectangle основания.
    public void setBottomRight(Point2D bottomRight){
        super.setBottomRight(bottomRight);
    }


    //10. Устанавливает высоту параллелепипеда.
    public void setHeight(int height){
        this.height = height;
    }


    //11. Возвращает длину прямоугольника основания.
    public int getLength(){
        return super.getLength();
    }


    //12. Возвращает ширину прямоугольника основания.
    public int getWidth(){
        return super.getWidth();
    }


    //13. Передвигает Rectangle3D на (dx, dy). Высота не изменяется.
    public void moveRel(int dx, int dy){
        super.moveRel(dx, dy);
    }


    //14. Увеличивает стороны Rectangle основания в (nx, ny) раз при сохранении координат левой верхней вершины; высота не изменяется.
    public void enlarge(int nx, int ny){
        super.enlarge(nx, ny);
    }

    //15. Возвращает площадь прямоугольника  основания.
    public double getArea(){
        return super.getArea();
    }


    //16. Возвращает периметр прямоугольника основания.
    public double getPerimeter(){
        return super.getPerimeter();
    }


    //17. Возвращает объем параллелепипеда.
    public double getVolume(){
        return getArea() * height;
    }


    //18. Определяет, лежит ли точка (x, y) внутри Rectangle основания. Если точка лежит на стороне, считается, что она лежит внутри.
    public boolean isInside(int x, int y){
        return super.isInside(x, y);
    }

    //19. Определяет, лежит ли точка point внутри Rectangle основания. Если точка лежит на стороне, считается, что она лежит внутри.
    public boolean isInside(Point2D point){
        return super.isInside(point);
    }

    //20. Определяет, лежит ли точка (x, y, z) внутри Rectangle3D. Если точка лежит на стороне, считается, что она лежит внутри.
    public boolean isInside(int x, int y, int z){
        return isInside(x, y) && z <= height;
    }

    //21. Определяет, лежит ли точка point внутри Rectangle3D. Если точка лежит на стороне, считается, что она лежит внутри.
    public boolean isInside(Point3D point){
        return isInside(point.getX(), point.getY(), point.getZ());
    }

    //22. Определяет, пересекается  ли Rectangle3D с другим Rectangle3D. Считается, что параллелепипеды пересекаются, если у них есть хоть одна общая точка.
    public boolean isIntersects(Rectangle3D rectangle){
        return super.isIntersects(rectangle);
    }

    //23. Определяет, лежит ли rectangle3D целиком внутри текущего Rectangle3D.
    public boolean isInside(Rectangle3D rectangle){
        return super.isInside(rectangle) && height >= rectangle.getHeight();
    }


    //24.	методы equals и hashCode. Не пишите эти методы сами, используйте средства IDEA.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rectangle3D that = (Rectangle3D) o;

        return height == that.height;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + height;
        return result;
    }
}
