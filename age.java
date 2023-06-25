package dz1_2;

/*
Простая задача 2: Обработка некорректного ввода

Напишите программу, которая запрашивает у пользователя его возраст.
Если введенное значение не является числом, выбросите исключение
NumberFormatException с сообщением "Некорректный ввод".
Иначе выведите возраст на экран.
 */

import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш возраст: ");
        String n = scanner.next();
        try {
            int i = Integer.parseInt(n.trim());
            System.out.println(" Ваш возраст: " + i);
        }
        catch (NumberFormatException nfe){
            System.out.println("NumberFormatException: " + nfe.getMessage() + "Некорректный ввод");
        }
    }

}