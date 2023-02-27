public class HW5 {
    public static byte byteMaxVal = Byte.MAX_VALUE;
    public static int intMaxVal = Integer.MAX_VALUE;
    public static double doubleMaxVal = Double.MAX_VALUE;

    public static void main(String[] args) {

        int x = 40;
        int y = 8;

        //Сложение
        int addition = x + y;
        System.out.println("Result addition " + addition);

        //Вычитание
        int subtraction = x - y;
        System.out.println("Result subtraction " + subtraction);

        //Умножение
        int multiplication = x * y;
        System.out.println("Result multiplication " + multiplication);

        //Деление целое
        int division = x / y;
        System.out.println("Result division " + division);

        //Деление с остатком (Остаток будет равен 0)
        int divisionWitchRemaider = x % y;
        System.out.println("Result divisionWitchRemaider " + divisionWitchRemaider);

        //X больше Y?
        boolean checkX = x > y;
        System.out.println("X > Y ? " + checkX);

        //X меньше Y?
        boolean checkY = x < y;
        System.out.println("X < Y ? " + checkY);

        //X равен Y?
        boolean checkEqual = x == y;
        System.out.println("X = Y ? " + checkEqual);


        //Комбинация разных типов данных
        double d = 2.5;
        int i = 4;
        System.out.println("Result combination double and integer " + (d + i));

        //переполнение при вычислении byte
        System.out.println("### Результат переполнения byte: " + (byte) (byteMaxVal + 1));
        //переполнение при вычислении int
        System.out.println("### Результат переполнения int: " + (intMaxVal + 1));

        //переполнение double
        double result = doubleMaxVal + 12.26D;
        System.out.println("### Результат переполнения double: " + result);


    }
}