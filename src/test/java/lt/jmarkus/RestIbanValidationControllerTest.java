package lt.jmarkus;


import lt.jmarkus.rest.controller.RestIbanValidationController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest(RestIbanValidationController.class)
public class RestIbanValidationControllerTest {

    @Test
    public void consumesPostRequest() throws Exception {

    }
}
