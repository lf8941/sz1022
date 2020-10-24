import com.itwf.dao.CheckItemDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author LiuFeng
 * @Date 2020/10/23 10:14
 */
public class Test1 {
    @Test
    public void test() {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
        CheckItemDao bean = applicationContext.getBean(CheckItemDao.class);
        System.out.println(bean.findAll());

    }
}
