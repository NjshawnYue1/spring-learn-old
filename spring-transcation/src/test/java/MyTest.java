import com.ga.dao.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName MyTest.java
 * @Description TODO
 * @createTime 2020年09月20日 20:26:00
 */
public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");;
        UserMapper userMapper = (UserMapper) context.getBean("userMapper");
        System.out.println(userMapper.query());
    }
}
