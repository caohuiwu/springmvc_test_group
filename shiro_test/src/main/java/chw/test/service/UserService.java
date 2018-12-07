package chw.test.service;

import chw.test.dao.UserDAO;
import chw.test.model.po.User;
import chw.test.model.vo.SysUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * <b>创建日期：</b> 2018-12-07 10:42
 * </p>
 *
 * @author 58dj.chw
 **/
@Service
public class UserService {

    @Resource
    private UserDAO userDAO;

    public List<SysUser> findByNames(User user) {
        return null;
    }

    public List<String> selectRoleNameListByUserId(long id) {

        return null;
    }

    public String getRoleByUserName(String userName){

        return null;
    }

    public String login(String userName){
        return null;
    }
}
