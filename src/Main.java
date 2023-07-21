import java.util.*;

public class Main {
    private static String[] name = {"Tom ", "Toty", "Kesha", "Kaha"};
    private static String[] namee = {"Audi", "BMW", "Messi", "Mersedes"};


    public static void main(String[] args) {
        LinkedList<Object> animal = new LinkedList<>();
        Random randomm = new Random();
        for (int i = 0; i < 50; i++) {
            int age = randomm.nextInt(1, 10);
            int namess = randomm.nextInt(1, namee.length);
            String m = namee[namess];
            if (i % 3 == 0 && i > 1) {
                Mouse mouse = new Mouse("M", 1);
                animal.add(mouse);
            }
            Dog dog = new Dog(m, age);
            animal.add(dog);
        }
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int age = random.nextInt(1, 10);
            int l = name.length;
            int names = random.nextInt(1, l);
            String n = name[names];
            Cat cat = new Cat(n, age);
            animal.add(cat);
        }
        System.out.println(animal);

    }
}