public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(Parcel parcel) {
        System.out.println("Dear " + name + ", your parcel has been shipped!\n"
                + "Parcel details: " + parcel.getDetails()
                + "\n============================================\n");
    }
}