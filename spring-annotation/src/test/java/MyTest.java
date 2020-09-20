import com.ga.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName MyTest.java
 * @Description TODO
 * @createTime 2020年09月20日 15:38:00
 */
public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = (User) context.getBean("user");
        user.setName("aa");
        System.out.println(user);
    }
}
