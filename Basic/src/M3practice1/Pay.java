package M3practice1;

public class Pay {

	public static void main(String[] args) {
		/*��J�b�Y�ө��ʪ����I���B�P��I���B�C
��I���B�p�����I���B�A�h�L�X�����B�������C
��I���B�������I���B�A�h�L�X������������C
��I���B�j�����I���B�A�h��X��^���B�̤֪��r���ƩM�����ơC
���]���ȥu��1000, 500, 100���ȶr�M50, 10, 5, 1���w���C
�����G�Y�R�F132�����ӫ~�A�I1000���A����^�@�i500���A�T�i100���A�@��50���w���A�@��10���w���A�@��5���w���M�T��1���w���C
 */
	int actualPay=999, mustPay=300;
	int changeBack=0,change500=0,change100=0,change50=0,change10=0,change5=0,change1=0;
	if (actualPay < mustPay) System.out.println("���B����");
	if (actualPay == mustPay) System.out.println("�������");
	if (actualPay > mustPay) {System.out.println("���");
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
	System.out.println(change500+"�i500");
	System.out.println(change100+"�i100");
	System.out.println(change50+"��50���w��");
	System.out.println(change10+"��10���w��");
	System.out.println(change5+"��5���w��");
	System.out.println(change1+"��1���w��");
	
	}
}
