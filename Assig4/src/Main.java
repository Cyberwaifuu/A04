public class Main {
    public static void main(String[] args) {
        ParcelFactory parcelFactory = createParcelFactoryByType("standard");

        // Simulating a payment processed event
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment();

        // Creating a parcel using the factory
        Parcel parcel = parcelFactory.createParcel();
        parcel.send();

        // Notifying users about the shipped item
        Cart userCart = new Cart();
        Observer user = new User("Biba");
        userCart.addObserver(user);
        userCart.addParcel(parcel);
    }

    public static ParcelFactory createParcelFactoryByType(String type) {
        if (type.equalsIgnoreCase("standard")) {
            return new StandardParcelFactory();
        } else if (type.equalsIgnoreCase("express")) {
            return new ExpressParcelFactory();
        } else {
            throw new RuntimeException(type + " is an unknown parcel type");
        }
    }
}