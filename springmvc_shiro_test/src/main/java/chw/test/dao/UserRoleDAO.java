package chw.test.dao;

import chw.test.model.po.UserRole;
import chw.test.model.example.QUserRole;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleDAO {
    /**
     *
     * @mbg.generated
     */
    long countByExample(QUserRole example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(QUserRole example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated
     */
    int insert(UserRole record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(UserRole record);

    /**
     *
     * @mbg.generated
     */
    List<UserRole> selectByExample(QUserRole example);

    /**
     *
     * @mbg.generated
     */
    UserRole selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UserRole record, @Param("example") QUserRole example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") UserRole record, @Param("example") QUserRole example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserRole record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserRole record);
}