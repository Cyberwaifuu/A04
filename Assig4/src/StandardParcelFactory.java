public class StandardParcelFactory implements ParcelFactory {

    @Override
    public Parcel createParcel() {
        return new StandardParcel();
    }
}