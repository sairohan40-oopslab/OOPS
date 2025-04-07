interface CarOrder {
    void placeOrder();
    void trackOrder();
    void cancelOrder();
}

class CarOrderImplementation implements CarOrder {
    public void placeOrder() {
        System.out.println("Car order placed.");
    }

    public void trackOrder() {
        System.out.println("Tracking car order.");
    }

    public void cancelOrder() {
        System.out.println("Car order canceled.");
    }
}

public class Main {
    public static void main(String[] args) {
        CarOrder order = new CarOrderImplementation();
        order.placeOrder();
        order.trackOrder();
        order.cancelOrder();
    }
}
