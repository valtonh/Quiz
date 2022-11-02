# DetyrShtepie1
import javax.swing.*;
import java.awt.event.*;


public class Kuiz1
{
	private JFrame frame;
	private JPanel fillimi;
	private Tabela1 board;
	private JButton  exit;
	
	public Kuiz1()
	{
		
		frame = new JFrame("Kuizi");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		fillimi= new JPanel();
		frame.add(fillimi);
		fillimi.setVisible(true);        	
		
		exit = new JButton("Quit");
		exit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
                  board = new Tabela1();
			frame.add(board);
			
			fillimi.setVisible(false);
			board.setVisible(true);
			
			board.add(exit);
			exit.setVisible(true);
		
		frame.pack();
		frame.setSize(350, 350);
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args)
	{
		new Kuiz1();
	}
}
/////////////////////////////////////////////////////////////////////
 import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Tabela1 extends JPanel
{
	private JButton a, b, c, d, e, f,g;
	private JLabel[] q;
	private JLabel q1, q2, q3, q4, q5, q6,q7, fact1;
	private JRadioButton op1a, op1b, op1c, op2a, op2b, op2c, op3a, op3b, op3c, op4a, op4b, op4c,op5a, op5b, op5c, op6a, op6b, op6c,op7a, op7b, op7c ;
	private JRadioButton[] op1, op2, op3;
	private JLabel resC, resI, goodbye;
	private JButton yesC1,	noC1,yesI1, yesI2, yesI3, yesI4, yesI5, yesI6,yesI7,noI1, noI2, noI3, noI4, noI5, noI6,noI7;
					
						
	public Tabela1()
	{
		setBackground(Color.white);
		
		a = new JButton("1");		
		b = new JButton("2");
		c = new JButton("3");
		d = new JButton("4");
		e = new JButton("5");
		f = new JButton("6");		
                g = new JButton("7");
              
                
		
		q = new JLabel[]
		{
			new JLabel("Cili eshte kryeqyteti i Shqiperis?"),
			new JLabel("Cili eshte kryeqyteti i Kosoves?"),
			new JLabel("Cili eshte kryeqyteti i Gjermanis?"),
			new JLabel("Cili eshte kryeqyteti i Maqedonis?"),
			new JLabel("Kush eshte kryeministri i Shqiperise?"),
			new JLabel("Kush eshte presidenti i Kosoves?"),
                        new JLabel("Presidenti i pare i Kosoves ishte?"),
                        
                        
		};
		
		op1 = new JRadioButton[]
		{
			new JRadioButton("Tirana"),		
			new JRadioButton("Prishtina"),
			new JRadioButton("Munchen"),
			new JRadioButton("Kumanova"),
			new JRadioButton("Sali Berisha"),
			new JRadioButton("Albin Kurti"),
                        new JRadioButton("Isa Mustafa"),
               
                        
		};
		
		op2 = new JRadioButton[]
		{
			new JRadioButton("Shkodra"),
			new JRadioButton("Prizreni"),
			new JRadioButton("Dortmund"),
			new JRadioButton("Shkupi"),
			new JRadioButton("Edi Rama"),
			new JRadioButton("Hashim Thaci"),
                        new JRadioButton("Ibrahim Rugova"),
                   
                        
		};
		
		op3 = new JRadioButton[]
		{
			new JRadioButton("Durresi"),
			new JRadioButton("Mitrovica"),
			new JRadioButton("Berlin"),
			new JRadioButton("Dibra"),	
			new JRadioButton("Erion Veliaj"),
			new JRadioButton("Kadri Veseli"),
                        new JRadioButton("Behxhet Pacolli"),
                        
		};
		
		resC = new JLabel("Vazhdoni?");
		resI = new JLabel("E pasakte. Provoni prap?");
		goodbye = new JLabel("Thank you for playing!");
		
		fact1 = new JLabel("E sakt!");       
		yesC1 = new JButton("Yes");
                noC1 = new JButton("No");                
		
		yesI1 = new JButton("Yes");
		yesI2 = new JButton("Yes");
		yesI3 = new JButton("Yes");
		yesI4 = new JButton("Yes");
		yesI5 = new JButton("Yes");
		yesI6 = new JButton("Yes");
                yesI7 = new JButton("Yes");                
		
		noI1 = new JButton("No");
		noI2 = new JButton("No");
		noI3 = new JButton("No");
		noI4 = new JButton("No");
		noI5 = new JButton("No");
		noI6 = new JButton("No");
                noI7 = new JButton("No");
             
                
		
		add(a);
		add(b);
		add(c);
		add(d);
		add(e);
		add(f);
                add(g);
            
		
		a.addActionListener(new AListener());
		b.addActionListener(new BListener());
		c.addActionListener(new CListener());
		d.addActionListener(new DListener());
		e.addActionListener(new EListener());
		f.addActionListener(new FListener());
                g.addActionListener(new GListener());
	}
	
	public void toBoard1()
	{
		a.setVisible(true);
		b.setVisible(true);
		c.setVisible(true);
		d.setVisible(true);
		e.setVisible(true);
		f.setVisible(true);
                g.setVisible(true);
          
	}
	
	private class AListener implements ActionListener
	{	
		public void actionPerformed(ActionEvent event)
		{	
			q1 = q[0];
			op1a = op1[0];
			op1b = op2[0];
			op1c = op3[0];
			
			add(q1);
			add(op1a);
			add(op1b);
			add(op1c);
			
			a.setVisible(false);
			b.setVisible(false);
			c.setVisible(false);
			d.setVisible(false);
			e.setVisible(false);
			f.setVisible(false);
                        g.setVisible(false);
                    
                        
			q1.setVisible(true);
			op1a.setVisible(true);
			op1b.setVisible(true);
			op1c.setVisible(true);
			
			op1a.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op1a.setVisible(false);
					op1b.setVisible(false);
					op1c.setVisible(false);
					
					add(fact1);
					add(resC);
					add(yesC1);
					add(noC1);
					
					fact1.setVisible(true);
					resC.setVisible(true);
					yesC1.setVisible(true);
					noC1.setVisible(true);
				}
			});
			
			yesC1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op1a.setSelected(false);
					
					q1.setVisible(false);
					fact1.setVisible(false);
					resC.setVisible(false);
					yesC1.setVisible(false);
					noC1.setVisible(false);
					
					toBoard1();
				}
			});
			
			noC1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op1a.setSelected(false);
					add(goodbye);
					
					q1.setVisible(false);
					fact1.setVisible(false);
					resC.setVisible(false);
					yesC1.setVisible(false);
					noC1.setVisible(false);
					
					goodbye.setVisible(true);
				}
			});
			
			op1b.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op1a.setVisible(false);
					op1b.setVisible(false);
					op1c.setVisible(false);
					
					add(resI);
					add(yesI1);
					add(noI1);
					
					resI.setVisible(true);
					yesI1.setVisible(true);
					noI1.setVisible(true);
				}
			});
			
			yesI1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op1b.setSelected(false);
					op1c.setSelected(false);
					
					resI.setVisible(false);
					yesI1.setVisible(false);
					noI1.setVisible(false);
					
					op1a.setVisible(true);
					op1b.setVisible(true);
					op1c.setVisible(true);
				}
			});
			
			noI1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op1b.setSelected(false);
					op1c.setSelected(false);
					
					q1.setVisible(false);
					resI.setVisible(false);
					yesI1.setVisible(false);
					noI1.setVisible(false);
					
					toBoard1();
				}
			});
			
			op1c.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op1a.setVisible(false);
					op1b.setVisible(false);
					op1c.setVisible(false);
					
					add(resI);
					add(yesI1);
					add(noI1);
					
					resI.setVisible(true);
					yesI1.setVisible(true);
					noI1.setVisible(true);
				}
			});
		}
	}
		
	private class BListener implements ActionListener
	{	
		public void actionPerformed(ActionEvent event)
		{	
			q2 = q[1];
			op2a = op1[1];
			op2b = op2[1];
			op2c = op3[1];
			
			add(q2);
			add(op2a);
			add(op2b);
			add(op2c);
			
			a.setVisible(false);
			b.setVisible(false);
			c.setVisible(false);
			d.setVisible(false);
			e.setVisible(false);
			f.setVisible(false);
                        g.setVisible(false);
                      
			q2.setVisible(true);
			op2a.setVisible(true);
			op2b.setVisible(true);
			op2c.setVisible(true);
			
			op2a.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op2a.setVisible(false);
					op2b.setVisible(false);
					op2c.setVisible(false);
					
					add(fact1);
					add(resC);
					add(yesC1);
					add(noC1);
					
					fact1.setVisible(true);
					resC.setVisible(true);
					yesC1.setVisible(true);
					noC1.setVisible(true);
				}
			});
			
			yesC1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op2a.setSelected(false);
					
					q2.setVisible(false);
					fact1.setVisible(false);
					resC.setVisible(false);
					yesC1.setVisible(false);
					noC1.setVisible(false);
					
					toBoard1();
				}
			});
			
			noC1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op2a.setSelected(false);
					add(goodbye);
					
					q2.setVisible(false);
					fact1.setVisible(false);
					resC.setVisible(false);
					yesC1.setVisible(false);
					noC1.setVisible(false);
					
					goodbye.setVisible(true);
				}
			});
			
			op2b.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op2a.setVisible(false);
					op2b.setVisible(false);
					op2c.setVisible(false);
					
					add(resI);
					add(yesI2);
					add(noI2);
					
					resI.setVisible(true);
					yesI2.setVisible(true);
					noI2.setVisible(true);
				}
			});
			
			yesI2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op2b.setSelected(false);
					op2c.setSelected(false);
				
					resI.setVisible(false);
					yesI2.setVisible(false);
					noI2.setVisible(false);
					
					op2a.setVisible(true);
					op2b.setVisible(true);
					op2c.setVisible(true);
				}
			});
			
			noI2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op2b.setSelected(false);
					op2c.setSelected(false);
					
					q2.setVisible(false);
					resI.setVisible(false);
					yesI2.setVisible(false);
					noI2.setVisible(false);
					
					toBoard1();
				}
			});
			
			op2c.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op2a.setVisible(false);
					op2b.setVisible(false);
					op2c.setVisible(false);
					
					add(resI);
					add(yesI2);
					add(noI2);
					
					resI.setVisible(true);
					yesI2.setVisible(true);
					noI2.setVisible(true);
				}
			});
		}
	}

	private class CListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{	
			q3 = q[2];
			op3a = op1[2];
			op3b = op2[2];
			op3c = op3[2];
			
			add(q3);
			add(op3a);
			add(op3b);
			add(op3c);
			
			a.setVisible(false);
			b.setVisible(false);
			c.setVisible(false);
			d.setVisible(false);
			e.setVisible(false);
			f.setVisible(false);
                        g.setVisible(false);
                        q3.setVisible(true);
			op3a.setVisible(true);
			op3b.setVisible(true);
			op3c.setVisible(true);
			
			
			op3a.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op3a.setVisible(false);
					op3b.setVisible(false);
					op3c.setVisible(false);
					
					add(resI);
					add(yesI3);
					add(noI3);
					
					resI.setVisible(true);
					yesI3.setVisible(true);
					noI3.setVisible(true);
				}
			});
			
			op3b.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op3a.setVisible(false);
					op3b.setVisible(false);
					op3c.setVisible(false);
					
					add(resI);
					add(yesI3);
					add(noI3);
					
					resI.setVisible(true);
					yesI3.setVisible(true);
					noI3.setVisible(true);
				}
			});
			
			yesI3.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op3b.setSelected(false);
					op3a.setSelected(false);
					
					resI.setVisible(false);
					yesI3.setVisible(false);
					noI3.setVisible(false);
					
					op3a.setVisible(true);
					op3b.setVisible(true);
					op3c.setVisible(true);
				}
			});
			
			noI3.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op3b.setSelected(false);
					op3a.setSelected(false);
					
					q3.setVisible(false);
					resI.setVisible(false);
					yesI3.setVisible(false);
					noI3.setVisible(false);
					
					toBoard1();
				}
			});
			
			op3c.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op3a.setVisible(false);
					op3b.setVisible(false);
					op3c.setVisible(false);
					
					add(fact1);
					add(resC);
					add(yesC1);
					add(noC1);
					
					fact1.setVisible(true);
					resC.setVisible(true);
					yesC1.setVisible(true);
					noC1.setVisible(true);
				}
			});
			
			yesC1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op3c.setSelected(false);
					
					q3.setVisible(false);
					fact1.setVisible(false);
					resC.setVisible(false);
					yesC1.setVisible(false);
					noC1.setVisible(false);
					
					toBoard1();
				}
			});
			
			noC1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op3c.setSelected(false);
					add(goodbye);
					
					q3.setVisible(false);
					fact1.setVisible(false);
					resC.setVisible(false);
					yesC1.setVisible(false);
					noC1.setVisible(false);
					
					goodbye.setVisible(true);
				}
			});
		}
	}

	private class DListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{	
			q4 = q[3];
			op4a = op1[3];
			op4b = op2[3];
			op4c = op3[3];
			
			add(q4);
			add(op4a);
			add(op4b);
			add(op4c);

			a.setVisible(false);
			b.setVisible(false);
			c.setVisible(false);
			d.setVisible(false);
			e.setVisible(false);
			f.setVisible(false);
                        g.setVisible(false);
                       	q4.setVisible(true);
			op4a.setVisible(true);
			op4b.setVisible(true);
			op4c.setVisible(true);
			
			op4a.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op4a.setVisible(false);
					op4b.setVisible(false);
					op4c.setVisible(false);
					
					add(resI);
					add(yesI4);
					add(noI4);
					
					resI.setVisible(true);
					yesI4.setVisible(true);
					noI4.setVisible(true);
				}
			});
			
			yesI4.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op4a.setSelected(false);
					op4c.setSelected(false);
					
					resI.setVisible(false);
					yesI4.setVisible(false);
					noI4.setVisible(false);
					
					op4a.setVisible(true);
					op4b.setVisible(true);
					op4c.setVisible(true);
				}
			});
			
			noI4.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op4a.setSelected(false);
					op4c.setSelected(false);
					
					q4.setVisible(false);
					resI.setVisible(false);
					yesI4.setVisible(false);
					noI4.setVisible(false);
					
					toBoard1();
				}
			});
			
			op4b.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op4a.setVisible(false);
					op4b.setVisible(false);
					op4c.setVisible(false);
					
					add(fact1);
					add(resC);
					add(yesC1);
					add(noC1);
					
					fact1.setVisible(true);
					resC.setVisible(true);
					yesC1.setVisible(true);
					noC1.setVisible(true);
				}
			});
			
			yesC1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op4b.setSelected(false);
					
					q4.setVisible(false);
					fact1.setVisible(false);
					resC.setVisible(false);
					yesC1.setVisible(false);
					noC1.setVisible(false);
					
					toBoard1();
				}
			});
			
			noC1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op4b.setSelected(false);
					add(goodbye);
					
					q4.setVisible(false);
					fact1.setVisible(false);
					resC.setVisible(false);
					yesC1.setVisible(false);
					noC1.setVisible(false);
					
					goodbye.setVisible(true);
				}
			});
			
			op4c.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op4a.setVisible(false);
					op4b.setVisible(false);
					op4c.setVisible(false);
					
					add(resI);
					add(yesI4);
					add(noI4);
					
					resI.setVisible(true);
					yesI4.setVisible(true);
					noI4.setVisible(true);
				}
			});
		}
	}

	private class EListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{	
			q5 = q[4];
			op5a = op1[4];
			op5b = op2[4];
			op5c = op3[4];
			
			add(q5);
			add(op5a);
			add(op5b);
			add(op5c);
			
			a.setVisible(false);
			b.setVisible(false);
			c.setVisible(false);
			d.setVisible(false);
			e.setVisible(false);
			f.setVisible(false);
                        g.setVisible(false);
                   	q5.setVisible(true);
			op5a.setVisible(true);
			op5b.setVisible(true);
			op5c.setVisible(true);
			
			op5a.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op5a.setVisible(false);
					op5b.setVisible(false);
					op5c.setVisible(false);
					
					add(resI);
					add(yesI5);
					add(noI5);
					
					resI.setVisible(true);
					yesI5.setVisible(true);
					noI5.setVisible(true);
				}
			});
			
			yesI5.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op5a.setSelected(false);
					op5c.setSelected(false);
					
					resI.setVisible(false);
					yesI5.setVisible(false);
					noI5.setVisible(false);
					
					op5a.setVisible(true);
					op5b.setVisible(true);
					op5c.setVisible(true);
				}
			});
			
			noI5.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op5a.setSelected(false);
					op5c.setSelected(false);
					
					q5.setVisible(false);
					resI.setVisible(false);
					yesI5.setVisible(false);
					noI5.setVisible(false);
					
					toBoard1();
				}
			});
			
			op5b.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op5a.setVisible(false);
					op5b.setVisible(false);
					op5c.setVisible(false);
					
					add(fact1);
					add(resC);
					add(yesC1);
					add(noC1);
					
					fact1.setVisible(true);
					resC.setVisible(true);
					yesC1.setVisible(true);
					noC1.setVisible(true);
				}
			});
			
			op5c.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op5a.setVisible(false);
					op5b.setVisible(false);
					op5c.setVisible(false);
					
					add(resI);
					add(yesI5);
					add(noI5);
					
					resI.setVisible(true);
					yesI5.setVisible(true);
					noI5.setVisible(true);
				}
			});
			
			yesC1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op5b.setSelected(false);
					
					q5.setVisible(false);
					fact1.setVisible(false);
					resC.setVisible(false);
					yesC1.setVisible(false);
					noC1.setVisible(false);
					
					toBoard1();
				}
			});
			
			noC1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op5b.setSelected(false);
					add(goodbye);
					
					q5.setVisible(false);
					fact1.setVisible(false);
					resC.setVisible(false);
					yesC1.setVisible(false);
					noC1.setVisible(false);
					
					goodbye.setVisible(true);
				}
			});
		}
	}

	private class FListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{	
			q6 = q[5];
			op6a = op1[5];
			op6b = op2[5];
			op6c = op3[5];
			
			add(q6);
			add(op6a);
			add(op6b);
			add(op6c);
			
		a.setVisible(false);
			b.setVisible(false);
			c.setVisible(false);
			d.setVisible(false);
			e.setVisible(false);
			f.setVisible(false);
                        g.setVisible(false);
                        q6.setVisible(true);
			op6a.setVisible(true);
			op6b.setVisible(true);
			op6c.setVisible(true);
			
			op6a.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op6a.setVisible(false);
					op6b.setVisible(false);
					op6c.setVisible(false);
					
					add(resI);
					add(yesI6);
					add(noI6);
					
					resI.setVisible(true);
					yesI6.setVisible(true);
					noI6.setVisible(true);
				}
			});
			
			yesI6.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op6a.setSelected(false);
					op6c.setSelected(false);
					
					resI.setVisible(false);
					yesI6.setVisible(false);
					noI6.setVisible(false);
					
					op6a.setVisible(true);
					op6b.setVisible(true);
					op6c.setVisible(true);
				}
			});
			
			noI6.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op6a.setSelected(false);
					op6c.setSelected(false);
					
					q6.setVisible(false);
					resI.setVisible(false);
					yesI6.setVisible(false);
					noI6.setVisible(false);
					
					toBoard1();
				}
			});
			
			op6b.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op6a.setVisible(false);
					op6b.setVisible(false);
					op6c.setVisible(false);
					
					add(fact1);
					add(resC);
					add(yesC1);
					add(noC1);
					
					resC.setVisible(true);
					yesC1.setVisible(true);
					noC1.setVisible(true);
				}
			});
			
			yesC1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op6b.setSelected(false);
					
					q6.setVisible(false);
					fact1.setVisible(false);
					resC.setVisible(false);
					yesC1.setVisible(false);
					noC1.setVisible(false);
					
					toBoard1();
				}
			});
			
			noC1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op6b.setSelected(false);
					add(goodbye);
					
					q6.setVisible(false);
					fact1.setVisible(false);
					resC.setVisible(false);
					yesC1.setVisible(false);
					noC1.setVisible(false);
					
					goodbye.setVisible(true);
				}
			});
			
			op6c.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op6a.setVisible(false);
					op6b.setVisible(false);
					op6c.setVisible(false);
					
					add(resI);
					add(yesI6);
					add(noI6);
					
					resI.setVisible(true);
					yesI6.setVisible(true);
					noI6.setVisible(true);
				}
			});
		}
	}
        private class GListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{	
			q7 = q[6];
			op7a = op1[6];
			op7b = op2[6];
			op7c = op3[6];
			
			add(q7);
			add(op7a);
			add(op7b);
			add(op7c);
			
		a.setVisible(false);
			b.setVisible(false);
			c.setVisible(false);
			d.setVisible(false);
			e.setVisible(false);
			f.setVisible(false);
                        g.setVisible(false);
                        q7.setVisible(true);
			op7a.setVisible(true);
			op7b.setVisible(true);
			op7c.setVisible(true);
			
			op7a.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op7a.setVisible(false);
					op7b.setVisible(false);
					op7c.setVisible(false);
					
					add(resI);
					add(yesI7);
					add(noI7);
					
					resI.setVisible(true);
					yesI7.setVisible(true);
					noI7.setVisible(true);
				}
			});
			
			yesI7.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op7a.setSelected(false);
					op7c.setSelected(false);
					
					resI.setVisible(false);
					yesI7.setVisible(false);
					noI7.setVisible(false);
					
					op7a.setVisible(true);
					op7b.setVisible(true);
					op7c.setVisible(true);
				}
			});
			
			noI7.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op7a.setSelected(false);
					op7c.setSelected(false);
					
					q7.setVisible(false);
					resI.setVisible(false);
					yesI7.setVisible(false);
					noI7.setVisible(false);
					
					toBoard1();
				}
			});
			
			op7b.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op7a.setVisible(false);
					op7b.setVisible(false);
					op7c.setVisible(false);
					
					add(fact1);
					add(resC);
					add(yesC1);
					add(noC1);
					
					resC.setVisible(true);
					yesC1.setVisible(true);
					noC1.setVisible(true);
				}
			});
			
			yesC1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op7b.setSelected(false);
					
					q7.setVisible(false);
					fact1.setVisible(false);
					resC.setVisible(false);
					yesC1.setVisible(false);
					noC1.setVisible(false);
					
					toBoard1();
				}
			});
			
			noC1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op7b.setSelected(false);
					add(goodbye);
					
					q7.setVisible(false);
					fact1.setVisible(false);
					resC.setVisible(false);
					yesC1.setVisible(false);
					noC1.setVisible(false);
					
					goodbye.setVisible(true);
				}
			});
			
			op7c.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					op7a.setVisible(false);
					op7b.setVisible(false);
					op7c.setVisible(false);
					
					add(resI);
					add(yesI7);
					add(noI7);
					
					resI.setVisible(true);
					yesI7.setVisible(true);
					noI7.setVisible(true);
				}
			});
		}}
}


