package esDemo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;

public class LoadProperty {
	/**
	 * 读取properties中文件的属性获取对应的值
	 * @param fileName 文件名称（相对路径）
	 * @param key	文件中对应的属性名称
	 * @return
	 */
	public static String getValueByKey(String fileName,String key) {
		InputStream inputStream = LoadProperty.class.getClassLoader().getResourceAsStream(fileName);
		Properties properties = new Properties();
		String filePath = "";
		try {
			properties.load(inputStream);
			filePath = properties.getProperty(key);
			if(StringUtils.isNotBlank(filePath)) {
				filePath = filePath.trim();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		return filePath;
	}
}
