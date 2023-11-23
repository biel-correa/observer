import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AirConditionerTest {
    private AirConditioner airConditioner;
    private Thermometer thermometer;

    @BeforeEach
    void setUp() {
        thermometer = new Thermometer();
        airConditioner = new AirConditioner(thermometer);
    }
    
    @Test
    void shouldTurnOnWhenTemperatureIsAbove30() {
        thermometer.setTemperature(31);
        assertTrue(airConditioner.isOn());
    }

    @Test
    void shouldTurnOffWhenTemperatureIsBelow20() {
        thermometer.setTemperature(19);
        assertTrue(!airConditioner.isOn());
    }

    @Test
    void shouldKeepStateWhenTemperatureIsBetween20And30() {
        thermometer.setTemperature(25);
        assertTrue(!airConditioner.isOn());
    }
}