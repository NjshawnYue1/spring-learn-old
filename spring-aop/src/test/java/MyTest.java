import com.ga.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName MyTest.java
 * @Description TODO
 * @createTime 2020年09月20日 16:59:00
 */
public class MyTest {
    @Test
    public void mytest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }
}
