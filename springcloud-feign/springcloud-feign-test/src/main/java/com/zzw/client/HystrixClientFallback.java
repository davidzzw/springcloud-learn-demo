package com.zzw.client;

import com.zzw.vo.Hello;

/**
 * @author zzw
 * @see
 * @since 2018/3/24
 */
public class HystrixClientFallback implements HystrixClient {
    @Override
    public Hello iFailSometimes() {
        return new Hello("fallback");
    }
}
