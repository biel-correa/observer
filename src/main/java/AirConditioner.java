public class AirConditioner implements Observer<Thermometer> {
    private boolean isOn;

    public AirConditioner(Subject subject) {
        subject.addObserver(this);
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public void update(Thermometer entity) {
        var temperature = entity.getTemperature();
        if (temperature > 30) {
            this.setOn(true);
        } else if (temperature < 20) {
            this.setOn(false);
        }
    }
}
