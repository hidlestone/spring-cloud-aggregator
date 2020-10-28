package com.payn.cloud.service;

import com.payn.cloud.domain.Order;

public interface OrderService {


    void create(Order order);

    void update(Long userId, Integer status);
}
