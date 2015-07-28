
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
//importing the necessary packages into the project. 
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
// Identifying the JFrame main class .
public class frameDemo {
	// Premature Initialization of the "frameDemo" JFrame elements to safely carve the GUI .
	private JFrame frmInnerAppDemo;
	protected static JTextField textField;
	protected static JTextField textField_1;
	protected static JTextField textField_2;
	protected static JTextField textField_3;
	protected static JTextField textField_4;
	protected static JTextArea txtrSearch ;
	protected JScrollPane sp;
	private JLabel lblNatid;
	private JLabel lblName;
	private JLabel lblA_1;
	private JLabel lblA_2;
	private JLabel lblA_3;
	private JRadioButton rdbtnNewRadioButton ;
	private JRadioButton rdbtnNewRadioButton_1 ;
	private JRadioButton rdbtnNewRadioButton_2 ;
	private JRadioButton rdbtnAdd_1 ;
	private JRadioButton rdbtnDelete ;
	private ButtonGroup bg1 = new ButtonGroup();
	private ButtonGroup bg2 = new ButtonGroup();
	static char w;
	JButton btnNewButton ;
	private JRadioButton rdbtnSearch;
	
	
	/**
	 * the main method that Launches the application with a certain specifications.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frameDemo window = new frameDemo();
					window.frmInnerAppDemo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frameDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// Frame specs.
		frmInnerAppDemo = new JFrame();
		frmInnerAppDemo.setTitle("Inner App Demo");
		frmInnerAppDemo.setResizable(false);
		frmInnerAppDemo.getContentPane().setBackground(SystemColor.menu);
		frmInnerAppDemo.setBounds(200, 200, 450, 400);
		frmInnerAppDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Button-click event handler .
		btnNewButton = new JButton("Execute");
		
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				
				 if ( textField.getText().isEmpty() == false)
		            { if (textField_1.getText().isEmpty() == false){
		                if (rdbtnAdd_1.isSelected())
		                {
		                    if (textField_2.getText().isEmpty() == false && textField_3.getText().isEmpty() == false && textField_4.getText().isEmpty() == false )
		                     { if (rdbtnNewRadioButton.isSelected())
		 		            {
				                 w = '1';
				            }
				            else if (rdbtnNewRadioButton_1.isSelected())
				            {
				                 w = '2';
				            }
				            else if (rdbtnNewRadioButton_2.isSelected())
				            {
				                 w = '3';
				            } 
		                     // Instantiating an object from the "EDIT_VALUE" class and then applying the insert method from the same class to that object.
		                     EDIT_VALUE insertion = new EDIT_VALUE ();
					           insertion.Insert(textField_1.getText(), textField.getText(), textField_2.getText(), textField_3.getText(), textField_4.getText(), w); }
		                    else { JOptionPane.showMessageDialog(null, "fields must not be empty !");  }
		                }
		                else if (rdbtnDelete.isSelected())
		                { 
		                	if (rdbtnNewRadioButton.isSelected())
			            {
			                 w = '1';
			            }
			            else if (rdbtnNewRadioButton_1.isSelected())
			            {
			                 w = '2';
			            }
			            else if (rdbtnNewRadioButton_2.isSelected())
			            {
			                 w = '3';
			            } 
		                     // Instantiating an object from the "EDIT_VALUE" class and then applying the delete method from the same class to that object.
		                	EDIT_VALUE deletion = new EDIT_VALUE ();
			            deletion.Delete(textField.getText(),textField_1.getText(),w);}}
		                else if (rdbtnSearch.isSelected())
			            {
		                	if (rdbtnNewRadioButton.isSelected())
			            {
			                 w = '1';
			            }
			            else if (rdbtnNewRadioButton_1.isSelected())
			            {
			                 w = '2';
			            }
			            else if (rdbtnNewRadioButton_2.isSelected())
			            {
			                 w = '3';
			            }  
		                	// keeping the search results textArea refreshed .
		                	
		                Search search = new Search();
		                
		                txtrSearch.setText(search.Search_Values(textField.getText(), w));
			            }
		            }
		            else { JOptionPane.showMessageDialog(null, "Fields must not be empty !"); }

			}
		
		});
		// Execute button specs .
		btnNewButton.setBounds(153, 207, 129, 29);
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setForeground(SystemColor.windowText);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		// Frame elements specs , events and grouping .
		rdbtnNewRadioButton = new JRadioButton("Students");
		bg2.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(50, 37, 109, 23);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Employees");
		bg2.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(50, 63, 109, 23);
		
		rdbtnNewRadioButton_2 = new JRadioButton("Guards");
		bg2.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(50, 89, 109, 23);
		
		JLabel lblNewLabel = new JLabel("Choose which table to modify :");
		lblNewLabel.setBounds(26, 11, 220, 19);
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmInnerAppDemo.getContentPane().add(btnNewButton);
		frmInnerAppDemo.getContentPane().add(rdbtnNewRadioButton);
		frmInnerAppDemo.getContentPane().add(rdbtnNewRadioButton_1);
		frmInnerAppDemo.getContentPane().add(rdbtnNewRadioButton_2);
		frmInnerAppDemo.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(225, 73, 186, 68);
		frmInnerAppDemo.getContentPane().add(panel);
		// changes and ops that occur when "Add" is chosen .
		rdbtnAdd_1 = new JRadioButton("Add");
		bg1.add(rdbtnAdd_1);
		rdbtnAdd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_1.setVisible(true);
				textField_2.setVisible(true) ;
				textField_3.setVisible(true);
				textField_4.setVisible(true);
				lblNatid.setVisible(true);
				lblA_1.setVisible(true);
				lblA_2.setVisible(true);
				lblA_3.setVisible(true);
				txtrSearch.setVisible(false);
				txtrSearch.setText(null);
				textField.setText(null);
                textField_1.setText(null);
                textField_2.setText(null);
                textField_3.setText(null);
                textField_4.setText(null);
	           
				
			}
		});
		// select "Add" radiobutton by default and adding it to panel.
		rdbtnAdd_1.setSelected(true);
		panel.add(rdbtnAdd_1);
		// changes and ops that occur when "Delete" is chosen .

		rdbtnDelete = new JRadioButton("Delete");
		bg1.add(rdbtnDelete);
		rdbtnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_1.setVisible(true);
				textField_2.setVisible(false) ;
				textField_3.setVisible(false);
				textField_4.setVisible(false);
				lblNatid.setVisible(true);
				lblA_1.setVisible(false);
				lblA_2.setVisible(false);
				lblA_3.setVisible(false);
				txtrSearch.setVisible(false);
				txtrSearch.setText(null);
				textField.setText(null);
                textField_1.setText(null);
                textField_2.setText(null);
                textField_3.setText(null);
                textField_4.setText(null);
	           
			}
		});
		// adding the radiobutton to the panel .
		panel.add(rdbtnDelete);
		
		rdbtnSearch = new JRadioButton("Search");
		rdbtnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_1.setVisible(false);
				textField_2.setVisible(false) ;
				textField_3.setVisible(false);
				textField_4.setVisible(false);
				txtrSearch.setVisible(true);
				txtrSearch.setText(null);
				lblNatid.setVisible(false);
				lblA_1.setVisible(false);
				lblA_2.setVisible(false);
				lblA_3.setVisible(false);
				textField.setText(null);
                textField_1.setText(null);
                textField_2.setText(null);
                textField_3.setText(null);
                textField_4.setText(null);
				       
			}
		});
		panel.add(rdbtnSearch);
		bg1.add(rdbtnSearch);
		
		JLabel lblChooseAnOperation = new JLabel("Choose an operation :");
		lblChooseAnOperation.setForeground(SystemColor.textHighlight);
		lblChooseAnOperation.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChooseAnOperation.setBounds(246, 38, 146, 19);
		frmInnerAppDemo.getContentPane().add(lblChooseAnOperation);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if((Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
					arg0.consume();
				}
			}
		});
		textField.setBounds(26, 176, 109, 20);
		frmInnerAppDemo.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText(null);
		
		textField_1 = new JTextField();
		// restricted typing .
		textField_1.addKeyListener(new KeyAdapter() {
			@Override 
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
					arg0.consume();
				}
			}
		});
		textField_1.setBounds(143, 176, 86, 20);
		frmInnerAppDemo.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		textField_1.setText(null);
		
		textField_2 = new JTextField();
		// restricted typing .
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
					arg0.consume();
				}
			}
		});
		textField_2.setBounds(239, 176, 44, 20);
		frmInnerAppDemo.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		textField_2.setText(null);
		
		textField_3 = new JTextField();
		// restricted typing .
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
					arg0.consume();
				}
			}
		});
		textField_3.setBounds(293, 176, 44, 20);
		frmInnerAppDemo.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		textField_3.setText(null);
		
		textField_4 = new JTextField();
		// restricted typing .
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
					arg0.consume();
				}
			}
		});
		// Frame elements specs .
		textField_4.setBounds(348, 176, 44, 20);
		frmInnerAppDemo.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		textField_4.setText(null);
		
		lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblName.setBounds(26, 151, 46, 14);
		frmInnerAppDemo.getContentPane().add(lblName);
		
		lblNatid = new JLabel("NAT_ID");
		lblNatid.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNatid.setBounds(143, 151, 46, 14);
		frmInnerAppDemo.getContentPane().add(lblNatid);
		
		lblA_1 = new JLabel("A1");
		lblA_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblA_1.setBounds(239, 152, 46, 14);
		frmInnerAppDemo.getContentPane().add(lblA_1);
		
		lblA_2 = new JLabel("A2");
		lblA_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblA_2.setBounds(293, 153, 46, 14);
		frmInnerAppDemo.getContentPane().add(lblA_2);
		
		lblA_3 = new JLabel("A3");
		lblA_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblA_3.setBounds(348, 153, 46, 14);
		frmInnerAppDemo.getContentPane().add(lblA_3);
		frmInnerAppDemo.getContentPane().setLayout(null);
		
		txtrSearch = new JTextArea();
		sp = new JScrollPane(txtrSearch);
		sp.setBounds(26, 247, 393, 103);
        txtrSearch.setEditable(false);
		txtrSearch.setSelectedTextColor(Color.RED);
		txtrSearch.setVisible(false);
		frmInnerAppDemo.getContentPane().add(sp);
		
		JLabel label = new JLabel("!");
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				Search report = new Search();
				JOptionPane.showMessageDialog(null, report.EnDaBiReport());
			}
		});
		label.setToolTipText("Display Information");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(377, 210, 15, 22);
		frmInnerAppDemo.getContentPane().add(label);
		
		
		
	}
}
