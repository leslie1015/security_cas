package pers.leslie.security.cas.securitycas.service;

import org.springframework.security.cas.authentication.CasAssertionAuthenticationToken;
import org.springframework.security.core.userdetails.AuthenticationUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import pers.leslie.security.cas.securitycas.entity.AuthUser;
import pers.leslie.security.cas.securitycas.entity.AuthorityInfo;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: YongWang
 * @date: 2021/2/2 09:06
 * @description:
 */
public class CasUserDetailService implements AuthenticationUserDetailsService<CasAssertionAuthenticationToken> {

    @Override
    public UserDetails loadUserDetails(CasAssertionAuthenticationToken token) throws UsernameNotFoundException {

        String username = token.getName();
        // 此处具体的实现可以根据用户名查表，再授权
        AuthUser userInfo = new AuthUser();
        userInfo.setUsername("admin");
        userInfo.setName("admin");
        Set<AuthorityInfo> authorities = new HashSet<AuthorityInfo>();
        AuthorityInfo authorityInfo = new AuthorityInfo("ROLE_ADMIN");
        authorities.add(authorityInfo);
        userInfo.setAuthorities(authorities);
        return userInfo;
    }
}
