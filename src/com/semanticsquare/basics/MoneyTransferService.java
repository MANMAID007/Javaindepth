class MoneyTransferService {
	double computeTransferAmount(int currencyIndex, double amount){
		CurrencyConverter cc = new CurrencyConverter();
		return cc.computeTransferAmount(currencyIndex, amount);
}
	double computeTransferFee(int currencyIndex, double amount) {
		return 0.02 * computeTransferAmount(currencyIndex, amount);
}

	public static void main(String[] args){
		MoneyTransferService transferService = new MoneyTransferService();
	
		double transferAmount = transferService.computeTransferAmount(0, 1000);
		double transferFees = transferService.computeTransferFee(0, 1000);
	
		System.out.println("Transfer Amount: " + transferAmount);
		System.out.println("Transfer Fee: " + transferFees);
}

}