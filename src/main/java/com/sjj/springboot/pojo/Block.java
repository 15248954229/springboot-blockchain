package com.sjj.springboot.pojo;

public class Block {
	/** ����������������е�λ�� */
	private int index;
	/** ������ʱ��ʱ��� */
	private String timestamp;
	/** �����ʲ�������Ҫ��¼������ */
	private int vac;
	/** �������ͨ�� SHA256 �㷨���ɵ�ɢ��ֵ */
	private String hash;
	/** ָ��ǰһ����� SHA256 ɢ��ֵ */
	private String prevHash;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public int getVac() {
		return vac;
	}

	public void setVac(int vac) {
		this.vac = vac;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getPrevHash() {
		return prevHash;
	}

	public void setPrevHash(String prevHash) {
		this.prevHash = prevHash;
	}

}
