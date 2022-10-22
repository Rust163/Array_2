import java.util.Random;


public class Main {


    public static void main(String[] args) {
        Random rand = new Random();
        int[] expensesArr = new int[31];
        int[] daysArr = new int[32];
        int sum = 0;
        int averageExpenses;
        int max = expensesArr[0];
        //int min = expensesArr[0];

        for (int i = 0; i < expensesArr.length; i++) {
            expensesArr[i] = rand.nextInt(100_000) + 100_000;
        }
        for (int i = 0; i < daysArr.length - 1; i++) {
            daysArr[i] = i;
        }
        for (int i = 1; i < daysArr.length - 1; i++) {
            System.out.println("Расходы за " + daysArr[i] + " -ое число составляют " + expensesArr[i] + " тыс. рублей.");
        }


        System.out.println();//--------------------------------------------


        for (int j : expensesArr) {
            if (max < j) {
                max = j;
                System.out.println("Сумма минимальных расходов за день: " + max + " тыс. рублей");
                break;
            }
        }


        System.out.println();//--------------------------------------------------


        for (int j : expensesArr) {
            if (j > max) {
                max = j;
                System.out.println("Сумма максимальных расходов за день: " + max + " тыс. рублей");
                break;
            }
        }

        System.out.println();//----------------------------------------

        for (int j : expensesArr) {
            sum = 31 * j;
            System.out.println("Сумма расходов за месяц составляет : " + sum + " тыс. рублей.");
            break;
        }

        System.out.println();//---------------------------------------------


        while (true) {
            averageExpenses = sum / 30;
            System.out.println("Средняя сумма трат за месяц составила:" + averageExpenses + " тыс. рублей.");
            break;
        }

        System.out.println();//-----------------------------------------------

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 10; i < reverseFullName.length; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
