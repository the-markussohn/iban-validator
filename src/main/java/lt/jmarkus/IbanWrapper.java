package lt.jmarkus;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.List;

@XmlRootElement (name = "ibans")
@XmlType(namespace = "http://jmarkus.lt")
@XmlSeeAlso(Iban.class)
public class IbanWrapper implements Serializable{

    @JsonProperty(value = "ibans")
    private List<Iban> ibans;

    @XmlAnyElement(lax = true)
    public List<Iban> getIbans() {
        return ibans;
    }

    public void setIbans(List<Iban> ibans) {
        this.ibans = ibans;
    }
}
