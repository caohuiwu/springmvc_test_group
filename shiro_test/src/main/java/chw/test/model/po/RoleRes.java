package chw.test.model.po;

import java.io.Serializable;

/**
 * This class corresponds to the database table role_res
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class RoleRes implements Serializable {
    /**
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * @mbg.generated
     */
    private Integer roleid;

    /**
     *
     * @mbg.generated
     */
    private Integer resid;

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

    /**
     *
     * @mbg.generated
     */
    public Integer getResid() {
        return resid;
    }

    /**
     *
     * @mbg.generated
     */
    public void setResid(Integer resid) {
        this.resid = resid;
    }
}