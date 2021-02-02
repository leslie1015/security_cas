package pers.leslie.security.cas.securitycas.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

/**
 * @author: YongWang
 * @date: 2021/2/2 09:05
 * @description:
 */
@Data
public class AuthorityInfo implements GrantedAuthority {

    /**
     * 权限CODE
     */
    private String authority;

    public AuthorityInfo(String authority)
    {
        this.authority = authority;
    }
}
