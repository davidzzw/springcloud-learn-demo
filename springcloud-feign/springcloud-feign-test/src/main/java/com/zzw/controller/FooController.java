package com.zzw.controller;

import com.zzw.client.StoreClient;
import feign.Client;
import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;

/**
 * @author zzw
 * @see
 * @since 2018/3/24
 */
@Import(FeignClientsConfiguration.class)
class FooController {

    private StoreClient fooClient;

    private StoreClient adminClient;

    @Autowired
    public FooController(
            Decoder decoder, Encoder encoder, Client client) {
        this.fooClient = Feign.builder().client(client)
                .encoder(encoder)
                .decoder(decoder)
                .requestInterceptor(new BasicAuthRequestInterceptor("user", "user"))
                .target(StoreClient.class, "http://PROD-SVC");
        this.adminClient = Feign.builder().client(client)
                .encoder(encoder)
                .decoder(decoder)
                .requestInterceptor(new BasicAuthRequestInterceptor("admin", "admin"))
                .target(StoreClient.class, "http://PROD-SVC");
    }
}