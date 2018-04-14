/*
 * FileName: BusinessErrorAttributes.java
 * Author:   zzw
 * Date:     2018年04月14日
 * Description: 错误信息
 */
package com.zzw.zuul.exception.error;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * 〈错误信息〉<br>
 * 〈错误信息〉
 *
 * @author zzw
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class BusinessErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String, Object> result = super.getErrorAttributes(webRequest, includeStackTrace);
        result.remove("exception");
        return super.getErrorAttributes(webRequest, includeStackTrace);
    }
}
