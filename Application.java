package dz1_1;

/*
Простая задача 1: Проверка деления на ноль

Напишите программу, которая запрашивает у пользователя
 два целых числа и выполняет их деление. Если второе число равно нулю,
 выбросите исключение ArithmeticException с сообщением
 "Деление на ноль недопустимо". Иначе выведите результат деления на экран.
 */
//import java.io.file;
public class Application{

    public static void main(String[] args){
        System.out.println(divide(10, 0));
    }
    public static int divide(int a1, int a2){
        if (a2 == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return a1/a2;
    }
}