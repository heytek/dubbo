package com.alibaba.dubbo.registry.zookeeper.environment;

/**
 * @author steven
 *
 */
public class VcapServices {
	private HarborService []harbor;
	
	private String jsonText;

	public HarborService[] getHarbor(){
		return harbor;
	}

	public void setHarbor(HarborService[] harbor){
		this.harbor = harbor;
	}

	public String getJsonText() {
		return jsonText;
	}

	public void setJsonText(String jsonText) {
		this.jsonText = jsonText;
	}
}
