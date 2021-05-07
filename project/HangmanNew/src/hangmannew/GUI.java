package hangmannew;

//import hangmannew.HangmanGUI.frame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;

public class GUI extends JFrame implements ActionListener, MouseListener {
	public static final String FILE1 = "hangman1.txt";
        public static final String FILE2 = "hangman2.txt";
        public static final String FILE3 = "hangman3.txt";// file er directory
	private static final int WIDTH = 1048;
	private static final int HEIGHT = 750;
	// File menu
        private static  int s=0;
        private static final String FILE_Instructions = "Instructions";
        private static final String FILE_SAVE = "Save";
	private static final String FILE_START = "Play";
        private static final String FILE_RESTART = "Restart";
	private static final String FILE_STOP = "Exit";
        private static final String FILE_LOAD = "Resume";
	public static final String SHOW_REPLAY = "Play Again?";
        public static String LOST=new String();
        public static String lost=new String();
         public static String WON=new String();
         public static String won=new String();
        public static JButton[] buttons = new JButton[26];
        public static ImageIcon bg = new ImageIcon("park_background.png");
        JLabel img = new JLabel(bg, JLabel.CENTER);
	private int state = 0;
	public Random rGen = new Random();
	private static char[] randPhrase;
	private static String[] words;
	private static char[] guesses;
	public static int numBodyParts = 0;
	private static String numGuesses = "";
	public static String phrase;
	public static JPanel mainPanel, leftPanel, rightPanel, bottomPanel,
			belowPanel;
        public static JLabel bck;
        public File f = new File("save_load.txt");
        char array[]=new char[numGuesses.length()];
        int count=0;
	
	public GUI() {
		super("HangMan by Group 7");
		setSize(WIDTH, HEIGHT);
                bg=new ImageIcon(getClass().getResource("park_background.png"));
                words = textFile();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPanel = new JPanel();
                mainPanel.setLayout(null);
        
                mainPanel.setBackground(Color.WHITE);
                bck = new JLabel();
                bck.setBounds(0,0,1050,500);
                bck.setIcon(bg);
                
                rightPanel = new JPanel();
		leftPanel = new JPanel();
                leftPanel.setBackground(Color.WHITE);
	        rightPanel.setBackground(Color.WHITE);
                leftPanel.setBounds(0,0, 1050,500);
                mainPanel.add(leftPanel);
                leftPanel.add(bck);
		bottomPanel = new JPanel();
                bottomPanel.setBounds(0,500,1050,850);
		bottomPanel.setBackground(Color.GRAY);
		mainPanel.add(bottomPanel, BorderLayout.SOUTH);

		belowPanel = new JPanel();
                belowPanel.setBounds(0, 850,1050,100);
		belowPanel.setBackground(Color.YELLOW);
                add(mainPanel);
		add(belowPanel, BorderLayout.AFTER_LAST_LINE);

		belowPanel.setVisible(false); // last er replayte use hoy

		createMenuBar();
		createButtons(bottomPanel);
		replayButtons(belowPanel);
		addMouseListener(this);
               
	}

	public void replayButtons(JPanel belowPanel) {
		JButton playAgain = new JButton(SHOW_REPLAY);
		playAgain.setSize(80, 80);
		playAgain.setActionCommand(SHOW_REPLAY);
		playAgain.addActionListener(this);
		JButton exit = new JButton(FILE_STOP);
		exit.setActionCommand(FILE_STOP);
		exit.addActionListener(this);
		exit.setSize(80, 80);
		belowPanel.add(playAgain);
		belowPanel.add(exit);
	}
        
