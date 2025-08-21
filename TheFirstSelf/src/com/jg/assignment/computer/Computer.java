package com.jg.assignment.computer;

public class Computer {
	
 	private String cpu;             // CPU
 	private String graphicsCard;    // 그래픽카드
	private int monitorRefreshRate; // 모니터 주사율
	private int ramCapacity;        // 램 용량
    private int powerCapacity;      // 파워 용량
    
    
    public Computer() { }
    
    public Computer(String cpu, String graphicsCard, int monitorRefreshRate
    		        , int ramCapacity, int powerCapacity) {
    	this.cpu = cpu;
    	this.graphicsCard = graphicsCard;
    	this.monitorRefreshRate = monitorRefreshRate;
    	this.ramCapacity = ramCapacity;
    	this.powerCapacity = powerCapacity;
    }
	


	public String getCpu() {
    	return cpu;
    }
    public String getGraphicsCard() {
    	return graphicsCard;
    }
    public int getMonitorRefreshRate() {
    	return monitorRefreshRate;
    }
    public int getRamCapacity() {
    	return ramCapacity;
    }
    public int getPowerCapacity() {
    	return powerCapacity;
    }
    
    public void setCpu(String cpu) {
    	this.cpu = cpu;
    }
    public void setGraphicsCard(String graphicsCard) {
    	this.graphicsCard = graphicsCard;
    }
    public void setMonitorRefreshRate(int monitorRefreshRate) {
    	this.monitorRefreshRate = monitorRefreshRate;
    	
    }
    public void setRamCapacity(int ramCapacity) {
    	this.ramCapacity = ramCapacity;
    }
    public void setPowerCapacity(int powerCapacity) {
    	this.powerCapacity = powerCapacity;
    }
    
    public String info() {
    	String info = "Cpu : " + cpu + " ,그래픽 카드 : " + graphicsCard 
    			    + ", 모니터 주사율 : " + monitorRefreshRate + ", 램 용량 : "
    			    + ramCapacity + ", 파워 용량 : " + powerCapacity;
    	return info;
    }
    
    
    public void set1() {
    	this.monitorRefreshRate = 60;
    	System.out.println("60Hz로 설정되었습니다");
    }
    
    public void set2() {
    	this.monitorRefreshRate = 144;
    	System.out.println("144Hz로 설정되었습니다");
    }
    
    public void set3() {
    	this.monitorRefreshRate = 240;
    	System.out.println("240Hz로 설정되었습니다");
    }
    
    
}
