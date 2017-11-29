package examples;

import java.sql.Connection;

import domain.Offer;
import repositories.IDatabaseCatalog;

public class OfferRepositoryExample {
	public static void execute(Connection connection, IDatabaseCatalog catalog){
		Offer offer = new Offer ("super autko, stan igla", 35000, "2015-02-13", "2015-03-12", 0, 0);
		Offer offer1 = new Offer ("tatko placze ze musi sprzedac", 20000, "2016-03-09", "2016-06-12", 1, 1);
		catalog.offers().add(offer);
		catalog.offers().add(offer1);
	}
}
