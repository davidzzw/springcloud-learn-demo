/*
 * FileName: ErrorFilter.java
 * Author:   zzw
 * Date:     2018年04月14日
 * Description: 错误过滤器
 */
package com.zzw.zuul.exception.filter;

import com.netflix.zuul.ZuulFilter;

/**
 * 〈错误过滤器〉<br>
 * 〈错误过滤器〉
 *
 * @author zzw
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class ErrorFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "error";
    }

    @Override
    public int filterOrder() {
        return 10;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        //统一异常处理  Dastson SR4 已修复
        return null;
    }
}
