package com.bjs.practice.springboot.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

public class HelloAutoConfiguration {
    //application.properties配置文件映射前缀实体对象
    @Resource
    private HelloProperties helloProperties;

    /**
     * 根据条件判断不存在HelloService时初始化新bean到SpringIoc
     *
     * @return
     */
    //创建HelloService实体bean
    @Bean
    //缺失HelloService实体bean时，初始化HelloService并添加到SpringIoc
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService() {
        System.out.println(">>>The HelloService Not Found，Execute Create New Bean.");
        HelloService helloService = new HelloService();
        //设置消息内容
        helloService.setMsg(helloProperties.getMsg());
        //设置是否显示
        helloService.setShow(helloProperties.isShow());
        return helloService;
    }
}
