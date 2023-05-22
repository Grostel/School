package net.thumbtack.school.base;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberOperations {

    //1. Ищет в массиве array первый элемент, значение которого равно value. Если такое значение найдено, возвращает его позицию в массиве array, в противном случае возвращает null.
    public static Integer find(int[] array, int value) {
        int i = 0;
        for (int elem : array) {
            if (elem == value) {
                return i;
            }
            i++;
        }
        return null;
    }

    //2. Ищет в массиве array первый элемент, значение которого по модулю не отличается от value более чем на eps.
    // Если такое значение найдено, возвращает его позицию в массиве array, в противном случае возвращает null.
    public static Integer find(double[] array, double value, double eps) {
        int i = 0;
        for (double elem : array) {
            if (Math.abs(elem) < value + eps & Math.abs(elem) > value - eps) {
                return i;
            }
            i++;
        }
        return null;
    }

    //3. Вычисляет плотность вещества по формуле weight / volume. Если получившееся значение не превышает max и не меньше min, возвращает полученное значение,
    // в противном случае возвращает null.
    public static Double calculateDensity(double weight, double volume, double min, double max) {
        return (weight / volume < max & weight / volume > min) ? weight / volume : null;
    }

    //4. Ищет в массиве array первый элемент, значение которого равно value. Если такое значение найдено, возвращает его позицию в массиве array, в противном случае возвращает null.
    public static Integer find(BigInteger[] array, BigInteger value) {
        int i = 0;
        for (BigInteger elem : array) {
            if (0 == elem.compareTo(value)) {
                return i;
            }
            i++;
        }
        return null;
    }


    //5. Вычисляет плотность вещества по формуле weight / volume. Если получившееся значение не превышает max и не меньше min, возвращает полученное значение, в противном случае возвращает null.
    public static BigDecimal calculateDensity(BigDecimal weight, BigDecimal volume, BigDecimal min, BigDecimal max) {
        return (-1 == (weight.divide(volume)).compareTo(max) & 1 == (weight.divide(volume)).compareTo(min)) ? weight.divide(volume) : null;
    }
}