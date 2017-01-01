package info.thecodinglive.service;

import info.thecodinglive.model.User;
import info.thecodinglive.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jins on 2017-01-01.
 */
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Transactional
    public void service(User user){
        userRepository.addUserInfo(user);
    }
}
