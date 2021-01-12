import com.chai.config.ChaiConfig;
import com.chai.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ChaiConfig.class);
        User getUser = (User) context.getBean("getUser");
        System.out.println(getUser.toString());

    }


}
