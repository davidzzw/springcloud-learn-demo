/*
 * FileName: MyFilterProcessor.java
 * Author:   zzw
 * Date:     2018年04月14日
 * Description: 自定义过滤器处理器
 */
package com.zzw.zuul.exception.processor;

import com.netflix.zuul.FilterProcessor;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

/**
 * 〈自定义过滤器处理器〉<br>
 * 〈自定义过滤器处理器〉
 *
 * @author zzw
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class MyFilterProcessor extends FilterProcessor {

    @Override
    public Object processZuulFilter(ZuulFilter filter) throws ZuulException {
        try {
            return super.processZuulFilter(filter);
        }
        catch (ZuulException e){
            RequestContext ctx = RequestContext.getCurrentContext();
            ctx.set("failed.filter",filter);
            throw e;
        }
    }
}
