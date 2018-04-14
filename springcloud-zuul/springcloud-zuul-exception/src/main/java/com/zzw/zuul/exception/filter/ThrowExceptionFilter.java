/*
 * FileName: ThrowExceptionFilter.java
 * Author:   zzw
 * Date:     2018年04月14日
 * Description: 异常处理过滤器
 */
package com.zzw.zuul.exception.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 〈异常处理过滤器〉<br>
 * 〈异常处理过滤器〉
 *
 * @author zzw
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */

@Component
public class ThrowExceptionFilter extends ZuulFilter {

    private static Logger logger = LoggerFactory.getLogger(ThrowExceptionFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        logger.info("this is a pre filter,it will throw a runtimeException");
        doSomething();
        return null;
    }

    private void doSomething() {
        throw new RuntimeException("exist some errors");
    }
}
