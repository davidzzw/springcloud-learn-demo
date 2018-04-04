package com.zzw.factory;

import com.zzw.client.HystrixClient;
import com.zzw.vo.Hello;
import feign.hystrix.FallbackFactory;

/**
 * @author zzw
 * @see
 * @since 2018/3/24
 */
public class HystrixClientFallbackFactory implements FallbackFactory<HystrixClient> {

    @Override
    public HystrixClient create(Throwable throwable) {

        return null;
    }
}
