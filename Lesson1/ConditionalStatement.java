public class ConditionalStatement{
	public static void main(String[] args){
		short Age=33;
		boolean IsMan=true;
		double Height=1.78;
		char firstNameLetter='R';

if(Age > 20) {
   	System.out.println("Возраст больще 20");
					}

if(IsMan) {
    System.out.println("Мужской пол");
}

if(!IsMan) {
   System.out.println("Женский пол");
}

if(Height < 1.80) {
   System.out.println("Рост меньше 1.80");
} else {
    System.out.println("Рост больше 1.80");
}

if(firstNameLetter == 'M') {
   System.out.println("первая буква M");
} else if(firstNameLetter == 'I') {
   System.out.println("первая буква I");
} else {
       System.out.println("первая буква не M и не I");
} 
	}
}