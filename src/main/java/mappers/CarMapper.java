package mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Car;
import domain.CarType;

public class CarMapper implements IMapper<Car>{

	public Car map(ResultSet rs) throws SQLException {
		Car c = new Car();
		c.setId(rs.getInt("id"));
		c.setBrand(rs.getString("brand"));
		c.setModel(rs.getString("model"));
		c.setYearOfProduction(rs.getInt("yearOfProduction"));
		c.setMileage(rs.getInt("mileage"));
		c.setCarType(CarType.valueOf(rs.getString("carType")));
		return c;
	}

}
