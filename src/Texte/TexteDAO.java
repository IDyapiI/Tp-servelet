package Texte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TexteDAO {

	private Connection connect;
	
	public TexteDAO() throws ClassNotFoundException, SQLException {
	
		Class.forName("com.mysql.jdbc.Driver");
		connect = DriverManager
		.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=");
		
	}
		
	public List<Texte> getTextes() throws SQLException{
			Statement st = connect.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM data");
			List<Texte> result = new ArrayList<>();
			
			while (rs.next()) {
				Texte t = new Texte();
				t.setId(rs.getString("id"));
				t.setContinent(rs.getString("continent"));
				t.setPays(rs.getString("pays"));
				t.setOS(rs.getString("OS"));
				t.setNavigateur(rs.getString("navigateur"));
				t.setResolution(rs.getString("resolution"));
				result.add(t);
			}
			
			return result;
	}

	public void setTextes(Texte info) throws SQLException{
		
		Statement st = connect.createStatement();
		st.execute("INSERT INTO data(Continent, OS, navigateur, resolution, pays) VALUES ('" + info.getContinent() + "','" + info.getOS() + "','" + info.getNavigateur() + "','" + info.getResolution() + "','" + info.getPays() + "')");

	}
	
	public void close() throws SQLException {
		connect.close();
	}

}