import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter make of the car");
        String make = scanner.nextLine();
        System.out.println("Enter model of the car");
        String model = scanner.nextLine();
        System.out.println("Enter manufacturing year, YYYY");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter color of the car");
        String color = scanner.nextLine();

        Car car = new Car(make, model, year, color);
        Car car1 = new Car("Hatchback", "Alto", 2008, "white");
        System.out.println(car.displayInfo());
        System.out.println(car1.displayInfo());
        System.out.println("car1 = " + car1);
        System.out.println("car = " + car);

        Car car2 = car;
        Car car3 = new Car("Hatchback", "Alto", 2008, "white");

        boolean equals = car1.equals(car3);
        System.out.println("equals = " + equals);

    }
}
