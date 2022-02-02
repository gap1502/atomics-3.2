
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Shop shop = new Shop();

        Account shop1 = new Account("Магазин спорттоваров", shop);
        Account shop2 = new Account("Магазин одежды", shop);
        Account shop3 = new Account("Магазин обуви", shop);

        shop1.join();
        shop2.join();
        shop3.join();

        System.out.println("Выручка всех магазинов составила: " + shop.result());
    }
}
