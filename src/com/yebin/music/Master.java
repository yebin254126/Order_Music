package com.yebin.music;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Master {
	private static Song s;
    public static List<Song>  song_list=new ArrayList<Song>(10); //歌曲列表
	public Master(Song song)
	{ 
	    song_list.add(song);   //添加歌曲
	}
	public Master() 
	{
		
	}
	public static void play_music()   //播放歌曲
	{
		if(!song_list.isEmpty())
		{
		   Iterator<Song> lt=song_list.listIterator();
			while(lt.hasNext())	  
			{
			  s=song_list.get(0);
			  System.out.println("播放音乐  "+s.toString());
			  song_list.remove(0);
			   try {
				Thread.sleep(800);
				System.out.println("即将播放下一曲....");
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			};
			}
		}
	}

}
