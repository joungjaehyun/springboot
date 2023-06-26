package org.zerock.b52.dto;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

//User 를 상속받으면 UserDetails를 들어갈수있다.
public class MemberDTO extends User{

    private String mname;

    public MemberDTO(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
        //TODO Auto-generated constructor stub
    }
    
}
