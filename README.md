# (一)文本更新
- java-parents工程 20210107更新
- java-samples工程 20201230更新

### 名字的由来

    取名为Java-samples ,就是Java过程中的demo。   
工程目标：

    为了方便管理工程代码,完整的Java课程.
    每一天的学习根据已经掌握和没有掌握的,
    如何测试呢,能手动写出来的,证明已经掌握了,反之没有.
    从最基本的课程开始,保证每一天都有学习计划和总结,
    包括难度和复杂点.
    
 - 学习新的技术知识
 - 可以随时review code
 - 记录问题 
    
操作的流程
- 先写文档说明
- 先写目标技术
- 先写测试用例
- 最后实现代码

验证知识掌握：

- 通过看文档能够review 以前写过的代码
- 可以通过样例代码巩固掌握的知识点 

# (二)项目结构说明



- .gitignore 忽略提交的文件
- .idea   IDEA 工具必须的文件
- java-interview-parent  面试需要准备的demo
  - apollo-quickstart apollo框架学习
  - design-pattern    设计模式学习
  - interview-core-sort  核心排序算法
  - java8-api             Java8的核心API 
  - mybatis-plus          ORM 持久层框架  
  - rabbit-mq-demo        JMS框架学习 
  - spring-demo   学习spring的demo  https://alidocs.dingtalk.com/document/edit?dentryKey=6K1WXnVa5tv9W8Yp
- java-se-parents        Java-SE 需要学习的内容
  - se-crazy-series  疯狂java 系列基础课程   （待实现）
  - se-day32-series  CZ Java基础系列课程 （待实现）
  - se-sgg-series    SGG 系列的Java基础课程  （待实现）
- java-web-parents
  - web-lession1-html   html前端基础
  - web-lession13-xml-reflect html和反射基础
  - web-lession2-css    cs 前端基础
  - web-lession6-jdbc   jdbc 数据库连接基础
- spring-boot-parent     spring-boot需要学习的知识工程
- tuling-demos     tuling 架构师专题  （当前正在实现部分）
    - jdk-performance-optimization jdk性能优化 https://naotu.baidu.com/file/7a30cce4d6239b916f48c580ee3bb077
    - spring-source-code001  spring源码系列 
- README.md              项目说明文档

- java-springclound  springclound学习的代码
    - 重新定义spring cloud 系列
    - alibaba cloud 系列
    - 其他系列
    
# (三)项目学习日志文档
# 多线程企业级模板口诀
线程操纵资源类
判断干活唤醒通知
严防多线程环境下的虚假唤醒
# 上一次执行到的部分 2021/3/4
首先skyway-x在做高可用的情况下再继续，此刻重点在于JVM和JDK部分的内容。因此需要在3月份及时调整这部分的优先级。 

# 目前计划
  
[计划学习文档](https://alidocs.dingtalk.com/document/edit?dentryKey=RljJl244YsP2wyWd)
- 2021年03月 jvm系列
    - interview系列
- 2020年9月 再次实现spring 源码
- 2020年10月 JDK JVM 源码系列
- 2020年11月 JDK JVM 源码系列
- 2021年01月 skyway-x 系列

# 上一次执行到的部分

- 开始构建skyway-x 平台基础架构  , 从更高层次开始架构一个项目
- 开始构建framework
- 开始构建platform
- 开始抽取device模块中的framework-jdbc依赖
- 开始新建skyway-user-service模块
- 解决device 和user 模块重复依赖web的问题
- 增加了[Druid](https://www.cnblogs.com/babycomeon/p/11582303.html)数据库连接池 
- 解决数据源重复配置的问题 [SpringBoot 多项目配置统一、公共属性
](https://markix.blog.csdn.net/article/details/102577380)
- 增加swagger的配置, 支持swagger接口测试 [swagger官方文档](https://doc.xiaominfo.com/knife4j/documentation/get_start.html)
![](v1-skyway-x\png\swagger.png)
- 处理logback.xml公用配置的问题 https://github.com/spring-projects/spring-boot/blob/master/spring-boot-project/spring-boot/src/main/resources/org/springframework/boot/logging/logback/base.xml
- 解决mybatis-plus自动生成controller ,service , dao ,service,mapper等
# 端口安排
skyway-device-service  8001
skyway-user-service    8002

