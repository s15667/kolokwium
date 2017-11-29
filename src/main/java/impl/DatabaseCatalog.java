package impl;

import java.sql.Connection;
import java.sql.SQLException;

import mappers.CarMapper;
import mappers.OfferMapper;
import mappers.SellerMapper;
import repositories.ICarRepository;
import repositories.IDatabaseCatalog;
import repositories.IOfferRepository;
import repositories.ISellerRepository;
import uow.IUnitOfWork;

public class DatabaseCatalog implements IDatabaseCatalog{
	private Connection connection;
	IUnitOfWork uow;
	public DatabaseCatalog(Connection connection, IUnitOfWork uow){
		this.connection = connection;
		this.uow = uow;
	}
	public ICarRepository cars() {
		try {
			return new CarRepository(connection, new CarMapper(), uow);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public ISellerRepository sellers() {
		try {
			return new SellerRepository(connection, new SellerMapper(), uow);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public IOfferRepository offers() {
		try {
			return new OfferRepository(connection, new OfferMapper(), uow);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	public void saveChanges() {
		uow.saveChanges();
		
	}
}
