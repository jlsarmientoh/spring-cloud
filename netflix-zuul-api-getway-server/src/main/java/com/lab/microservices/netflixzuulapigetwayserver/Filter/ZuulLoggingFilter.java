package com.lab.microservices.netflixzuulapigetwayserver.Filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class ZuulLoggingFilter extends ZuulFilter{

    Logger logger = LoggerFactory.getLogger(ZuulLoggingFilter.class);


    public static final String PRE = "pre";

    @Override
    public String filterType() {
        return PRE;
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        logger.info("request method -> {}, url -> {}",
                request.getMethod(),
                request.getRequestURI());
        return null;
    }
}
