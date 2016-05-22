package ajax;

import beans.MyBean;
import dto.BeanDTO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/")
public class MessController {

    @GET
    @Produces("text/plain")
    public String message()
    {
     return "worked!";
    }

    @GET
    @Path("/bean")
    @Produces("application/json")
    public MyBean getEntity()
    {
        MyBean bean = new MyBean();
        bean.setName("bean1");
        bean.setValue("value");
        return bean;
    }

    @GET
    @Path("/{name}")
    @Produces("text/plain")
    public String messageService(@PathParam("name") String msg){

        return "111111";
    }

    @GET
    @Path("/testRest")
    @Consumes(MediaType.APPLICATION_JSON)
    public BeanDTO messageRest(){
        BeanDTO bean = new BeanDTO();
        bean.setValue("value");
        bean.setName("Name");
        return bean;
    }

    @GET
    @Consumes
   public String messageOutService(){

       return "111111";
   }
}
