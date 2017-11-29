package examples;

import java.sql.Connection;
import java.util.List;

import domain.Car;
import domain.CarType;
import domain.Offer;
import domain.Seller;
import repositories.IDatabaseCatalog;

public class QueryExamples {
	public static void execute(Connection connection, IDatabaseCatalog catalog){
		List<Car> carsType = catalog.cars().withType(CarType.Terenowy);
		
		List<Car> carsModel = catalog.cars().withModel("Mustang");
		
		List<Car> carsYearOfProduction = catalog.cars().withYearOfProduction(1999, 2006);
		
		List<Car> carsMileage = catalog.cars().withMileage(100000, 400000);
		
		System.out.println("Auta typu terenowego\nID\tMarka\t\tModel\t\tRocznik\t\tPrzebieg\t\tRodzaj");
		for(Car c: carsType){
			System.out.println(c.getId()+"\t\t"+c.getBrand()+"\t\t"+c.getModel()+"\t\t"+c.getYearOfProduction()+"\t\t"+c.getMileage()+"\t\t"+c.getCarType().toString());
		}
		System.out.println("Mustangi\nID\tMarka\tModel\tRocznik\tPrzebieg\tRodzaj");
		for(Car c: carsModel){
			System.out.println(c.getId()+"\t\t"+c.getBrand()+"\t\t"+c.getModel()+"\t\t"+c.getYearOfProduction()+"\t\t"+c.getMileage()+"\t\t"+c.getCarType().toString());
		}
		System.out.println("Auta z lat 1999-2006\nID\tMarka\tModel\tRocznik\tPrzebieg\tRodzaj");
		for(Car c: carsYearOfProduction){
			System.out.println(c.getId()+"\t\t"+c.getBrand()+"\t\t"+c.getModel()+"\t\t"+c.getYearOfProduction()+"\t\t"+c.getMileage()+"\t\t"+c.getCarType().toString());
		}
		System.out.println("Auta z przebiegiem 100000 - 400000\nID\tMarka\tModel\tRocznik\tPrzebieg\tRodzaj");
		for(Car c: carsMileage){
			System.out.println(c.getId()+"\t\t"+c.getBrand()+"\t\t"+c.getModel()+"\t\t"+c.getYearOfProduction()+"\t\t"+c.getMileage()+"\t\t"+c.getCarType().toString());
		}
		
		List<Offer> offers = catalog.offers().getPage(1, 2);
		List<Seller> sellers = catalog.sellers().getPage(1, 2);
		
		System.out.println("Sprzedawcy\nID\tNazwa\t\tRodzaj\t\ttelefon\t\tmail\t\t");
		for(Seller s: sellers){
			System.out.println(s.getId()+"\t\t"+s.getName()+"\t\t"+s.getSellerType().toString()+"\t\t"+s.getPhone()+"\t\t"+s.getEmail());
		}
		System.out.println("Oferty\nID\tOpis\t\t\tcena\t\tData utworzenia\tData wygasniecia\tCarID\t\tSellerID\t\t)");
		for(Offer o: offers){
			System.out.println(o.getId()+"\t"+o.getDescription()+"\t\t"+o.getPrice()+"\t"+o.getCreationDate()+"\t"+o.getExpireDate()+"\t"+o.getCarId()+"\t\t"+o.getSellerId());
		}
	}
}
