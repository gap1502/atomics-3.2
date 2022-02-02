import java.util.Random;
import java.util.stream.IntStream;

public class Account extends Thread {
    private final static int MAX_COUNT_PURCHASES = 40;
    private final static int MAX_PRICE_PURCHASES = 1000;
    Shop shop;

    public Account(String name, Shop shop) {
        super(name);
        this.shop = shop;
        start();
    }

    @Override
    public void run() {
        long dayProfit = sumProfit();
        System.out.println(Thread.currentThread().getName() + " - выручка за день составила: " + dayProfit);
        shop.addStat(dayProfit);
    }

    private long sumProfit() {
        Random random = new Random();
        int dayPurchases = random.nextInt(MAX_COUNT_PURCHASES);
        int[] profit = new int[dayPurchases];
        for (int i = 0; i < profit.length; i++) {
            profit[i] = random.nextInt(MAX_PRICE_PURCHASES);
        }
        return IntStream.of(profit).sum();
    }
}
