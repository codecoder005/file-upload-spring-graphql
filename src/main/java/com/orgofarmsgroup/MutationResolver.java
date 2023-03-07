package com.orgofarmsgroup;

import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.schema.DataFetchingEnvironment;
import jakarta.servlet.http.Part;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
@RequiredArgsConstructor
public class MutationResolver implements GraphQLMutationResolver {
    private final ResourceLoader resourceLoader;
    public String updateAvatar(Part file) {
//        Part actualAvatar = environment.getArgument("file");
        // TODO: Implement
//        return "http://localhost:8080/avatar/foo." + actualAvatar.getContentType();
        return "success";
    }

    private File getLocation(String filename) throws IOException {
        File directory = resourceLoader.getResource("file:./filestorage/").getFile();
        return new File(directory, filename);
    }
}
