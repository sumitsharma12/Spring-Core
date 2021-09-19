package lifecycle.using.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("lifecycle/using/annotation/tes.xml");
		context.registerShutdownHook();
		Example pa=(Example)context.getBean("p1");

		System.out.println(pa);
		
	
		
		
	}

}
