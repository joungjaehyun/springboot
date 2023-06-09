package org.zerock.b5.security;

import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.zerock.b5.dto.MemberDTO;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        log.info("loadUserByUsername : " + username);

        MemberDTO memberDTO = new MemberDTO(
                username,
                "$2a$10$yYnBEUb5uGR2QDiMF2.RieO7NCqRexe1Drvq6yt8k6LlNGmWT/P1S",
                List.of(new SimpleGrantedAuthority("ROLE_USER")));
        
        UserDetails user = User.builder()
                .username(username)
                .password("$2a$10$yYnBEUb5uGR2QDiMF2.RieO7NCqRexe1Drvq6yt8k6LlNGmWT/P1S")
                .authorities("ROLE_USER", "ROLE_G1")
                .build();

        return memberDTO;
    }

}
