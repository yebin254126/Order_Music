package com.yebin.music;

class Song {

	private  String name;   //������
	private  String singer; //����
	private  double  time;  //ʱ��
	
 public Song(String n,String s,double t) //��ʼ��������Ϣ������������
 {
	 name =n;
	 singer=s;
	 time=t;
 }
public  Song(String n,String s) //��һ��������������������
{
	name=n;
	singer=s;
	}
 
   public String toString()  //��дTostring 
   {
	return this.name+" "+this.singer;
	   
   }
}
