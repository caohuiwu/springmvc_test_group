package chw.test.service;

import chw.test.model.po.generator.User;
import chw.test.model.vo.SysUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * <b>创建日期：</b> 2018-11-30 10:43
 * </p>
 *
 * @author 58dj.chw
 **/
@Service
public class UserService {

    public List<SysUser> findByNames(User user) {
        return null;
    }

    public List<String> selectRoleNameListByUserId(long id) {

        return null;
    }
}
