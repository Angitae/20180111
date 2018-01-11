package com.ocj.gui;

import java.awt.Frame;

public class FrameMain extends Frame {
	private static final long serialVersionUID = 1L;

	// ���ϴ� ������ Frame�� �����Ͽ� ���.
	public FrameMain(String title) {
		
		super(title); // ���⼭ ������ ǥ���ȴ�. 
		
		/*// setSize(�� , ����) : Component�� ũ�⸦ �����ϴ� �޼ҵ� .  ������ px
		setSize(300, 400);   // this.setSize �� this�� ������ ��.
		
		
		// setLocation( X, Y) : ���۳�Ʈ�� ��� ��ġ�� �����ϴ� �޼ҵ�.
		setLocation(500, 100);
		
		*/
		
		// ���� �� ������ ���ÿ� �ϴ� �޼ҵ�
		// ���۳�Ʈ�� �����ġ �� ũ�⸦ �����ϴ� �޼ҵ�.
		
		setBounds(500, 100, 300, 400);
		
		//setVisible(boolean) : ���۳�Ʈ�� ��������� ����ϴ¸޼ҵ�.
		setVisible(true);  // ���������� this�� �����Ǿ� ����.
	}

	public static void main(String[] args) {
		new FrameMain("GUI");
	}
}
