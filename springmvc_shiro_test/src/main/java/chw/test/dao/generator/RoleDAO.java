package chw.test.dao.generator;

import chw.test.model.po.generator.Role;
import chw.test.model.qo.generator.QRole;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleDAO {
    /**
     *
     * @mbg.generated
     */
    long countByExample(QRole example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(QRole example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated
     */
    int insert(Role record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(Role record);

    /**
     *
     * @mbg.generated
     */
    List<Role> selectByExample(QRole example);

    /**
     *
     * @mbg.generated
     */
    Role selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Role record, @Param("example") QRole example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Role record, @Param("example") QRole example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Role record);
}