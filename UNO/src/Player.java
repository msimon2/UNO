import java.util.Scanner;

public class Player
	{
	public static void chooseAction()
		{
		System.out.println("Do you: ");
		System.out.println("1) play a card?");
		System.out.println("2) draw a card?");
		System.out.println("3) call uno?");
		Scanner userActionChoice = new Scanner(System.in);
		int actionChoice = userActionChoice.nextInt();
		if (actionChoice == 1)
			{
			pickCard();	
			}
		}
	public static void pickCard()
		{
		System.out.println("Please pick the card you wish to play.");
		Scanner userCardChoice = new Scanner(System.in);
		int cardChoice = userCardChoice.nextInt();
		System.out.println("You're playing: ");
		if (Cards.YourHand.get(cardChoice).getValue() == 11)
			{
			System.out.println(Cards.YourHand.get(cardChoice).getPurpose());
			}
		else if (Cards.YourHand.get(cardChoice).getValue() == 12)
			{
			System.out.println(Cards.YourHand.get(cardChoice).getPurpose() + " in/ " + Cards.YourHand.get(cardChoice).getColor());
			}
		else
			{
			System.out.println(Cards.YourHand.get(cardChoice).getValue() + " in- " + Cards.YourHand.get(cardChoice).getColor());
			}
		}
	public static void printDeck()
		{
		for (int i = 0; i<7; i++)
			{
			System.out.println(Cards.YourHand.get(i).getValue());
			}
		}
	}
