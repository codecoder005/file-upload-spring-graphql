package com.orgofarmsgroup.config;

import graphql.schema.Coercing;
import graphql.schema.GraphQLScalarType;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@EnableWebMvc
//@Configuration
public class PersonAvatarConfig{// implements WebMvcConfigurer {
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry
//                .addResourceHandler("/avatar/**")
//                .addResourceLocations("file:./filestorage/");
//    }

//    public static class UploadScalar {
//
//        public static final GraphQLScalarType UPLOAD = GraphQLScalarType.newScalar()
//                .name("Upload")
//                .description("A custom scalar that handles file uploads")
//                .coercing(new Coercing() {
//                    @Override
//                    public Object serialize(Object dataFetcherResult) {
////                        return serializeEmail(dataFetcherResult);
//                        return dataFetcherResult;
//                    }
//
//                    @Override
//                    public Object parseValue(Object input) {
////                        return parseEmailFromVariable(input);
//                        return input;
//                    }
//
//                    @Override
//                    public Object parseLiteral(Object input) {
////                        return parseEmailFromAstLiteral(input);
//                        return input;
//                    }
//                })
//                .build();
//    }
}
