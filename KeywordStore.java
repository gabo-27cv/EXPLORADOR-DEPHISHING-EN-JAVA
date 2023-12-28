import java.util.Map;
import java.util.HashMap;

public class KeywordStore {
    private static final Map<String, Integer> phishingKeywords = new HashMap<>();
    static {
        phishingKeywords.put("Banco de la Nación Argentina", 1);
        phishingKeywords.put("Banco Santander", 1);
        phishingKeywords.put("Banco Galicia", 1);
        phishingKeywords.put("Fundación Mastercard", 1);
        phishingKeywords.put("Google", 1);
        phishingKeywords.put("Gobierno de Argentina", 1);
        phishingKeywords.put("Servicio de Salud de la Nación Argentina", 1);
        phishingKeywords.put("Seguridad Social Argentina", 1);
        phishingKeywords.put("Sistema de Medicina Preventiva y Curativa (SMPC)", 1);
        phishingKeywords.put("Unión de Salud de la Nación Argentina", 1);
        phishingKeywords.put("Codin", 1);
        phishingKeywords.put("Wise", 1);
        phishingKeywords.put("Western Union", 1);
        phishingKeywords.put("TransferGo", 1);
        phishingKeywords.put("PayPal", 1);
        phishingKeywords.put("Mercado Pago", 1);
        phishingKeywords.put("Exchange", 1);
        phishingKeywords.put("Bitcoin", 1);
        phishingKeywords.put("Ethereum", 1);
        phishingKeywords.put("Ripple", 1);
        phishingKeywords.put("XRP", 1);
        phishingKeywords.put("Litecoin", 1);
        phishingKeywords.put("Bitcoin Cash", 1);
        phishingKeywords.put("Binance", 1);
        phishingKeywords.put("Coinbase", 1);
        phishingKeywords.put("FTX", 1);
        phishingKeywords.put("Bitmex", 1);
        phishingKeywords.put("Kraken", 1);
        phishingKeywords.put("Ethereum Classic", 1);
        phishingKeywords.put("Zcash", 1);
    }

    public static Map<String, Integer> getPhishingKeywords() {
        return phishingKeywords;
    }
}
