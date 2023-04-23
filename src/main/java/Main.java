import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumGuests;
        String inputName;
        Double inputPrice;
        String totalList = "";
        Double totalPrice = 0.00;


        System.out.println("Введите количество гостей: ");

        while (true) {
            sumGuests = scanner.nextInt();
            if (sumGuests > 1) {
                System.out.println("Количество гостей: " + sumGuests + ". На них и поделим счет!");
                break;
            }
            if (sumGuests == 1) {
                System.out.println("Количество гостей: " + sumGuests + " гость. Тут и делить-то нечего");
            }
            if (sumGuests <= 0) {
                System.out.println("Введено неверное значение. Введите целое число, больше 1");
            }
            System.out.println("Введите количество гостей: ");
        }

            while (true) {
                System.out.println("Введите название продукта: ");
                inputName = scanner.nextLine();
                String check = "завершить";
                if (inputName.equalsIgnoreCase(check)) {
                    System.out.println("подсчет завршен");
                    break;
                }
                if (!(inputName.equalsIgnoreCase(check))) {
                    totalList = totalList + "\n" + inputName;
                    System.out.println(totalList + " \n ");
                    System.out.println("Введите стоимость продукта: ");
                    while (true) {
                        inputPrice = scanner.nextDouble();
                        if (scanner.hasNextDouble()) {
                            totalPrice = totalPrice + inputPrice;
                            System.out.println("Итого " + totalPrice + " рублей.");
                        }
                        if (inputPrice <= 0) {
                            System.out.println("Повторите ввод, введены неверные данные");
                            break;
                        }
                    }
                }
            }
    }
}






