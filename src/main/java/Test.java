import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named(value="test")
@RequestScoped
public class Test
{
    public String getMessage(){
   		return "JSF";
   	};

    public String startProcess(){
        return "page.xhtml";
    }

    public String valig(int value){
        FacesContext ctx = FacesContext.getCurrentInstance();

        if(value>10)
        {
            ctx.addMessage("value > 10!", new FacesMessage("!!!"));
        }
        return "jsf.xhtml";
    }

}
