package lt.jmarkus;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountriesIbanLength {

    private static final Map<IbanCountries, Integer> IBAN_LENGTH = new HashMap<>();

    static {
        IBAN_LENGTH.put(IbanCountries.AD, 24);
        IBAN_LENGTH.put(IbanCountries.AE, 23);
        IBAN_LENGTH.put(IbanCountries.AL, 28);
        IBAN_LENGTH.put(IbanCountries.AT, 20);
        IBAN_LENGTH.put(IbanCountries.AZ, 28);
        IBAN_LENGTH.put(IbanCountries.BA, 20);
        IBAN_LENGTH.put(IbanCountries.BE, 16);
        IBAN_LENGTH.put(IbanCountries.BG, 22);
        IBAN_LENGTH.put(IbanCountries.BH, 22);
        IBAN_LENGTH.put(IbanCountries.BR, 29);
        IBAN_LENGTH.put(IbanCountries.BY, 28);
        IBAN_LENGTH.put(IbanCountries.CH, 21);
        IBAN_LENGTH.put(IbanCountries.CR, 22);
        IBAN_LENGTH.put(IbanCountries.CY, 28);
        IBAN_LENGTH.put(IbanCountries.CZ, 24);
        IBAN_LENGTH.put(IbanCountries.DE, 22);
        IBAN_LENGTH.put(IbanCountries.DK, 18);
        IBAN_LENGTH.put(IbanCountries.DO, 28);
        IBAN_LENGTH.put(IbanCountries.EE, 20);
        IBAN_LENGTH.put(IbanCountries.ES, 24);
        IBAN_LENGTH.put(IbanCountries.FI, 18);
        IBAN_LENGTH.put(IbanCountries.FO, 18);
        IBAN_LENGTH.put(IbanCountries.FR, 27);
        IBAN_LENGTH.put(IbanCountries.GB, 22);
        IBAN_LENGTH.put(IbanCountries.GE, 22);
        IBAN_LENGTH.put(IbanCountries.GI, 23);
        IBAN_LENGTH.put(IbanCountries.GL, 18);
        IBAN_LENGTH.put(IbanCountries.GR, 27);
        IBAN_LENGTH.put(IbanCountries.GT, 28);
        IBAN_LENGTH.put(IbanCountries.HR, 21);
        IBAN_LENGTH.put(IbanCountries.HU, 28);
        IBAN_LENGTH.put(IbanCountries.IE, 22);
        IBAN_LENGTH.put(IbanCountries.IL, 23);
        IBAN_LENGTH.put(IbanCountries.IQ, 23);
        IBAN_LENGTH.put(IbanCountries.IS, 26);
        IBAN_LENGTH.put(IbanCountries.IT, 27);
        IBAN_LENGTH.put(IbanCountries.JO, 30);
        IBAN_LENGTH.put(IbanCountries.KW, 30);
        IBAN_LENGTH.put(IbanCountries.KZ, 20);
        IBAN_LENGTH.put(IbanCountries.LB, 28);
        IBAN_LENGTH.put(IbanCountries.LC, 32);
        IBAN_LENGTH.put(IbanCountries.LI, 21);
        IBAN_LENGTH.put(IbanCountries.LT, 20);
        IBAN_LENGTH.put(IbanCountries.LU, 20);
        IBAN_LENGTH.put(IbanCountries.LV, 21);
        IBAN_LENGTH.put(IbanCountries.MC, 27);
        IBAN_LENGTH.put(IbanCountries.MD, 24);
        IBAN_LENGTH.put(IbanCountries.ME, 22);
        IBAN_LENGTH.put(IbanCountries.MK, 19);
        IBAN_LENGTH.put(IbanCountries.MR, 27);
        IBAN_LENGTH.put(IbanCountries.MT, 31);
        IBAN_LENGTH.put(IbanCountries.MU, 30);
        IBAN_LENGTH.put(IbanCountries.NL, 18);
        IBAN_LENGTH.put(IbanCountries.NO, 15);
        IBAN_LENGTH.put(IbanCountries.PK, 24);
        IBAN_LENGTH.put(IbanCountries.PL, 28);
        IBAN_LENGTH.put(IbanCountries.PS, 29);
        IBAN_LENGTH.put(IbanCountries.PT, 25);
        IBAN_LENGTH.put(IbanCountries.QA, 29);
        IBAN_LENGTH.put(IbanCountries.RO, 24);
        IBAN_LENGTH.put(IbanCountries.RS, 22);
        IBAN_LENGTH.put(IbanCountries.SA, 24);
        IBAN_LENGTH.put(IbanCountries.SC, 31);
        IBAN_LENGTH.put(IbanCountries.SE, 24);
        IBAN_LENGTH.put(IbanCountries.SI, 19);
        IBAN_LENGTH.put(IbanCountries.SK, 24);
        IBAN_LENGTH.put(IbanCountries.SM, 27);
        IBAN_LENGTH.put(IbanCountries.ST, 25);
        IBAN_LENGTH.put(IbanCountries.SV, 28);
        IBAN_LENGTH.put(IbanCountries.TL, 23);
        IBAN_LENGTH.put(IbanCountries.TN, 24);
        IBAN_LENGTH.put(IbanCountries.TR, 26);
        IBAN_LENGTH.put(IbanCountries.UA, 29);
        IBAN_LENGTH.put(IbanCountries.VG, 24);
        IBAN_LENGTH.put(IbanCountries.XK, 20);
    }

    public static Map<IbanCountries, Integer> getIbanLength() {
        return Collections.unmodifiableMap(IBAN_LENGTH);
    }
}
