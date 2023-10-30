import java.util.ArrayList;
import java.util.List;

public class Cart implements Observed {
    private List<Parcel> parcelList = new ArrayList<>();
    private List<Observer> activeUsers = new ArrayList<>();

    public void addParcel(Parcel parcel) {
        this.parcelList.add(parcel);
        notifyObservers(parcel);
    }

    @Override
    public void addObserver(Observer observer) {
        this.activeUsers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.activeUsers.remove(observer);
    }

    @Override
    public void notifyObservers(Parcel parcel) {
        for (Observer observer : activeUsers) {
            observer.handleEvent(parcel);
        }
    }
}
