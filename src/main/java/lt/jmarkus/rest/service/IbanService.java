package lt.jmarkus.rest.service;


import lt.jmarkus.rest.utility.CountriesIbanLength;
import lt.jmarkus.rest.utility.IbanCountries;
import lt.jmarkus.rest.domain.Iban;
import org.springframework.stereotype.Component;

@Component
public class IbanService {
    private final Iban iban;

    public IbanService(Iban iban) {
        this.iban = iban;
    }

    public boolean isValid() {
        if (!isIBANLength()) return false;
        String stringForMod97 = convertForMod97();
        return validateIBAN(stringForMod97);
    }

    public Iban getIban() {
        return iban;
    }

    public boolean isIBANLength() {
        String countryCode = getCountryCodeFromIban();
        return getIbanLengthByCountry(countryCode) == iban.getId().length();
    }

    public String getCountryCodeFromIban() {
        return iban.getId().substring(0, 2);
    }

    public int getIbanLengthByCountry(String countryCode) {
        return CountriesIbanLength.getIbanLength().get(IbanCountries.valueOf(countryCode));
    }

    public String convertAlphabeticChars() {
        String convertedString = iban.getId();
        char[] charsToConvert = iban.getId().replaceAll("\\d", "").toCharArray();
        for (char c : charsToConvert) {
            convertedString = convertedString.replaceAll(String.valueOf(c), String.valueOf((int) c - 55));
        }
        return convertedString;
    }

    public String convertForMod97() {
        String convertedString = convertAlphabeticChars();
        return convertedString.substring(6) + convertedString.substring(0, 6);
    }

    boolean validateIBAN(String s) {
        int remainder = 0;
        if (s.length() <= 9) {
            return Integer.parseInt(s) % 97 == 1;
        } else {
            remainder = Integer.parseInt(s.substring(0, 9)) % 97;
        }
        return validateIBAN(String.valueOf(remainder) + s.substring(9));
    }
}