package lt.jmarkus.soap;

import lt.jmarkus.soap.beans.GetValidateRequest;
import lt.jmarkus.soap.beans.GetValidateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

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
}

