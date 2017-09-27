package lt.jmarkus;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IbanServiceTest {
    private Iban iban;
    private IbanService ibanService;

    @Before
    public void setUp() throws Exception {
        iban = new Iban();
        iban.setId("GB82WEST12345698765432");
        ibanService = new IbanService(iban);
    }

    @Test
    public void validatesTrueWhenLengthIsCorrect() throws Exception {
        assertTrue(ibanService.isIBANLength());
        iban.setId("LT121000011101001000");
        assertTrue(ibanService.isIBANLength());
        iban.setId("GB82WEST12345");
        assertFalse(ibanService.isIBANLength());
    }

    @Test
    public void convertsAlphabeticCharsAccordingToMod97Rules() throws Exception {
        assertEquals("1611823214282912345698765432", ibanService.convertAlphabeticChars());
    }

    @Test
    public void convertsIBANAccordingToMod97Rules() throws Exception {
        assertEquals("3214282912345698765432161182", ibanService.convertForMod97());
    }

    @Test
    public void validatesThatIBANIsCorrect() throws Exception {
        assertTrue(ibanService.isValid());
        iban.setId("DK500040044011624");
        assertFalse(ibanService.isValid());
    }
}