# Scarlet Witch Wanda 绯红女巫（旺达）

--说明

搭建开发环境步骤如下：
一、安装JDK，Eclipse这些必要工具。
二、安装Visio，理论上07 13 16是互通的
三、下载com4j库（我已经下载并打包到wanda.jar中，解压后在com4j-20120426-2里面），这个库是开源免费的，地址：
https://com4j.kohsuke.org/
https://github.com/kohsuke/com4j/downloads

下面就可以使用com4j生成visio接口文件，这些文件均为调本地方法的java文件，我已经生成了visio2007和2016的接口文件，并放在Wanda.jar相同目录下，你也无需生成。
除非有一些问题，你可能需要重新生成，按照如下步骤：

1、首先解压第三步下载的com4j包，将args4j-2.0.1.jar，tlbimp.jar，com4j.jar放到本机JDK的bin目录下（不一定，只是为了命令方便，这三个文件你一起可以放到任何地方）。

2、安装好Visio后找到VISLIB.DLL文件路径，例如：D:\software\visio2013\VISLIB.DLL
2016 C:\Program Files\Microsoft Office\Office16\VISLIB.DLL

3、cmd进入JDK安装bin目录，运行以下命令：
java -jar tlbimp.jar -o visio -p VisioTool "D:\software\visio2013\VISLIB.DLL"
运行之后在JDK的bin目录出现一个名为visio的文件夹。然后将visio文件整个作为一个包复制到工程中，不必留在java bin目录中，你也可以指定导出的位置：
C:\Program Files\Java\jdk1.8.0_152\bin>java -jar tlbimp.jar -o D:\\visio -p visiotool "C:\Program Files\Microsoft Office\Office16\VISLIB.DLL"

如果是64位系统，可能执行不成功，那么解压com4j.jar，提取其中的com4j-amd64.dll，然后加载动态链接库，如
regsvr32 C:\com4j-amd64.dll

4、把args4j-2.0.1.jar，tlbimp.jar，com4j.jar3个jar文件导入java工程中即可（我已经将所需jar打包在lib包中，只需将项目导入eclipse即可）。


版本更新
2020/03/24 1.1
finish the work!


