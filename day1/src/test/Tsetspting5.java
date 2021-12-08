package test;

import com.yutao.shi.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shiyutao
 * @create 2021-11-01 22:18
 */
public class Tsetspting5 {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean01.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.getId());
        System.out.println(user.getName());
        User user1 = context.getBean("user1", User.class);
        System.out.println(user1.getName());
    }

}
