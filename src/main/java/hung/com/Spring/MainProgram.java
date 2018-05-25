package hung.com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import hung.com.Spring.bean.GreetingService;
import hung.com.Spring.bean.MyComponent;
import hung.com.Spring.config.AppConfiguration;
import hung.com.Spring.lang.Language;

public class MainProgram {
	 
	   public static void main(String[] args) {
	 
	       // Creating a Context Application object by reading
	       // the configuration of the 'AppConfiguration' class.
	       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
	 
	       //====================================== vd1:
	       System.out.println("----------");
	       Language language = (Language) context.getBean("language");
	      
	       System.out.println("Bean Language: "+ language);
	       System.out.println("Call language.sayBye(): "+ language.getBye());
	      
	       //====================================== vd2:
	       System.out.println("----------");
	       GreetingService service = (GreetingService) context.getBean("greetingService");
	       service.sayGreeting();
	  
	       //================================== vd3:
	       System.out.println("----------");
	       MyComponent myComponent = (MyComponent) context.getBean("myComponent");
	       myComponent.showAppInfo();
	      
	   }
	  
	}

