package com.microservices.microservicescourse.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "msvc-student", url = "localhost:8090/api/student")
public interface studentClient {


}
