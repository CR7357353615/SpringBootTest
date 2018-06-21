package com.lho.demo.bean;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;

/**
 * Created by lihao on 2018/6/21.
 */
@Component
public class CustomContainer implements EmbeddedServletContainerCustomizer {

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {

        container.setPort(8000);

    }

}