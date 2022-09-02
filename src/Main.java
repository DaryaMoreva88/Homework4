public class Main {
    public static void main(String[] args) {
        //Задание 1.1
        System.out.println("Задание 1.1");
        int age = 12;
        if (age >= 18) {
            System.out.println("Поздравляю тебя с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил. Нужно еще подождать");

        }
        //Задание 1.2
        System.out.println("Задание 1.2");

        int age1 = 31;
        if (age1 >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age1 >= 18) {
            System.out.println("Человек закончил школу и может поступать в университет");
        }
        if (age1 > 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");

            //Задание 1.3
            System.out.println("Задание 1.3");
            int place = 45;
            if (place <= 60) {
                System.out.println("В вагоне есть свободное место с посадкой");
                if (place <= 102) {
                    System.out.println("В вагоне есть свободное место без посадки");
                }
                if (place > 102) {
                    System.out.println("Мест нет");
                }
            }
        }
        //Задание 2.1
        System.out.println("Задание 2.1");
        int age2 = 19;
        if (age2 >= 18) {
            System.out.println("Поздравляю тебя с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил. Нужно еще подождать");

        }
        //Задание 2.2
        System.out.println("Задание 2.2");

        int age3 = 31;
        if (age3 >= 7 && age3 < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (age3 >= 18 && age3 < 24) {
            System.out.println("Человек закончил школу и может поступать в университет");
        } else if (age3 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");

            //Задание 2.3

            System.out.println("Задание 2.3");
            int place1 = 101;
            if (place1 <= 60) {
                System.out.println("В вагоне есть свободное место с посадкой");
            } else if (place1 > 60 && place1 <= 102) {
                System.out.println("В вагоне есть свободное место без посадки");
            } else if (place1 > 102) {
                System.out.println("Мест нет");
            }

            //Задание 3.1
            System.out.println("Задание 3.1");

            int human = 25;
            if (human >= 2 && human <= 6) {
                System.out.println("Если возраст человека равен " + human + ", то ему нужно ходить в детский сад");
            } else if (human >= 7 && human < 18) {
                    System.out.println("Если возраст человека равен " + human + ", то ему нужно ходить в школу");
                } else if (human >= 18 && age3 < 24) {
                    System.out.println("Если возраст человека равен " + human + ", то ему нужно ходить в университет");
                } else if (human >= 24) {
                    System.out.println("Если возраст человека равен " + human + ", то ему нужно ходить на работу");
                }
            }
        //Задание 3.2
        System.out.println("Задание 3.2");

        int kid = 10;
        if (kid < 5 ) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (kid >= 5 && kid < 14) {
            System.out.println("Ребенок может кататься на аттракционе только в сопровождении взрослого");
        } else if (kid >= 14) {
            System.out.println("Ребенок может кататься на аттракционе без сопровождения");
        }
        //Задание 3.3
        System.out.println("Задание 3.3");

        int one = 501;
        int two = 5630;
        int free = 300;
        boolean ones = one > two && one > free;
        boolean twos = two > one && two > free;
        boolean frees = free > one && free > two;
        if (ones) {
            System.out.println("Большее число = " + one);
        } else if (twos) {
            System.out.println("Большее число = " + two);
        } else if (frees) {
            System.out.println("Большее число = " + free);
        }

        }
    }


