package com.kh.chap05.model.vo;

public abstract class Music {
     
	// Ŭ���̾�Ʈ �䱸���׿� ���� �����ڰ� ��ȹ �� �����ؾ���
	private String code;
	private String title;
	private String runningTime;
	
	
	public Music() {}
	public Music(String code, String title, String runningTime) {
		this.code = code;
		this.title = title;
		this.runningTime = runningTime;
	}
	
	public String getCode() {
		return code;
	}
	public String getTitle() {
		return title;
	}
	public String getRunningTime() {
		return runningTime;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setRunningTime(String runningTime) {
		this.runningTime = runningTime;
	}
	
	
}
