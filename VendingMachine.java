import java.util.Random;

public class VendingMachine {

    private String productName;
    private double price;
    private final int maxQuantity = 50;
    private int currentStock;

    public VendingMachine() {
        productName = "Kitkat";
        price = 1.5;
        currentStock = 50;
    }

    public VendingMachine(String productName, double price, int currentStock) {
        this.productName = productName;
        this.price = price;
        this.currentStock = currentStock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public double getTotalSales() {
        return price * (maxQuantity - currentStock);
    }

    public boolean getStock() {
        return currentStock > 0;
    }

    public void itemSold() {
        currentStock--;
    }

}



    /*VendingMachine kitkat = new VendingMachine("Kitkat", 1.5, 48);
    double priceOfKitkat = kitkat.getPrice();
    kitkat.setPrice(4); */
