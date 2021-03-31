# spring.profiles
spring.profiles.include ==> [导入某配置模块]  
spring.profiles.active ==> [使用某配置文件作为启动配置]

使用：  
application.yml使用spring.profiles.include导入其他配置（分类好的如 db，redis，alibaba等）[很适合导入一些个人隐私配置]  
注意：  
include导入的配置会 覆盖application.yml存在的配置   


## 廖雪峰教程：
> 通过Profile可以实现一套代码在不同环境启用不同的配置和功能。   

@Profile("default")
根据生产环境配置不同的类


## java8
使用java8流的对象创建工具 Builder