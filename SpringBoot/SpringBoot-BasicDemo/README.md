# Spring Boot基本教程
## Spring Boot简介
+ 官方
~~~
Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".
We take an opinionated view of the Spring platform and third-party libraries so you can get started with minimum fuss. Most Spring Boot applications need minimal Spring configuration.
~~~
+ 百度在线翻译
~~~
SpringBoot可以轻松创建独立的、生产级的、基于Spring的应用程序，您可以“直接运行”。
我们对Spring平台和第三方库持有一种固执己见的观点，这样您就可以用最少的麻烦开始了。大多数Spring引导应用程序需要最少的Spring配置。
~~~
+ 总结
~~~
+ Spring Boot是一个基于Java的开源框架，用于创建微服务。它由Pivotal Team开发，用于构建独立的生产就绪Spring应用。
+ Spring Boot可以轻松创建独立的、生产级的、基于Spring的应用程序。
+ 开发Spring Boot的主要动机是简化配置和部署spring应用程序的过程。
+ Spring Boot的核心就是Spring。 
~~~
## Spring Boot优点
~~~
+ 减少了大量的开发时间并提高了生产力。
+ 避免了编写大量的样板代码，注释和XML配置。
+ Spring Boot应用程序与其Spring生态系统(如Spring JDBC，Spring ORM，Spring Data，Spring Security等)集成非常容易。
+ 遵循“自用默认配置”方法，以减少开发工作量。
+ 提供嵌入式HTTP服务器，如Tomcat，Jetty等，以开发和测试Web应用程序非常容易。
+ 提供CLI(命令行界面)工具从命令提示符，非常容易和快速地开发和测试Spring Boot(Java或Groovy)应用程序。
+ 提供了许多插件来开发和测试Spring启动应用程序非常容易使用构建工具，如Maven和Gradle。
+ 提供了许多插件，以便与嵌入式和内存数据库工作非常容易。
~~~
## Spring Boot工程创建
+ 创建Maven工程
+ pom文件引入Spring Boot 父（parent）依赖
~~~
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>${spring-boot.version}</version>
 </parent>
~~~
+ 常用starter, 命名规则：spring-boot-starter-*
~~~
spring-boot-starter
spring-boot-starter-web
spring-boot-starter-test
spring-boot-starter-thymeleaf
~~~

## Spring Boot目录结构
![img.png](https://github.com/dxkIdea/Spring-All/blob/master/SpringBoot/SpringBoot-BasicDemo/directory%20structure.png)