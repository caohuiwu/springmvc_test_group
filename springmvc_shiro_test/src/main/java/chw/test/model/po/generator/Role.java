package chw.test.model.po.generator;

import java.io.Serializable;

/**
 * This class corresponds to the database table role
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Role implements Serializable {
    /**
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * @mbg.generated
     */
    private String rolename;

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
    public String getRolename() {
        return rolename;
    }

    /**
     *
     * @mbg.generated
     */
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}