package com.alibaba.dubbo.registry.zookeeper.environment;

import com.alibaba.fastjson.JSON;

public class VcapServicesParser {
	public static final String VCAP_SERVICES_KEY = "VCAP_SERVICES";
	
	public VcapServices parseServices(){
		return parseServices(System.getenv(VCAP_SERVICES_KEY));
	}
	
	public VcapServices parseServices(String serviceJson){
		if(serviceJson==null || serviceJson.isEmpty()){
			return null;
		}
		
		String jsonText = serviceJson.replaceAll("int_port", "intport");
		VcapServices vcapServices = JSON.parseObject(jsonText, VcapServices.class);
		if(vcapServices != null){
			vcapServices.setJsonText(serviceJson);
		}
		
		return vcapServices;
	}
}
