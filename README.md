###SmallRobot

一个由讯飞语音集成的聊天小机器人

###效果图

电脑模拟器没有麦，以后再补上GIF图

###二维码下载
 ![image](/demo_res/二维码.png)
 
（[下载 apk](https://github.com/Roc-egg/SmallRobot/raw/master/demo_res/demo.apk)）

###简单说明

本Demo使用了强大的讯飞语音听写、在线语音听写和在线命令词识别。讯飞语音并不支持语音启动本机内的app应用，
所以自己添加了语音启动手机内的系统应用和安装应用。实现比较简单通过 PackageManager的
```java
    public abstract List<PackageInfo> getInstalledPackages(int var1);
```
可以获得手机内应用的包名，返回一个List集合拿到应用的名称和包名再加判断跳转就可以实现了。
