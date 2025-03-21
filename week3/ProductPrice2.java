package week3;

public class ProductPrice2 {
	public static void main(String[] args) {
		
		//우유 변수 설정
		int m_cnt = 1;
		int m_price = 4500;
				
		//당근 변수 설정
		int c_cnt = 3;
		int c_price = 1000;
				
		//과자 변수 설정
		int s_cnt = 2;
		int s_price = 1500;
				
		//할인 전 상품 가격
		int total1 =  m_cnt *  m_price;
		total1 += c_cnt * c_price;
		total1 += s_cnt * s_price;
		System.out.println("할인 전 상품 가격: " + total1 + "원");
				
		//할인 금액
		int total2 = m_cnt * m_price;
		total2 += s_cnt * s_price;
				
		int rate = 25;
		double discount = total2 * rate / 100;
		System.out.println("할인 금액: " + discount + "원");
				
		//최종 결제 금액
		double final_amt = total1 - discount;
		System.out.println("최종 결제 금액: " + final_amt + "원");
	}
}
