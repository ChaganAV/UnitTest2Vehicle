import com.example.unittest2vehicle.model.Car;
import com.example.unittest2vehicle.model.Motorcycle;
import com.example.unittest2vehicle.model.Vehicle;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MotocycleTest {
    Motorcycle motorcycle = new Motorcycle("Chehy", "Sport", 1996);
    /**
     * Проверить, что экземпляр объекта Motorcycle также является
     * экземпляром транспортного средства (используя оператор instanceof)
     */
    @Test
    void motorcycleInstance(){
        assertThat(motorcycle).isInstanceOf(Vehicle.class);
    }

    /**
     * Проверить, что объект Motorcycle создается с 2-мя колесами.
     */
    @Test
    void motorcycleWheets(){
        //Motorcycle motorcycle = new Motorcycle("Chehy", "Sport", 1996);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    /**
     * Проверить, что объект Motorcycle развивает скорость 75
     * в режиме тестового вождения (используя метод testDrive()).
     */
    @Test
    void motorcycleDriveSpeed(){
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    /**
     * Проверить, что в режиме парковки
     * (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
     * мотоцикл останавливается (speed = 0).
     */
    @Test
    void motorcyclePark(){
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}
