
public class Text
	{
	public static void introducePlayer() throws InterruptedException
		{
		System.out.println("Welcome to UNO! In this deck, we have 0-9 in each color. There's also a 'R+S' card.");
		Thread.sleep(3000);
		System.out.println("Because only two people are playing, the REVERSE and SWITCH cards will act the same, hence why they're combined.");
		Thread.sleep(3000);
		System.out.println("Both cards skip the next player and allow the player who just placed the card to place another card.");
		Thread.sleep(4000);
		System.out.println("There's also a +2 card for each color. All of the above cards must match the color of the top card in the discard pile.");
		Thread.sleep(4000);
		System.out.println("There are also 4 wild cards that allow you to change the color of the discard pile when played.");
		Thread.sleep(4000);
		System.out.println("Also, there are four +4 Wild, these change the color and also force the other play to draw 4 cards from the deck.");
		Thread.sleep(4000);
		System.out.println("The objective of the game is to place your cards on the discard pile, matching either color or number.");
		Thread.sleep(4000);
		System.out.println("When you're left with only one card, you should call UNO. After that, you must place the remaining card to win the game.");
		Thread.sleep(4000);
		System.out.println("You will be playing against a computer, but don't think that will mean you can cheat.");
		Thread.sleep(4000);
		}
	public static void introduceDiscard()
		{
		System.out.println("The discard pile will be displayed on every turn. To begin, the card will be: ");	
		}
	
	}
