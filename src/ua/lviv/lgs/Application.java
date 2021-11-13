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
               List l = new ArrayList();

               int count = getRandomValue(10, 1);

               for (int i = 0; i <= count; i++) {
                   Wheel w = new Wheel(getRandomValueDouble(14, 10), "Alcantara");
                   Engine e = new Engine(getRandomValue(12, 4));
                   Car c = new Car(getRandomValue(700, 200), getRandomValue(2021, 2000));

                   l.clear();

                   l.add(w);
                   l.add(e);
                   l.add(c);

                   System.out.println(l);
               }
                    break;
            }

            case 3: {

                System.out.println("Task 2B");
                Car car = new Car(getRandomValue(700, 150), getRandomValue(2021, 2000));

                int count = getRandomValue(10, 1);

                List lAuto = new ArrayList(getRandomValue(100, 1));

                for (int i = 0; i <= count; i++) {
                    Wheel w = new Wheel(getRandomValueDouble(14, 10), "Alcantara");
                    Engine e = new Engine(getRandomValue(12, 4));

                    lAuto.clear();

                    lAuto.add(w);
                    lAuto.add(e);
                    lAuto.add(car);

                    System.out.println(lAuto);
                }

            }
        }
    }
}
