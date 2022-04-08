package day36.cryptoToken;

public class Bitcoin extends CryptoToken{
    public Bitcoin(int quantity, double price, double volume, long marketCap, long circulatingSupply, boolean isMineable) {
        super(quantity, price, volume, marketCap, circulatingSupply, isMineable);
    }
}
