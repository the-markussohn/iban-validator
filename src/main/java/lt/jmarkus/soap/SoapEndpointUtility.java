package lt.jmarkus.soap;

import lt.jmarkus.rest.domain.Iban;
import lt.jmarkus.rest.service.IbanService;
import org.springframework.stereotype.Component;

@Component
public class SoapEndpointUtility {
    private final Iban IBAN;

    public SoapEndpointUtility() {
        this.IBAN = new Iban();
    }

    public void setIBAN(String ibanString) {
        IBAN.setId(ibanString);
    }

    public String getIBAN() {
        return IBAN.getId();
    }

    public boolean checkValidity() {
        return new IbanService(IBAN).isValid();
    }
}
