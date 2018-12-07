package chw.test.dao;

import chw.test.model.example.QResource;
import chw.test.model.po.Resource;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResourceDAO {
    /**
     *
     * @mbg.generated
     */
    long countByExample(QResource example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(QResource example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated
     */
    int insert(Resource record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(Resource record);

    /**
     *
     * @mbg.generated
     */
    List<Resource> selectByExample(QResource example);

    /**
     *
     * @mbg.generated
     */
    Resource selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Resource record, @Param("example") QResource example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Resource record, @Param("example") QResource example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Resource record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Resource record);
}