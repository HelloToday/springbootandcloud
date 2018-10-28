### 86 -Spring的热部署
https://blog.csdn.net/u014792352/article/details/65631577
对应文档的第86章

####  1. 重新加载静态资源

##### 1.1.spring-boot-devtools 可以实现

##### 1.2  在IDE里面开启debug重新加载静态资源甚至是java的类也可以热加载

##### 1.3 在maven或者gradle的插件里面有个addResources  可以支持从命令行里面加载静态资源

#### 2. 不重启应用重新加载模板

spring.thymeleaf.cache =false

spring.freemarker.cache =false

#### 3.应用的快速重启

spring-boot-devtools  虽然离着jrabel还有一段距离，但是比冷启动要快很多

这里引用了第二十章的内容所以要看一下**第二十章**

#### 4 热加载classees

大多数的现代的IDE都支持字节码的热交换，因此，如果代码的签名没有改变的话可以无缝的感知到修改变化