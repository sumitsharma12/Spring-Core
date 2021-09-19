package lifecycle.using.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {

	public double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi(double price) {
		super();
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		// For initializing 
		
		System.out.println("pespsi initialze the bean");
	}
	

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
        //		For Destroy
		System.out.println("Pepsi Destroy the bean ");
	}
	
	
}
