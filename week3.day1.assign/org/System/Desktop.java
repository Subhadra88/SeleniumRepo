package org.System;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("My desktop size is 32 inch");
	}
	public static void main(String[] args) {
		Desktop dk=new Desktop();
		dk.computerModel();
		dk.desktopSize();

	}

}
