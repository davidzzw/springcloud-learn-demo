package com.zzw.client;

import com.zzw.vo.Store;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author zzw
 * @see
 * @since 2018/3/24
 */
@FeignClient("stores")
public interface StoreClient {

    @RequestMapping(method = RequestMethod.GET,value = "/stores")
    List<Store> getStores();

    @RequestMapping(method = RequestMethod.POST,value = "/stores/{stroeId}",consumes = "application/json")
    Store update(@PathVariable("storeId")Long storeId,Store store);
}
