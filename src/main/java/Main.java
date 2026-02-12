
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        Car car1 = new Car(null, 0); // создаем значения из класса Car
        Car car2 = new Car(null, 0);
        Car car3 = new Car(null, 0);
        Race race24 = new Race(); // чтобы можно было делать ссылки на класс Race

        System.out.println("Введите название машины номер 1");
        car1.name = scanner.next();

        System.out.println("Введите скорость машины номер 1");
        car1.speed = scanner.nextInt();
        while (car1.speed < 0 || car1.speed > 250) {
            System.out.println("Некорректная скорость. Попробуйте снова");
            car1.speed = scanner.nextInt();
        }

        race24.calculateDistance(car1); //Считаем дистанцию и смотрим, лидер или нет

        System.out.println("Введите название машины номер 2");
        car2.name = scanner.next();

        System.out.println("Введите скорость машины номер 2");
        car2.speed = scanner.nextInt();
        while (car2.speed < 0 || car1.speed > 250) {
            System.out.println("Некорректная скорость. Попробуйте снова");
            car2.speed = scanner.nextInt();
        }
        race24.calculateDistance(car2);//Считаем дистанцию и смотрим, лидер или нет

        System.out.println("Введите название машины номер 3");
        car3.name = scanner.next();

        System.out.println("Введите скорость машины номер 3");
        car3.speed = scanner.nextInt();
        while (car3.speed < 0 || car1.speed > 250) {
            System.out.println("Некорректная скорость. Попробуйте снова");
            car3.speed = scanner.nextInt();
        }
        race24.calculateDistance(car3);//Считаем дистанцию и смотрим, лидер или нет

        race24.printWinner(); // объявляем лидера
    }




}
