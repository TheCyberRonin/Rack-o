/*Author: 			Ruben Swyers
* Creation Date: 	March 15, 2015 
* Due Date: 		March 28, 2015
* Course: 			CSC243
* Professor Name: 	Dr. Spiegel
* Assignment: 		#2 - Racko GUI
* Filename: 		Deck.java
* Purpose:		  	This represents a Deck in the GUI. It is a JPanel that has a JLayeredPane on it.
					When a card is added, it gets added to the JLayeredPane.
*/
import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.util.Stack;

public class Deck extends JPanel
{
	//members
	JLayeredPane DJLP;
	
	public Deck()
	{
		this.DJLP = new JLayeredPane();
		this.add(this.DJLP);
		this.DJLP.setLayout(null);
	}
	//methods
			//public void addCard(Card C, int index)
	public void addCard(Card C, int index, int x, int y)
	{
		C.setBounds(x,y,95,140);
		this.DJLP.add(C,new Integer(index));
	}
	/*public Card draw()
	{
		return this.Pile.pop();
	}
	public int getSize()
	{
		return Pile.size();
	}
	public boolean empty()
	{
		return Pile.empty();
	}
	public Card getTop()
	{
		if(this.empty())
		{
			return new Card(0);
		}
		else
		{
			return this.Pile.peek();
		}
	}
	public String top()
	{
		if(this.empty())
		{
			return "O";
		}
		else
		{
			return this.Pile.peek().toString();
		}
	}
	public String toString()
	{
		String result = "";
		//Printed out the stack without popping anything from it
		//in order to do so, you need to treat it as a vector
		for(int i = Pile.size() - 1; i >= 0; i--)
		{
			result += "" + Pile.get(i).toString() + "\n";
		}
		return result;
	}
*/
}
