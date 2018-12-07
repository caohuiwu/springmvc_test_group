package chw.test.model.po;

import java.io.Serializable;

/**
 * This class corresponds to the database table user
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class User implements Serializable {
    /**
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * @mbg.generated
     */
    private String password;

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
    public String getUsername() {
        return username;
    }

    /**
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password;
    }
}