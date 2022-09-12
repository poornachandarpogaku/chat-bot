package com.chat;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;
// write a chat program, print last 4 conversations.
public class Chat 
{
	public static void main(String[] args) throws NoSuchElementException
	{
		LinkedList<String> list = new LinkedList<>();
		System.out.println("lets chat:");
		while(list.size()>=0)
		{
		Scanner sc = new Scanner(System.in);
		list.add(sc.nextLine());
	      if(list.size()>4)
	      {
	    	  list.removeFirst();
	      }
	      list.forEach(i -> System.out.println(i));  
		}
		
		
	}
}
