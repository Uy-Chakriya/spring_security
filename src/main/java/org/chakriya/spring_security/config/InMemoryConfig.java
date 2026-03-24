package org.chakriya.spring_security.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@RequiredArgsConstructor
public class InMemoryConfig {
    private final PasswordEncoder passwordEncoder;
    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager()
    {

//        spring security it don't allow the raw password so in this case we need to
        UserDetails admin = User.withUsername("admin").password(passwordEncoder.encode("123")).roles("ADMIN").build();
        UserDetails user = User.withUsername("user").password(passwordEncoder.encode("321")).roles("USER").build();
        return new InMemoryUserDetailsManager(admin,user);
    }

}
