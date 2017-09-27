package lt.jmarkus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class SoapEndpoint {
    private static final String NAMESPACE_URI = "http://localhost:8080/";

    private Iban iban;

    @Autowired
    public SoapEndpoint(Iban iban) {
        this.iban = iban;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ibanValid")
    @ResponsePayload
    public Response isValid(@RequestPayload Iban iban) {
        IbanService service = new IbanService(iban);
        return new Response(iban.getId(), service.isValid());
    }
}

