package info.thecodinglive.config;

import info.thecodinglive.model.User;
import info.thecodinglive.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * Created by jins on 2017-01-01.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DBConfig.class, loader=AnnotationConfigContextLoader.class)
public class DBConfigTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test(){
        System.out.println("dd");
    }
    @Test
    public void getTime(){
        userRepository.getTimeNow();
    }

    @Test
    public void addUser(){
        User user1 = new User();
        user1.setUid("test1");
        user1.setEmail("test@test.com");
        user1.setUname("honggildong");
        userRepository.addUserInfo(user1);
    }
}
