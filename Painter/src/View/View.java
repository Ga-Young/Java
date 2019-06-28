package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Label;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Model.Shape;

public class View{
	ArrayList<Shape> model;
	public JFrame frame;  			
	
	JPanel toolPanel; 	
	public DrawPanel drawPanel;
	
	public DrawPanel getDrawPanel() {
		return drawPanel;
	}

	public JMenuBar menuBar = new JMenuBar();
	public JMenu fileMenu;
	public JMenuItem menuItem1,menuItem2,menuItem3;
	
	public JButton bgButton = new JButton("모눈종이");
	
	public JButton penButton = new JButton("펜");
	public JButton lineButton = new JButton("직선");
	public JButton triangleButton = new JButton("삼각형");
	public JButton rectangleButton = new JButton("사각형");
	public JButton circleButton = new JButton("원");
	public JButton diamondButton = new JButton("마름모");
	public JButton polygonButton = new JButton("N각형");
	public JButton eraserButton = new JButton("지우개");
	public JButton clickButton = new JButton("컨트롤");
	public JButton rotateButton = new JButton("회전 ");
	public JButton fillButton = new JButton("");
	public JButton strokeButton = new JButton("");
	
	public JLabel label = new JLabel("선 굵기");
	public JTextField thicknessText = new JTextField(2);
	public JButton thicknessButton = new JButton("확인");

	public View(ArrayList<Shape> model) {
		this.model = model;
		
		frame = new JFrame();
		toolPanel = new JPanel();
		drawPanel = new DrawPanel(model);
		
		fileMenu = new JMenu("file");
		menuBar.add(fileMenu);
		
		menuItem1 = new JMenuItem("새로만들기");
		menuItem2 = new JMenuItem("저장하기");
		menuItem3 = new JMenuItem("불러오기");
		
		fileMenu.add(menuItem1);
		fileMenu.add(menuItem2);
		fileMenu.add(menuItem3);
		frame.setJMenuBar(menuBar);
		
		penButton.setFocusable(false);
		bgButton.setFocusable(false);
		lineButton.setFocusable(false);
		triangleButton.setFocusable(false);
		rectangleButton.setFocusable(false);
		circleButton.setFocusable(false);
		diamondButton.setFocusable(false);
		polygonButton.setFocusable(false);
		eraserButton.setFocusable(false);
		clickButton.setFocusable(false);
		rotateButton.setFocusable(false);
		fillButton.setFocusable(false);
		strokeButton.setFocusable(false);
		label.setFocusable(false);
		drawPanel.setFocusable(true);
		
		drawPanel.setBackground(Color.white);
		strokeButton.setBackground(Color.black);
		strokeButton.setPreferredSize(new Dimension(25,25));
		fillButton.setPreferredSize(new Dimension(25,25));
		fillButton.setBackground(Color.white);

		toolPanel.add(bgButton);
		toolPanel.add(penButton);
        toolPanel.add(lineButton);
        toolPanel.add(triangleButton);
        toolPanel.add(rectangleButton);
        toolPanel.add(circleButton);
        toolPanel.add(diamondButton);
        toolPanel.add(polygonButton);
        toolPanel.add(eraserButton);
        toolPanel.add(clickButton);
        toolPanel.add(rotateButton);
        toolPanel.add(fillButton);
        toolPanel.add(strokeButton);
        toolPanel.add(label);
        toolPanel.add(thicknessText);
        toolPanel.add(thicknessButton);
        
        frame.add(toolPanel,BorderLayout.NORTH);
        frame.add(drawPanel,BorderLayout.CENTER);
        
        frame.setSize(1200, 700);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		frame.requestFocus();
	}
}	
