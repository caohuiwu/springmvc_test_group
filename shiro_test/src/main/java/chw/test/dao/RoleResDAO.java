package chw.test.dao;

import chw.test.model.example.QRoleRes;
import chw.test.model.po.RoleRes;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleResDAO {
    /**
     *
     * @mbg.generated
     */
    long countByExample(QRoleRes example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(QRoleRes example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated
     */
    int insert(RoleRes record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(RoleRes record);

    /**
     *
     * @mbg.generated
     */
    List<RoleRes> selectByExample(QRoleRes example);

    /**
     *
     * @mbg.generated
     */
    RoleRes selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") RoleRes record, @Param("example") QRoleRes example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") RoleRes record, @Param("example") QRoleRes example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(RoleRes record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(RoleRes record);
}