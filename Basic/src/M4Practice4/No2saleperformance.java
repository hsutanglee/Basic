package M4Practice4;

public class No2saleperformance {

	public static void main(String[] args) {

	int data[][]= {{33,32,56,45,33},{77,33,68,45,23},{43,55,43,67,65}};
	String product[]= {"產品A",	"產品B","產品C",	"產品D","產品E"};
	String salesman[]= {"1","2","3"};
	//salesman total
	int salesman_total[]= {0,0,0};
	for (int i=0;i<salesman.length;i++) {
		for (int j=0;j<product.length;j++){
			salesman_total[i]+=data[i][j];
		}
		System.out.println("salesman each tatal " +salesman[i]+"="+salesman_total[i]);
	}
	
	int product_total[]= {0,0,0,0,0};
	for (int j=0;j<product.length;j++) {
		for (int i=0;i<salesman.length;i++){
			product_total[j]+=data[i][j];
		}
		System.out.println("product each total " +product[j]+"="+product_total[j]);
	}
	
	
	
	int best_salesman=0;
	for (int i=0;i<salesman.length;i++){
		if (salesman_total[i]>salesman_total[best_salesman]){
			best_salesman=i;
		}
	}
	System.out.println("best_salesman "+salesman[best_salesman]);
	
	int bestsale_product=0;
	for (int j=0;j<product_total.length;j++) {
		if (product_total[j]>product_total[bestsale_product]) {
			bestsale_product=j;
		}
	}
	System.out.println("best_product is "+product[bestsale_product]);
	
	
	}	

}
