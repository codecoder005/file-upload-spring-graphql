package com.orgofarmsgroup.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import graphql.kickstart.servlet.apollo.ApolloScalars;
import graphql.schema.GraphQLScalarType;
import jakarta.servlet.http.Part;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigBeans {
//    @Bean
//    public GraphQLScalarType uploadScalar() {
//        return ApolloScalars.Upload;
//    }
//    @Bean
//    public ObjectMapper objectMapper() {
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
//        SimpleModule module = new SimpleModule();
//        module.addDeserializer(Part.class, new PartDeserializer());
//        objectMapper.registerModule(module);
//        return objectMapper;
//    }
}
