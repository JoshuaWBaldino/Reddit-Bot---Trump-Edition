import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
	static Scanner input = new Scanner(System.in);
	
	// Demo ones to use for any words/phrases
	public static int detecWord____(String words)
	{
		int countright = 0;
		words=words.toLowerCase();
		words.equalsIgnoreCase(words);
		if (words.contains(""))
		{
			countright++;
			System.out.println(words);
		}
		else
		{
			
		}
		return countright;
	}
	
	public static String[] readArrayFor____(String file) {
		
		int ctr = 0;
		try {
			Scanner s1 = new Scanner(new File(file));
			while (s1.hasNextLine()) {
				ctr = ctr + 1;
				s1.nextLine();
			}
			
			String[] words = new String[ctr];
			
			Scanner s2 = new Scanner(new File(file));
			int numword=0;
			for (int i = 0; i < ctr; i = i+1) {
				words[i] = s2.nextLine();
				numword = numword+detecWord____(words[i]);
			}
		
			System.out.println("\nNumber of times Russia:"+numword);
			s2.close();
			return words;
		}
		catch (FileNotFoundException e) {
		System.out.println("Was unable to find file");
			}
		return null;
	}
    //
	
	public static int detecWordPepe(String words)
	{
		//can i get it so that i can just change the word without copying and pasting a ton of these for each word I want to search for
		String word = null;
		int countright = 0;
		words=words.toLowerCase();
		words.equalsIgnoreCase(words);
		if (words.contains("pepe") && words.contains("nazi"))
		{
			countright++;
			System.out.println(words);
		}
		else
		{
			
		}
		return countright;
	}

	public static String[] readArrayForPepe(String file) {
	
	int ctr = 0;
	try {
		Scanner s1 = new Scanner(new File(file));
		while (s1.hasNextLine()) {
			ctr = ctr + 1;
			s1.nextLine();
		}
		
		String[] words = new String[ctr];
		
		Scanner s2 = new Scanner(new File(file));
		int numword=0;
		for (int i = 0; i < ctr; i = i+1) {
			words[i] = s2.nextLine();
			numword = numword+detecWordPepe(words[i]);
		}
	
		System.out.println("\nNumber of times Pepe & Nazi:"+numword);
		s2.close();
		return words;
	}
	catch (FileNotFoundException e) {
	System.out.println("Was unable to find file");
		}
	return null;
}
	
	public static int detecWordFake(String words)
	{
		int countright = 0;
		words=words.toLowerCase();
		words.equalsIgnoreCase(words);
		if (words.contains("fake news"))
		{
			countright++;
			System.out.println(words);
		}
		else
		{
			
		}
		return countright;
	}
	
	public static String[] readArrayForFake(String file) {
		
		int ctr = 0;
		try {
			Scanner s1 = new Scanner(new File(file));
			while (s1.hasNextLine()) {
				ctr = ctr + 1;
				s1.nextLine();
			}
			
			String[] words = new String[ctr];
			
			Scanner s2 = new Scanner(new File(file));
			int numword=0;
			for (int i = 0; i < ctr; i = i+1) {
				words[i] = s2.nextLine();
				numword = numword+detecWordFake(words[i]);
			}
		
			System.out.println("\nNumber of times Fake news:"+numword);
			s2.close();
			return words;
		}
		catch (FileNotFoundException e) {
		System.out.println("Was unable to find file");
			}
		return null;
	}
	
	public static int detecWordAliens(String words)
	{
		int countright = 0;
		words=words.toLowerCase();
		words.equalsIgnoreCase(words);
		if (words.contains("alien") && words.contains("aliens"))
		{
			countright++;
			System.out.println(words);
		}
		else
		{
			
		}
		return countright;
	}
	
	public static String[] readArrayForAliens(String file) {
		
		int ctr = 0;
		try {
			Scanner s1 = new Scanner(new File(file));
			while (s1.hasNextLine()) {
				ctr = ctr + 1;
				s1.nextLine();
			}
			
			String[] words = new String[ctr];
			
			Scanner s2 = new Scanner(new File(file));
			int numword=0;
			for (int i = 0; i < ctr; i = i+1) {
				words[i] = s2.nextLine();
				numword = numword+detecWordAliens(words[i]);
			}
		
			System.out.println("\nNumber of times Aliens:"+numword);
			s2.close();
			return words;
		}
		catch (FileNotFoundException e) {
		System.out.println("Was unable to find file");
			}
		return null;
	}
	
	public static int detecWordBernie(String words)
	{
		int countright = 0;
		words=words.toLowerCase();
		words.equalsIgnoreCase(words);
		if (words.contains("bernie"))
		{
			countright++;
			System.out.println(words);
		}
		else
		{
			
		}
		return countright;
	}
	
	public static String[] readArrayForBernie(String file) {
		
		int ctr = 0;
		try {
			Scanner s1 = new Scanner(new File(file));
			while (s1.hasNextLine()) {
				ctr = ctr + 1;
				s1.nextLine();
			}
			
			String[] words = new String[ctr];
			
			Scanner s2 = new Scanner(new File(file));
			int numword=0;
			for (int i = 0; i < ctr; i = i+1) {
				words[i] = s2.nextLine();
				numword = numword+detecWordBernie(words[i]);
			}
		
			System.out.println("\nNumber of times Bernie:"+numword);
			s2.close();
			return words;
		}
		catch (FileNotFoundException e) {
		System.out.println("Was unable to find file");
			}
		return null;
	}

	public static int detecWordHillary(String words)
	{
		int countright = 0;
		words=words.toLowerCase();
		words.equalsIgnoreCase(words);
		if (words.contains("hillary"))
		{
			countright++;
			System.out.println(words);
		}
		else
		{
			
		}
		return countright;
	}
	
	public static String[] readArrayForHillary(String file) {
		
		int ctr = 0;
		try {
			Scanner s1 = new Scanner(new File(file));
			while (s1.hasNextLine()) {
				ctr = ctr + 1;
				s1.nextLine();
			}
			
			String[] words = new String[ctr];
			
			Scanner s2 = new Scanner(new File(file));
			int numword=0;
			for (int i = 0; i < ctr; i = i+1) {
				words[i] = s2.nextLine();
				numword = numword+detecWordHillary(words[i]);
			}
		
			System.out.println("\nNumber of times Hillary:"+numword);
			s2.close();
			return words;
		}
		catch (FileNotFoundException e) {
		System.out.println("Was unable to find file");
			}
		return null;
	}

	public static int detecWordTrump(String words)
	{
		int countright = 0;
		words=words.toLowerCase();
		words.equalsIgnoreCase(words);
		if (words.contains("trump"))
		{
			countright++;
			System.out.println(words);
		}
		else
		{
			
		}
		return countright;
	}
	
	public static String[] readArrayForTrump(String file) {
		
		int ctr = 0;
		try {
			Scanner s1 = new Scanner(new File(file));
			while (s1.hasNextLine()) {
				ctr = ctr + 1;
				s1.nextLine();
			}
			
			String[] words = new String[ctr];
			
			Scanner s2 = new Scanner(new File(file));
			int numword=0;
			for (int i = 0; i < ctr; i = i+1) {
				words[i] = s2.nextLine();
				numword = numword+detecWordTrump(words[i]);
			}
		
			System.out.println("\nNumber of times Trump:"+numword);
			s2.close();
			return words;
		}
		catch (FileNotFoundException e) {
		System.out.println("Was unable to find file");
			}
		return null;
	}

	public static int detecWordDaddy(String words)
	{
		int countright = 0;
		words=words.toLowerCase();
		words.equalsIgnoreCase(words);
		if (words.contains("daddy"))
		{
			countright++;
			System.out.println(words);
		}
		else
		{
			
		}
		return countright;
	}
	
	public static String[] readArrayForDaddy(String file) {
		
		int ctr = 0;
		try {
			Scanner s1 = new Scanner(new File(file));
			while (s1.hasNextLine()) {
				ctr = ctr + 1;
				s1.nextLine();
			}
			
			String[] words = new String[ctr];
			
			Scanner s2 = new Scanner(new File(file));
			int numword=0;
			for (int i = 0; i < ctr; i = i+1) {
				words[i] = s2.nextLine();
				numword = numword+detecWordDaddy(words[i]);
			}
		
			System.out.println("\nNumber of times Daddy:"+numword);
			s2.close();
			return words;
		}
		catch (FileNotFoundException e) {
		System.out.println("Was unable to find file");
			}
		return null;
	}

	public static int detecWordDeepState(String words)
	{
		int countright = 0;
		words=words.toLowerCase();
		words.equalsIgnoreCase(words);
		if (words.contains("deep state"))
		{
			countright++;
			System.out.println(words);
		}
		else
		{
			
		}
		return countright;
	}
	
	public static String[] readArrayForDeepState(String file) {
		
		int ctr = 0;
		try {
			Scanner s1 = new Scanner(new File(file));
			while (s1.hasNextLine()) {
				ctr = ctr + 1;
				s1.nextLine();
			}
			
			String[] words = new String[ctr];
			
			Scanner s2 = new Scanner(new File(file));
			int numword=0;
			for (int i = 0; i < ctr; i = i+1) {
				words[i] = s2.nextLine();
				numword = numword+detecWordDeepState(words[i]);
			}
		
			System.out.println("\nNumber of times Deep State:"+numword);
			s2.close();
			return words;
		}
		catch (FileNotFoundException e) {
		System.out.println("Was unable to find file");
			}
		return null;
	}

	public static int detecWordNazi(String words)
	{
		int countright = 0;
		words=words.toLowerCase();
		words.equalsIgnoreCase(words);
		if (words.contains("nazi"))
		{
			countright++;
			System.out.println(words);
		}
		else
		{
			
		}
		return countright;
	}
	
	public static String[] readArrayForNazi(String file) {
		
		int ctr = 0;
		try {
			Scanner s1 = new Scanner(new File(file));
			while (s1.hasNextLine()) {
				ctr = ctr + 1;
				s1.nextLine();
			}
			
			String[] words = new String[ctr];
			
			Scanner s2 = new Scanner(new File(file));
			int numword=0;
			for (int i = 0; i < ctr; i = i+1) {
				words[i] = s2.nextLine();
				numword = numword+detecWordNazi(words[i]);
			}
		
			System.out.println("\nNumber of times Nazi:"+numword);
			s2.close();
			return words;
		}
		catch (FileNotFoundException e) {
		System.out.println("Was unable to find file");
			}
		return null;
	}
	
	
	
	
	
	
}