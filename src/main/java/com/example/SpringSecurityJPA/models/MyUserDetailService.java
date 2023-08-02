package com.example.SpringSecurityJPA.models;
import com.example.SpringSecurityJPA.MyUserDetail;
import com.example.SpringSecurityJPA.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailService implements UserDetailsService {

    UserRepository  userRepository;

    public MyUserDetailService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> user =  userRepository.findByUserName(userName);
        user.orElseThrow(() ->new UsernameNotFoundException("Not Found " + userName));
        return user.map(MyUserDetail::new).get();
        }
}
