package com.alibaba.dubbo.registry.zookeeper.environment;

public class BaseCredential {
	private String hostName;
	private int port;
	
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	@Override
	public String toString() {
		return "BaseCredential [hostName=" + hostName + ", port=" + port + "]";
	}
}
