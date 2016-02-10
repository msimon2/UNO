import java.util.ArrayList;

public class Cards
	{
	static ArrayList<CardMaker> Cards = new ArrayList<CardMaker>();
	static ArrayList<Hand> YourHand = new ArrayList<Hand>();

	public static void addCards()
		{
		//Add blue cards
		Cards.add(new BlueCards("Blue",0));
		Cards.add(new BlueCards("Blue",1));
		Cards.add(new BlueCards("Blue",2));
		Cards.add(new BlueCards("Blue",3));
		Cards.add(new BlueCards("Blue",4));
		Cards.add(new BlueCards("Blue",5));
		Cards.add(new BlueCards("Blue",6));
		Cards.add(new BlueCards("Blue",7));
		Cards.add(new BlueCards("Blue",8));
		Cards.add(new BlueCards("Blue",9));
		Cards.add(new SpecialBlue("Blue","+2", 12));
		Cards.add(new SpecialBlue("Blue","R+S", 12));
		
		//Add green cards
		Cards.add(new GreenCards("Green",0));
		Cards.add(new GreenCards("Green",1));
		Cards.add(new GreenCards("Green",2));
		Cards.add(new GreenCards("Green",3));
		Cards.add(new GreenCards("Green",4));
		Cards.add(new GreenCards("Green",5));
		Cards.add(new GreenCards("Green",6));
		Cards.add(new GreenCards("Green",7));
		Cards.add(new GreenCards("Green",8));
		Cards.add(new GreenCards("Green",9));
		Cards.add(new SpecialGreen("Green","+2", 12));
		Cards.add(new SpecialGreen("Green","R+S", 12));
		
		//Add red cards
		Cards.add(new RedCards("Red",0));
		Cards.add(new RedCards("Red",1));
		Cards.add(new RedCards("Red",2));
		Cards.add(new RedCards("Red",3));
		Cards.add(new RedCards("Red",4));
		Cards.add(new RedCards("Red",5));
		Cards.add(new RedCards("Red",6));
		Cards.add(new RedCards("Red",7));
		Cards.add(new RedCards("Red",8));
		Cards.add(new RedCards("Red",9));
		Cards.add(new SpecialRed("Red","+2", 12));
		Cards.add(new SpecialRed("Red","R+S", 12));
		
		//Add yellow cards
		Cards.add(new YellowCards("Yellow",0));
		Cards.add(new YellowCards("Yellow",1));
		Cards.add(new YellowCards("Yellow",2));
		Cards.add(new YellowCards("Yellow",3));
		Cards.add(new YellowCards("Yellow",4));
		Cards.add(new YellowCards("Yellow",5));
		Cards.add(new YellowCards("Yellow",6));
		Cards.add(new YellowCards("Yellow",7));
		Cards.add(new YellowCards("Yellow",8));
		Cards.add(new YellowCards("Yellow",9));
		Cards.add(new SpecialYellow("Yellow","+2", 12));
		Cards.add(new SpecialYellow("Yellow","R+S", 12));
		
		//Add Wild & +4 cards
		Cards.add(new WildFour("Wild +4",11));
		Cards.add(new WildFour("Wild +4",11));
		Cards.add(new WildFour("Wild +4",11));
		Cards.add(new WildFour("Wild +4",11));
		Cards.add(new WildFour("Wild",11));
		Cards.add(new WildFour("Wild",11));
		Cards.add(new WildFour("Wild",11));
		Cards.add(new WildFour("Wild",11));
		}
	public static void drawCards()
		{
		System.out.println("Your hand is : ");
		for(int i =0; i <7; i++)
			{
			System.out.print(i+") ");
			//"shuffle" deck and get card, add to HAND
			int cardDrawn = (int)(Math.random()*Cards.size());
			YourHand.add(new Hand(Cards.get(cardDrawn).getColor(), Cards.get(cardDrawn).getPurpose(),
					+ Cards.get(cardDrawn).getValue()));
			//determine if special cards, or regular, print different sysos
			if (YourHand.get(i).getValue() == 11)
				{
				System.out.println(YourHand.get(i).getPurpose());
				}
			else if (YourHand.get(i).getValue() == 12)
				{
				System.out.println(YourHand.get(i).getPurpose() + " in/ " + YourHand.get(i).getColor());
				}
			else
				{
				System.out.println(YourHand.get(i).getValue() + " in- " + YourHand.get(i).getColor());
				}
			//remove card that's drawn, prevents repeats
			Cards.remove(cardDrawn);
			}
		System.out.println();
		}
	public static void startDiscard()
		{
		//draw "card off top" from "shuffled" deck, top of discard pile
		int discardStarter = (int)(Math.random()*Cards.size());
		if (Cards.get(discardStarter).getValue() != 11 && Cards.get(discardStarter).getValue() != 12)
			{
			System.out.println(Cards.get(discardStarter).getValue() + " in " + Cards.get(discardStarter).getColor());
			}
		//if special card, run again -- no special cards as beginning discard
		else
			{
			startDiscard();
			}
		Cards.remove(discardStarter);
		System.out.println();
		}
	}
