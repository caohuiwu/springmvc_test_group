package chw.test.model.po;

import java.io.Serializable;

/**
 * This class corresponds to the database table resource
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Resource implements Serializable {
    /**
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * @mbg.generated
     */
    private String resname;

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
    public String getResname() {
        return resname;
    }

    /**
     *
     * @mbg.generated
     */
    public void setResname(String resname) {
        this.resname = resname;
    }
}