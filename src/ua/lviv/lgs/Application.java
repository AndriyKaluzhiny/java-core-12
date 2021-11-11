package ua.lviv.lgs;

import java.util.*;

public class Application {

    public static void menu() {
        System.out.println("If you want to test task 1, enter 1");
        System.out.println("If you want to test task 2, enter 2.a");
        System.out.println("If you want to test task 3, enter 2.b");
        System.out.println("If you want to exit, enter 0");
    }

   public static int getRandomValue(int max, int min) {
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }

    public static double getRandomValueDouble(double max, double min) {
        Random r = new Random();
        return r.nextDouble(max - min + 1) + min;
    }

    public static void main(String[] args) {
        menu();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        switch (input) {
            case 1 : {
                Integer[] array =
                        {getRandomValue(100, 1),
                                getRandomValue(100, 1),
                                getRandomValue(100, 1),
                                getRandomValue(100, 1)
                        };
                System.out.println("Random numbers(Before sort): " + Arrays.toString(array));
                Arrays.sort(array);
                System.out.println("Random numbers(Sort asc): " + Arrays.toString(array));
                Arrays.sort(array, Collections.reverseOrder());
                System.out.println("Random numbers(Sort desc): " + Arrays.toString(array));
            }

            case 2: {
               String[][] array = new String[getRandomValue(100, 1)][getRandomValue(100, 1)];

                for (String[] anArr : array) {
                    for (String anAnArr : anArr) {
                        Wheel w = new Wheel(getRandomValueDouble(16, 9), "Alcantara");
                        Engine e = new Engine(getRandomValue(12, 4));
                        Car c = new Car(getRandomValue(700, 150), getRandomValue(2021, 2000));

                        array = new String[][]{{w.toString(), e.toString(), c.toString()}};
                    }
                    System.out.println(Arrays.deepToString(array));
                }
            }

            case 3: {

                System.out.println("Task 2B");
                Car car = new Car(getRandomValue(700, 150), getRandomValue(2021, 2000));

                String[] arrayAuto = new String[getRandomValue(100, 0)];

                for (String s : arrayAuto) {
                    Wheel w = new Wheel(getRandomValueDouble(16, 9), "Alcantara");
                    Engine e = new Engine(getRandomValue(12, 4));

                    arrayAuto = new String[]{w.toString(), e.toString(), " "};
                    Arrays.fill(arrayAuto, 2,3, car.toString());

                    System.out.println(Arrays.deepToString(arrayAuto));
                }


            }
        }
    }
}
