package net.thumbtack.school.figures.v1;

public class CircleFactory {
    private static int counter;

    //1. Создает Circle по координатам центра и значению радиуса.
    public static Circle createCircle(Point2D center, int radius){
        counter++;
        return new Circle(center, radius);
    }

    //2. Возвращает количество Circle, созданных с помощью метода createCircle.
    public static int getCircleCount(){
        return counter;
    }

    //3. Устанавливает количество Circle, созданных с помощью метода createCircle, равным 0 (иными словами, реинициализирует фабрику).
    public static void reset(){
        counter = 0;
    }
}
