package vijay.projects.betavarient.FileUpload;

import graphql.schema.DataFetchingEnvironment;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@Component
public class UploadFileMutation {

    @MutationMapping
    public UUID uploadFIle(@Argument DataFetchingEnvironment environment) {

        MultipartFile file = environment.getArgument("file");

        return UUID.randomUUID();
    }
}
