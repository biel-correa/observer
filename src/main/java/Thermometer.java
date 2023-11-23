import java.util.ArrayList;
import java.util.List;

public class Thermometer implements Subject {
    private List<Observer> observers;
    private float temperature;

    public Thermometer() {
        this.temperature = 27;
        observers = new ArrayList<>();
    }

    public float getTemperature() {
        return this.temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        this.notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (var observer : this.observers) {
            observer.update(this);
        }
    }
}
