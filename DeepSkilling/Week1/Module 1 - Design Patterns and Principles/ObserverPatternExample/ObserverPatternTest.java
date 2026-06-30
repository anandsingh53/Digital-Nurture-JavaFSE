public class ObserverPatternTest {

    public static void main(String[] args) {

        // Create Subject
        StockMarket stockMarket = new StockMarket();

        // Create Observers
        Observer mobile = new MobileApp("Anand");
        Observer web = new WebApp("Rahul");

        // Register Observers
        stockMarket.registerObserver(mobile);
        stockMarket.registerObserver(web);

        // Change Stock Price
        stockMarket.setStockPrice("TCS", 4200);

        stockMarket.setStockPrice("Infosys", 1550);

        // Remove one Observer
        stockMarket.removeObserver(web);

        System.out.println("\nWeb App Unsubscribed");

        // Another Stock Update
        stockMarket.setStockPrice("Reliance", 3000);
    }
}