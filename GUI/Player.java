import java.util.Scanner;
abstract public class Player
{
  //members
  protected String name;
  protected Rack Hand = new Rack();
  protected int score;				//this score is going to be the actual score
  protected int currentScore;			//this will be the calculated score at the end of each turn
  protected Card ExtraCard;
  //methods

  public Player(String name)
  {
	  this.setName(name);
    this.Hand = new Rack();
  }
  //sets
  public void setScore(int s)
  {
	  this.score = s;
  }
  public void setCurrentScore(int s)
  {
	  this.currentScore = s;
  }
  public void setName(String s)
  {
    this.name = s;
  }
  //gets
  public int getScore()
  {
	  return this.score;
  }
  public int getCurrentScore()
  {
	  return this.currentScore;
  }
  public String getName()
  {
    return this.name;
  }
  //other methods
  public void getCard(Card C,int index)
  {
    C.setState(true);
    this.Hand.addCard(C,index);
  }
  public Rack getRack()
  {
    return this.Hand;
  }
  public abstract void pickupCard(Card C);
  public Card getExtraCard()
  {
    return this.Hand.getExtra();
  }
  public void printHand()
  {
    System.out.println(this.Hand);
  }
  public abstract int choosePile(Card Top);
  public abstract Card chooseDiscard();
  public Card takeTurn(Card C)
	{
		this.pickupCard(C);
		Card result = chooseDiscard();
		return result;
	}
  public void printRack()
  {
    System.out.println(this.Hand);
  }
/*  public void updateScore()
  {
    this.setCurrentScore(this.Hand.score());
  }*/
}
