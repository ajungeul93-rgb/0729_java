package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {

	List<Music> musicList = new ArrayList();

	public void addList(String title, String singer) {

		Music ms = new Music(title, singer);

		musicList.add(ms);

	}



	public List<Music> addAtZero(String title, String singer) {

		// 아마도? 0번 배열에 들어가게 만들어야함
		Music m = new Music(title, singer);
		
		musicList.add(0, m);

		return musicList;
	}

	public List<Music> printAll() {
		return musicList;
	}

	public List<Music> searchMusic(String keyword) {
		List<Music> searched = new ArrayList();

		for (int i = 0; i < musicList.size(); i++) {

			Music music = musicList.get(i);
			if (music.getTitle().contains(keyword) || music.getSinger().contains(keyword)) {
				searched.add(music);
			}

		}

		return searched;
	}

	public int removeMusic(String title, String singer) {

		int count = 0;

		for (int i = 0; i < musicList.size(); i++) {

			if (title.equals(musicList.get(i).getTitle()) && singer.equals(musicList.get(i).getSinger())) {
				musicList.remove(i);
				i--;
				count++;
			}

		}

		return count;
	}

	public boolean setMusic(String title, String newTitle, String newSinger) {

		for (int i = 0; i < musicList.size(); i++) {

			Music m = musicList.get(i);

			if (title.equals(m.getTitle())) {

				m.setTitle(newTitle);
				m.setSinger(newSinger);
				return true;
			}
		}
		return false;

	}
}
