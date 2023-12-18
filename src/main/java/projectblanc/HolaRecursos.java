package projectblanc;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("hola")
public class HolaRecursos {

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Hola hola(@QueryParam("nom") String nom) {
		if ((nom == null) || nom.trim().isEmpty())  {
			nom = "món";
		}

		return new Hola(nom);
	}	
	
}
