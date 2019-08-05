package com.wxainn;

import com.wxainn.compoment.UserService;
import com.wxainn.config.AppConfig;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextTest {

    @Test
    public void refresh() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        final AppConfig bean = context.getBean(AppConfig.class);
        final String str = context.getBean("str", String.class);
        final UserService userService = context.getBean(UserService.class);
        Assert.assertNotNull(bean);
        Assert.assertNotNull(str);
        Assert.assertNotNull(userService);
    }

}
