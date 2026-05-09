public class q2_coin_changing_problem {

    public static void main(String[] args) {

        int amount = 1988;

        int[] denominations = {5000, 1000, 500, 100, 50, 20, 10, 5, 2, 1};

        System.out.println("Amount = Rs." + amount);
        System.out.println("\nCurrency Denomination and Number of Notes:\n");

        for(int i = 0; i < denominations.length; i++) {

            int count = 0;

            while(amount >= denominations[i]) {

                amount = amount - denominations[i];
                count++;
            }

            if(count > 0) {

                System.out.println("Rs." + denominations[i] + " : " + count);
            }
        }
    }
}