package top.zerg.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("ribbon")
public interface FeignService {

    @GetMapping("/ribbon/getPort")
    String getPort();

}
