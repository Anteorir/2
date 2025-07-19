import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите цену товара (в руб.):");
        int price = scanner.nextInt();

        System.out.print("Введите вес товара (в кг.):");
        int weight = scanner.nextInt();

        int result = calculateCustoms(price, weight);

        System.out.println("Размер пошлины (в руб.) составит:" + result);
    }
    public static int calculateCustoms(int price, int weight){
        int division = price / 100;
        int multiplication = weight * 100;

        return division + multiplication;
    }
}
