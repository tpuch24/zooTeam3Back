package zooteam3.enclos;

import java.util.ArrayList;

import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;

@Path("/")
public class EnclosService extends Application{
	@Inject 
	private IEnclosManager enclosM;
	
    @GET
    @Path("/xml/enclos/{id}")
    @Produces({ "application/xml" })
    public Enclos getEnclosXML(@PathParam("id") String id) {
        return enclosM.getEnclos(Integer.parseInt(id));
    }

    @GET
    @Path("/json/enclos/{id}")
    @Produces({ "application/json" })
    public Enclos getEnclosJson(@PathParam("id") String id) {
        return enclosM.getEnclos(Integer.parseInt(id)) ;
    }

    @GET
    @Path("/xml/enclos/liste")
    @Produces({ "application/xml" })
    public ArrayList<Enclos> getListeEnclosXML() {
        return enclosM.getListeEnclos() ;
    }

    @GET
    @Path("json/enclos/liste")
    @Produces({ "application/json" })
    public ArrayList<Enclos> getListeEnclosJson() {
        return enclosM.getListeEnclos() ;
    }

    @DELETE
    @Path("/xml/enclos/delete/{id}")
    @Produces({ "application/xml" })
    public String deleteEnclosXML(@PathParam("id") String id) {
    	if (enclosM.deleteEnclos(Integer.parseInt(id))) {
    		return "<result>OK<result>";
    	} else {
    		return "<result>KO<result>";
    	}
    }

    @DELETE
    @Path("/json/enclos/delete/{id}")
    @Produces({ "application/json" })
    public String deleteEnclosJson(@PathParam("id") String id) {
    	if (enclosM.deleteEnclos(Integer.parseInt(id))) {
    		return "{\"OK\"}";
    	} else {
    		return "{KO}";
    	}
    }

    @POST
    @Path("/json/enclos/insert")
    @Consumes({"application/json" })
    @Produces({ "application/json" })
    public Enclos insertEnclosJson(Enclos enclos) {
        return enclosM.insertEnclos(enclos) ;
    }
    
    @POST
    @Path("/json/enclos/update")
    @Consumes({"application/json" })
    @Produces({ "application/json" })
    public Enclos updateEnclosJson(Enclos enclos) {
        return enclosM.updateEnclos(enclos) ;
    }
}
