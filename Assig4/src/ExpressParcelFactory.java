public class ExpressParcelFactory implements ParcelFactory {

    @Override
    public Parcel createParcel() {
        return new ExpressParcel();
    }
}