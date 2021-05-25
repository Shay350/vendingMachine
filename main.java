import java.util.Random;

public class main {

    public static void main(String[] args) {

        VendingMachine hersheys = new VendingMachine("Hersheys", 1.50, 23);

        VendingMachine kitkat = new VendingMachine("Kitkat", 2.00, 40);

        VendingMachine twix = new VendingMachine("Twix", 1.75, 36);

        VendingMachine aero = new VendingMachine("Aero", 1.25, 25);

        VendingMachine coffeeCrisp = new VendingMachine("Coffee Crisp", 1.50, 50);

        double[] prices = {1.5, 2.00, 1.75, 1.25, 1.50};
        for (int i = 0; i < 20; i++) {
            Random r = new Random();
            int randomPrice = r.nextInt(prices.length);
            System.out.println("$" + prices[randomPrice]);
        }

    }
    
}