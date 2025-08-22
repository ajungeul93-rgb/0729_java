package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	
	List<Music> musicList = new ArrayList();
	
	public List<Music> addList(){
		return musicList;
	}

}
