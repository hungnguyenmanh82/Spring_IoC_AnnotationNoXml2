package hung.com.Spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hung.com.Spring.lang.Language;

@Service //singleton
public class GreetingService {
 
   @Autowired
   private Language language; //tự động khởi tạo khi new GreetingService
 
   public GreetingService() {
 
   }
 
   public void sayGreeting() {
        
       String greeting = language.getGreeting();
 
       System.out.println("Greeting: " + greeting);
   }
 
}
