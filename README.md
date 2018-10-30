# dubbo-test
dubbo demo
项目地址 https://github.com/CongZhouArtist/dubbo-test

dubbo版本2.6.4
使用maven + assembly实现tar.gz打包
使用官方start.sh实现脚本启动(其实使用com.alibaba.dubbo.container.Main运行spring环境)

**以dubbo-provider为例，目录树如下**:
![在这里插入图片描述](https://img-blog.csdnimg.cn/2018103023312483.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3p4Y2MxMzE0,size_16,color_FFFFFF,t_70)
  
 1. assembly文件夹放了优雅脚本和assembly.xml
 2. 其中conf实现了多环境配置
 3.  spring文件夹为spring环境配置

**使用mvn clean package -DskipTest打包**
![在这里插入图片描述](https://img-blog.csdnimg.cn/2018103023545080.png)
  
 1. 其中lib为项目所依赖的所有jar包 
 2. conf为properties文件 
 3. bin为sh脚本文件

**使用bin目录下的脚本可以实现优雅start和stop**
![在这里插入图片描述](https://img-blog.csdnimg.cn/20181030235907441.png)
  

PS:
 1. dubbo-consumer为测试工程，运行main方法就可以测试。
 2. 如需使用zookeeper，直接修改dubbo.properties  dubbo.registry.address
 3. 与Jenkins可实现持续集成，直接使用tar.gz解压，sh脚本启动
