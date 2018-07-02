package M3practice1;

public class Pay {

	public static void main(String[] args) {
		/*輸入在某商店購物應付金額與實付金額。
實付金額小於應付金額，則印出”金額不足”。
實付金額等於應付金額，則印出”不必找錢”。
實付金額大於應付金額，則輸出找回金額最少的鈔票數和錢幣數。
假設幣值只有1000, 500, 100元紙鈔和50, 10, 5, 1元硬幣。
說明：若買了132元的商品，付1000元，應找回一張500元，三張100元，一個50元硬幣，一個10元硬幣，一個5元硬幣和三個1元硬幣。
 */
	int actualPay=999, mustPay=300;
	int changeBack=0,change500=0,change100=0,change50=0,change10=0,change5=0,change1=0;
	if (actualPay < mustPay) System.out.println("金額不足");
	if (actualPay == mustPay) System.out.println("不必找錢");
	if (actualPay > mustPay) {System.out.println("找錢");
			changeBack=actualPay-mustPay;
			change500=changeBack/500;
			change100=(changeBack%500)/100;
			change50=((changeBack-change500*500-change100*100)%100)/50;
			change10=((changeBack-change500*500-change100*100-change50*50)%50)/10;
		    change5=((changeBack-change500*500-change100*100-change50*50-change10*10)%10)/5;
			change1=(changeBack-change500*500-change100*100-change50*50-change10*10-change5*5)%5;
	}
	System.out.println("must pay : "+mustPay);
	System.out.println("actural pay : "+actualPay);
	System.out.println(change500+"張500");
	System.out.println(change100+"張100");
	System.out.println(change50+"個50元硬幣");
	System.out.println(change10+"個10元硬幣");
	System.out.println(change5+"個5元硬幣");
	System.out.println(change1+"個1元硬幣");
	
	}
}
