import com.chai.dao.UserDaoMySqlImpl;
import com.chai.dao.UserDaoimpl;
import com.chai.service.UserService;
import com.chai.service.UserServiceimpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceimpl serviceimpl = (UserServiceimpl) context.getBean("Serviceimpl");
        serviceimpl.getUser();
    }
}
