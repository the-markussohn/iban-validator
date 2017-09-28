package lt.jmarkus.rest.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

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
