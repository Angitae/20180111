package com.ocj.gui;

import java.awt.Frame;

public class FrameMain extends Frame {
	private static final long serialVersionUID = 1L;

	// 원하는 형태의 Frame을 구현하여 출력.
	public FrameMain(String title) {
		
		super(title); // 여기서 제목이 표현된다. 
		
		/*// setSize(폭 , 높이) : Component의 크기를 변경하는 메소드 .  단위는 px
		setSize(300, 400);   // this.setSize 중 this가 생략된 것.
		
		
		// setLocation( X, Y) : 컴퍼넌트의 출력 위치를 변경하는 메소드.
		setLocation(500, 100);
		
		*/
		
		// 위의 두 역할을 동시에 하는 메소드
		// 컴퍼넌트의 출력위치 및 크기를 변경하는 메소드.
		
		setBounds(500, 100, 300, 400);
		
		//setVisible(boolean) : 컴퍼넌트의 출력유무를 출력하는메소드.
		setVisible(true);  // 마찬가지로 this가 생략되어 있음.
	}

	public static void main(String[] args) {
		new FrameMain("GUI");
	}
}
