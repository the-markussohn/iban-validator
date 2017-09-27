package lt.jmarkus;

import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@Component
@XmlType(namespace = "http://jmarkus.lt")
@XmlRootElement(name = "iban")
public class Iban implements Serializable{

    private String id;

    @XmlElement(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
