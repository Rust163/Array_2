import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] expensesArr = new int[31];
        int sum = 0;
        int min = 200000;
        int max = 0;

        for (int i = 0; i < expensesArr.length -1; i++) {
            expensesArr[i] = rand.nextInt(100_000) + 100_000;
        }

        System.out.println();//-----------------------------------------------


        for (int i = 0; i < expensesArr.length -1; i++) {
            if (expensesArr[i] > max) {
                max = expensesArr[i];
            }
            if (expensesArr[i] < min) {
                min = expensesArr[i];
            }
        }
        System.out.println("Минимальная сумма за день: " + min + " . " + "Максимальная сумма за день: " + max);


        System.out.println();//-----------------------------------------------


        for (int i = 0; i < expensesArr.length -1; i++) {
            sum = expensesArr[i] * 30;
            System.out.println("Сумма расходов за месяц составляет : " + sum + " тыс. рублей.");
            break;
        }


        System.out.println();//---------------------------------------------


        for (int i = 0; i < expensesArr.length -1; i--) {
            int averageExpenses = sum / 30;
            System.out.println("Средняя сумма трат за месяц составила: " + averageExpenses + " тыс. рублей.");
            break;
        }


        System.out.println();//-----------------------------------------------


        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1;i >= 0 ;i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}