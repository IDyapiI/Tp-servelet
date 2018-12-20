package Texte;
import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Texte {

	private String id;
	private String continent;
	private String pays;
	private String OS;
	private String navigateur;
	private String resolution; 
	
	public String getId() {
		return id;	
	}
	public String getContinent() {
		return continent;
	}
	public String getPays() {
		return pays;
	}
	public String getOS() {
		return OS;
	}
	public String getNavigateur() {
		return navigateur;
	}
	public String getResolution() {
		return resolution;
	}	
	public void setId(String id) {
		this.id = id;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public void setOS(String OS) {
		this.OS = OS;
	}
	public void setNavigateur(String navigateur) {
		this.navigateur = navigateur;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	

}