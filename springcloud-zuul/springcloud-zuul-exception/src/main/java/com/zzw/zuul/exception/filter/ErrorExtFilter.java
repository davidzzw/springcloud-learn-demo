/*
 * FileName: ErrorExtFilter.java
 * Author:   zzw
 * Date:     2018年04月14日
 * Description: 错误异常过滤器
 */
package com.zzw.zuul.exception.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.cloud.netflix.zuul.filters.post.SendErrorFilter;

/**
 * 〈错误异常过滤器〉<br>
 * 〈错误异常过滤器〉
 *
 * @author zzw
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class ErrorExtFilter extends SendErrorFilter {

    @Override
    public String filterType() {
        return "error";
    }

    @Override
    public int filterOrder() {
        return 30;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        ZuulFilter failedFilter = (ZuulFilter) ctx.get("failed.filter");
        if(failedFilter != null && failedFilter.filterType().equals("post")){
            return true;
        }
        return false;
    }
}
