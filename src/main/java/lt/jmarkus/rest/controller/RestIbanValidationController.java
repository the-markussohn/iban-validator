package lt.jmarkus.rest.controller;

import lt.jmarkus.rest.domain.Iban;
import lt.jmarkus.rest.domain.IbanWrapper;
import lt.jmarkus.rest.domain.Response;
import lt.jmarkus.rest.domain.ResponseWrapper;
import lt.jmarkus.rest.service.IbanService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestIbanValidationController {

    @RequestMapping(method = RequestMethod.POST, value = "/iban",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Response isIBAN(@RequestBody Iban iban) {
        IbanService service = new IbanService(iban);
        return new Response(service.getIban().getId(), service.isValid());
    }

    @RequestMapping(method = RequestMethod.POST, value = "/ibanlist",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseWrapper isIBAN(@RequestBody IbanWrapper ibanWrapper) {
        ResponseWrapper wrapper = new ResponseWrapper();
        for (Iban iban :
                ibanWrapper.getIbans()) {
            wrapper.getIbans().add(new Response(iban.getId(), new IbanService(iban).isValid()));
        }
        return wrapper;
    }
}
