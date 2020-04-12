## Spring Framework

bean 和bean定义：bean是一个实例，bean定义是描述这个bean的属性方法等的定义

# 环境介绍
本文实现环境：Window 10 / JDK 8 / Spring 4.3 / IDEA 2019/gradle5.3
源码地址：[https://github.com/spring-projects/spring-framework](https://github.com/spring-projects/spring-framework)

在正式开始之前我们需要先安装 Gradle
地址：[https://gradle.org/releases/](https://gradle.org/releases/)
## 配置Gradle环境
1. 下载Gradle后解压到你的目录 。如：D:/Develop/Gradle-5.6.2
2. 设置环境变量

```bash
# 以windows为例
GRADLE_HOME=D:/Develop/Gradle-5.6.2
PATH=%PATH%;%GRADLE_HOME%/bin
```
## 验证Gradle
安装配置完毕后，在命令行敲入如下命令验证安装配置是否正确（外网可能比较慢），类似maven也可以配置成国内镜像
```bash
gradle -version
```
### Gradle 加速
和 Maven 的配置相同，我们可以给 Gradle 配置一个阿里的数据源，加速项目的构建（加上下载 Jar 包），找到配置文件 init.gradle，我的默认目录在 C:\Users\用户名.gradle，如果没有找到则新建一个 init.gradle 文件，之后添加如下配置：

```bash
allprojects {
   repositories {
       maven {
           url "http://maven.aliyun.com/nexus/content/groups/public"
       }
   }
}
```
# 二 Spring源码准备
  GitHub上拉取源码。我们不需要提交Spring，所以可以直接选择对应的版本再下载Spring-framework zip包就可以。
       源码地址：[https://github.com/spring-projects/spring-framework](https://github.com/spring-projects/spring-framework)

# 三 导入和编译Spring
Spring 源码下载完成之后，我们就可以使用 IDEA 导入源码项目了，为了加快源码编译的速度，在导入之后我们可以编辑 Spring 源码根目录下的 settings.gradle 文件，添加阿里的源配置信息

```bash
maven { url "http://maven.aliyun.com/nexus/content/groups/public/"}
```
接下来我们就可以导入 Spring 源码了，点击 Import Project，选择 Spring 源码的路径，选择 Gradle 方法导入，如下图所示：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200412153032728.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4MTMwMDk0,size_16,color_FFFFFF,t_70)
点击 Next，选择本地的 Gradle 路径，如下图所示：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200412153054157.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4MTMwMDk0,size_16,color_FFFFFF,t_70)
然后点击 Finish 就会进入项目的自动构建阶段了。Spring 构建完成（和你本机性能及网速有关，我得build了一个多小时）
# 测试spring源码环境
创建一个自己的测试工程：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200412153233983.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM4MTMwMDk0,size_16,color_FFFFFF,t_70)创建完成之后，我们在 build.gradle 中添加对 Spring 源码的依赖：

```bash
api(project(":spring-context"))
```
如我这里的 test-bean 和 testsping-bean进行测试