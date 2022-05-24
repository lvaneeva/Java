public class HomeWorkApp2 {
    public static void main(String[] args) {

        System.out.println(isSummaLimit(5, 16));
        printPositive(-100);
        System.out.println(isNegative(-100));
        printStringNumber("I love Java", 5);
        System.out.println(isLeapYear(2100));
    }

    /*Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
    (включительно), если да – вернуть true, в противном случае – false
     */
    public static boolean isSummaLimit(int a, int b) {
        if ((a+b)>=10 && (a+b)<=20) {
            return true;
        }
        else
            return false;
    }
    /*Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом*/
    public static void printPositive(int a) {
        if (a>=0) {
            System.out.println("Положительное число");
        }
        else
            System.out.println("Отрицательное число");
    }

    /* 3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
    отрицательное, и вернуть false если положительное. */
    public static boolean isNegative(int a) {
        if (a>=0) {
            return  false;
        }
        else
           return true;
    }

    /* 4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
    указанную строку, указанное количество раз; */
    public static void printStringNumber(String s, int a){
        for (int j=0; j<a; j++ ) {
            System.out.println(s);
        }
    }

    /* 5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
    не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
    при этом каждый 400-й – високосный.
    */

    public static boolean isLeapYear(int year){
        if (year%4==0) {
            if (year%100==0) {
                if (year%400==0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        else {
            return false;
        }
    }
}
