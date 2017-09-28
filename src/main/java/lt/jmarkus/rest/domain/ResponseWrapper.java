package lt.jmarkus.rest.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement (name = "ibans")
@XmlSeeAlso(Response.class)
public class ResponseWrapper implements Serializable{

    @JsonProperty (value = "ibans")
    private List<Response> ibans;

    public ResponseWrapper() {
        ibans = new ArrayList<>();
    }

    @XmlAnyElement(lax = true)
    public List<Response> getIbans() {
        return ibans;
    }

    public void setIbans(List<Response> ibans) {
        this.ibans = ibans;
    }
}
