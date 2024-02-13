import com.example.unittest2vehicle.model.Car;
import com.example.unittest2vehicle.model.Motorcycle;
import com.example.unittest2vehicle.model.Vehicle;
import org.junit.jupiter.api.*;
import org.assertj.core.api.Assertions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * тесты для Car
 */
public class CarTest {
    /**
     * тестовый объект
     */
    private Car car = new Car("BMW","X4",2016);
    /**
     * Проверить, что экземпляр объекта Car также является
     * экземпляром транспортного средства (используя оператор instanceof)
     */
    @Test
    void carInstance(){
        //Car car = new Car();
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    /**
     * Проверить, что объект Car создается с 4-мя колесами.
     */
    @Test
    void carWheets(){
        //Car car = new Car("BMW","X4",2016);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    /**
     * Проверить, что объект Car развивает скорость 60
     * в режиме тестового вождения.
     */
    @Test
    void carDriveSpeed(){
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    /**
     * Проверить, что в режиме парковки
     * (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
     * машина останавливается (speed = 0).
     */
    @Test
    void carPark(){
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }
}
