public class NumberGame{
	public static void main(String[] args){
		System.out.println("Игра угадай число");
		int Answer=34;
		int PlayerNumb=47;
		while(Answer!=PlayerNumb){
			System.out.println("Число игрока"+PlayerNumb);
			if(PlayerNumb>Answer)
			{
				System.out.println("Данное число больше того, что загадал компьютер");
				PlayerNumb--;
			}
			if(PlayerNumb<Answer)
			{
				System.out.println("Данное число меньше того, что загадал компьютер");
				PlayerNumb++;
			}			
		}
		if(PlayerNumb==Answer)
			{System.out.println("Поздравляю, число угадано! "+Answer);}			
		}
	}
