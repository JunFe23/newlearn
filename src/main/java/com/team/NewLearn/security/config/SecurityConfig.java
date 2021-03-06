package com.team.NewLearn.security.config;

import com.team.NewLearn.security.handler.AuthFailureHandler;
import com.team.NewLearn.security.handler.AuthSuccessHandler;
import com.team.NewLearn.service.login.SecurityServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.sql.DataSource;

@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    private final DataSource dataSource;
    private final AuthSuccessHandler authSuccessHandler;
    private final AuthFailureHandler authFailureHandler;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    private SecurityServiceImpl securityService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();

        http.authorizeRequests()
                .antMatchers("/user/**").access("hasRole('ROLE_USER')")
                .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")

                .antMatchers("/mypage/**").access("hasRole('ROLE_USER')or hasRole('ROLE_ADMIN')")

                .antMatchers("/main",
                        "/login",
                        "/sign-Up",
                        "/pwFind",
                        "/login/**",
                        "/reply/**",
                        "/community/**",
                        "/main",
                        "/pwFind",
                        "/css/**","/js/**","/img/**","/plugin/**","/vendor/**",
                        "/logout"

                ).permitAll()

                //?????? /** ??? ????????? ????????? ????????? ??????
                .antMatchers("/**").authenticated();



        http.formLogin()
                // ????????? ??? ????????? ?????????
                .loginPage("/login")
                // ????????? ?????? ?????? ??? ????????? ???????????? ??????
                .loginProcessingUrl("/login-process")
                .usernameParameter("email")    //input name ??????????????? "email"??? ?????????.
                .passwordParameter("password") //input name ??????????????? "password"??? ?????????.
                .failureHandler(authFailureHandler) //????????? ????????? ???????????? ?????????
                .successHandler(authSuccessHandler);// ????????? ????????? ???????????? ?????????



        http.logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/login")  // ??? ????????? ??????????????? ??????
                .invalidateHttpSession(true);   // ?????? ?????????

    }


}
