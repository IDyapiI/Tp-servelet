package controller;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.w3c.dom.UserDataHandler;

import Texte.Texte;
import Texte.TexteDAO;

import java.io.IOException;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

@Path("/Exemple")
public class controller {

	@POST
	@Path("/Bonjour9")
	@Consumes("application/json")
	@Produces("application/json")
	public List<Texte> direBonjour7(Texte info) throws IOException {
		List<Texte> infos;

		try {
			TexteDAO utilisateur = new TexteDAO();
			utilisateur.setTextes(info);
			infos = utilisateur.getTextes();
			utilisateur.close();

		} catch (Exception e) {
			throw new IOException("Probleme de connexion � la base" + e);
		}
		return infos;
	}
}
