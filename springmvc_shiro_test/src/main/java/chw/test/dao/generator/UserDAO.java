package chw.test.dao.generator;

import chw.test.model.po.generator.User;
import chw.test.model.qo.generator.QUser;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDAO {
    /**
     *
     * @mbg.generated
     */
    long countByExample(QUser example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(QUser example);

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
    List<User> selectByExample(QUser example);

    /**
     *
     * @mbg.generated
     */
    User selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") QUser example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") User record, @Param("example") QUser example);

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