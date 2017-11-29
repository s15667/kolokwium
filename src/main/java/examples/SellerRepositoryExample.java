package examples;

import java.sql.Connection;

import domain.Seller;
import domain.SellerType;
import repositories.IDatabaseCatalog;

public class SellerRepositoryExample {
	public static void execute(Connection connection, IDatabaseCatalog catalog){
		Seller seller = new Seller("Jan Kowalski", SellerType.Private, "111222333", "abc@def.xyz");
		Seller seller1 = new Seller("Złomek", SellerType.Company, "222111333","abc@zlomek.abc");
		catalog.sellers().add(seller);
		catalog.sellers().add(seller1);
		catalog.sellers().add(seller);
		catalog.sellers().add(seller1);
		catalog.sellers().add(seller1);
	}
}
