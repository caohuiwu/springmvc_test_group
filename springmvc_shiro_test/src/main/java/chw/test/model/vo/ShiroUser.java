package chw.test.model.vo;

import java.util.List;
import java.util.Set;

/**
 * <p>
 * <b>创建日期：</b> 2018-11-30 11:19
 * </p>
 *
 * @author 58dj.chw
 **/
public class ShiroUser {

    private Set<String> roles;

    private List<String> urlSet;

    public List<String> getUrlSet() {
        return urlSet;
    }

    public void setUrlSet(List<String> urlSet) {
        this.urlSet = urlSet;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }
}
