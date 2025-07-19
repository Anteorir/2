import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите цену товара (в руб.):");
        int x = scanner.nextInt();

        System.out.print("Введите вес товара (в кг.):");
        int y = scanner.nextInt();

        calculateCustoms(x, y);

    }
    public static void calculateCustoms(int x, int y){
        int result = x / 100;
        int result2 = y * 100;
        int c = result + result2;
        System.out.println("Размер пошлины (в руб.) составит:" + c);





    }
}
