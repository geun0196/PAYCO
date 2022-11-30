package PAYCO;

//OCP를 위한 PayProcess 

interface PayProcess{
	public void payProcess();
}

abstract public class Payment { //결제 클래스
	protected String shopName;
	protected String productName;
	protected long productPrice;

	public Payment() {

	}
	
	public Payment(String shopName, String productName, long productPrice) {// 결제 생성자
		super();
		this.shopName = shopName;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public abstract void pay(); //추상메서드: 선언부만 작성하고 구현부는 작성하지 않음

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

// PayProcess를 지키고 Payment를 상속받는 카드결제를 위한 클래스 생성
class CardPayment extends Payment implements PayProcess{
	private String cardNumber;
	private String cardPassword;
	private int monthlyInstallment;

	@Override // 부모클래스의 추상메서드 오버라이드하여 구현
	public void pay(){
		if(getMonthlyInstallment()<0 | productPrice<=0) {
			System.out.println("가격이나 할부개월수가 잘못되었습니다.");
		}else {
			System.out.println("신용카드가 정상적으로 지불되었습니다.");
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
		String msg = "[신용카드 결제 정보]";
		msg += "\n상점명 : "+shopName;
		msg += "\n상품명 : "+productName;
		msg += "\n상품가격 : "+productPrice;
		msg += "\n신용카드번호 : "+cardNumber;
		msg += "\n할부개월 : "+monthlyInstallment;
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
	public void payProcess() { //protocol 구현
		this.pay();
		System.out.println( this );
	}
}

//PayProcess를 지키고 Payment를 상속받는 포인트제를 위한 클래스 생성
class PointPayment extends Payment implements PayProcess{
	private String PointReceiptNumber;

	@Override
	public void pay(){ //부모클래스 추상메소드 재정의
		if(productPrice<=0) {
			System.out.println("가격이 잘못되었습니다.");
		}else {
			System.out.println("현금이 정상적으로 지불되었습니다.");
		}
	}
	public PointPayment(){

	}
	// PointPayment 클래스의 생성자
	public PointPayment(String shopName, String productName, long productPrice,String PointReceiptNumber) {
		super(shopName,productName,productPrice);
		this.PointReceiptNumber = PointReceiptNumber;
	}

	@Override
	public String toString() {
		String msg = "[현금 결제 정보]";
		msg += "\n상점명 : "+shopName;
		msg += "\n상품명 : "+productName;
		msg += "\n상품가격 : "+productPrice;
		msg += "\n현금영수증번호 : "+PointReceiptNumber;
		return msg;
	}
	public String getPointReceiptNumber() {
		return PointReceiptNumber;
	}
	public void setPointReceiptNumber(String PointReceiptNumber) {
		this.PointReceiptNumber = PointReceiptNumber;
	}

	@Override 
	public void payProcess() { //protocol 구현
		this.pay();
		System.out.println( this );
	}
}

class PayProcessing{ // OCP를 위해 다른 클래스는 수정하지 않고 payProcessing을 수정한다.
	public void payProcessing(PayProcess pp) {
		pp.payProcess();
	}
}