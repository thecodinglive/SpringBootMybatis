package info.thecodinglive.repository;

import info.thecodinglive.model.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by jins on 2016-12-31.
 */
@Repository
public class UserRepository {
    private static final String MAPPER_NAME_SPACE="sample.mapper.UserMapper.";

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public String getTimeNow(){
        return sqlSessionTemplate.selectOne( MAPPER_NAME_SPACE  + "getCurrentDateTime");
    }

    public void addUserInfo(User user){
        sqlSessionTemplate.insert( MAPPER_NAME_SPACE + "addUserInfo", user);
    }
}
