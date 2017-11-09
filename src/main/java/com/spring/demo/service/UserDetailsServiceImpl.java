package com.spring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        com.spring.demo.entity.User user = userService.getUser("colibri");
        Set<GrantedAuthority> roles = new HashSet();
        roles.add(new SimpleGrantedAuthority("user"));

        UserDetails userDetails =
                new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), roles);

        return userDetails;
    }

}
