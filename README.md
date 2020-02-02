# Scarlet Witch Wanda 绯红女巫（旺达）

纵使身世悲悯，吾亦横空出世

--说明

现在我们一步一步搭建开发环境。

一、安装JDK，Eclipse这些必要工具。本文不再赘述。

二、安装Visio，本文使用的是2013版本。

三、下载com4j库，这个库是开源免费的，地址：https://com4j.kohsuke.org/

四、上面下载了必要的开发工具后，接下来一步很重要，使用com4j生成visio接口（即需要和本地visio绑定）
4.1 解压第三步下载的com4j包，将args4j-2.0.1.jar，tlbimp.jar，com4j.jar放到本机JDK的bin目录下。

4.2 安装好Visio后找到VISLIB.DLL文件路径，例如：D:\software\visio2013\VISLIB.DLL
2016 C:\Program Files\Microsoft Office\Office16\VISLIB.DLL


4.3 cmd进入JDK安装bin目录，运行以下命令：
java -jar tlbimp.jar -o visio -p VisioTool "D:\software\visio2013\VISLIB.DLL"
运行之后在JDK的bin目录出现一个名为visio的文件夹。这是一套操作visio的类库。

4.4 我们还需要dom4j库来操作XML，下载地址：https://dom4j.github.io/

4.5 将4.3中的visio文件夹和4.1的3个jar文件和4.4中的dom4j文件，导入到我们的java工程中，就可以开始编程了。

C:\Program Files\Java\jdk1.8.0_152\bin>java -jar tlbimp.jar -o visio -p visiotool "C:\Program Files\Microsoft Office\Office16\VISLIB.DLL"

如果是64位系统，则解压com4j.jar，提取其中的com4j-amd64.dll，并加载
regsvr32 C:\com4j-amd64.dll



