package lt.jmarkus.rest.domain;

import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Component
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
