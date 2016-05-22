package beans;

import javax.ejb.Stateless;
import javax.inject.Named;

@Named("beanEJB")
@Stateless
public class BeanEJB {

    public String MesFor() {
              // return bean.getName()+"--"+bean.getValue();
           return "11111111111111111";
           }
}
