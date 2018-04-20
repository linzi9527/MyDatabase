这个数据库是基于文本文件的读写储存，原理比较简单。
-------------------------------------------------------------------------------
数据库命令： 首先，数据库有四大基本功能：增删改查（add/delete/update/query）,我为了使用方便，
在设定这四个命令的同时，增加了“列出全部（show）”和“退出（quit）”。

数据库成员： 数据库每个成员有五个值：与

命令格式：

ADD

DELETE

UPDATE

QUERY

SHOW

QUIT
==============================================================================
程序文件各类的作用分析：

Main：显示欢迎界面、调用MainLooper的loop()方法（程序主循环）。

MainLooper：程序主循环、从Input的getInputLine()方法获得命令输入、把输入的字符串传给CheckCmd的check()方法、如果传去check()的值为”QUIT”则跳出循环。

Input：bufferedReader.getInputLine()方法中，调用java.io.BufferedReader的readLine()方法读取整行字符串返回。

Data.txt：存放数据库的文件。

Eng.properties：存放用户交互界面（UI）提示

IOProperty：利用java.util.Properties的load(InputStreaminStream)方法，读取储存文件键值对。

UserInterface：提供获取UI提示的方法。

User：方便获得、暂存、修改、统一输出成员的值。

UsefulMethod：（实用方法）专门在代码重构时新增的类，供使用的类继承，意在统一管理常用的6个方法。分别是：1、反馈命令成功执行 2、判断字符串是否为数字 3、判断成员的数值value是否符合要求 4、判断新增成员key是否重复 5、把数据库储存文件的内容按照id排序（选择排序法） 6、消除String[]中的null。

CheckCmd：使用String的.split(“ ”)方法拆分命令，检查判断输入命令，若无语法问题即进行相应操作，否则报错。

Action：根据CheckCmd的调用进行相应的操作实现数据库功能。

WriteFile：根据调用的参数把字符串添加或覆盖写入文件。

QueryFile：showAll()方法返回数据库所有的内容，query(inttypeIndex, int operIndex, String args) 根据参数进行相应的搜索，返回所有符合条件的成员。

命令实现详析：

ADD

actAdd(String[] strs)：可添加前提：命令长度为6、成员数值value和性别合规、key不重复。否则根据不符的要求相应显示提示。

actAdd(String[] strs)：new一个User类，放入成员值，用writeFile.write(user.toString(),true)添加到文件尾部，并执行一次sortData()（文件全内容按id排序）。

DELETE

checkDelete(String[] strs)：前提：命令长度为2。判断命令参数是否为id（isNumberic(Stringstr)），并输入到actDELETE()。

actDelete(String[] strs, boolean isId)：调用queryFile.showAll()获得文件全部内容并存在String[]中。根据isId循环检索对应key，成立便跳出，把对应字符串赋为””空字符串，并复写在文件上。

UPDATE（设计仅支持salary修改）

checkUpdate(String[] strs)：前提：命令长度为4、命令第2部分是salary。判断命令参数是否为id，并输入到actUPDATE()

actUpdate(String[] strs, boolean isId)：与DELETE类似，调用queryFile.showAll()获得文件全部内容并存在String[]中。根据isId循环检索对应key，成立便跳出，把对应成员值放在一个user成员内，并修改成员salary值，再复写在文件上。

QUERY

checkQuery(String[] strs)：前提：命令长度为4。根据type index｛0.

actQuery(int typeIndex, int operIndex, Stringargs)：调用queryFile.query(typeIndex, operIndex, args)获取结果并循环输出结果。

query(int typeIndex, int operIndex, Stringargs) ：把简化的情况分别检索。思想挺简单，逻辑容易乱，代码也多。

SHOW

checkShow(String[] strs)：前提：命令长度为1。直接调用actShow(String[]strs)。

actShow(String[] strs)：调用queryFile.showAll()获取全部内容并循环输出。

QUIT

checkQuit()：输出“谢谢使用”，并返回-1至MainLooper，跳出循环，程序终结。