package chw.test.model.po;

import java.io.Serializable;

/**
 * This class corresponds to the database table user_role
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class UserRole implements Serializable {
    /**
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * @mbg.generated
     */
    private Integer userid;

    /**
     *
     * @mbg.generated
     */
    private Integer roleid;

    /**
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     *
     * @mbg.generated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     *
     * @mbg.generated
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}