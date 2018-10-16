package com.yebin.music;

class Song {

	private  String name;   //歌曲名
	private  String singer; //歌手
	private  double  time;  //时长
	
 public Song(String n,String s,double t) //初始化歌曲信息，含三个参数
 {
	 name =n;
	 singer=s;
	 time=t;
 }
public  Song(String n,String s) //另一个构造器，含俩个参数
{
	name=n;
	singer=s;
	}
 
   public String toString()  //重写Tostring 
   {
	return this.name+" "+this.singer;
	   
   }
}
