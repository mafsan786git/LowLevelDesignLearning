package WithStrategy;

import WithStrategy.Strategy.SportDriveStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SportDriveStrategy());
    }
}
