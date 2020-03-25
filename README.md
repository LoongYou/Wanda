# Scarlet Witch Wanda 绯红女巫（旺达）

## 作者信息
yulong 2020/03/25
欢迎关注https://github.com/LoongYou

## 介绍

这是一个对vsd流程图进行视觉优化的小工具，可将vsd文件转为html，主要针对软件设计流程图中的泳道和阶段实现粘性导航标题，提高阅读效率。

## F&Q
1.它用在什么场景？
--软件设计流程图的初衷是如实的描述逻辑和关联系统的交互，因此泳道列表是必不可少的，当流程图较大，在visio中往往要上下翻动页面查看，
影响了效率和准确性。此时你会希望泳道或阶段的标题可以像excel那样固定列头或行，这正是本工具所提供的。

2.这会改动原来的vsd文件吗？
--不会，但是需要通过visio打开vsd文件以读取信息。

3.对运行环境的要求？
--需要jdk1.8，兼容visio2010及以上版本(很遗憾对于2007我实在没有办法，其实这也是好事，升级一下吧，多多善益)，不支持IE，请将默认浏览器设为谷歌或其他浏览器

4.可以在html中修改vsd文件吗？
--理论上可以实现，但是不是现在。visio是个非常远古的软件，使用了封闭的文件格式(vsd)，本程序通过visio将vsd转为svg(W3C开放格式矢量图形)，
才使得在浏览器中操作有了可能，这不仅仅是时间问题，要知道即便是解析visio生成的svg也是让人非常烦躁的，又谈何去做兼容？不重复造车轮了，点到为止即可。



## 开发说明

搭建开发环境步骤如下：
- 一、安装JDK，Eclipse
- 二、安装Visio，理论上07 10 13 16是互通的
- 三、下载com4j库（我已经下载并打包到wanda.jar中，解压后在com4j-20120426-2里面），这个库是开源免费且考古的，地址：
https://com4j.kohsuke.org/
https://github.com/kohsuke/com4j/downloads

下面就可以使用com4j生成visio接口文件，这些文件均为调本地方法的java文件，我已经生成了visio2007和2016的接口文件，并放在Wanda.jar相同目录下，你也无需生成。
除非有一些问题，你可能需要重新生成，按照如下步骤：

1.首先解压第三步下载的com4j包，将args4j-2.0.1.jar，tlbimp.jar，com4j.jar放到本机JDK的bin目录下（不一定，只是为了命令方便，这三个文件你一起可以放到任何地方，cd到对应的文件夹执行cmd命令即可）。

2.安装好Visio后找到VISLIB.DLL文件路径，例如：D:\software\visio2013\VISLIB.DLL
2016 C:\Program Files\Microsoft Office\Office16\VISLIB.DLL

3.cmd进入JDK安装bin目录，运行以下命令：
java -jar tlbimp.jar -o visio -p VisioTool "D:\software\visio2013\VISLIB.DLL"
运行之后在JDK的bin目录出现一个名为visio的文件夹。然后将visio文件整个作为一个包复制到工程中，不必留在java bin目录中，你也可以指定导出的位置：
2016 C:\Program Files\Java\jdk1.8.0_152\bin>java -jar tlbimp.jar -o D:\\visio -p visiotool "C:\Program Files\Microsoft Office\Office16\VISLIB.DLL"

2007  java -jar tlbimp.jar -o visio -p VisioTool "C:\Program Files (x86)\Microsoft Office\Office12\VISLIB.DLL"

如果是64位系统，可能执行不成功，那么解压com4j.jar，提取其中的com4j-amd64.dll(我已放到com4j-20120426-2里面)，然后加载动态链接库，如
regsvr32 C:\com4j-amd64.dll，再重做第三步即可

如果以上步骤均失败，则使用管理员权限

4.开发的时候把args4j-2.0.1.jar，tlbimp.jar，com4j.jar3个jar文件导入java工程中即可（我已经将所需jar打包在lib包中，只需将项目导入eclipse即可）。

5.开发完成导出可执行jar的时候，建议使用eclipse导出，可以省去编写MANIFEST的麻烦，并且选择package方式将lib放入单独的文件夹，以后替换局部jar包很方便，系统兼容性也很好。

## 版本更新
- 2020/03/24 1.1
finish the work!


