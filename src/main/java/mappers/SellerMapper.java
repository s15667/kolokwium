package mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Seller;
import domain.SellerType;

public class SellerMapper implements IMapper<Seller>{

	public Seller map(ResultSet rs) throws SQLException {
		Seller s = new Seller();
		s.setId(rs.getInt("id"));
		s.setName(rs.getString("name"));
		s.setSellerType(SellerType.valueOf(rs.getString("sellerType")));
		s.setPhone(rs.getString("phone"));
		s.setEmail(rs.getString("email"));
		return s;
	}

}
