package com.admin.springbootadmintemplate.config;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;


@Component
public class CORSFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest hrequest = (HttpServletRequest) servletRequest;
        HttpServletResponse hresponse = (HttpServletResponse) servletResponse;
        //跨域
        hresponse.setHeader("Access-Control-Allow-Origin", hrequest.getHeader("Origin"));
        hresponse.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT");
        hresponse.setHeader("Access-Control-Max-Age", "0");
        hresponse.setHeader("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,token");
        hresponse.setHeader("Access-Control-Allow-Credentials", "true");
        hresponse.setHeader("XDomainRequestAllowed", "1");
        filterChain.doFilter(servletRequest, servletResponse);


    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
