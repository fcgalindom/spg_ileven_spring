package spg_ileven_spring.com.example.spg_ileven_spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class WebSegurity {
    @Bean
    public UserDetailsService userDetailsService(){
        var user = User.withUsername("Unclavedave").password("1234DS").roles("read").build();

        return  new InMemoryUserDetailsManager(user);
    }
    @Bean
    public PasswordEncoder passwordEncoder (){
        return NoOpPasswordEncoder.getInstance();
    }
}
