package PAYCO;

interface PayProcess{
	public void payProcess();
}

abstract public class Payment { //���� Ŭ����
	protected String shopName;
	protected String productName;
	protected long productPrice;
	
	public Payment() {
		
	}
	public Payment(String shopName, String productName, long productPrice) {
		super();
		this.shopName = shopName;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public abstract void pay(); //�߻�޼���: ����θ� �ۼ��ϰ� �����δ� �ۼ����� ����

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public long getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}
}

class CardPayment extends Payment implements PayProcess{
	private String cardNumber;
	private String cardPassword;
	private int monthlyInstallment;
	
	@Override // �θ�Ŭ������ �߻�޼��� �������̵��Ͽ� ����
	public void pay(){
		if(getMonthlyInstallment()<0 | productPrice<=0) {
			System.out.println("�����̳� �Һΰ������� �߸��Ǿ����ϴ�.");
		}else {
		System.out.println("�ſ�ī�尡 ���������� ���ҵǾ����ϴ�.");
		}
	}
	public CardPayment(){
		
	}
	public CardPayment(String shopName, String productName, long productPrice,String cardNumber, String cardPassword, int monthlyInstallment) {
		super(shopName,productName,productPrice);
		this.cardNumber = cardNumber;
		this.cardPassword = cardPassword;
		this.monthlyInstallment = monthlyInstallment;
	}

	@Override
	public String toString() {
		String msg = "[�ſ�ī�� ���� ����]";
		msg += "\n������ : "+shopName;
		msg += "\n��ǰ�� : "+productName;
		msg += "\n��ǰ���� : "+productPrice;
		msg += "\n�ſ�ī���ȣ : "+cardNumber;
		msg += "\n�Һΰ��� : "+monthlyInstallment;
		return msg;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardPassword() {
		return cardPassword;
	}
	public void setCardPassword(String cardPassword) {
		this.cardPassword = cardPassword;
	}
	public int getMonthlyInstallment() {
		return monthlyInstallment;
	}
	public void setMonthlyInstallment(int monthlyInstallment) {
		this.monthlyInstallment = monthlyInstallment;
	}
	
	@Override
	public void payProcess() {
		this.pay();
		System.out.println( this );
	}
}

class CashPayment extends Payment implements PayProcess{
	private String cashReceiptNumber;

	@Override
	public void pay(){
		if(productPrice<=0) {
			System.out.println("������ �߸��Ǿ����ϴ�.");
		}else {
		System.out.println("������ ���������� ���ҵǾ����ϴ�.");
		}
	}
	public CashPayment(){
		
	}
	public CashPayment(String shopName, String productName, long productPrice,String cashReceiptNumber) {
		super(shopName,productName,productPrice);
		this.cashReceiptNumber = cashReceiptNumber;
	}

	@Override
	public String toString() {
		String msg = "[���� ���� ����]";
		msg += "\n������ : "+shopName;
		msg += "\n��ǰ�� : "+productName;
		msg += "\n��ǰ���� : "+productPrice;
		msg += "\n���ݿ�������ȣ : "+cashReceiptNumber;
		return msg;
	}
	public String getCashReceiptNumber() {
		return cashReceiptNumber;
	}
	public void setCashReceiptNumber(String cashReceiptNumber) {
		this.cashReceiptNumber = cashReceiptNumber;
	}
	
	@Override
	public void payProcess() {
		this.pay();
		System.out.println( this );
	}
}

class PayProcessing{
	public void payProcessing(PayProcess pp) {
		pp.payProcess();
	}
}