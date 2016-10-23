## JavaWeb项目之客户管理系统 

## 项目介绍

### 功能介绍

- 添加客户:添加客户的信息，包括姓名，性别，手机，邮箱，自我描述
- 查询客户:查询数据库中所有的客户，查询结果将客户信息以列表的形式给出，可以对列表中的客户信息进行编辑及删除
- 高级搜索:多条件组合在数据库中进行客户信息的查询，搜索结果以列表的形式给出，可以对列表中的客户信息进行编辑及删除
 
### 运用知识
- 数据库基本查询
- 数据库连接池c3p0
- 运用dbutil.jar包一键封装表单数据到bean对象中
- 利用dbutils.jar包简化对数据库增、删、改、查的代码
- 标签库
- JavaWeb三层框架的分离
- 将servlet的转发、重定向及方法进行封装，这样当设计到多个功能时不用建立多个servlet类。
- 反射

## 准备
1.导入第三方jar包以及c3p0配置文件。

- c3p0.jar
- mchange-commons.java.jar
- commons-beanutils.jar
- commons-dbutils.jar
- commons-logging.jar
- 自己写的小工具itcast-tools.jar
- jstl.jar
- mysql-connector-java.jar

2.建包

- dao
- service
- servlet
- domain

## 搭建环境
IntelliJ IDEA  +  MySQL

## 使用方法
1.git clone https://github.com/codingXiaxw/JavaWeb-Project-CustomerManagement.git  

2.使用IntelliJ IDEA导入打开即可。

## 项目功能截图
### 添加客户
<img src="http://od2xrf8gr.bkt.clouddn.com/tianjia.png" width="50%" height="50%">

### 查询客户
<img src="http://od2xrf8gr.bkt.clouddn.com/chaxun.png" width="80%" height="50%">

### 编辑客户

<img src="http://od2xrf8gr.bkt.clouddn.com/bianji.png" width="50%" height="50%">

### 高级搜索客户

<img src="http://od2xrf8gr.bkt.clouddn.com/sousuo.png" width="50%" height="50%">



