package com.yebin.music;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Master {
	private static Song s;
    public static List<Song>  song_list=new ArrayList<Song>(10); //�����б�
	public Master(Song song)
	{ 
	    song_list.add(song);   //��Ӹ���
	}
	public Master() 
	{
		
	}
	public static void play_music()   //���Ÿ���
	{
		if(!song_list.isEmpty())
		{
		   Iterator<Song> lt=song_list.listIterator();
			while(lt.hasNext())	  
			{
			  s=song_list.get(0);
			  System.out.println("��������  "+s.toString());
			  song_list.remove(0);
			   try {
				Thread.sleep(800);
				System.out.println("����������һ��....");
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			};
			}
		}
	}

}
