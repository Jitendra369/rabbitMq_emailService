package com.emailservice.consumer;

import com.emailservice.dto.OrderEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class OrderEmailConsumer {

    @RabbitListener(queues = "order_email_queue" )
    public void orderEmailConsumer(OrderEvent orderEvent){
        log.info(" EmailService :  consume the event from order service  "+orderEvent.toString());
    }

}
