package com.payn.cloud.controller;


import com.payn.cloud.entities.CommonResult;
import com.payn.cloud.entities.Payment;
import com.payn.cloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CustomerFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("customer/feign/payment/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }
}
