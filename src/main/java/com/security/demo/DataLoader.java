package com.security.demo;

import com.security.demo.domain.Authorities;
import com.security.demo.domain.User;
import com.security.demo.repository.AuthoritiesRepository;
import com.security.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AuthoritiesRepository authoritiesRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user = new User();
        user.setId(1L);
        user.setUsername("test@naver.com");
        user.setPassword("$2a$10$OTBU3YAtNHqfCz048xnIFeFjG.V1olFSWY82VYoSL9BTRbyPXLoSq");
        userRepository.save(user);

        Authorities authorities = new Authorities();
        authorities.setUser(user);
        authorities.setId(2L);
        authorities.setAuthority("ROLE_USER");
        authoritiesRepository.save(authorities);
    }
}
