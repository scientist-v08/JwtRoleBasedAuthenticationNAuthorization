package scientist.v08.jwtspringsecurity.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import scientist.v08.jwtspringsecurity.repository.OurUsersRepository;

@Service
@AllArgsConstructor
public class CustomuserDetailsService implements UserDetailsService {

    private final OurUsersRepository ourUserRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return ourUserRepo.findByEmail(username).orElseThrow();
    }
    
}
