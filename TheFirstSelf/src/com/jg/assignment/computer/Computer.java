package com.jg.assignment.computer;

public class Computer {
	
 	private String cpu;             // CPU
 	private String graphicsCard;    // �׷���ī��
	private int monitorRefreshRate; // ����� �ֻ���
	private int ramCapacity;        // �� �뷮
    private int powerCapacity;      // �Ŀ� �뷮
    
    
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
    	String info = "Cpu : " + cpu + " ,�׷��� ī�� : " + graphicsCard 
    			    + ", ����� �ֻ��� : " + monitorRefreshRate + ", �� �뷮 : "
    			    + ramCapacity + ", �Ŀ� �뷮 : " + powerCapacity;
    	return info;
    }
    
    
    public void set1() {
    	this.monitorRefreshRate = 60;
    	System.out.println("60Hz�� �����Ǿ����ϴ�");
    }
    
    public void set2() {
    	this.monitorRefreshRate = 144;
    	System.out.println("144Hz�� �����Ǿ����ϴ�");
    }
    
    public void set3() {
    	this.monitorRefreshRate = 240;
    	System.out.println("240Hz�� �����Ǿ����ϴ�");
    }
    
    
}
