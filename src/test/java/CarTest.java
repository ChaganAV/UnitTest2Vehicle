import com.example.unittest2vehicle.model.Car;
import com.example.unittest2vehicle.model.Motorcycle;
import org.junit.jupiter.api.*;
import org.assertj.core.api.Assertions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {
    @Test
    void carInstance(){
        Car car = new Car();
        assertThat(car).isInstanceOf(Car.class);
    }
    @Test
    void motorcycleInstance(){
        Car car = new Car();
        assertThat(car).isInstanceOf(Motorcycle.class);
    }
}
