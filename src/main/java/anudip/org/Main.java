package anudip.org;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[] args) {
		ApplicationContext apx=new ClassPathXmlApplicationContext("spring.config.xml") ;		
		User u=(User) apx.getBean("userobj");		
		u.userdisplay();
	}

}