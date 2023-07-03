import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1 = scanner.nextInt();
        char operation = scanner.next().charAt(0);
        int operand2 = scanner.nextInt();
        int result = 0;
        switch (operation) {
            case '+':
                result = operand1 + operand2;
                break;
                123123123
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Введен некорректный оператор");
        }
        System.out.println(result);
    }
}
