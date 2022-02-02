import java.util.concurrent.atomic.LongAdder;

public class Shop {
    private final LongAdder longAdder = new LongAdder();

    public void addStat(long sumAccountProfit) {
        longAdder.add(sumAccountProfit);
    }

    public long result() {
        return longAdder.sum();
    }
}
