package day36.cryptoToken;

import java.util.ArrayList;
import java.util.Arrays;

public class MyWallet {
    public static void main(String[] args) {

        Bitcoin bitcoin1 = new Bitcoin(2,20,30,355,154,true);

        Bitcoin bitcoin2 = new Bitcoin(2,20,30,355,154,true);

        Etherium etherium  = new Etherium(2,20,30,355,154,true);

        Cardano cardano = new Cardano(2,20,30,355,154,true);

        ArrayList<CryptoToken> tokens = new ArrayList<>();

        Bitcoin[] bitcoins = {bitcoin1, bitcoin2};
        tokens.addAll(Arrays.asList(bitcoins));
        tokens.add(cardano);
        tokens.add(etherium);

        double totalAsset = 0;

        for (CryptoToken token : tokens) {
            totalAsset+= token.totalPrice();
        }
        System.out.println(totalAsset);

    }
}
