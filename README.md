## JavaWeb项目之客户管理系统 

## 项目介绍
详细讲解请点击这里前往我的博客[客户管理系统项目](http://codingxiaxw.cn/2016/10/25/25-JavaWeb%E9%A1%B9%E7%9B%AE%E4%B9%8B%E5%AE%A2%E6%88%B7%E7%AE%A1%E7%90%86%E7%B3%BB%E7%BB%9F/)  

### 功能介绍

- 添加客户:添加客户的信息，包括姓名，性别，手机，邮箱，自我描述
- 查询客户:查询数据库中所有的客户，查询结果将客户信息以列表的形式给出，可以对列表中的客户信息进行编辑及删除
- 高级搜索:多条件组合在数据库中进行客户信息的查询，搜索结果以列表的形式给出，可以对列表中的客户信息进行编辑及删除
- 新增分页功能，逻辑很强。
 
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
IntelliJ IDEA  +  MySQL  或者  eclipse + MySQL

## 使用方法

1. git clone `https://github.com/codingXiaxw/CustomerManagement.git`  
2. 使用IntelliJ IDEA导入打开 或者 使用eclipse打开`CustomerManagement_for_Eclipse`项目
3. 使用eclipse/src/create_table.sql文件中的sql语句创建相应的数据库及表
4. 修改`CustomerManagement/src`下`c3p0-config.xml`中数据库相关信息
5. 部署Tomcat并启动
6. enjoy it

## 项目功能截图
### 添加客户
<img src="http://od2xrf8gr.bkt.clouddn.com/tianjia.png" width="50%" height="50%">

### 查询客户
<img src="http://od2xrf8gr.bkt.clouddn.com/chaxun.png" width="80%" height="50%">

### 编辑客户

<img src="http://od2xrf8gr.bkt.clouddn.com/bianji.png" width="50%" height="50%">

### 高级搜索客户

<img src="http://od2xrf8gr.bkt.clouddn.com/sousuo.png" width="50%" height="50%">

### 新增分页后的界面
<img src="http://od2xrf8gr.bkt.clouddn.com/fenye.png" width="50%" height="50%">




