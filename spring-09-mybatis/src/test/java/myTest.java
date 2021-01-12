import com.chai.dao.UserMapper;
import com.chai.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class myTest {

    @Test
    public void test1() throws  IOException{
//        String resource="mybatis-config.xml";
//
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = build.openSession(true);
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> userList = mapper.selectUser();
//        for (User user : userList) {
//            System.out.println(user);
//        }

       ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
       UserMapper userMapper = (UserMapper) context.getBean("userMapper2");
        List<User> user = userMapper.selectUser();
        System.out.println(user);

    }
}
