package first10;

class Product
{
	double price;
}

public class Qn1 {

	public void Updateprice(Product product,double price)
	{
		price=price*2;
		product.price=product.price+price;
	}
	public static void main(String[] args) {
		Product prt=new Product();
		prt.price=200;
		double newprice=100;
		
		Qn1 obj=new Qn1();
		obj.Updateprice(prt, newprice);
		System.out.println(prt.price+":"+newprice);
		

	}

}
