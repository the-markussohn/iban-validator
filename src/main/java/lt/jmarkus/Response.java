package lt.jmarkus;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlType(namespace = "http://jmarkus.lt")
@XmlRootElement
public class Response implements Serializable {

    private String id;

    private boolean isValid;

    private static final long serialVersionUID = 1L;

    public Response(String id, boolean isValid) {
        this.id = id;
        this.isValid = isValid;
    }

    public Response() {
    }

    @XmlElement
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @XmlElement
    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
}
