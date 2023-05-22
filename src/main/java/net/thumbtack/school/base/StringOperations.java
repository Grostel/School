package net.thumbtack.school.base;

public class StringOperations {

    //1. Возвращает суммарную длину строк, заданных массивом strings.
    public static int getSummaryLength(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (String elem : strings) {
            sb.append(elem);
        }
        return sb.length();
    }

    //2. Возвращает двухсимвольную строку, состоящую из начального и конечного символов заданной строки.
    public static String getFirstAndLastLetterString(String string) {
        char[] str = {string.charAt(0), string.charAt(string.length() - 1)};
        return String.valueOf(str);
    }

    //3. Возвращает true, если обе строки в позиции index содержат один и тот же символ, иначе false.
    public static boolean isSameCharAtPosition(String string1, String string2, int index) {
        return string1.charAt(index) == (string2.charAt(index));
    }

    //4. Возвращает true, если в обеих строках первый встреченный символ character находится в одной и той же позиции. Просмотр строк ведется от начала.
    public static boolean isSameFirstCharPosition(String string1, String string2, char character) {
        return string1.indexOf(character) == string2.indexOf(character);
    }

    //5. Возвращает true, если в обеих строках первый встреченный символ character находится в одной и той же позиции. Просмотр строк ведется от конца.
    public static boolean isSameLastCharPosition(String string1, String string2, char character) {
        return string1.lastIndexOf(character) == string2.lastIndexOf(character);
    }

    //6. Возвращает true, если в обеих строках первая встреченная подстрока str начинается в одной и той же позиции. Просмотр строк ведется от начала.
    public static boolean isSameFirstStringPosition(String string1, String string2, String str) {
        return string1.indexOf(str) == string2.indexOf(str);
    }

    //7. Возвращает true, если в обеих строках первая встреченная подстрока str начинается в одной и той же позиции. Просмотр строк ведется от конца.
    public static boolean isSameLastStringPosition(String string1, String string2, String str) {
        return string1.lastIndexOf(str) == string2.lastIndexOf(str);
    }

    //8. Возвращает true, если строки равны.
    public static boolean isEqual(String string1, String string2) {
        return string1.equals(string2);
    }

    //9. Возвращает true, если строки равны без учета регистра (например, строки “abc” и “aBC” в этом смысле равны).
    public static boolean isEqualIgnoreCase(String string1, String string2) {
        return isEqual(string1.toLowerCase(), string2.toLowerCase());
    }

    //10. Возвращает true, если строка string1 меньше строки string2.
    public static boolean isLess(String string1, String string2) {
        return string1.compareTo(string2) < 0;
    }

    //11. Возвращает true, если строка string1 меньше строки string2 без учета регистра (например, строка “abc” меньше строки “ABCd” в этом смысле).
    public static boolean isLessIgnoreCase(String string1, String string2) {
        return isLess(string1.toLowerCase(), string2.toLowerCase());
    }

    //12. Возвращает строку, полученную путем сцепления двух строк.
    public static String concat(String string1, String string2) {
        return string1 + string2;
    }

    //13. Возвращает true, если обе строки string1 и string2 начинаются с одной и той же подстроки prefix.
    public static boolean isSamePrefix(String string1, String string2, String prefix) {
        if (string1.length() >= prefix.length() && string2.length() >= prefix.length()) {
            return isEqual(string1.substring(0, prefix.length()), prefix) &&
                    isEqual(string2.substring(0, prefix.length()), prefix);
        } else {
            return false;
        }
    }

    //14. Возвращает true, если обе строки string1 и string2 заканчиваются одной и той же подстрокой suffix.
    public static boolean isSameSuffix(String string1, String string2, String suffix) {
        StringBuilder sb = new StringBuilder(string1);
        StringBuilder sb2 = new StringBuilder(string2);
        StringBuilder sb3 = new StringBuilder(suffix);
        sb.reverse();
        sb2.reverse();
        sb3.reverse();
        string1 = sb.toString();
        string2 = sb2.toString();
        suffix = sb3.toString();
        return isSamePrefix(string1, string2, suffix);
    }

    //15. Возвращает самое длинное общее “начало” двух строк. Если у строк нет общего начала, возвращает пустую строку.
    public static String getCommonPrefix(String string1, String string2) {

        if (string1.length() > 0 & string2.length() > 0) {
            if (isLess(string1, string2)) {
                for (int i = 0; i < (string1.length()) - 1; i++) {
                    if (!isSameCharAtPosition(string1, string2, i)) {
                        return string1.substring(0, i);
                    }
                }
                return string1;
            } else {
                for (int i = 0; i < (string2.length()) - 1; i++) {
                    if (!isSameCharAtPosition(string1, string2, i)) {
                        return string2.substring(0, i);
                    }
                }
                return string2;
            }
        }
        return "";
    }

    //16. Возвращает перевернутую строку.
    public static String reverse(String string) {
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString();
    }

