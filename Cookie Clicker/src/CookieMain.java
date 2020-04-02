import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class CookieMain {

	JLabel counterLabel, perSecLabel;
	JButton button1, button2, button3, button4;
	int cookieCounter, timerSpeed, cursorNumber, cursorPrice, grandpaNumber, grandpaPrice, bakeryPrice, bakeryNumber,
			factoryPrice, factoryNumber;
	double perSecond;
	boolean timerOn;
	Font font1, font2;
	cookieHandler cHandler = new cookieHandler();
	Timer timer;
	boolean grandpaUnlocked = false;
	boolean factoryUnlocked = false;
	boolean bakeryUnlocked = false;

	JTextArea messageText;

	MouseHandler mHandler = new MouseHandler();

	public static void main(String[] args) {

		new CookieMain();

	}

	public CookieMain() {

		createFont();
		createUI();

		timerOn = false;
		perSecond = 0;
		cookieCounter = 0;
		cursorNumber = 0;
		cursorPrice = 10;
		grandpaNumber = 0;
		grandpaPrice = 50;
		bakeryPrice = 800;
		bakeryNumber = 0;
		factoryPrice = 1000;
		factoryNumber = 0;

	}

	public void createFont() {
		font1 = new Font("Comic Sans MS", Font.PLAIN, 32);
		font2 = new Font("Cimic Sans MS", Font.PLAIN, 15);

	}

	public void createUI() {
		JFrame window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);

		JPanel cookiePanel = new JPanel();
		cookiePanel.setBounds(100, 220, 200, 200);
		cookiePanel.setBackground(Color.black);
		window.add(cookiePanel);

		ImageIcon cookie = new ImageIcon(getClass().getClassLoader().getResource("cookie.png"));
		JButton cookieButton = new JButton();
		cookieButton.setBackground(Color.black);
		cookieButton.setFocusPainted(false);
		cookieButton.setBorder(null);
		cookieButton.setIcon(cookie);
		cookieButton.addActionListener(cHandler);
		cookieButton.setActionCommand("coockie");
		cookiePanel.add(cookieButton);

		JPanel counterPanel = new JPanel();
		counterPanel.setBounds(100, 101, 200, 100);
		counterPanel.setBackground(Color.black);
		counterPanel.setLayout(new GridLayout(2, 1));
		window.add(counterPanel);

		counterLabel = new JLabel(cookieCounter + " cookies");
		counterLabel.setForeground(Color.white);
		counterLabel.setFont(font1);
		counterPanel.add(counterLabel);

		perSecLabel = new JLabel();
		perSecLabel.setForeground(Color.white);
		perSecLabel.setFont(font2);
		counterPanel.add(perSecLabel);

		JPanel itemPanel = new JPanel();
		itemPanel.setBounds(500, 170, 250, 250);
		itemPanel.setBackground(Color.black);
		itemPanel.setLayout(new GridLayout(4, 1));
		window.add(itemPanel);

		button1 = new JButton("Cursor");
		button1.setFont(font1);
		button1.setFocusPainted(false);
		button1.addActionListener(cHandler);
		button1.setActionCommand("Cursor");
		button1.addMouseListener(mHandler);
		itemPanel.add(button1);

		button2 = new JButton("?");
		button2.setFont(font1);
		button2.setFocusPainted(false);
		button2.addActionListener(cHandler);
		button2.setActionCommand("Grandpa");
		button2.addMouseListener(mHandler);
		itemPanel.add(button2);

		button3 = new JButton("?");
		button3.setFont(font1);
		button3.setFocusPainted(false);
		button3.addActionListener(cHandler);
		button3.setActionCommand("Bakery");
		button3.addMouseListener(mHandler);
		itemPanel.add(button3);

		button4 = new JButton("?");
		button4.setFont(font1);
		button4.setFocusPainted(false);
		button4.addActionListener(cHandler);
		button4.setActionCommand("Factory");
		button4.addMouseListener(mHandler);
		itemPanel.add(button4);

		JPanel messagePanel = new JPanel();
		messagePanel.setBounds(500, 70, 250, 150);
		messagePanel.setBackground(Color.black);
		window.add(messagePanel);

		messageText = new JTextArea();
		messageText.setBounds(50, 70, 250, 150);
		messageText.setForeground(Color.white);
		messageText.setBackground(Color.black);
		messageText.setFont(font2);
		messageText.setLineWrap(true);
		messageText.setWrapStyleWord(true);
		messageText.setEditable(false);
		messagePanel.add(messageText);

		window.setVisible(true);

	}

	public void setTimer() {
		timer = new Timer(timerSpeed, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cookieCounter++;
				counterLabel.setText(cookieCounter + " cookies");

				if (grandpaUnlocked == false) {
					if (cookieCounter >= 100) {
						grandpaUnlocked = true;
						button2.setText("Grandpa" + "(" + grandpaNumber + ")");
					}
					
					if(bakeryUnlocked == false) {
						if(cookieCounter >= 800) {
							bakeryUnlocked = true;
							button3.setText("Bakery"+"(" + bakeryNumber + ")");
						}
					}

					if (factoryUnlocked == false) {
						if (cookieCounter >= 1000) {
							factoryUnlocked = true;
							button4.setText("Factory" + "(" + factoryNumber + ")");
						}
					}

				}

			}
		});
	}

	public void timerUpdate() {

		if (timerOn == false) {
			timerOn = true;

		} else if (timerOn == true) {
			timer.stop();

		}

		double speed = 1 / perSecond * 1000;
		timerSpeed = (int) Math.round(speed);

		String s = String.format("%.1f", perSecond);
		perSecLabel.setText("per second " + s);

		setTimer();
		timer.start();

	}

	public class cookieHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {

			String action = event.getActionCommand();

			switch (action) {
			case "cookie":
				cookieCounter++;
				counterLabel.setText(cookieCounter + " cookies");
				break;
			case "Cursor":
				if (cookieCounter >= cursorPrice) {
					cookieCounter = cookieCounter - cursorPrice;
					cursorPrice = cursorPrice + 5;
					counterLabel.setText(cookieCounter + " cookies");

					cursorNumber++;
					button1.setText("Cursor " + "(" + cursorNumber + ")");
					messageText.setText("Cursor \n[price " + cursorPrice + "] \n Autoclicks ones every 10 seonds.");
					perSecond = perSecond + 0.1;
					timerUpdate();
				} else {
					messageText.setText("You need more cookies");
				}
				break;
			case "Grandpa":

				if (cookieCounter >= grandpaPrice) {
					cookieCounter = cookieCounter - grandpaPrice;
					grandpaPrice = grandpaPrice + 50;
					counterLabel.setText(cookieCounter + " cookies");

					grandpaNumber++;
					button2.setText("Grandpa" + "(" + grandpaNumber + ")");
					messageText.setText(
							"Grandpa \n[price " + grandpaPrice + "] \n Each grandpa produces 1 cookie per second.");
					perSecond = perSecond + 1;
					timerUpdate();
				} else {
					messageText.setText("You need more cookies");
				}
				break;
			case "Bakery":
				if (cookieCounter >= bakeryPrice) {
					cookieCounter = cookieCounter - bakeryPrice;
					factoryPrice = factoryPrice + 80;
					counterLabel.setText(cookieCounter + " cookies");

					bakeryNumber++;
					button3.setText("Bakery" + "(" + bakeryNumber + ")");
					messageText.setText(
							"Bakery \n[price " + bakeryPrice + "] \n Your bakery can produce 300 cookies in 1 second.");
					perSecond = perSecond + 30;
					timerUpdate();
				} else {
					messageText.setText("You need more cookies");
				}
				break;

			case "Factory":
				// case "Factory" + Functionality
				if (cookieCounter >= factoryPrice) {
					cookieCounter = cookieCounter - factoryPrice;
					factoryPrice = factoryPrice + 120;
					counterLabel.setText(cookieCounter + " cookies");

					factoryNumber++;
					button4.setText("Factory" + "(" + factoryNumber + ")");
					messageText.setText("Factory \n[price " + factoryPrice
							+ "] \n Your factory can prodyce 800 cookies in 1 second.");
					perSecond = perSecond + 55;
					timerUpdate();
				} else {
					messageText.setText("You need more cookies");
				}
				break;

			}

			cookieCounter++;
			counterLabel.setText(cookieCounter + " cookies");
		}

	}

	public class MouseHandler implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton button = (JButton) e.getSource();

			if (button == button1) {
				messageText.setText("Cursor \n[price " + cursorPrice + "] \n Autoclicks ones every 10 seonds.");

			} else if (button == button2) {
				if (grandpaUnlocked == false) {
					messageText.setText("This is currently locked!");
				} else {
					messageText.setText(
							"Grandpa \n[price " + grandpaPrice + "] \n Each grandpa produces 1 cookie per second.");
				}

			} else if (button == button3) {

				
				if (bakeryUnlocked == false) {
					messageText.setText("This is currently locked, BAAAKA");
				}else {
					messageText.setText(
							"Bakery \n[price " + bakeryPrice + "] \n Each bakery produces 400 cookie per second.");
				}

			} else if (button == button4) {
				
				if (factoryUnlocked == false) {
					messageText.setText("DISSAPPOINTMENT");
				} else {
					messageText.setText("Factory \n[price " + factoryPrice + "] \n 20 cookies in 1 sec.");
				}
			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton button = (JButton) e.getSource();
			if (button == button1) {
				messageText.setText(null);
			} else if (button == button2) {
				messageText.setText(null);
			} else if (button == button3) {
				messageText.setText(null);
			} else if (button == button4) {
				messageText.setText(null);
			}

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}

}
