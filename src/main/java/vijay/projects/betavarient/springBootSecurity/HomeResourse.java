package vijay.projects.betavarient.springBootSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;
import vijay.projects.betavarient.Entities.UserSecurityDetails;
import vijay.projects.betavarient.Security.AuthenticationRequest;
import vijay.projects.betavarient.Security.AuthenticationResponse;
import vijay.projects.betavarient.Services.UserSecurityDetailsService;
import vijay.projects.betavarient.Utils.JwtUtil;

@RestController
public class HomeResourse {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserSecurityDetailsService userSecurityDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/")
    public String home() {
        return ("<h1>Welcome</h1>");
    }

    @GetMapping("/user")
    public String homeUser() {
        return ("<h1>Welcome User</h1>");
    }

    @GetMapping("/admin")
    public String homeAdmin() {
        return ("<h1>Welcome Admin</h1>");
    }

    @GetMapping("/demo")
    public String Demo() {
        return "demo";
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
        } catch (BadCredentialsException e) {
            throw new Exception("Incorrect Username and Password", e);
        }
        final UserDetails userDetails = userSecurityDetailsService
                .loadUserByUsername(authenticationRequest.getUsername());
        final String jwt = jwtUtil.generateToken(userDetails);
        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
}
