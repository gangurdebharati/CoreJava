package com.tns.datetimeapi;

import java.time.LocalDateTime;

public class CurrentDateTime
{
	public static void main(String[] args)
	{
		LocalDateTime myObj=LocalDateTime.now();
		System.out.println(myObj);
	}
}
