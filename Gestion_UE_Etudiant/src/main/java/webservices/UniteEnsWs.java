package webservices;

import entities.UniteEnseignement;
import metiers.UniteEnseignementBusiness;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("/ue")
public class UniteEnsWs {
    UniteEnseignementBusiness helper = new UniteEnseignementBusiness();
    @Path("list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() {
        public Response addUE (UniteEnseignement UniteEnseignement ue;
        ue){
            if (helper.addUniteEnseignement(ue) == true) {
                return Response.status(200).
                        entity("object added").build();

            } else return Response.status(400).
                    entity("object not added").build();
        }
    }

