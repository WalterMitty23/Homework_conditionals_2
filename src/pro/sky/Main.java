package pro.sky;


public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Task 1");
        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android  по ссылке");
        } else {
            System.out.println("Unknown system, try again");
        }
    }

    public static void task2() {
        System.out.println("Task 2");
        int clientOs = 2;
        int clientDeviceYear = 2006;
        boolean earlier2015 = (clientDeviceYear < 2015);
        if ((clientOs == 0) && earlier2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if ((clientOs == 1) && earlier2015) {
            System.out.println("Установите версию приложения для Android  по ссылке");
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android  по ссылке");
        } else {
            System.out.println("Unknown device");
        }
    }
    // Можно ли было эту задачу switch'ом решить?

    public static void task3() {
        System.out.println("Task 3");
        int year = 2004;
        int leapYear = year % 4;
        int leapYear400 = year % 400;
        int leapYearNot100 = year % 100;
        boolean trueLeapYear1 = leapYear == 0;
        boolean trueLeapYear2 = leapYearNot100 != 0;
        boolean trueLeapYear3 = leapYear400 == 0;
        if ((trueLeapYear1 && trueLeapYear2) || trueLeapYear3) {
            System.out.printf("%d год является високосным", year);
        } else {
            System.out.printf("%d год не является високосным", year);
        }
    }

    public static void task4() {
        System.out.println("\nTask 4");
        int deliveryDistance = 105;
        boolean delivery1 = deliveryDistance <= 20;
        int day1 = 1;
        boolean delivery2 = ((deliveryDistance > 20) && (deliveryDistance <= 60));
        int day2 = day1 + 1;
        boolean delivery3 = ((deliveryDistance > 60) && (deliveryDistance <= 100));
        int day3 = day2 + 1;
        boolean noDelivery = deliveryDistance > 100;
        /* 1 - день
           2 - дня
           3 - дня
        */
        if (delivery1) {
            System.out.print("Потребуется: ");
            if (day1 == 1) {
                System.out.printf("%d день ", day1);
            }

        } else if (delivery2) {
            System.out.print("Потребуется: ");
            if ((day1 > 1) || (day2 <= 2)) {
                System.out.printf("%d дня ", day2);
            }

        } else if (delivery3) {
            System.out.print("Потребуется: ");
            if ((day2 > 2) || (day3 <= 3)) {
                System.out.printf("%d дня ", day3);

            }

        } else {
                System.out.println("доставки нет");
        }
    }
    /* так подсказал ChatGPT - нужно ли изучать эту тему чтобы корректно выдавалось "день\дня"?


        if (deliveryTime >= 0) {
            String dayOrDays = (deliveryTime == 1) ? "день" : "дня";  // Учитываем правильное склонение
            System.out.println("Потребуется " + deliveryTime + " " + dayOrDays);
        } else {
            System.out.println("Доставка недоступна");
        }
    }
     */


    public static void task5() {
        System.out.println("Task 5");
        int monthNumber = 10;

        switch (monthNumber) {
            case 12:
                System.out.print("Это декабрь, а период года - ");
                break;
            case 1:
                System.out.print("Это январь, а период года - ");
                break;
            case 2:
                System.out.print("Это февраль, а период года - ");
                break;
            case 3:
                System.out.print("Это март, а период года - ");
                break;
            case 4:
                System.out.print("Это апрель, а период года - ");
                break;
            case 5:
                System.out.print("Это май, а период года - ");
                break;
            case 6:
                System.out.print("Это июнь, а период года - ");
                break;
            case 7:
                System.out.print("Это июль, а период года - ");
                break;
            case 8:
                System.out.print("Это август, а период года - ");
                break;
            case 9:
                System.out.print("Это сентябрь, а период года - ");
                break;
            case 10:
                System.out.print("Это октябрь, а период года - ");
                break;
            case 11:
                System.out.print("Это ноябрь, а период года - ");
                break;
            default:
                System.out.print("Неправильно введен месяц");
        }

        if ((monthNumber == 12) || (monthNumber <=2)) {
            System.out.println("зима");
        } else if ((monthNumber >= 3) || (monthNumber <=5)) {
            System.out.println("весна");
        } else if ((monthNumber >= 6) || (monthNumber <=8)) {
            System.out.println("лето");
        } else if ((monthNumber >= 9) || (monthNumber <=11)) {
            System.out.println("осень");
        }
 /*  Как у меня в комментарии - могу ли так скипать кейсы чтобы не прописывать постоянно Sout.
 Где-то прочитал что можно, но чревато накосячить

    public static void task5() {
        System.out.println("Task 5");
        int monthNumber = 6;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неправильно введен месяц");
        }
     */
    }
}