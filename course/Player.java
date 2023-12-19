package course;

public class Player{
	public static final int MAX_STAMINA = 100;
	public static final int MIN_STAMINA = 0;
	private static int countOfPlayers = 0;
	int stamina;
	public Player(int stamina) { 
		this.stamina = stamina; 
		if(countOfPlayers < 6) {
			countOfPlayers++;
		}
	}
	
	public void run() {
		if(stamina == 0) {
			return;
		}
		stamina--;
		
		if(stamina == 0) {
			countOfPlayers--;
		}
	}
	
	public static void info() {
		if(countOfPlayers < 6) {
			System.out.println("Команды неполные, на поле еще есть " + (6 - countOfPlayers) + " свободных мест" );
		} else {
			System.out.println("команда полная, мест больше нет");
		}
	}
	
	public int getStamina() { return stamina; }
}
