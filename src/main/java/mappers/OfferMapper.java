package mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Offer;

public class OfferMapper implements IMapper<Offer>{

	public Offer map(ResultSet rs) throws SQLException {
		Offer o = new Offer();
		o.setId(rs.getInt("id"));
		o.setDescription(rs.getString("description"));
		o.setPrice(rs.getFloat("price"));
		o.setCreationDate(rs.getString("creationDate"));
		o.setExpireDate(rs.getString("expireDate"));
		o.setCarId(rs.getInt("carId"));
		o.setSellerId(rs.getInt("sellerId"));
		return o;
	}
	
}
