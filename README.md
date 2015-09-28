# MyBatisSpring

准备动作<br />
1、启动H2数据库服务端<br />
2、运行InitMain初始化数据库<br />
<br />
原始Dao开发方法<br />
1、在MyBatis配置文件中配置别名<br />
2、在MyBatis配置文件中配置Sql映射文件<br />
3、编写Sql映射文件<br />
4、Dao继承SqlSessionDaoSupport可调用getSqlSession方法得到SqlSession<br />
5、通过SqlSession的insert、update、selectOne、selectList、delete等方法操作数据库<br />
6、在Spring配置文件中配置数据源<br />
7、在Spring配置文件中配置SqlSession工厂<br />
6、在Spring配置文件中配置Dao并将SqlSession工厂注入Dao中<br />
7、通过ApplicationContext得到Dao对象操作数据库<br />
<br />
过度Mapper开发方法<br />
1、在MyBatis配置文件中配置别名<br />
2、编写Mapper接口
3、在Mapper包里编写Sql映射文件<br />
4、在Spring配置文件中配置数据源<br />
5、在Spring配置文件中配置SqlSession工厂<br />
6、在Spring配置文件中配置Mapper并将Mapper接口全类名和SqlSession工厂注入Dao中<br />
7、通过ApplicationContext得到Mapper代理对象操作数据库<br />
<br />
扫描Mapper开发方法<br />
1、在MyBatis配置文件中配置别名<br />
2、编写Mapper接口
3、在Mapper包里编写Sql映射文件<br />
4、在Spring配置文件中配置数据源<br />
5、在Spring配置文件中配置SqlSession工厂<br />
6、在Spring配置文件中配置Mapper扫描包路径和SqlSession工厂Bean的名字
7、通过ApplicationContext得到Mapper代理对象操作数据库<br />



