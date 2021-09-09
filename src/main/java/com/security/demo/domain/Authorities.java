package com.security.demo.domain;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Authorities implements GrantedAuthority {
    private static final long serialVersionUID = -8123526131047887755L;
    @Id @GeneratedValue
    private Long id;
    private String authority;
    private CustomSecurityUser user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @ManyToOne
    public CustomSecurityUser getUser() {
        return user;
    }

    public void setUser(CustomSecurityUser user) {
        this.user = user;
    }
}
