package com.fy.opnfeign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by 51589 on 2019/7/16.
 */
@FeignClient("spote-server")
public interface SpotsServiceFeign {
}
