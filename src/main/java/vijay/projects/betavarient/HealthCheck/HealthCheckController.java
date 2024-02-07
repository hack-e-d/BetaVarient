package vijay.projects.betavarient.HealthCheck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HealthCheckController {

    @Autowired
    private Environment environment;

    @GetMapping("/health-check")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public HealthCheckResponse healthCheck() {
        HealthCheckResponse healthCheckResponse = new HealthCheckResponse();
        healthCheckResponse.setStatus("OK");
        healthCheckResponse.setActiveProfile(environment.getActiveProfiles());
        return healthCheckResponse;
    }
}
