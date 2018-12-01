package chw.test.dao;

import chw.test.model.example.UserExample;
import chw.test.model.po.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDAO {
    /**
     *
     * @mbg.generated
     */
    long countByExample(UserExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(UserExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated
     */
    int insert(User record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(User record);

    /**
     *
     * @mbg.generated
     */
    List<User> selectByExample(UserExample example);

    /**
     *
     * @mbg.generated
     */
    User selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(User record);
}