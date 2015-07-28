
/*
Copyright 2015 ELIAS SOUD . 
This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU Lesser General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of 
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 See the 
GNU Lesser General Public License for more details.
You should have received a copy of the GNU Lesser General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.UIManager;

import java.awt.Color;

public class RSADemo {

	private JFrame frmRsaDemo;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RSADemo window = new RSADemo();
					window.frmRsaDemo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RSADemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRsaDemo = new JFrame();
		frmRsaDemo.setResizable(false);
		frmRsaDemo.getContentPane().setForeground(new Color(102, 0, 255));
		frmRsaDemo.setTitle("RSA Demo");
		frmRsaDemo.setBounds(100, 100, 400, 350);
		frmRsaDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRsaDemo.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 38, 86, 20);
		frmRsaDemo.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(139, 38, 86, 20);
		frmRsaDemo.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(252, 38, 86, 20);
		frmRsaDemo.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Desired Public Key");
		lblNewLabel.setForeground(new Color(102, 0, 255));
		lblNewLabel.setBounds(10, 11, 109, 16);
		frmRsaDemo.getContentPane().add(lblNewLabel);
		
		JLabel lblP = new JLabel("p");
		lblP.setForeground(new Color(102, 0, 255));
		lblP.setBounds(139, 12, 46, 14);
		frmRsaDemo.getContentPane().add(lblP);
		
		JLabel lblQ = new JLabel("q");
		lblQ.setForeground(new Color(102, 0, 255));
		lblQ.setBounds(252, 12, 46, 14);
		frmRsaDemo.getContentPane().add(lblQ);
		
		JButton btnNewButton = new JButton("Generate P_Key Sequence");
		btnNewButton.setForeground(new Color(255, 51, 0));
		btnNewButton.setBounds(10, 69, 187, 23);
		frmRsaDemo.getContentPane().add(btnNewButton);
		
		JLabel lblPublicKey = new JLabel("Public Key");
		lblPublicKey.setForeground(Color.BLACK);
		lblPublicKey.setBounds(10, 103, 72, 20);
		frmRsaDemo.getContentPane().add(lblPublicKey);
		
		JLabel lblModulusN = new JLabel("Modulus = n");
		lblModulusN.setForeground(Color.BLACK);
		lblModulusN.setBounds(94, 103, 81, 20);
		frmRsaDemo.getContentPane().add(lblModulusN);
		
		JButton btnNewButton_1 = new JButton("Calculate Private Key");
		btnNewButton_1.setForeground(new Color(255, 51, 51));
		btnNewButton_1.setBounds(10, 157, 187, 23);
		frmRsaDemo.getContentPane().add(btnNewButton_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 126, 72, 20);
		frmRsaDemo.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(94, 126, 81, 20);
		frmRsaDemo.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblPrivateKey = new JLabel("Private Key");
		lblPrivateKey.setBounds(10, 191, 72, 14);
		frmRsaDemo.getContentPane().add(lblPrivateKey);
		
		JLabel lblModulusN_1 = new JLabel("Modulus = n");
		lblModulusN_1.setBounds(94, 190, 81, 16);
		frmRsaDemo.getContentPane().add(lblModulusN_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(10, 214, 72, 20);
		frmRsaDemo.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(94, 214, 81, 20);
		frmRsaDemo.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Encrypte the Message");
		btnNewButton_2.setForeground(new Color(255, 51, 0));
		btnNewButton_2.setBounds(199, 213, 165, 23);
		frmRsaDemo.getContentPane().add(btnNewButton_2);
		
		JLabel lblEncryptedMessage = new JLabel("Encrypted Message --------------->");
		lblEncryptedMessage.setBounds(10, 245, 187, 14);
		frmRsaDemo.getContentPane().add(lblEncryptedMessage);
		
		textField_7 = new JTextField();
		textField_7.setBounds(199, 242, 165, 20);
		frmRsaDemo.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Decrypte the Message");
		btnNewButton_3.setForeground(new Color(255, 51, 0));
		btnNewButton_3.setBounds(10, 270, 165, 23);
		frmRsaDemo.getContentPane().add(btnNewButton_3);
		
		JLabel label = new JLabel("---->");
		label.setBounds(174, 274, 46, 14);
		frmRsaDemo.getContentPane().add(label);
		
		textField_8 = new JTextField();
		textField_8.setBounds(199, 271, 165, 20);
		frmRsaDemo.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/rsa-encryption.png")).getImage();
		label_1.setIcon(new ImageIcon(img));
		label_1.setBounds(224, 69, 129, 136);
		frmRsaDemo.getContentPane().add(label_1);
	
		
	}
}
