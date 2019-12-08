package com.example.eureka.client;

import org.springframework.cloud.openfeign.*;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "eureka-application-server")
public interface TryFeignClient {
	@GetMapping("/getMsg")
	public String getMsg();

}
