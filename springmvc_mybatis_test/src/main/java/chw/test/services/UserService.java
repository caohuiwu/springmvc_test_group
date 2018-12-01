package chw.test.services;

import org.springframework.stereotype.Service;
import chw.test.dao.UserDAO;
import chw.test.model.example.UserExample;

import javax.annotation.Resource;

/**
 * <p>
 * <b>创建日期：</b> 2018-11-30 17:15
 * </p>
 *
 * @author 58dj.chw
 **/
@Service
public class UserService {

    @Resource
    private UserDAO userDAO;

    public boolean login(String userName, String password){
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(userName).andPasswordEqualTo(password);
        long count = userDAO.countByExample(userExample);
        if (count > 0){
            return true;
        }
        return false;
    }
}
