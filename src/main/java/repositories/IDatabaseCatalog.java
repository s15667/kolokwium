package repositories;

public interface IDatabaseCatalog {
	public ICarRepository cars();
	public ISellerRepository sellers();
	public IOfferRepository offers();
	
	public void saveChanges();
}