	public void createButtons(JPanel bottomPanel) {

		
		String[] letters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
				"k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
				"w", "x", "y", "z" };

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(letters[i]);
                        buttons[i].setBackground(Color.LIGHT_GRAY);
			buttons[i].setSize(40, 40);
			buttons[i].setActionCommand(letters[i]);
			buttons[i].addActionListener(this);
                        bottomPanel.add(buttons[i]);
		}

	}

	public void createMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu fileMenu = new JMenu("Game");
		menuBar.add(fileMenu);

                createMenuItem(fileMenu, FILE_Instructions);
		createMenuItem(fileMenu, FILE_START);
                createMenuItem(fileMenu, FILE_RESTART); 
                createMenuItem(fileMenu, FILE_SAVE);
                createMenuItem(fileMenu, FILE_LOAD);
		createMenuItem(fileMenu, FILE_STOP);
	}
	public void createMenuItem(JMenu menu, String itemName) {
		JMenuItem menuItem = new JMenuItem(itemName);
		menuItem.addActionListener(this);
		menu.add(menuItem);
	}

	public void paint(Graphics g) {
		super.paint(g);
		Font font = new Font("Rockwell", Font.PLAIN | Font.ITALIC, 24);
		g.setFont(font);
		g.setColor(Color.BLUE);
                
                
		if (state == 1) {
			
			
			gameMessages(g);
			String result = "";
			for (int i = 0; i < guesses.length; i++) {

				result += guesses[i] + " ";
			
			
			}
			g.drawString(result, 550, 175);
			g.drawString("Guesses so far", 600, 300);
			g.drawString(numGuesses, 600, 350);
                        g.drawString(LOST, 500, 400);
                        g.drawString(lost, 500, 450);
                        g.drawString(WON, 500, 400);
                        g.drawString(won, 500, 450);
			System.out.println(randPhrase);
                        
                        
			hangman(g);
                  

			}
                
		}

	

	private void hangman(Graphics g) {
		g.drawLine(40,480,365,480);
		// vertical pole
		g.drawLine(150,500,150,150);
		// cross-bar
		g.drawLine(150,150,375,150);
		// rope
		g.drawLine(375,150,375,199);
		if (numBodyParts >= 1) {
                         //face
			g.setColor(Color.YELLOW);
			g.fillOval(335,210, 100, 60);
			// hat
			g.setColor(Color.BLACK);
                        g.fillRect(360, 187, 50, 32);
			g.fillRect(340, 207, 82, 15);

			//eyes
			g.setColor(Color.GRAY);
			g.fillOval(360, 230, 10, 10);
			g.fillOval(390, 230, 10, 10);

			if (numBodyParts >= 2) {
				// body
				g.setColor(Color.BLUE);
				g.fillRect(350,270, 70, 80);
			}

			if (numBodyParts >= 3) {
				// left arm
				g.setColor(Color.BLUE);
				g.fillRect(310,280, 50, 15);
				g.setColor(Color.YELLOW);
				g.fillRect(300, 280, 10, 15);
			}
			if (numBodyParts >= 4) {
				// right arm
				g.setColor(Color.BLUE);
				g.fillRect(410,280, 50, 15);
				g.setColor(Color.YELLOW);
				g.fillRect(460, 280, 10, 15);
			}
			if (numBodyParts >= 5) {
				// left foot
				g.setColor(Color.BLACK);
				g.fillRect(360,350, 15, 75);
			}
			if (numBodyParts >= 6) {
				// right foot
		
                            
                                g.setColor(Color.BLACK);
				g.fillRect(395,350, 15, 75);
                                g.setColor(Color.RED);
			        g.drawArc(360, 255, 50, 15, 10, 180);
                                g.setColor(Color.DARK_GRAY);
				g.fillRect(350, 270, 80, 20);
                        }
                        
                        
        	
	}
                
              
        }

	private void gameMessages(Graphics g) {

		if (!winner()) {
			g.drawString("Hangman Game!!!", 300, 80);
                        g.drawString("JAVA Group 7", 450, 100);
			
		} else if (winner() && numBodyParts < 6) {
                        WON="You Win!!! ";
                        won="Press Restart To Play Again";
				bottomPanel.setVisible(false);
			belowPanel.setVisible(false);
                       // repaint();
                        
		} else if (looser() && numBodyParts == 6) {
                        
			bottomPanel.setVisible(false);
			belowPanel.setVisible(true);

		}

	}

	public String getword() {
		words = textFile();
                int n = words.length;
		int r = rGen.nextInt(n);
		String word = words[r];

		return word;
	}

	public boolean winner() {
		if (Arrays.equals(guesses, randPhrase)) {
			return true;
		} else {
			return false;
		}

	}
        public boolean looser() {
		if (Arrays.equals(guesses, randPhrase)) {
			return false;}
                else{
            return true;
		
	}
        }

	public String[] textFile() {
	  
		BufferedReader reader = null;
		
		List<String> wordList = new ArrayList<String>();
		try { 
                    if(s<=2){
			reader = new BufferedReader(new FileReader(FILE1));
			s++;
                }
                    else if(s>2 && s<=5){
			reader = new BufferedReader(new FileReader(FILE2));
			s++;
                }
                    else if(s>5 && s<=8){
			reader = new BufferedReader(new FileReader(FILE3));
			s++;
                }
                          String s = null;
			while ((s = reader.readLine()) != null) {

				wordList.add(s);

			}

		} catch (IOException e) {

			System.out.println(e.getMessage());
			System.exit(-1);
		} finally {
			try {
				
				reader.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
				System.exit(-1);
			}
		}
		
		return wordList.toArray(new String[wordList.size()]);

	}
        
        public void save(int b,String g,char[] G,String p) {
              
            try {
                BufferedWriter bw= new BufferedWriter(new FileWriter(f));
                bw.write(String.valueOf(b));
                bw.newLine();
                bw.write(g);
                bw.newLine();
                bw.write(G);
                bw.newLine();
                bw.write(p);
                bw.close();
            } catch (IOException ex) {
                
            }
            }
        
        
	public void actionPerformed(ActionEvent e) {

		String command = e.getActionCommand();
		if(command.equals(FILE_Instructions)){
                    JOptionPane.showMessageDialog(null," Hangman is a guessing game where the word"
                                        + "\n"
                                        + " to guess is represented by dashes. The player"
                                        + "\n"
                                        + " is given the option to enter a letter. If the letter"
                                        + "\n"
                                        + " guessed is contained in the word, the letter will"
                                        + "\n"
                                        + " replace the dash in its approprate placement."
                                        + "\n"
                                        + " You can not exceed 6 wrong guesses or else you"
                                        + "\n"
                                        + "will lose. Words are selected randomly.",
                                "Instructions",
                                JOptionPane.INFORMATION_MESSAGE, null);
            }
                
                else if (command.equals(FILE_START)) {
			state = 1;
			play(0);
                 	repaint();

		}
                else if(command.equals(FILE_RESTART)){
                        numBodyParts = 0;
			numGuesses = "";
			bottomPanel.setVisible(true);
			state = 1;
			play(0);
			repaint();
                }
                
              else if(command.equals(FILE_SAVE)){
                  
                        save(numBodyParts,numGuesses,guesses,phrase);
              }
              
              else if(command.equals(FILE_LOAD)){
                    try {
                        String ns=new String();
                        BufferedReader br=new BufferedReader(new FileReader(f));
                        numBodyParts=Integer.parseInt(br.readLine());
                       // System.out.println(numBodyParts);
                        numGuesses=br.readLine();
                       // System.out.println(numGuesses);
                        
                        ns=br.readLine();
                       guesses=ns.toCharArray();
                        //System.out.println(guesses);
                        phrase=br.readLine();
                        System.out.println(phrase);
                        state=1;
                        play(1);
                        
                    } catch (FileNotFoundException ex) {
                    } catch (IOException ex) {
                 
                    }
              }
		
	        else if (command.length() == 1 && state == 1) {
			letters(command);
                        for (int i = 0; i < buttons.length; i++) {
                            if(buttons[i].getText()==command){
                       buttons[i].setBackground(Color.RED);
                       buttons[i].setEnabled(false);
                            }
                 }
		}
                
		else if (command.equals(SHOW_REPLAY)) {

			numBodyParts = 0;
			numGuesses = "";
			bottomPanel.setVisible(true);
			state = 1;
			play(0);
			repaint();		

		} 
                else if (command.equals(FILE_STOP)) {
			state = 2;
			System.exit(-1);
		}

		 repaint();
	
        }

	public void letters(String command) {

		System.out.println(command);
                if (phrase.contains(command.toLowerCase())) {
			for (int i = 0; i < randPhrase.length; i++) {
				if (command.toLowerCase().charAt(0) == randPhrase[i]) {
					guesses[i] = command.toLowerCase().charAt(0);
                                }
				}
                }
                        
                           
                else if (!phrase.contains(command.toLowerCase())) {
			JOptionPane.showMessageDialog(null, "Sorry " + command
					+ " is the wrong letter");
			numBodyParts++;
		}
                
                
             

		
              numGuesses += command;
		
                if (numBodyParts < 6 && !winner()) {
		numGuesses += ",";
                        
		}
                
                 repaint();
              
                if(numBodyParts == 6 && looser()){
                   
                   LOST= " Sorry You Lost!!!";
                   lost="The word is '"+phrase+"'";
                   
                   belowPanel.setVisible(true);
                        }
               repaint();
                        }
           
        
        
	private void play(int n) {
                LOST="";
                lost="";
                WON="";
                won="";

		if(n==0){
                    phrase = getword();
                
		randPhrase = phrase.toCharArray();
		guesses = new char[randPhrase.length];
		for (int i = 0; i < guesses.length; i++) {
			guesses[i] = '_';
                    }
                
                for (int i = 0; i < buttons.length; i++) {
             buttons[i].setEnabled(true);
             buttons[i].setBackground(Color.LIGHT_GRAY);
            }
                
                }
                
                else if (n==1)
                {
                    char[] disable=new char[numGuesses.length()];
                    disable=numGuesses.toCharArray();
                       for (int i = 0; i < disable.length; i++) {
                            for (int j = 0; j < buttons.length; j++) {
                              if(buttons[j].getText().equals(Character.toString(disable[i]))){
                                  buttons[j].setEnabled(false);
                                   buttons[j].setBackground(Color.RED);
                               }
                            }
                        }
                    
                    randPhrase = phrase.toCharArray();
                    
                }
                

	}
       
	public void mouseClicked(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}
        
	public static void main(String[] args) {
		GUI hangman = new GUI();
		hangman.setVisible(true);
                
                
	}

  
}