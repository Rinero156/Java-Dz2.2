public class Main {
    public static void main(String[] args) {
        int balance = 300;

        int replenishment = 500;

        int finalBalance;

        if (replenishment > 100) {
            int finalBonus = replenishment / 100;

            finalBalance = balance + replenishment + finalBonus;

            System.out.println("Ваш баланс равен " + finalBalance);
        } else {
            finalBalance = balance + replenishment;
            System.out.println("Ваш баланс равен " + finalBalance);
        }

    }
}