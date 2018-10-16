package com.yebin.music;

import java.util.Scanner;


class Player {
     
    public Player()   //点歌
    {
    	
    		System.out.println("请输入你要点的歌名,歌手名");
    		Scanner sc=new Scanner(System.in);
    		Song s=new Song(sc.next(),sc.next());
    		Master.song_list.add(s);    	
    	
    }
    public Player(Song s)
    {
    	Master.song_list.add(s);
    }
	
}
