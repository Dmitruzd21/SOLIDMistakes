import java.util.Map;

public interface Basket {

    public void addPurchase(String title, int count);

    public long sum(Map<String, Integer> prices);
}
