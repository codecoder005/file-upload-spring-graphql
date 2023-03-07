package com.orgofarmsgroup;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;

@Service
public class GQueryResolver implements GraphQLQueryResolver {
    public Boolean noOp() {
        return true;
    }

}
