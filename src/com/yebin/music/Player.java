package com.yebin.music;

import java.util.Scanner;


class Player {
     
    public Player()   //���
    {
    	
    		System.out.println("��������Ҫ��ĸ���,������");
    		Scanner sc=new Scanner(System.in);
    		Song s=new Song(sc.next(),sc.next());
    		Master.song_list.add(s);    	
    	
    }
    public Player(Song s)
    {
    	Master.song_list.add(s);
    }
	
}
