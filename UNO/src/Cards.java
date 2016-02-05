import java.util.ArrayList;

public class Cards
	{
	static ArrayList<CardMaker> Cards = new ArrayList<CardMaker>();
	public static void addCards()
		{
		//Add blue cards
		Cards.add(new BlueCards("blue",0));
		Cards.add(new BlueCards("blue",1));
		Cards.add(new BlueCards("blue",2));
		Cards.add(new BlueCards("blue",3));
		Cards.add(new BlueCards("blue",4));
		Cards.add(new BlueCards("blue",5));
		Cards.add(new BlueCards("blue",6));
		Cards.add(new BlueCards("blue",7));
		Cards.add(new BlueCards("blue",8));
		Cards.add(new BlueCards("blue",9));
		Cards.add(new SpecialBlue("blue","+2"));
		Cards.add(new SpecialBlue("blue","R+S"));
		
		//Add green cards
		Cards.add(new GreenCards("green",0));
		Cards.add(new GreenCards("green",1));
		Cards.add(new GreenCards("green",2));
		Cards.add(new GreenCards("green",3));
		Cards.add(new GreenCards("green",4));
		Cards.add(new GreenCards("green",5));
		Cards.add(new GreenCards("green",6));
		Cards.add(new GreenCards("green",7));
		Cards.add(new GreenCards("green",8));
		Cards.add(new GreenCards("green",9));
		Cards.add(new SpecialGreen("green","+2"));
		Cards.add(new SpecialGreen("green","R+S"));
		
		//Add red cards
		Cards.add(new RedCards("red",0));
		Cards.add(new RedCards("red",1));
		Cards.add(new RedCards("red",2));
		Cards.add(new RedCards("red",3));
		Cards.add(new RedCards("red",4));
		Cards.add(new RedCards("red",5));
		Cards.add(new RedCards("red",6));
		Cards.add(new RedCards("red",7));
		Cards.add(new RedCards("red",8));
		Cards.add(new RedCards("red",9));
		Cards.add(new SpecialRed("red","+2"));
		Cards.add(new SpecialRed("red","R+S"));
		
		//Add yellow cards
		Cards.add(new YellowCards("yellow",0));
		Cards.add(new YellowCards("yellow",1));
		Cards.add(new YellowCards("yellow",2));
		Cards.add(new YellowCards("yellow",3));
		Cards.add(new YellowCards("yellow",4));
		Cards.add(new YellowCards("yellow",5));
		Cards.add(new YellowCards("yellow",6));
		Cards.add(new YellowCards("yellow",7));
		Cards.add(new YellowCards("yellow",8));
		Cards.add(new YellowCards("yellow",9));
		Cards.add(new SpecialYellow("yellow","+2"));
		Cards.add(new SpecialYellow("yellow","R+S"));
		
		//Add Wild & +4 cards
		Cards.add(new WildFour("wild +4"));
		Cards.add(new WildFour("wild +4"));
		Cards.add(new WildFour("wild +4"));
		Cards.add(new WildFour("wild +4"));
		Cards.add(new WildFour("wild"));
		Cards.add(new WildFour("wild"));
		Cards.add(new WildFour("wild"));
		Cards.add(new WildFour("wild"));
		
		}
	}
