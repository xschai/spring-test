import com.chai.pojo.Address;
import com.chai.pojo.Student;
import com.chai.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Mytest {
    public static void main(String[] args) {
//        Address address = new Address();
//        System.out.println(address);
      ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.toString());

    }


}
