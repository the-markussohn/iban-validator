package lt.jmarkus.soap;

import lt.jmarkus.soap.beans.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.List;

@Endpoint
public class SoapEndpoint {
    private static final String NAMESPACE_URI = "http://soap.jmarkus.lt/beans";

    private SoapEndpointUtility soapEndpointUtility;

    @Autowired
    public SoapEndpoint(SoapEndpointUtility soapEndpointUtility) {
        this.soapEndpointUtility = soapEndpointUtility;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getValidateRequest")
    @ResponsePayload
    public GetValidateResponse getValidate(@RequestPayload GetValidateRequest request) {
        GetValidateResponse response = new GetValidateResponse();
        soapEndpointUtility.setIBAN(request.getIban());
        response.setIban(soapEndpointUtility.getIBAN());
        response.setValid(soapEndpointUtility.checkValidity());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "listValidateRequest")
    @ResponsePayload
    public ListValidateResponse listValidate(@RequestPayload ListValidateRequest request) {
        ListValidateResponse response = new ListValidateResponse();
        List<ListValidateResponse.ValidityMap.Entry> entries = new ArrayList<>();
        ListValidateResponse.ValidityMap map = new ListValidateResponse.ValidityMap();
        for (lt.jmarkus.soap.beans.Number iban :
                request.getIbans()) {
            ListValidateResponse.ValidityMap.Entry entry = new ListValidateResponse.ValidityMap.Entry();
            soapEndpointUtility.setIBAN(iban.getId());
            entry.setKey(iban.getId());
            entry.setValue(soapEndpointUtility.checkValidity());
            entries.add(entry);
        }
        entries.forEach(entry -> {
            map.getEntry().add(entry);
        });
        response.setValidityMap(map);
        return response;
    }
}

