package kolokwium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import examples.CarRepositoryExample;
import examples.OfferRepositoryExample;
import examples.QueryExamples;
import examples.SellerRepositoryExample;
import impl.DatabaseCatalog;
import repositories.IDatabaseCatalog;
import uow.IUnitOfWork;
import uow.UnitOfWork;

public class App {

	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
		IUnitOfWork uow = new UnitOfWork(connection);
		IDatabaseCatalog catalog = new DatabaseCatalog(connection, uow);
		
		CarRepositoryExample.execute(connection, catalog);
		//SellerRepositoryExample.execute(connection, catalog);
		//OfferRepositoryExample.execute(connection, catalog);
		uow.saveChanges();
		QueryExamples.execute(connection, catalog);
		uow.saveChanges();
		connection.close();
		System.out.println("Koniec");
	}

}
