package by.epam.training.strings;

public class Main {

	public static void main(String[] args) {
		String text = "   far far       away, behind the world        mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean. A small river named Duden flows by their place                     and supplies it with                 the necessary regelialia. It is a paradisematic country, in which roasted parts of sentences fly into your mouth  ";
		StringLogicOperator operator = new StringLogicOperator(text);
		
		System.out.println(operator.removeSpaces());//удаление лишних пробелов
		System.out.println(operator.CountWords());//количество строк в строке
		System.out.println(operator.replaceSubstring("far", "close"));//замена подстроки
		
		
	}

}
