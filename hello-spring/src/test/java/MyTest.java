import com.ga.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName MyTest.java
 * @Description TODO
 * @createTime 2020年09月20日 13:51:00
 */
public class MyTest {

    @Test
    public void test1(){
        // 获取配置 配置文件加载时bean已经被初始化
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 拿到对象 对象是由spring创建的 同时设置了属性
        User user = (User) applicationContext.getBean("user");
        User user1 = (User) applicationContext.getBean("user");
        System.out.println(user == user1);

    }
}
