package esDemo;

import java.util.Arrays;

import org.frameworkset.elasticsearch.ElasticSearchHelper;
import org.frameworkset.elasticsearch.client.ClientInterface;
import org.frameworkset.elasticsearch.client.ClientUtil;

public class HelloWorld {
	public static void main(String[] args) {
		//添加rest服务器
		ElasticSearchHelper.addHttpServer(Arrays.asList(PiccElasticSearch.loadEsAddress()));
		//获取直接操作query dsl的rest api接口组件
//		ClientInterface clientUtil = ElasticSearchHelper.getRestClientUtil();
		
		//getConfigRestClientUtil方法获取的ClientInterface实例是getRestClientUtil方法获取到的ClientInterface实例的子类，
		//所以同样具备后者的所有功能。加载配置文件api和不加载配置文件api都是一致的，区别就是加载配置文件api传递的是dsl在配置文件中dsl对应的名称，
		//如果配置文件中的dsl带有参数变量，还需要传递参数（map方式、bean方式传入即可）。
		ClientInterface clientUtil = ElasticSearchHelper.getConfigRestClientUtil("estrace/esDemoMapper.xml");
		//发送es restful请求，获取String类型json报文
		//自己在es中添加数据
		String map =clientUtil.executeHttp("orders/_search", ClientUtil.HTTP_POST);
		System.out.println(map);
	}
}
	
