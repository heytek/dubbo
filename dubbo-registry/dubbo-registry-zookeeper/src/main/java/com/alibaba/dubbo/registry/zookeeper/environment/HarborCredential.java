package com.alibaba.dubbo.registry.zookeeper.environment;

public class HarborCredential extends BaseCredential {
	private int intport;
	
	public int getIntport() {
		return intport;
	}

	public void setIntport(int internalPort) {
		this.intport = internalPort;
	}
	
	@Override
	public String toString() {
		return "HarborCredential [intport=" + intport + ", toString()=" + super.toString() + "]";
	}
}
