public class StandardParcel implements Parcel {
    private String details = "Standard Parcel";

    @Override
    public String getDetails() {
        return details;
    }

    @Override
    public void send() {
        System.out.println("Standard Parcel sent. Days until arrival 9");
    }
}
