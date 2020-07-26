package service;
import java.util.*;
import java.io.*;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

public class FlamesCheckService{
	public char findFlames(String name1, String name2)
	{
		
		int l1=name1.length();
		int l2=name2.length();
		name1=name1.toLowerCase();
		name2=name2.toLowerCase();
		StringBuffer st1=new StringBuffer(name1);
		StringBuffer st2=new StringBuffer(name2);
		int st3=0;
		for(int i=0;i<l1;i++)
		{
			for(int j=0;j<l2;j++)
			{
				if(st1.charAt(i)==st2.charAt(j))
				{
					st1=st1.deleteCharAt(i);
					st2=st2.deleteCharAt(j);
					l1=st1.length();
					l2=st2.length();
					i=0;
					j=0;
				}
			}
		}
		st3=st1.length()+st2.length();
		String f="FLAMES";
		while(f.length()!=1)
		{
			int cut=0;
			for(int k=0;k<=st3;k++)
			{
				if(cut>=f.length())
					cut=0;
				++cut;
			}
			f=f.substring(0,cut-1)+f.substring(cut);
			f=f.trim();
		}
		
		
	}
}

