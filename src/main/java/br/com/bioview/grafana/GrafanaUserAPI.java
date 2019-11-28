package br.com.bioview.grafana;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/user")
public class GrafanaUserAPI {
	
	//required to validate datasource on grafana
	@GET
	@Produces("application/json")
	@Path("/")
	public String getRoot() {
		return "{}";
	}
	
	@POST
	@Path("/query")
	@Consumes("application/json")
	@Produces("application/json")
	public String query(@DefaultValue("none") @HeaderParam("X-Grafana-User") String user, String query) {
		System.out.println("query:" + query);
		return "[" + user + "]"; 
	}

	@POST
	@Path("/search")
	@Consumes("application/json")
	@Produces("application/json")
	public String search(@DefaultValue("none") @HeaderParam("X-Grafana-User") String user, String query) {
		System.out.println("search:" + query);
		return "[ \"" + user + "\"]"; 
	}
}
