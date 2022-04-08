package day36.cryptoToken;

public class CryptoToken {

    public int quantity;
    public double price, volume;
    public long marketCap, circulatingSupply;
    public boolean isMineable;

    public CryptoToken(int quantity, double price, double volume, long marketCap, long circulatingSupply, boolean isMineable) {
        this.quantity = quantity;
        this.price = price;
        this.volume = volume;
        this.marketCap = marketCap;
        this.circulatingSupply = circulatingSupply;
        this.isMineable = isMineable;
    }

    public double totalPrice(){
        return price * quantity;
    }

    public String toString() {
        return "CryptoToken{" +
                "quantity=" + quantity +
                ", price=" + price +
                ", volume=" + volume +
                ", marketCap=" + marketCap +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                '}';
    }
}
/*
CryptoToken Task
	1. create a class called CryptoToken
			variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)



			methods:
				setInfo()
				toString()
				totalPrice(): returns the total price of the cyrpto totek ( price * quantity)

	2. create 5 sub classes of CryptoToken:
			Bitcoin
			Ethereum
			Cardano
			XRP
			Doge

	3. create a class named MyWallet

		create one object of each CryptoToken

		calculate the total Asset

 */