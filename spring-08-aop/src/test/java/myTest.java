import com.chai.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    @Test
    public  void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       UserService userService = (UserService) context.getBean("userService");
       userService.add();
    }
}
