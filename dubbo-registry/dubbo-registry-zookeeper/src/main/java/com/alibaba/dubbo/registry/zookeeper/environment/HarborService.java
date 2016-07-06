package com.alibaba.dubbo.registry.zookeeper.environment;

public class HarborService{
	private HarborCredential credentials;

	public HarborCredential getCredentials() {
		return credentials;
	}

	public void setCredentials(HarborCredential credentials) {
		this.credentials = credentials;
	}

	@Override
	public String toString() {
		if(credentials!=null){
			return credentials.toString();
		}else{
			return "null";
		}
	}
}