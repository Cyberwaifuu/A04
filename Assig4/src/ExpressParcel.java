public class ExpressParcel implements Parcel {
    private String details = "Express Parcel.";

    @Override
    public String getDetails() {
        return details;
    }

    @Override
    public void send() {
        System.out.println("Express Parcel sent. Days until arrival 3");
    }
}