import com.ga.mapper.UserMapper;
import com.ga.mapper.UserMapperImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName MyTest.java
 * @Description TODO
 * @createTime 2020年09月20日 18:01:00
 */
public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");


        UserMapper userMapper = (UserMapper) context.getBean("userMapper");
        System.out.println(userMapper.query());
    }
}
