import java.util.Scanner;
public class Narrative {

	static Scanner input = new Scanner(System.in);
	static String file = null;
	
public static void IntroPosts(String[] args) {
		int option = 3;
		int cntr = 0;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		System.out.println(" Hello, my name is Reddit Bot - Trump edition and I wll be helping you learn to spot patterns within a data set."
				+ "\nWhile looking at the data presented to you, "
				+ "\nkeep in mind interesting patterns and similarities that you see.");
		while (cntr < 1) {
			System.out.println("Before we start looking at the data, can you let me know if you would rather read from posts or comments?"
					+ "\n(enter posts or comments)");
			String data = input.nextLine();
			if (data.equalsIgnoreCase("posts")) {
				file = "redditPosts";
				cntr ++;
			}
			else if(data.equalsIgnoreCase("comments")) {
				file = "Comment";
				cntr ++;
			}
			else {
				System.out.println("Didnt get that.");
			}
			
		}
		System.out.println("\nAlright with that out of the way, we can now get down to the fun part, analyzing data (Yay)."
				+ "\nSo when looking at the data there are many diffrenet key words and phrases that can be find in multiple places."
				+ "\nLets start with looking at some interesting words and phrases I personally found in the data." );
		cntr=0;
	while (cntr < 3 ){
		if ( num1 == 0 && num2 == 0 && num3 == 0) {
			System.out.println("Choose number 1, 2, or 3!(Type 1, 2, or 3)");
			option = input.nextInt();
				
				if (option == 1) {
					System.out.println("You have selected Nazi Pepe");
					try        
					{
					    Thread.sleep(1000);
					} 
					catch(InterruptedException ex) 
					{
					    Thread.currentThread().interrupt();
					}
					String[] words = FileReader.readArrayForPepe(file);
					cntr ++;
					num1 ++;
					System.out.println("\nPoor Pepe, what has he done wrong :(");
				} 
				else if (option == 2) {
					System.out.println("You have selected Fake News");
					try        
					{
					    Thread.sleep(1000);
					} 
					catch(InterruptedException ex) 
					{
					    Thread.currentThread().interrupt();
					}
					String[] words = FileReader.readArrayForFake(file);
					cntr ++;
					num2 ++;
					System.out.println("\nBy now everything we hear is basically fake news.");
				} 
				else if (option == 3) {
					System.out.println("You have selected Aliens");
					try        
					{
					    Thread.sleep(1000);
					} 
					catch(InterruptedException ex) 
					{
					    Thread.currentThread().interrupt();
					}
					String[] words = FileReader.readArrayForAliens(file);
					cntr ++;
					num3 ++;
					System.out.println("\nThis is not a sci-fi reddit, but there are a lot of mentions about aliens.");
				} 
				else {
					System.out.println("Choose another selection.");
				}
				
				
			}
		if ( num1 == 1 && num2 == 0 && num3 == 0) {
			System.out.println("Choose number 1, 2, or 3!");
			option = input.nextInt();
			
			 if (option == 2) {
				 System.out.println("You have selected Fake News");
					try        
					{
					    Thread.sleep(1000);
					} 
					catch(InterruptedException ex) 
					{
					    Thread.currentThread().interrupt();
					}
					String[] words = FileReader.readArrayForFake(file);
					cntr ++;
					num2 ++;
					System.out.println("\nBy now everything we hear is basically fake news.");
				} 
			else if (option == 3) {
				System.out.println("You have selected Aliens");
				try        
				{
				    Thread.sleep(1000);
				} 
				catch(InterruptedException ex) 
				{
				    Thread.currentThread().interrupt();
				}
				String[] words = FileReader.readArrayForAliens(file);
				cntr ++;
				num3 ++;
				System.out.println("\nThis is not a sci-fi reddit, but there are a lot of mentions about aliens.");

				} 
				else {
					System.out.println("Choose another selection.");
				}
		}
		
		if ( num1 == 0 && num2 == 1 && num3 == 0) {
			System.out.println("Choose number 1, 2, or 3!");
			option = input.nextInt();
				
			 if (option == 1) {
				 System.out.println("You have selected Nazi Pepe");
					try        
					{
					    Thread.sleep(1000);
					} 
					catch(InterruptedException ex) 
					{
					    Thread.currentThread().interrupt();
					}
					String[] words = FileReader.readArrayForPepe(file);
					cntr ++;
					num1 ++;
					System.out.println("\nPoor Pepe, what has he done wrong :(");
				} 
				 
			else if (option == 3) {
				System.out.println("You have selected Aliens");
				try        
				{
				    Thread.sleep(1000);
				} 
				catch(InterruptedException ex) 
				{
				    Thread.currentThread().interrupt();
				}
				String[] words = FileReader.readArrayForAliens(file);
				cntr ++;
				num3 ++;
				System.out.println("\nThis is not a sci-fi reddit, but there are a lot of mentions about aliens.");

				} 
				else {
					System.out.println("Choose another selection.");
				}
		}
		
				if ( num1 == 0 && num2 == 0 && num3 == 1) {
					System.out.println("Choose number 1, 2, or 3!");
					option = input.nextInt();
						
						if (option == 1) {
							System.out.println("You have selected Nazi Pepe");
							try        
							{
							    Thread.sleep(1000);
							} 
							catch(InterruptedException ex) 
							{
							    Thread.currentThread().interrupt();
							}
							String[] words = FileReader.readArrayForPepe(file);
							cntr ++;
							num1 ++;
							System.out.println("\nPoor Pepe, what has he done wrong :(");
						} 
						else if (option == 2) {
							System.out.println("You have selected Fake News");
							try        
							{
							    Thread.sleep(1000);
							} 
							catch(InterruptedException ex) 
							{
							    Thread.currentThread().interrupt();
							}
							String[] words = FileReader.readArrayForFake(file);
							cntr ++;
							num2 ++;
							System.out.println("\nBy now everything we hear is basically fake news.");
						} 
						else {
							System.out.println("Choose another selection.");
						}
				}
						
				if ( num1 == 1 && num2 == 1 && num3 == 0) {
						System.out.println("Choose number 1, 2, or 3!");
						option = input.nextInt();
								
							if (option == 3) {
								System.out.println("You have selected Aliens");
								try        
								{
									 Thread.sleep(1000);
								} 
								catch(InterruptedException ex) 
								{
									 Thread.currentThread().interrupt();
								}
								String[] words = FileReader.readArrayForAliens(file);
								cntr ++;
								num3 ++;
								System.out.println("\nThis is not a sci-fi reddit, but there are a lot of mentions about aliens.");

							} 
							else {
								System.out.println("Choose another selection.");
							}
					}
					if ( num1 == 0 && num2 == 1 && num3 == 1) {
							System.out.println("Choose number 1, 2, or 3!");
							option = input.nextInt();
										
							if (option == 1) {
									System.out.println("You have selected Nazi Pepe");
									try        
									{
										 Thread.sleep(1000);
									} 
									catch(InterruptedException ex) 
									{
									    Thread.currentThread().interrupt();
									}
									String[] words = FileReader.readArrayForPepe(file);
									cntr ++;
									num1 ++;
									System.out.println("\nPoor Pepe, what has he done wrong :(");
									} 
										
								else {
									System.out.println("Choose another selection.");
								}
							}
										
					if ( num1 == 1 && num2 == 0 && num3 == 1) {
							System.out.println("Choose number 1, 2, or 3!");
							option = input.nextInt();
											
									if (option == 2) {
										System.out.println("You have selected Fake News");
										try        
										{
											Thread.sleep(1000);
											} 
										catch(InterruptedException ex) 
										{
										    Thread.currentThread().interrupt();
											}
											String[] words = FileReader.readArrayForFake(file);
											cntr ++;
											num2 ++;
											System.out.println("\nBy now everything we hear is basically fake news.");
											} 
												
										else {
											System.out.println("Choose another selection.");
										}
								}
					}
	System.out.println("\nAfter seeing the results of these few words we can already see a pattern within the responses where statements are repeated multiple times."
			+ "\nThis shows that not all users posting and commenting in the reddit forums are exactly human."
			+ "\nThe reason for these repeats in posts are due to bots that are spamming the sub reddit's."
			+ "\nThese bots are created in order to help spread a certain message or get people to rallie to their cause."
			+ "\n...");
			option =0;
			cntr = 0;
			num1 = 0;
			num2 = 0;
			num3 = 0;
	
			}

public static void SecondPosts(String[] args) {
	int option = 3;
	int cntr = 0;
	int num1 = 0;
	int num2 = 0;
	int num3 = 0;
	try        
	{
	    Thread.sleep(20000);
	} 
	catch(InterruptedException ex) 
	{
	    Thread.currentThread().interrupt();
	}
	System.out.println("\nNow that we have seen a few patterns within in the data set let us now do a little guessing game."
			+ "Which presidential canidates name is repeated the most?");

while (cntr < 3 ){
	if ( num1 == 0 && num2 == 0 && num3 == 0) {
		System.out.println("Choose number Bernie(1), Hillary(2), or Trump(3)!(Type 1, 2, or 3)");
		option = input.nextInt();
			
			if (option == 1) {
				System.out.println("You have selected Bernie");
				try        
				{
				    Thread.sleep(1000);
				} 
				catch(InterruptedException ex) 
				{
				    Thread.currentThread().interrupt();
				}
				String[] words = FileReader.readArrayForBernie(file);
				cntr ++;
				num1 ++;
				System.out.println("\nSadly this section of Redddit was not feeling the burn this time :(");
			} 
			else if (option == 2) {
				System.out.println("You have selected Hillary");
				try        
				{
				    Thread.sleep(1000);
				} 
				catch(InterruptedException ex) 
				{
				    Thread.currentThread().interrupt();
				}
				String[] words = FileReader.readArrayForHillary(file);
				cntr ++;
				num2 ++;
				System.out.println("\nClose, but can not beat the main topic of this reddit thread.");
			} 
			else if (option == 3) {
				System.out.println("You have selected Trump");
				try        
				{
				    Thread.sleep(1000);
				} 
				catch(InterruptedException ex) 
				{
				    Thread.currentThread().interrupt();
				}
				String[] words = FileReader.readArrayForTrump(file);
				cntr ++;
				num3 ++;
				System.out.println("\nShocker, the name of this reddit thread is also the most used name.");
			} 
			else {
				System.out.println("Choose another selection.");
			}
			
			
		}
	if ( num1 == 1 && num2 == 0 && num3 == 0) {
		System.out.println("Choose number Bernie(1), Hillary(2), or Trump(3)!(Type 1, 2, or 3)");
		option = input.nextInt();
		
		 if (option == 2) {
			 System.out.println("You have selected Hillary");
				try        
				{
				    Thread.sleep(1000);
				} 
				catch(InterruptedException ex) 
				{
				    Thread.currentThread().interrupt();
				}
				String[] words = FileReader.readArrayForHillary(file);
				cntr ++;
				num2 ++;
				System.out.println("\nClose, but can not beat the main topic of this reddit thread.");
			} 
		else if (option == 3) {
			System.out.println("You have selected Trump");
			try        
			{
			    Thread.sleep(1000);
			} 
			catch(InterruptedException ex) 
			{
			    Thread.currentThread().interrupt();
			}
			String[] words = FileReader.readArrayForTrump(file);
			cntr ++;
			num3 ++;
			System.out.println("\nShocker, the name of this reddit thread is also the most used name.");

			} 
			else {
				System.out.println("Choose another selection.");
			}
	}
	
	if ( num1 == 0 && num2 == 1 && num3 == 0) {
		System.out.println("Choose number Bernie(1), Hillary(2), or Trump(3)!(Type 1, 2, or 3)");
		option = input.nextInt();
			
		 if (option == 1) {
			 System.out.println("You have selected Bernie");
				try        
				{
				    Thread.sleep(1000);
				} 
				catch(InterruptedException ex) 
				{
				    Thread.currentThread().interrupt();
				}
				String[] words = FileReader.readArrayForBernie(file);
				cntr ++;
				num1 ++;
				System.out.println("\nSadly this section of Redddit was not feeling the burn this time :(");
			} 
			 
		else if (option == 3) {
			System.out.println("You have selected Trump");
			try        
			{
			    Thread.sleep(1000);
			} 
			catch(InterruptedException ex) 
			{
			    Thread.currentThread().interrupt();
			}
			String[] words = FileReader.readArrayForTrump(file);
			cntr ++;
			num3 ++;
			System.out.println("\nShocker, the name of this reddit thread is also the most used name.");

			} 
			else {
				System.out.println("Choose another selection.");
			}
	}
	
			if ( num1 == 0 && num2 == 0 && num3 == 1) {
				System.out.println("Choose number Bernie(1), Hillary(2), or Trump(3)!(Type 1, 2, or 3)");
				option = input.nextInt();
					
					if (option == 1) {
						System.out.println("You have selected Bernie");
						try        
						{
						    Thread.sleep(1000);
						} 
						catch(InterruptedException ex) 
						{
						    Thread.currentThread().interrupt();
						}
						String[] words = FileReader.readArrayForBernie(file);
						cntr ++;
						num1 ++;
						System.out.println("\nSadly this section of Redddit was not feeling the burn this time :(");
					} 
					else if (option == 2) {
						System.out.println("You have selected Hillary");
						try        
						{
						    Thread.sleep(1000);
						} 
						catch(InterruptedException ex) 
						{
						    Thread.currentThread().interrupt();
						}
						String[] words = FileReader.readArrayForHillary(file);
						cntr ++;
						num2 ++;
						System.out.println("\nClose, but can not beat the main topic of this reddit thread.");
					} 
					else {
						System.out.println("Choose another selection.");
					}
			}
					
			if ( num1 == 1 && num2 == 1 && num3 == 0) {
				System.out.println("Choose number Bernie(1), Hillary(2), or Trump(3)!(Type 1, 2, or 3)");
					option = input.nextInt();
							
						if (option == 3) {
							System.out.println("You have selected Trump");
							try        
							{
							    Thread.sleep(1000);
							} 
							catch(InterruptedException ex) 
							{
							    Thread.currentThread().interrupt();
							}
							String[] words = FileReader.readArrayForTrump(file);
							cntr ++;
							num3 ++;
							System.out.println("\nShocker, the name of this reddit thread is also the most used name.");

						} 
						else {
							System.out.println("Choose another selection.");
						}
				}
				if ( num1 == 0 && num2 == 1 && num3 == 1) {
					System.out.println("Choose number Bernie(1), Hillary(2), or Trump(3)!(Type 1, 2, or 3)");
						option = input.nextInt();
									
						if (option == 1) {
							System.out.println("You have selected Bernie");
							try        
							{
							    Thread.sleep(1000);
							} 
							catch(InterruptedException ex) 
							{
							    Thread.currentThread().interrupt();
							}
							String[] words = FileReader.readArrayForBernie(file);
							cntr ++;
							num1 ++;
							System.out.println("\nSadly this section of Redddit was not feeling the burn this time :(");
								} 
									
							else {
								System.out.println("Choose another selection.");
							}
						}
									
				if ( num1 == 1 && num2 == 0 && num3 == 1) {
					System.out.println("Choose number Bernie(1), Hillary(2), or Trump(3)!(Type 1, 2, or 3)");
						option = input.nextInt();
										
								if (option == 2) {
									System.out.println("You have selected Hillary");
									try        
									{
									    Thread.sleep(1000);
									} 
									catch(InterruptedException ex) 
									{
									    Thread.currentThread().interrupt();
									}
									String[] words = FileReader.readArrayForHillary(file);
									cntr ++;
									num2 ++;
									System.out.println("\nClose, but can not beat the main topic of this reddit thread.");
								}
											
									else {
										System.out.println("Choose another selection.");
									}
							}
					}
		System.out.println("\nJust like when we were looking at the funnier keywords and phrases,"
				+ "\nyou can see that within the data for the presidential canidates there are sentences that are repeating two or more times."
				+ "\nSome of these sentences can just be a person spamming, "
				+ "\nbut most likley these are bot spams."
				+ "\nThough bots spamming is not entirely bad, it can mislead people and annoy others."
				+ "\nI hope you were able to learn more about analzing data from this short program, "
				+ "\nand next time you are on a sub reddit you are able to spot out patterns within it."
				+ "\n(Wait for it)");
		option =0;
		cntr = 0;
		num1 = 0;
		num2 = 0;
		num3 = 0;
	}

public static void FinalPosts(String[] args) {
	int option = 3;
	int cntr = 0;
	int num1 = 0;
	int num2 = 0;
	int num3 = 0;	
	
	try        
	{
	    Thread.sleep(20000);
	} 
	catch(InterruptedException ex) 
	{
	    Thread.currentThread().interrupt();
	}
		System.out.println("\n"
					+ "\nBonus round: "
					+ "\nHere are some more weird words that I found in the data that were stated multiple times!");

		while (cntr < 3) {
			if ( num1 == 0 && num2 == 0 && num3 == 0) {
				System.out.println("Choose number 1, 2, or 3!(Type 1, 2, or 3)");
				option = input.nextInt();
					
					if (option == 1) {
						System.out.println("You have selected Daddy");
						try        
						{
						    Thread.sleep(1000);
						} 
						catch(InterruptedException ex) 
						{
						    Thread.currentThread().interrupt();
						}
						String[] words = FileReader.readArrayForDaddy(file);
						cntr ++;
						num1 ++;
						System.out.println("\nThis is honestly just wierd, but I guess some can see him as a father figure.");
					} 
					else if (option == 2) {
						System.out.println("You have selected Deep State");
						try        
						{
						    Thread.sleep(1000);
						} 
						catch(InterruptedException ex) 
						{
						    Thread.currentThread().interrupt();
						}
						String[] words = FileReader.readArrayForDeepState(file);
						cntr ++;
						num2 ++;
						System.out.println("\nNot suprising to find a couple of government conspirators in this reddit.");
					} 
					else if (option == 3) {
						System.out.println("You have selected Nazi");
						try        
						{
						    Thread.sleep(2000);
						} 
						catch(InterruptedException ex) 
						{
						    Thread.currentThread().interrupt();
						}
						String[] words = FileReader.readArrayForNazi(file);
						cntr ++;
						num3 ++;
						try        
						{
						    Thread.sleep(1000);
						} 
						catch(InterruptedException ex) 
						{
						    Thread.currentThread().interrupt();
						}
						System.out.println(".");
						try        
						{
						    Thread.sleep(2000);
						} 
						catch(InterruptedException ex) 
						{
						    Thread.currentThread().interrupt();
						}
						System.out.println(".");
						try        
						{
						    Thread.sleep(2000);
						} 
						catch(InterruptedException ex) 
						{
						    Thread.currentThread().interrupt();
						}
						System.out.println(".");
						try        
						{
						    Thread.sleep(2000);
						} 
						catch(InterruptedException ex) 
						{
						    Thread.currentThread().interrupt();
						}
						System.out.println("'Sigh'");
					} 
					else {
						System.out.println("Choose another selection.");
					}
					
					
				}
			if ( num1 == 1 && num2 == 0 && num3 == 0) {
				System.out.println("Choose number 1, 2, or 3!");
				option = input.nextInt();
				
				 if (option == 2) {
					 System.out.println("You have selected Deep State");
						try        
						{
						    Thread.sleep(1000);
						} 
						catch(InterruptedException ex) 
						{
						    Thread.currentThread().interrupt();
						}
						String[] words = FileReader.readArrayForDeepState(file);
						cntr ++;
						num2 ++;
						System.out.println("\nNot suprising to find a couple of government conspirators in this reddit.");
					} 
				else if (option == 3) {
					System.out.println("You have selected Nazi");
					try        
					{
					    Thread.sleep(2000);
					} 
					catch(InterruptedException ex) 
					{
					    Thread.currentThread().interrupt();
					}
					String[] words = FileReader.readArrayForNazi(file);
					cntr ++;
					num3 ++;
					try        
					{
					    Thread.sleep(2000);
					} 
					catch(InterruptedException ex) 
					{
					    Thread.currentThread().interrupt();
					}
					System.out.println(".");
					try        
					{
					    Thread.sleep(2000);
					} 
					catch(InterruptedException ex) 
					{
					    Thread.currentThread().interrupt();
					}
					System.out.println(".");
					try        
					{
					    Thread.sleep(2000);
					} 
					catch(InterruptedException ex) 
					{
					    Thread.currentThread().interrupt();
					}
					System.out.println(".");
					try        
					{
					    Thread.sleep(2000);
					} 
					catch(InterruptedException ex) 
					{
					    Thread.currentThread().interrupt();
					}
					System.out.println("'Sigh'");

					} 
					else {
						System.out.println("Choose another selection.");
					}
			}
			
			if ( num1 == 0 && num2 == 1 && num3 == 0) {
				System.out.println("Choose number 1, 2, or 3!");
				option = input.nextInt();
					
				 if (option == 1) {
					 System.out.println("You have selected Daddy");
						try        
						{
						    Thread.sleep(1000);
						} 
						catch(InterruptedException ex) 
						{
						    Thread.currentThread().interrupt();
						}
						String[] words = FileReader.readArrayForDaddy(file);
						cntr ++;
						num1 ++;
						System.out.println("\nThis is honestly just wierd, but I guess some can see him as a father figure.");
					} 
					 
				else if (option == 3) {
					System.out.println("You have selected Nazi");
					try        
					{
					    Thread.sleep(2000);
					} 
					catch(InterruptedException ex) 
					{
					    Thread.currentThread().interrupt();
					}
					String[] words = FileReader.readArrayForNazi(file);
					cntr ++;
					num3 ++;
					try        
					{
					    Thread.sleep(2000);
					} 
					catch(InterruptedException ex) 
					{
					    Thread.currentThread().interrupt();
					}
					System.out.println(".");
					try        
					{
					    Thread.sleep(2000);
					} 
					catch(InterruptedException ex) 
					{
					    Thread.currentThread().interrupt();
					}
					System.out.println(".");
					try        
					{
					    Thread.sleep(2000);
					} 
					catch(InterruptedException ex) 
					{
					    Thread.currentThread().interrupt();
					}
					System.out.println(".");
					try        
					{
					    Thread.sleep(2000);
					} 
					catch(InterruptedException ex) 
					{
					    Thread.currentThread().interrupt();
					}
					System.out.println("'Sigh'");

					} 
					else {
						System.out.println("Choose another selection.");
					}
			}
			
					if ( num1 == 0 && num2 == 0 && num3 == 1) {
						System.out.println("Choose number 1, 2, or 3!");
						option = input.nextInt();
							
							if (option == 1) {
								System.out.println("You have selected Daddy");
								try        
								{
								    Thread.sleep(1000);
								} 
								catch(InterruptedException ex) 
								{
								    Thread.currentThread().interrupt();
								}
								String[] words = FileReader.readArrayForDaddy(file);
								cntr ++;
								num1 ++;
								System.out.println("\nThis is honestly just wierd, but I guess some can see him as a father figure.");
							} 
							else if (option == 2) {
								System.out.println("You have selected Deep State");
								try        
								{
								    Thread.sleep(1000);
								} 
								catch(InterruptedException ex) 
								{
								    Thread.currentThread().interrupt();
								}
								String[] words = FileReader.readArrayForDeepState(file);
								cntr ++;
								num2 ++;
								System.out.println("\nNot suprising to find a couple of government conspirators in this reddit.");
							} 
							else {
								System.out.println("Choose another selection.");
							}
					}
							
					if ( num1 == 1 && num2 == 1 && num3 == 0) {
							System.out.println("Choose number 1, 2, or 3!");
							option = input.nextInt();
									
								if (option == 3) {
									System.out.println("You have selected Nazi");
									try        
									{
									    Thread.sleep(2000);
									} 
									catch(InterruptedException ex) 
									{
									    Thread.currentThread().interrupt();
									}
									String[] words = FileReader.readArrayForNazi(file);
									cntr ++;
									num3 ++;
									try        
									{
									    Thread.sleep(2000);
									} 
									catch(InterruptedException ex) 
									{
									    Thread.currentThread().interrupt();
									}
									System.out.println(".");
									try        
									{
									    Thread.sleep(2000);
									} 
									catch(InterruptedException ex) 
									{
									    Thread.currentThread().interrupt();
									}
									System.out.println(".");
									try        
									{
									    Thread.sleep(2000);
									} 
									catch(InterruptedException ex) 
									{
									    Thread.currentThread().interrupt();
									}
									System.out.println(".");
									try        
									{
									    Thread.sleep(2000);
									} 
									catch(InterruptedException ex) 
									{
									    Thread.currentThread().interrupt();
									}
									System.out.println("'Sigh'");

								} 
								else {
									System.out.println("Choose another selection.");
								}
						}
						if ( num1 == 0 && num2 == 1 && num3 == 1) {
								System.out.println("Choose number 1, 2, or 3!");
								option = input.nextInt();
											
								if (option == 1) {
									System.out.println("You have selected Daddy");
									try        
									{
									    Thread.sleep(1000);
									} 
									catch(InterruptedException ex) 
									{
									    Thread.currentThread().interrupt();
									}
									String[] words = FileReader.readArrayForDaddy(file);
									cntr ++;
									num1 ++;
									System.out.println("\nThis is honestly just wierd, but I guess some can see him as a father figure.");
										} 
											
									else {
										System.out.println("Choose another selection.");
									}
								}
											
						if ( num1 == 1 && num2 == 0 && num3 == 1) {
								System.out.println("Choose number 1, 2, or 3!");
								option = input.nextInt();
												
										if (option == 2) {
											System.out.println("You have selected Deep State");
											try        
											{
											    Thread.sleep(1000);
											} 
											catch(InterruptedException ex) 
											{
											    Thread.currentThread().interrupt();
											}
											String[] words = FileReader.readArrayForDeepState(file);
											cntr ++;
											num2 ++;
											System.out.println("\nNot suprising to find a couple of government conspirators in this reddit.");
										}
													
											else {
												System.out.println("Choose another selection.");
											}
									}
							}
		try        
		{
		    Thread.sleep(4000);
		} 
		catch(InterruptedException ex) 
		{
		    Thread.currentThread().interrupt();
		}
		System.out.println("Agian, thank you very much for spending time with me! "
				+ "\nIf you ever want to talk agian or see what the other data set has in store, just run me agian."
				+ "\n Have a good day"
				+ "\n~ 'Reddit Bot - Trump edition' Terminated ~");

}


}