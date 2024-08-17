package com.emailservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {

    private String orderId;
    private String orderName;
    private double orderPrice;
    private String orderType;
}
