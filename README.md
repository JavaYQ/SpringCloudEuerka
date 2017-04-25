# SpringCloudEuerka

基于SpringCloud实现了服务的自动注册及发现。

使用euerka作为注册中心，由euerkaServer在localhost:8761进行监听发现服务，默认心跳频率30s。

euerkaClient启动后，自动注册到8761端口，提供加法服务。测试链接：http://localhost:8022/service/api/3,5

euerkaMinus启动后，自动注册到8761，提供减法服务。测试链接：http://localhost:8023/service/api/3,5

全部使用logback进行日志管理，默认存放在程序根目录。

注册中心使用SpringSecurity提供基本的登录控制，用户名：user，密码：123456。
