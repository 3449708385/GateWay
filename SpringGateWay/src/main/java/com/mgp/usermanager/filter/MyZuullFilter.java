package com.mgp.usermanager.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

@Component("myZuullFilter")
public class MyZuullFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";//这里是设置过滤器类型
    }

    @Override
    public int filterOrder() {
        return 0;  //设置执行顺序
    }

    @Override
    public boolean shouldFilter() {
        return true;  //该过滤器需要执行
    }

    @Override
    public Object run() {
        RequestContext requestContext= RequestContext.getCurrentContext();
        System.out.println("filter");
        System.out.println(requestContext.getRequest().getMethod());
        return null;
    }
}
