package vijay.projects.betavarient.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import vijay.projects.betavarient.Entities.UserSecurity;
import vijay.projects.betavarient.Entities.UserSecurityDetails;
import vijay.projects.betavarient.Repositories.UserSecurityRepository;

import java.util.ArrayList;

@Service
public class UserSecurityDetailsService implements UserDetailsService {

    @Autowired
    UserSecurityRepository userSecurityRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserSecurity userSecurity = userSecurityRepository.findByUsername(userName);
        if(userSecurity == null) {
            throw new UsernameNotFoundException("User not found : " + userName);
        }
        return new UserSecurityDetails(userSecurity);
    }

//    @Override
//    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//        return new User("foo","pass",new ArrayList<>());
//    }
}

