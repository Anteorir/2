import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите цену товара (в руб.):");
        int price = scanner.nextInt();

        System.out.print("Введите вес товара (в кг.):");
        int weight = scanner.nextInt();

        calculateCustoms(price, weight);

    }
    public static void calculateCustoms(int price, int weight){
        int result = price / 100;
        int result2 = weight * 100;
        int result3 = result + result2;
        System.out.println("Размер пошлины (в руб.) составит:" + result3);
    }
}
