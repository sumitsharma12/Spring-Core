package lifecycle.using.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("lifecycle/using/interfaces/Tt.xml");
		Pepsi pa=(Pepsi)context.getBean("p1");
		System.out.println(pa);
		
		context.registerShutdownHook();
	}

}