    //17. Возвращает true, если строка является палиндромом, то есть читается слева направо так же, как и справа налево.
    public static boolean isPalindrome(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    //18. Возвращает true, если строка является палиндромом, то есть читается слева направо так же, как и справа налево, без учета регистра.
    public static boolean isPalindromeIgnoreCase(String string) {
        return isPalindrome(string.toLowerCase());
    }

    //19. Возвращает самый длинный палиндром (без учета регистра) из массива заданных строк. Если в массиве нет палиндромов, возвращает пустую строку.
    public static String getLongestPalindromeIgnoreCase(String[] strings) {
        String res;
        res = "";
        for (String elem : strings) {
            if (isPalindromeIgnoreCase(elem) & elem.length() > res.length()) {
                res = elem;
            }
        }
        return res;
    }

    //20. Возвращает true, если обе строки содержат один и тот же фрагмент длиной length, начиная с позиции index.
    public static boolean hasSameSubstring(String string1, String string2, int index, int length){
        return  getCommonPrefix(string1.substring(index),string2.substring(index)).length() == length;
    }

    //21. Возвращает true, если после замены в string1 всех вхождений replaceInStr1 на replaceByInStr1 и замены в string2 всех вхождений replaceInStr2 на replaceByInStr2
    // полученные строки равны.
    public static boolean isEqualAfterReplaceCharacters(String string1, char replaceInStr1, char replaceByInStr1, String string2, char replaceInStr2, char replaceByInStr2){
        return isEqual(string1.replace(replaceInStr1,replaceByInStr1),string2.replace(replaceInStr2,replaceByInStr2));
    }

    //22. Возвращает true, если после замены в string1 всех вхождений строки replceInStr1 на replaceByInStr1 и замены в string2 всех вхождений replceInStr2 на replaceByInStr2
    // полученные строки равны.
    public static boolean isEqualAfterReplaceStrings(String string1, String replaceInStr1, String replaceByInStr1, String string2, String replaceInStr2, String replaceByInStr2){
        return isEqual(string1.replace(replaceInStr1,replaceByInStr1),string2.replace(replaceInStr2,replaceByInStr2));
    }

    //23. Возвращает true, если строка после выбрасывания из нее всех пробелов является палиндромом, без учета регистра.
    public static boolean isPalindromeAfterRemovingSpacesIgnoreCase(String string){
        return isPalindromeIgnoreCase(string.replace(" ",""));
    }

    //24. Возвращает true, если две строки равны, если не принимать во внимание все пробелы в начале и конце каждой строки.
    public static boolean isEqualAfterTrimming(String string1, String string2){
        return isEqual(string1.trim(),string2.trim());
    }

    //25. Для заданного массива целых чисел создает текстовую строку, в которой числа разделены знаком “запятая” (т.н. формат CSV - comma separated values).
    // Для пустого массива возвращается пустая строка.
    public static String makeCsvStringFromInts(int[] array){
        String result = "";
        for (int elem: array){
            result = result + "," + elem;
        }
        return result.replaceFirst(",","");
    }

    //26.Для заданного массива вещественных чисел создает текстовую строку, в которой числа разделены знаком “запятая”, причем каждое число записывается с двумя знаками после точки.
    // Для пустого массива возвращается пустая строка.
    public static String makeCsvStringFromDoubles(double[] array){
        String result = "";
        for (double elem: array){
            result = result + "," + String.format("%.2f", elem);
        }
        return result.replaceFirst(",","");
    }

    //27. То же, что и в упражнении 25, но возвращает StringBuilder.
    public static StringBuilder makeCsvStringBuilderFromInts(int[] array){
        StringBuilder sb = new StringBuilder(makeCsvStringFromInts(array));
        return sb;
    }


    //28. То же, что и в упражнении 26, но возвращает StringBuilder.
    public static StringBuilder makeCsvStringBuilderFromDoubles(double[] array){
        StringBuilder sb = new StringBuilder(makeCsvStringFromDoubles(array));
        return sb;
    }


    //29. Удаляет из строки символы, номера которых заданы в массиве positions. Предполагается, что будут передаваться только допустимые номера, упорядоченные по возрастанию.
    //Номера позиций для удаления указаны для исходной строки. Возвращает полученный в результате StringBuilder.
    public static StringBuilder removeCharacters(String string, int[] positions){
        StringBuilder sb = new StringBuilder(string);
        int i = 0;
        for (int elem: positions) {
            sb.deleteCharAt(elem - i);
            i++;
        }
        return sb;
    }

    //30.	Вставляет в строку символы. Массивы positions и characters имеют одинаковую длину. В позицию positions[i] в исходной строке string вставляется символ characters[i].
    // Если в массиве positions один и тот же номер позиции повторяется несколько раз, это значит, что в указанную позицию вставляется несколько символов, в том порядке,
    // в котором они перечислены в массиве characters. Предполагается, что будут передаваться только допустимые номера, упорядоченные по неубыванию.
    // Возвращает полученный в результате StringBuilder.
    public static StringBuilder insertCharacters(String string, int[] positions, char[] characters){
        StringBuilder sb = new StringBuilder(string);
        int i = 0;
        for (int elem: positions) {
            sb.insert(elem + i, characters[i]);
            i++;
        }
        return sb;
    }

}
