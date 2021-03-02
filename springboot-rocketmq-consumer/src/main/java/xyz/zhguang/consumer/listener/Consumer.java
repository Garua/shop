package xyz.zhguang.consumer.listener;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RocketMQMessageListener(topic = "springbootOne",consumerGroup = "${rocketmq.consumer.group}")
public class Consumer  implements RocketMQListener<String> { //监听消息及类型
    @Override
    public void onMessage(String s) {
        log.info("接收到的消息：" + s);
    }
}
