package esDemo;

import org.frameworkset.elasticsearch.ElasticSearch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PiccElasticSearch extends ElasticSearch{
	private static final Logger logger = LoggerFactory.getLogger(PiccElasticSearch.class);
	/* 
	 * 重写配置文件(non-Javadoc)
	 * @see org.frameworkset.elasticsearch.ElasticSearch#configure()
	 */
	public void configure() {
		restServerAddresses = loadEsAddress();
		super.configure();
	}

	/**
	 * 加载es地址 
	 * @return
	 */
	public static String[] loadEsAddress() {
		//es地址
		String[] esAdress = {};
		//文件路径
		String file = "application.properties";
		//文件中的属性名称
		String key = "elasticsearch-demo";
		String adresses = LoadProperty.getValueByKey(file, key);
		String[] split = adresses.split(",");
		esAdress = split;
		return esAdress;
	}
}
