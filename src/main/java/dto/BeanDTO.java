package dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BeanDTO
{
    @XmlElement
    private int id;

    @XmlElement
    private String name;

    @XmlElement
    private String value;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String toString()
    {
        return this.getName()+" "+this.getName();
    }
}
