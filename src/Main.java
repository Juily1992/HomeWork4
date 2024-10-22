// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Task 1
        Scanner legalAge = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int age = legalAge.nextInt();

        if (age >= 18) {
         System.out.println("Если ваш возраст " + age + " , то вы совершеннолетний.");
        } else {
        System.out.println("Если ваш возраст " + age + " , то вы несовершеннолетний");
        }

        // Task 2
        Scanner temperatureOutside = new Scanner(System.in);
        System.out.print("Какая сегодня температура? ");
        int temperature = temperatureOutside.nextInt();
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов. На улице холодно, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов. На улице тепло, можно идти без шапки.");
        }

        // Task 3
        Scanner carSpeed = new Scanner(System.in);
        System.out.print("Какая скорость водителя? ");
        int speed = carSpeed.nextInt();
        if (speed > 60) {
            System.out.println("Если скорость водителя равна " + speed + " км/ч., то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость водителя равна " + speed + " км/ч., то можно ездить спокойно.");
        }


        // Task 4
        Scanner ageSchoolKindergarten = new Scanner(System.in);
        System.out.print("Какой Ваш возраст? ");
        int age1 = ageSchoolKindergarten.nextInt();

        if (age1 >= 2 & age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в детский сад.");
        }
        if (age1 >= 7 & age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в школу.");
        }
        if (age1 >= 18 & age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в университет.");
        }
        if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему пора ходить на работу.");
        }

        // Task 5
        Scanner childAge = new Scanner(System.in);
        System.out.print("Какой возраст ребенка? ");
        int age2 = childAge.nextInt();

        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + " , то он не может кататься на аттракционе.");
        }
        if (age2 >= 5 & age2 <= 14) {
            System.out.println("Если возраст ребенка равен " + age2 + " , то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        if (age2 >= 14) {
            System.out.println("Если возраст ребенка равен " + age2 + " , то он может кататься без сопровождения взрослого. ");
        }

        // Task 6
        Scanner ticketNumber = new Scanner(System.in);
        System.out.print("Введите номер билета ");
        int place = ticketNumber.nextInt();

        if (place > 0 & place <= 60) {
            System.out.println("Для Вас есть сидячее место номер  " + place);
        } else {
            if (place > 60 & place <= 120) {
                System.out.println("Для Вас есть только стоячее место ");
            } else {
                System.out.println("В вагоне нет свободных мест");
            }
        }

        // Task 7
        Scanner biggestNumers = new Scanner(System.in);
        System.out.print("Ведите число 1 ");
        int number1 = biggestNumers.nextInt();
        System.out.print("Ведите число 2 ");
        int number2 = biggestNumers.nextInt();
        System.out.print("Ведите число 3 ");
        int number3 = biggestNumers.nextInt();

        int big = number1;
           if (number2>big) {
            big=number2; }
               else {
                 if (number3 > big) {
                  big = number3; }
               }
           System.out.print("Число " + big + " наибольшее");
        }


   }
