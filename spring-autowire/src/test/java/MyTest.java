import com.ga.entity.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GuAn
 * @version 1.0
 * @ClassName MyTest.java
 * @Description TODO
 * @createTime 2020年09月20日 15:04:00
 */
public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        People people = (People) context.getBean("people");
        people.getCat().say();

    }
}
