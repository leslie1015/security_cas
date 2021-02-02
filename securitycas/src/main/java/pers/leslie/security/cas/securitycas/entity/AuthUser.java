package pers.leslie.security.cas.securitycas.entity;

import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: YongWang
 * @date: 2021/2/2 09:04
 * @description:
 */
@Data
public class AuthUser implements UserDetails {

    /**
     * 用户ID
     */
    private Long id;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 登录名称
     */
    private String username;

    /**
     * 登录密码
     */
    private String password;

    private boolean isAccountNonExpired = true;

    private boolean isAccountNonLocked = true;

    private boolean isCredentialsNonExpired = true;

    private boolean isEnabled = true;

    private Set<AuthorityInfo> authorities = new HashSet<AuthorityInfo>();
}
