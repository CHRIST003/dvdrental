package ac.za.cput.project.security;
import org.hibernate.jdbc.Expectation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws  Exception {
      auth.inMemoryAuthentication()
              .withUser("member")
              .password(encodePassword().encode("amour"))
              .roles("USER")
              .and()
              .withUser("Admin")
              .password(encodePassword().encode("admin"))
              .roles("USER","ADMIN");
  }

  @Override
    protected void configure(HttpSecurity http) throws Exception{
      http.httpBasic().and()
              .authorizeRequests()
              .antMatchers("/starter/**/create/**")
              .hasRole("ADMIN")
              .anyRequest().authenticated();
  }

  @Bean
    public PasswordEncoder encodePassword(){
      return new BCryptPasswordEncoder();
  }


}
