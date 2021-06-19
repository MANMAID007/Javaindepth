class CurrencyConverter {
	double[] exchangeRates = {63.0, 3.0, 3.0, 595.0, 18.0, 107.0, 2.0};
	
	void setExchangeRate(double[] rates) {
		exchangeRates = rates;
	}
	void updateExchangeRate(int currencyIndex, double newVal) {
		exchangeRates[currencyIndex] = newVal;
	}
	double getExchangeRate(int currencyIndex){
		return exchangeRates[currencyIndex];
	}
	double computeTransferAmount(int currencyIndex, double amount){
		return amount * getExchangeRate(currencyIndex);
	}
	
	void printCurrencies(){
		System.out.println("rupee: " + exchangeRates[0]);
		System.out.println("dirham: " + exchangeRates[1]);
		System.out.println("real: " + exchangeRates[2]);
		System.out.println("chilean_peso: " + exchangeRates[3]);
		System.out.println("mexican_peso: " + exchangeRates[4]);
		System.out.println("_yen: " + exchangeRates[5]);
		System.out.println("$australian: " + exchangeRates[6]);
	}
	
	public static void main(String[] arg){
		CurrencyConverter cc = new CurrencyConverter();
		
		double[] rates = {63.0, 3.0, 3.0, 595.0, 18.0, 107.0, 2.0};
		cc.setExchangeRate(rates);
		cc.printCurrencies();
		
		rates = new double[] {66.0, 3.0, 3.0, 585.0, 18.0, 105.0, 2.0};
		cc.setExchangeRate(rates);
		cc.printCurrencies();
		
		cc.updateExchangeRate(0, 65.0);
		cc.printCurrencies();
		
		double amount = cc.computeTransferAmount(0, 1000);
		System.out.println(amount);
	}
}