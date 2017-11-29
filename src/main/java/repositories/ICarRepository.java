package repositories;


import java.util.List;

import domain.Car;
import domain.CarType;

public interface ICarRepository extends IRepository<Car>{
	public List<Car> withType(CarType carType);
	public List<Car> withModel(String model);
	public List<Car> withYearOfProduction(int from, int to);
	public List<Car> withMileage(int from, int to);
}
