package com.micro.mvc;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.web.servlet.MultipartConfigFactory;

//@Configuration
public class FileSizeConfig {
	//@NacosValue(value="${upload.maxsize}",autoRefreshed=true)
	private String maxsize;
	
	//@NacosValue(value="${upload.maxrequestsize}",autoRefreshed=true)
	private String maxrequestsize;
	
	//@Bean  
	public MultipartConfigElement multipartConfigElement() {  
		MultipartConfigFactory factory = new MultipartConfigFactory();  
		//文件最大  
		factory.setMaxFileSize(maxsize); //KB,MB  
		// 设置总上传数据总大小  
		factory.setMaxRequestSize(maxrequestsize);  
		return factory.createMultipartConfig();  
	} 
}
