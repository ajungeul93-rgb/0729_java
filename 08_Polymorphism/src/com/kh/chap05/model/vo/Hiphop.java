package com.kh.chap05.model.vo;

public class Hiphop extends Music implements MusicI, Dance {
	
    @Override
    public void play() {
    	System.out.println("ÈüÇÕÀ» Àç»ıÇÕ´Ï´Ù.");
    }
    @Override
    public void stop() {
    	System.out.println("À½¾ÇÀ» ¸ØÃä´Ï´Ù.");
    }
	
	

	

}
