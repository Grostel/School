package net.thumbtack.school.introduction;

public class FirstSteps {

    //1. Возвращает сумму чисел x и y.
    public int sum(int x, int y) {
        return x + y;
    }

    //2. Возвращает произведение чисел x и y.
    public int mul(int x, int y) {
        return x * y;
    }

    //3. Возвращает частное от деления чисел x и y. Гарантируется, что y != 0.
    public int div(int x, int y) {
        return x / y;
    }

    //4. Возвращает остаток от деления чисел x и y. Гарантируется, что y != 0.
    public int mod(int x, int y) {
        return x % y;
    }

    //5. Возвращает true, если  x равен y, иначе false.
    public boolean isEqual(int x, int y) {
        return x == y;
    }

    //6. Возвращает true, если  x больше y, иначе false.
    public boolean isGreater(int x, int y) {
        return x > y;
    }

    //7. Прямоугольник с горизонтальными и вертикальными сторонами, задан двумя точками - левой верхней (xLeft, yTop) и
    // правой нижней (xRight, yBottom). На плоскости OXY ось X направлена вправо, ось Y - вниз.
    // Дана еще одна точка с координатами (x, y). Гарантируется, что xLeft < xRight и yTop < yBottom.
    // Метод должен возвращать true, если точка лежит внутри прямоугольника , иначе false. Если точка лежит на границе прямоугольника, то считается, что она лежит внутри него.
    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return x >= xLeft && x <= xRight && y >= yTop && y <= yBottom;
    }

    //8. Возвращает сумму чисел, заданных одномерным массивом array. Для пустого одномерного массива возвращает 0.
    public int sum(int[] array) {
        int result = 0;
        for (int elem : array) {
            result += elem;
        }
        return result;
    }

    //9. Возвращает произведение чисел, заданных одномерным массивом array. Для пустого одномерного массива возвращает 0.
    public int mul(int[] array) {
        int result = (array.length == 0) ? 0 : 1;
        for (int elem : array) {
            result *= elem;
        }
        return result;
    }

    //10. Возвращает минимальное из чисел, заданных одномерным массивом array.
    // Для пустого одномерного массива возвращает Integer.MAX_VALUE.
    public int min(int[] array) {
        int result = Integer.MAX_VALUE;
        for (int elem : array) {
            result = elem < result ? elem : result;
        }
        return result;
    }

    //11. Возвращает максимальное из чисел, заданных одномерным массивом array.
    // Для пустого одномерного массива возвращает Integer.MIN_VALUE.
    public int max(int[] array) {
        int result = Integer.MIN_VALUE;
        for (int elem : array) {
            result = elem > result ? elem : result;
        }
        return result;
    }

    //12. Возвращает среднее значение для чисел, заданных одномерным массивом array.
    // Для пустого одномерного массива возвращает 0.
    public double average(int[] array) {
        return (array.length == 0) ? 0 : (double) sum(array) / (double) array.length;
    }

    //13. Возвращает true, если одномерный массив array строго упорядочен по убыванию, иначе false.
    // Пустой одномерный массив считается упорядоченным.
    public boolean isSortedDescendant(int[] array) {
        int last = Integer.MAX_VALUE;
        for (int elem : array) {
            if (elem >= last) {
                return false;
            }
            last = elem;
        }
        return true;
    }

    //14. Возводит все элементы одномерного массива array в куб.
    public void cube(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }
    }

    //15. Возвращает true, если в одномерном массиве array имеется элемент, равный value, иначе false.
    public boolean find(int[] array, int value) {
        for (int elem : array) {
            if (elem == value) {
                return true;
            }
        }
        return false;
    }

    //16. Переворачивает одномерный массив array, то есть меняет местами 0-й и последний, 1-й и предпоследний и т.д. элементы.
    public void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    //17. Возвращает true, если одномерный массив является палиндромом, иначе false. Пустой массив считается палиндромом.
    public boolean isPalindrome(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    //18. Возвращает сумму чисел, заданных двумерным массивом matrix.
    public int sum(int[][] matrix) {
        int result = 0;
        for (int[] elem : matrix) {
            result += sum(elem);
        }
        return result;
    }

    //19. Возвращает максимальное из чисел, заданных двумерным массивом matrix.
    // Для пустого двумерного массива возвращает Integer.MIN_VALUE.
    public int max(int[][] matrix) {
        int result = Integer.MIN_VALUE;
        for (int el[]: matrix) {
            int temp = max(el);
            result = Math.max(temp, result);
        }
        return result;
    }

    //20. Возвращает максимальное из чисел, находящихся на главной диагонали квадратного двумерного массива matrix.
    // Для пустого двумерного массива возвращает Integer.MIN_VALUE.
    public int diagonalMax(int[][] matrix) {
        int result = Integer.MIN_VALUE;
        if (matrix.length > 1) {
            for (int i = 0; i < matrix.length; i++) {
                result = Math.max(matrix[i][i], result);
            }
        }
        return result;
    }

    //21.  Возвращает true, если все строки двумерного массива matrix строго упорядочены по убыванию, иначе false.
    // Пустая строка считается упорядоченной. Разные строки массива matrix могут иметь разное количество элементов.
    // При написании метода рекомендуется внутри него вызвать метод из п. 13.
    public boolean isSortedDescendant(int[][] matrix) {
        for (int el[]: matrix) {
            if (!isSortedDescendant(el)){
                return false;
            }
        }
        return true;
    }


}
