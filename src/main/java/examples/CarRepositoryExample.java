package examples;

import java.sql.Connection;
import domain.Car;
import domain.CarType;
import repositories.IDatabaseCatalog;

public class CarRepositoryExample {
	public static void execute(Connection connection, IDatabaseCatalog catalog){
		Car car = new Car("Ford", "Mustang", 1967, 350000, CarType.Osobowy);
		Car car1 = new Car("Chevrolet", "Impala", 1967, 400000, CarType.Osobowy);
		Car car2 = new Car("Opel", "Astra", 2000, 250000, CarType.Osobowy);
		Car car3 = new Car("Auto", "Terenowe", 2005, 150000, CarType.Terenowy);
		catalog.cars().add(car);
		catalog.cars().add(car1);
		catalog.cars().add(car2);
		catalog.cars().add(car3);
		catalog.cars().add(car);
	}
}
