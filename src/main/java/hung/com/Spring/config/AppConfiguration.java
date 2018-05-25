package hung.com.Spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import hung.com.Spring.lang.Language;
import hung.com.Spring.lang.impl.Vietnamese;

/**
 * Thay vì config với XML thì ta config bằng Annotation
 *
 */
@Configuration
@ComponentScan({"hung.com.Spring.bean"}) //tất cả been khởi tạo interface Language sẽ trả về new Vietnamese.
public class AppConfiguration {
    
    /**
     * tạo 1 bean bất kỳ ở đây vào khởi tạo cho nó
     * Ngoài các bean ở đây, còn có các bean tạo bởi @service, @component, @repository
     */
	@Bean(name ="language")
    public Language getLanguage() {
		//khởi tạo và bean ở đây, đưa giá trị vào bằng java code như thường
        return new Vietnamese();  //class implement Language interface
    }
      
}
