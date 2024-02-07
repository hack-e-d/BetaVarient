package vijay.projects.betavarient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import vijay.projects.betavarient.FileUpload.FileStorageService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.annotation.Resource;

@SpringBootApplication
public class BetavarientApplication implements CommandLineRunner{

    @Resource
    FileStorageService storageService;

    public static void main(String[] args) {
        SpringApplication.run(BetavarientApplication.class, args);
    }
    public void run(String... arg) throws Exception {
//    storageService.deleteAll();
        storageService.init();
    }
}

