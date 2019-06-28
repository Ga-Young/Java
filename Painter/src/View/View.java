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
	
	public JButton bgButton = new JButton("������");
	
	public JButton penButton = new JButton("��");
	public JButton lineButton = new JButton("����");
	public JButton triangleButton = new JButton("�ﰢ��");
	public JButton rectangleButton = new JButton("�簢��");
	public JButton circleButton = new JButton("��");
	public JButton diamondButton = new JButton("������");
	public JButton polygonButton = new JButton("N����");
	public JButton eraserButton = new JButton("���찳");
	public JButton clickButton = new JButton("��Ʈ��");
	public JButton rotateButton = new JButton("ȸ�� ");
	public JButton fillButton = new JButton("");
	public JButton strokeButton = new JButton("");
	
	public JLabel label = new JLabel("�� ����");
	public JTextField thicknessText = new JTextField(2);
	public JButton thicknessButton = new JButton("Ȯ��");

	public View(ArrayList<Shape> model) {
		this.model = model;
		
		frame = new JFrame();
		toolPanel = new JPanel();
		drawPanel = new DrawPanel(model);
		
		fileMenu = new JMenu("file");
		menuBar.add(fileMenu);
		
		menuItem1 = new JMenuItem("���θ����");
		menuItem2 = new JMenuItem("�����ϱ�");
		menuItem3 = new JMenuItem("�ҷ�����");
		
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
