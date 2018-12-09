import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/** "MusicaTrialView" class:  Generate the human-machine-interface and detect button touched.
 * In order to play the clips or change the instrument.  
 * 
 * @author Leshanshui YANG
 * @date 2017.04.05 
 * @version 1.0  
 */ 

public class MusicaTrialView extends JFrame {

	private static final long serialVersionUID = 1L;
	private static JFrame mainFrame;
	private ClipPlay exchangeClip; //change data with class ClipPlay
	private StyleSwitch exchangeStyle; //change data with class StyleSwitch
	private final JLabel bg = new JLabel("");
	private int stylenb = 1;
	ImageIcon drums = new ImageIcon(MusicaTrialView.class.getResource("/pool/DRUMS.jpg"));
	ImageIcon chord = new ImageIcon(MusicaTrialView.class.getResource("/pool/CHORD.jpg"));
	ImageIcon synth = new ImageIcon(MusicaTrialView.class.getResource("/pool/SYNTH.jpg"));

	
	public MusicaTrialView() {
	
		this.exchangeClip = new ClipPlay();
		this.exchangeStyle = new StyleSwitch();
		
		//prepareUI();
		getContentPane().setLayout(null);
		setResizable(false);
		getContentPane().setEnabled(false);
		
		////
		JButton Button1 = new JButton("");
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		/**
		 * activeBtn1() to activeBtnV(), including 1,2,3,4,Q,W,E,R,A,S,D,F,Z,X,C,V.
		 * detect keyboard input and mouse input, send the input information to the unit which encode this info.
		 *
		 * @param KeyEvent, MouseClicked
		 * @return int TargetID
		 */
		Button1.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent event1) {
					if(event1.getKeyCode() == KeyEvent.VK_1){
						try {
							activeBtn1();
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.out.println("1 pressed");
					}
					
					if(event1.getKeyCode() == KeyEvent.VK_2){
						try {
							activeBtn2();
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.out.println("2 pressed");
					}
					
					if(event1.getKeyCode() == KeyEvent.VK_3){
						try {
							activeBtn3();
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.out.println("3 pressed");
					}
					if(event1.getKeyCode() == KeyEvent.VK_4){
						try {
							activeBtn4();
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.out.println("4 pressed");
					}
					if(event1.getKeyCode() == KeyEvent.VK_Q){
						try {
							activeBtnQ();
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.out.println("Q pressed");
					}
					if(event1.getKeyCode() == KeyEvent.VK_W){
						try {
							activeBtnW();
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.out.println("W pressed");
					}
					if(event1.getKeyCode() == KeyEvent.VK_E){
						try {
							activeBtnW();
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.out.println("E pressed");
					}
					if(event1.getKeyCode() == KeyEvent.VK_R){
						try {
							activeBtnR();
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.out.println("R pressed");
					}
					if(event1.getKeyCode() == KeyEvent.VK_A){
						try {
							activeBtnA();
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.out.println("A pressed");
					}if(event1.getKeyCode() == KeyEvent.VK_S){
						try {
							activeBtnS();
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.out.println("S pressed");
					}if(event1.getKeyCode() == KeyEvent.VK_D){
						try {
							activeBtnD();
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.out.println("D pressed");
					}if(event1.getKeyCode() == KeyEvent.VK_F){
						try {
							activeBtnF();
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.out.println("F pressed");
					}if(event1.getKeyCode() == KeyEvent.VK_Z){
						try {
							activeBtnZ();
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.out.println("Z pressed");
					}if(event1.getKeyCode() == KeyEvent.VK_X){
						try {
							activeBtnX();
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.out.println("X pressed");
					}if(event1.getKeyCode() == KeyEvent.VK_C){
						try {
							activeBtnC();
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.out.println("C pressed");
					}if(event1.getKeyCode() == KeyEvent.VK_V){
						try {
							activeBtnV();
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.out.println("V pressed");
					}
			}
		});
		
		Button1.addMouseListener(new MouseAdapter() {
			public void mouseClicked (MouseEvent arg0) {
				try {
					activeBtn1();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("x1");
			}
		});
		Button1.setBounds(262, 39, 75, 75);
		
		
		////
		JButton Button2 = new JButton("");
	
		Button2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				try {
					activeBtn2();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("x2");
			}
		});
		Button2.setBounds(367, 39, 75, 75);
		
		
		////
		JButton Button3 = new JButton("");

		Button3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				try {
					activeBtn3();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("x3");
			}
		});
		Button3.setBounds(472, 39, 75, 75);
		
		
		////
		JButton Button4 = new JButton("");
		
		Button4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				try {
					activeBtn4();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("x4");
			}
		});
		Button4.setBounds(577, 39, 75, 75);
		
		
		////
		JButton ButtonQ = new JButton("");
		
		ButtonQ.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				try {
					activeBtnQ();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("xQ");
			}
		});
		ButtonQ.setBounds(262, 135, 75, 75);
		
		
		////
		JButton ButtonW = new JButton("");
		
		ButtonW.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				try {
					activeBtnW();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("xW");
			}
		});
		ButtonW.setBounds(367, 135, 75, 75);
		
		
		////
		JButton ButtonE = new JButton("");
		
		ButtonE.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				try {
					activeBtnE();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("xE");
			}
		});
		ButtonE.setBounds(472, 135, 75, 75);
		
		
		////
		JButton ButtonR = new JButton("");
		
		ButtonR.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				try {
					activeBtnR();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("xR");
			}
		});
		ButtonR.setBounds(577, 135, 75, 75);

		
		////
		JButton btnA = new JButton("");
		btnA.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				try {
					activeBtnA();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("xA");
			}
		});
		btnA.setBounds(262, 239, 75, 75);

		
		////
		JButton btnS = new JButton("");
		btnS.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				try {
					activeBtnS();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("xS");
			}
		});
		btnS.setBounds(367, 239, 75, 75);

		
		////
		JButton btnD = new JButton("");
		btnD.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				try {
					activeBtnD();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("xD");
			}
		});
		btnD.setBounds(472, 239, 75, 75);
		
		////
		JButton btnF = new JButton("");
		btnF.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				try {
					activeBtnF();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("xF");
			}
		});
		btnF.setBounds(577, 239, 75, 75);

		////
		JButton btnZ = new JButton("");
		btnZ.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				try {
					activeBtnZ();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("xZ");
			}
		});
		btnZ.setBounds(262, 338, 75, 75);
		getContentPane().add(btnZ);
		
		////
		JButton btnX = new JButton("");
		btnX.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				try {
					activeBtnX();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("xX");
			}
		});
		btnX.setBounds(367, 338, 75, 75);

		////
		JButton btnC = new JButton("");
		btnC.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				try {
					activeBtnC();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("xC");
			}
		});
		btnC.setBounds(472, 338, 75, 75);

		////
		JButton btnV = new JButton("");
		btnV.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				try {
					activeBtnV();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("xV");
			}
		});
		btnV.setBounds(577, 338, 75, 75);



		
		/**
		 * Detect the clicks on the style changing button to active changeBG().
		 * 
		 * @param MouseClicked
		 * @return int StyleID & active changeBG() fonction.
		 */
		JButton btnStyleSynth = new JButton();
		btnStyleSynth.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				changeBG(3);
				System.out.println("Style3");
			}
		});
		btnStyleSynth.setBounds(704, 158, 179, 41);
		
		JButton btnStyleChord = new JButton();
		btnStyleChord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnStyleChord.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				changeBG(2);
				System.out.println("Style2");
			}
		});
		btnStyleChord.setBounds(704, 202, 179, 41);
		
		JButton btnStyleDrums = new JButton();
		btnStyleDrums.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				changeBG(1);
				System.out.println("Style1");
			}
		});
		btnStyleDrums.setBounds(704, 329, 179, 41);
	
		
		Button1.setContentAreaFilled(false);
		Button2.setContentAreaFilled(false);
		Button3.setContentAreaFilled(false);
		Button4.setContentAreaFilled(false);
		ButtonQ.setContentAreaFilled(false);
		ButtonW.setContentAreaFilled(false);
		ButtonE.setContentAreaFilled(false);
		ButtonR.setContentAreaFilled(false);
		btnA.setContentAreaFilled(false);
		btnS.setContentAreaFilled(false);
		btnD.setContentAreaFilled(false);
		btnF.setContentAreaFilled(false);
		btnZ.setContentAreaFilled(false);
		btnX.setContentAreaFilled(false);
		btnC.setContentAreaFilled(false);
		btnV.setContentAreaFilled(false);
		btnStyleChord.setContentAreaFilled(false);
		btnStyleDrums.setContentAreaFilled(false);
		btnStyleSynth.setContentAreaFilled(false);

		Button1.setBorderPainted(false);
		Button2.setBorderPainted(false);
		Button3.setBorderPainted(false);
		Button4.setBorderPainted(false);
		ButtonQ.setBorderPainted(false);
		ButtonW.setBorderPainted(false);
		ButtonE.setBorderPainted(false);
		ButtonR.setBorderPainted(false);
		btnA.setBorderPainted(false);
		btnS.setBorderPainted(false);
		btnD.setBorderPainted(false);
		btnF.setBorderPainted(false);
		btnZ.setBorderPainted(false);
		btnX.setBorderPainted(false);
		btnC.setBorderPainted(false);
		btnV.setBorderPainted(false);
		btnStyleChord.setBorderPainted(false);
		btnStyleSynth.setBorderPainted(false);
		btnStyleDrums.setBorderPainted(false);
		
		getContentPane().add(Button1);
		getContentPane().add(Button2);
		getContentPane().add(Button3);
		getContentPane().add(Button4);
		getContentPane().add(ButtonQ);
		getContentPane().add(ButtonW);
		getContentPane().add(ButtonE);
		getContentPane().add(ButtonR);
		getContentPane().add(btnA);
		getContentPane().add(btnS);
		getContentPane().add(btnD);
		getContentPane().add(btnF);
		getContentPane().add(btnX);
		getContentPane().add(btnC);
		getContentPane().add(btnV);
		
		getContentPane().add(btnStyleChord);
		getContentPane().add(btnStyleSynth);
		getContentPane().add(btnStyleDrums);
		
		bg.setIcon(drums);
		bg.setBounds(0, -2, 1058, 551);
		getContentPane().add(bg);
	}


		/**
		 * Change the BackGround Wallpaper.
		 * 
		 * @param StyleID
		 * @return 
		 */
	 	public void changeBG(int style){
	 		this.stylenb=style;
	 		switch(style){

			case 1:{bg.setIcon(drums);
					//goStyle1();
					} 
	 		break;
	 		
			case 2:{bg.setIcon(chord);
					//goStyle2();
					} 
	 		break;
	 		
			case 3:{bg.setIcon(synth);
					//goStyle3();
					} 
	 		break;
	 		
			default:{}
			break;
	 		}
	 		
	 		bg.setBounds(0, -2, 1058, 551);
	 		getContentPane().add(bg);
	 	}


	 	
		/**
		 * goStyle1(), goStyle2(), goStyle3(): Change the style in the class Styleswitch.
		 * 
		 * @param 
		 * @return 
		 */
		 public void goStyle1(){this.exchangeStyle.style1();}
	   	 public void goStyle2(){this.exchangeStyle.style2();}
		 public void goStyle3(){this.exchangeStyle.style3();}



	    //ACTION
	
	   public static void main(String[] args){
		   mainFrame = new MusicaTrialView();
		   mainFrame.setSize(894, 564); //888, 528 + 20 suple
		   mainFrame.setVisible(true); 
	   }

	  /**		
	   * activeBtn(): Lance the music in the class ClipPlay.
	   * 
	   * @param 	
	   * @return int ButtonID, int StyleID
       */
	    
	   public void activeBtn1() throws IOException {
	   		this.exchangeClip.getBtnNo(1);
	   		this.exchangeClip.hong(stylenb);
	   }
	   
	   public void activeBtn2() throws IOException {
	   		this.exchangeClip.getBtnNo(2);
	   		this.exchangeClip.hong(stylenb);
	   }
	   
	   public void activeBtn3() throws IOException {
	   		this.exchangeClip.getBtnNo(3);
	   		this.exchangeClip.hong(stylenb);
	   }
	   
	   public void activeBtn4() throws IOException {
	   		this.exchangeClip.getBtnNo(4);
	   		this.exchangeClip.hong(stylenb);
	   }
	   
	   public void activeBtnQ() throws IOException {
	   		this.exchangeClip.getBtnNo(5);
	   		this.exchangeClip.hong(stylenb);
	   }
	   
	   public void activeBtnW() throws IOException {
	   		this.exchangeClip.getBtnNo(6);
	   		this.exchangeClip.hong(stylenb);
	   }
	   
	   public void activeBtnE() throws IOException {
	   		this.exchangeClip.getBtnNo(7);
	   		this.exchangeClip.hong(stylenb);
	   }
	   
	   public void activeBtnR() throws IOException {
	   		this.exchangeClip.getBtnNo(8);
	   		this.exchangeClip.hong(stylenb);
	   }
	   
	   public void activeBtnA() throws IOException {
	   		this.exchangeClip.getBtnNo(9);
	   		this.exchangeClip.hong(stylenb);
	   }
	   
	   public void activeBtnS() throws IOException {
	   		this.exchangeClip.getBtnNo(10);
	   		this.exchangeClip.hong(stylenb);
	   }
	   
	   public void activeBtnD() throws IOException {
	   		this.exchangeClip.getBtnNo(11);
	   		this.exchangeClip.hong(stylenb);
	   }
	   
	   public void activeBtnF() throws IOException {
	   		this.exchangeClip.getBtnNo(12);
	   		this.exchangeClip.hong(stylenb);
	   }
	   
	   public void activeBtnZ() throws IOException {
	   		this.exchangeClip.getBtnNo(13);
	   		this.exchangeClip.hong(stylenb);
	   }
	   
	   public void activeBtnX() throws IOException {
	   		this.exchangeClip.getBtnNo(14);
	   		this.exchangeClip.hong(stylenb);
	   }
	   
	   public void activeBtnC() throws IOException {
	   		this.exchangeClip.getBtnNo(15);
	   		this.exchangeClip.hong(stylenb);
	   }
	   
	   public void activeBtnV() throws IOException {
	   		this.exchangeClip.getBtnNo(16);
	   		this.exchangeClip.hong(stylenb);
	   }
}