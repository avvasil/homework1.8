package pro.sky;

import java.lang.reflect.Array;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

//task1
        int year = 2022;
        checkLeapYear(year);

//task2
        int clientOS = 1;
        int clientDeviceYear = 2021;
        int currentYear = LocalDate.now().getYear();
        installOS(clientOS, clientDeviceYear, currentYear);

//task3
        int deliveryDistance = 95;
        countDeliveryDays(deliveryDistance);

//task4
        String textToValidate = "camnkjhttrgdhjkyr";
        validateText(textToValidate);

//task5
        int[] arr = {3, 2, 1, 6, 5};
        reverseArray(arr);

    }

    public static void checkLeapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }


    public static void installOS(int clientOS, int clientDeviceYear, int currentYear) {
        if (clientDeviceYear >= currentYear) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке https://");
            } else if (clientOS == 1)
                System.out.println("Установите версию приложения для Android по ссылке https://");
        } else {
            if (clientOS == 0) {
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке https://");
            } else if (clientOS == 1)
                System.out.println("Установите облегчённую версию приложения для Android по ссылке https://");
        }
    }


    public static void countDeliveryDays(int deliveryDistance) {
        if (0 < deliveryDistance && deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1.");
        } else if (20 <= deliveryDistance && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2.");
        } else if (60 <= deliveryDistance && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3.");
        } else
            System.out.println("Доставка невозможна.");
    }

    public static void validateText(String textToValidate) {
        boolean duplicateExists = false;
        for (int i = 0; i < textToValidate.length() - 1; i++) {
            if (textToValidate.charAt(i) == textToValidate.charAt(i + 1)) {
                duplicateExists = true;
                System.out.println("Найден дубль. Символ " + '"' + textToValidate.charAt(i) + '"' + ". " + (i + 2) + "-й по счёту. ");
                break;
            }
        }
        if (!duplicateExists) {
            System.out.println("Дублей не обнаружено.");
        }
    }


    public static void reverseArray (int[] arr) {
        for (int i = Array.getLength(arr) - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}