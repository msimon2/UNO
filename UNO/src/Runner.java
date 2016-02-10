
public class Runner
	{
		static boolean won;
	public static void main(String[] args) throws InterruptedException 
		{
		//Text.introducePlayer();
		Cards.addCards();
		Cards.drawCards();
		Text.introduceDiscard();
		Cards.startDiscard();
			Player.chooseAction();
		}
	}
