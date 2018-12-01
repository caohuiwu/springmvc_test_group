这是一个springMVC + mybatis的基础例子


一、引入springMVC
配置web.xml



遇到的问题
===
1. mybtatis-config.xml配置 \<setting name="logImpl" value="SLF4J"/>

```
Caused by: org.apache.ibatis.logging.LogException: Error setting Log implementation.  Cause: java.lang.reflect.InvocationTargetException
    at org.apache.ibatis.logging.LogFactory.setImplementation(LogFactory.java:139)
    at org.apache.ibatis.logging.LogFactory.useCustomLogging(LogFactory.java:89)
    at org.apache.ibatis.session.Configuration.setLogImpl(Configuration.java:222)
    at org.apache.ibatis.builder.xml.XMLConfigBuilder.settingsElement(XMLConfigBuilder.java:263)
    at org.apache.ibatis.builder.xml.XMLConfigBuilder.parseConfiguration(XMLConfigBuilder.java:113)
    ... 69 more
Caused by: java.lang.reflect.InvocationTargetException
    at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
    at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
    at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
    at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
    at org.apache.ibatis.logging.LogFactory.setImplementation(LogFactory.java:133)
    ... 73 more
Caused by: java.lang.NoClassDefFoundError: org/slf4j/LoggerFactory
    at org.apache.ibatis.logging.slf4j.Slf4jImpl.<init>(Slf4jImpl.java:33)
```
2.org.apache.ibatis.binding.BindingException: Invalid bound statement (not found): chw.UserDAO.countByExample

```
org.apache.ibatis.binding.BindingException: Invalid bound statement (not found): chw.UserDAO.countByExample
	at org.apache.ibatis.binding.MapperMethod$SqlCommand.<init>(MapperMethod.java:230)
	at org.apache.ibatis.binding.MapperMethod.<init>(MapperMethod.java:48)
	at org.apache.ibatis.binding.MapperProxy.cachedMapperMethod(MapperProxy.java:65)
	at org.apache.ibatis.binding.MapperProxy.invoke(MapperProxy.java:58)
	at com.sun.proxy.$Proxy15.countByExample(Unknown Source)
	at chw.UserService.login(UserService.java:25)
	at chw.LoginController.login(LoginController.java:25)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.springframework.web.bind.annotation.support.HandlerMethodInvoker.invokeHandlerMethod(HandlerMethodInvoker.java:181)
	at org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter.invokeHandlerMethod(AnnotationMethodHandlerAdapter.java:440)
	at org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter.handle(AnnotationMethodHandlerAdapter.java:428)
	at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:963)
	at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:897)
	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:970)
	at org.springframework.web.servlet.FrameworkServlet.doPost(FrameworkServlet.java:872)
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:661)
	at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:846)
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:742)
```
修改：将sqlmap-*.xml文件，由java.chw.test.mapper全部移动到java.resources.mapper目录下
3. 中文传到后台乱码
    
    在web.xml中添加过滤器