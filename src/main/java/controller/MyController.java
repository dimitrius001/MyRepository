package controller;

import beans.MyBean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("myController")
@RequestScoped
public class MyController {

    public MyController() {
    }

    private MyBean bean = new MyBean();

    public String startProcess()
    {
        return "Name - "+bean.getName()+" Value - "+bean.getValue();
    }

    public MyBean getBean() {
        return bean;
    }


}
