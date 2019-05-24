#搜索引擎的 ORM 库 Elasticsearch Bboss

bboss elasticsearch是一套基于query dsl语法操作和访问分布式搜索引擎elasticsearch的o/r mapping高性能开发库，底层基于es restful api。基于bboss elasticsearch，可以快速编写出访问和操作elasticsearch的程序代码，简单、高效、可靠、安全。

bboss elasticsearch以类似于mybatis的方式,使用xml文件管理elasticsearch的dsl脚本，在dsl脚本中可以使用变量、脚本片段、foreach循环、逻辑判断、注释；配置文件支持在线修改、自动热加载，开发和调试非常方便。

#bboss-elastic特色
1.采用类似于mybatis的方式配置语法配置和管理访问es的qsl脚本，简洁而直观，支持配置文件热加载功能；提供丰富的逻辑判断语法；支持qsl脚本片段和片段引用功能；

2.提供高效可定制的db到elasticsearch数据导入能力

3.支持elasticsearch sql，可替代es jdbc模块；引入bboss不仅可以拥有bboss的客户端自动发现和负载容灾能力、对es、jdk、spring boot的兼容性能力，还可以拥有es jdbc的所有功能，同时还解决了因为引入es jdbc导致项目对es版本的强依赖和兼容性问题，参考demo： orm https://gitee.com/bboss/eshelloword-booter/blob/master/src/test/java/org/bboss/elasticsearchtest/sql/SQLOrmTest.java 分页 https://gitee.com/bboss/eshelloword-booter/blob/master/src/test/java/org/bboss/elasticsearchtest/sql/SQLPagineTest.java

4.支持ES JDBC，参考文档：Elasticsearch JDBC案例介绍
5.提供创建和查询索引表配置模板api；提供创建和查询索引表api；提供索引文档创建、修改、删除、获取基本功能;提供索引文档批量创建、批量修改、批量删除api；
6.提供支持分页检索api（from/size,searchafter,scroll,slicescroll）
7.支持获取索引文档字段元数据
8.提供简洁易用的全文检索api，聚合检索和统计api；支持o/mapping功能，支持检索和聚合查询结果快速转换为java对象或者java对象列表；支持分页检索功能和关键词高亮显示；支持多索引表查询；支持父子关系检索；支持地理位置检索；提供检索和聚合查询结果的回调处理接口，可以自定义结果封装处理逻辑。
9支持关键字自动联想和自动纠错的api
10.提供客户端自动负载均衡和容灾恢复机制，高效可靠
11.内置http 连接池管理
12.支持自动发现es服务端新加节点或者剔除节点
13.支持基于X-Pack和searchguard两种安全认证机制
14.除了提供高阶的o/r mapping API，还提供了简单易用的原生restful api和基于tcp的Transport api，可以根据实际需要使用合适的API
15.ClientUtil组件可以指定elasticsearch服务器，支持多es集群，可以在指定的elasticsearch集群上执行操作
16.提供自动清理历史索引数据的工具
17.bboss es不依赖elasticsearch官方任何jar文件，兼容elasticsearch版本:1.x,2.x,5.x,6.x,7.x**,+**
18.bboss es jdk兼容性： jdk 1.7+
19.bboss es兼容spring boot各个版本,零配置集成，提供spring booter es starter
