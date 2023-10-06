package com.gateway.filter;

import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomFilter extends AbstractGatewayFilterFactory<CustomFilter.Config>{
    public CostomFilter() {
        super(Config.class);
    }
}
