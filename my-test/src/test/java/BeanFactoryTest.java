import bean.MyTestBean;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

public class BeanFactoryTest {

    @Test
    public void testSimpleLoad() {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
        MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
        Assert.assertEquals("testStr", bean.getTestStr());
    }

    @Test
    public void test1() throws IOException {
        String s = "abc";
        final InputStream d = s.getClass().getResourceAsStream("String");
        final int read = d.read();
        System.out.println(read);
    }
}
