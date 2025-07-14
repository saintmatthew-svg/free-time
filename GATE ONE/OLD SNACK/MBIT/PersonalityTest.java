import java.util.Scanner;
	public class PersonalityTest {
		public static void main(String... args) {
			Scanner input = new Scanner(System.in);
			int countA = 0;
			int countB = 0;
			
				System.out.println("	WHAT IS YOUR NAME:");
				String name = input.nextLine();
				
				//ONE
				
				System.out.println("SELECT (A) OR (B) ");
				System.out.println("EXTROVERTED E  VS  INTROVERTED I");
				
						System.out.println();
						
				System.out.println("A expand energy. enjoy groups.  ,      B. conserve energy. enjoy one-on-one.");
				String[] optionone = {"A. expand energy, enjoy groups.", "B. conserve energy, enjoy one-on-one."};
				String one = input.nextLine();
					
					while(!one.equalsIgnoreCase("A") && !one.equalsIgnoreCase("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A expand energy. enjoy groups.  ,      B. conserve energy. enjoy one-on-one.");
						one = input.nextLine(); 
					}
						
						System.out.println();
						
				System.out.println("A. more outgoing, think out loud.,       B. more reserved, enjoy think to yourself.");				
				String[] optionfive = {"A. more outgoing, think out loud.", "B. more reserved, enjoy think to yourself."};
				String five = input.nextLine();
					
					while(!five.equalsIgnoreCase("A") && !five.equalsIgnoreCase("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. more outgoing, think out loud.,       B. more reserved, enjoy think to yourself.");
						five = input.nextLine();
					}
						
						System.out.println();
					
				System.out.println("A. seek many task, public activities, interaction with other.      B. seek private, solitary activities with queit to concetrate");				
				String[] optionnine = {"A. seek many task, public activities, interaction with other.", "B. seek private, solitary activities with queit to concetrate"};
				String nine = input.nextLine();
					
					while(!nine.equalsIgnoreCase("A") && !nine.equalsIgnoreCase("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. seek many task, public activities, interaction with other.      B. seek private, solitary activities with queit to concetrate");
						nine = input.nextLine();
					}
					
						System.out.println();
																																									
				System.out.println("A. external, communicative, express yourself. , B. internal, reticent, keep to your self");	
				String[] optionthirteen = {"A. external, communicative, express yourself." , "B. internal, reticent, keep to your self"};
				String thirteen = input.nextLine();
					
					while(!thirteen.equalsIgnoreCase("A") && !thirteen.equalsIgnoreCase("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. external, communicative, express yourself. , B. internal, reticent, keep to your self");
						thirteen = input.nextLine();
					}
				
					System.out.println();
				
				System.out.println("A. active, initiate.,		B. reflective, deliberate");
				String[] optionseventeen = {"A. active, initiate.", "B. reflective, deliberate"};
				String seventeen = input.nextLine();
					
					while(!seventeen.equalsIgnoreCase("A") && !seventeen.equalsIgnoreCase("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. active, initiate.,		B. reflective, deliberate");
						seventeen = input.nextLine();
					}
				
					System.out.println();
				
				//TWO
				
				System.out.println("SENSING S  VS  INTUITIVE N");
				System.out.println("A. interpret literally,		B. look for meaning and possibilities");
				String[] optiontwo = {"A. interpret literally", "B. look for meaning and possibilities"};
				String two = input.nextLine();
					
					while(!two.equalsIgnoreCase("A") && !two.equalsIgnoreCase("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("SENSING S  VS  INTUITIVE N");
						System.out.println("A. interpret literally,		B. look for meaning and possibilities");
						two = input.nextLine();
					}
				
						System.out.println();
				
				System.out.println("A. practical, realistic, experiential. 		B. imaginative, innovative, theoretical");
				String[] optionsix = {"A. practical, realistic, experiential.", "B. imaginative, innovative, theoretical"};
				String six = input.nextLine();
					
					while(!six.equalsIgnoreCase("A") && !six.equalsIgnoreCase("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. practical, realistic, experiential. 		B. imaginative, innovative, theoretical");
						six = input.nextLine();
					}
					
						System.out.println();
						
				System.out.println("A. standard, usual, conventional.		B. different, novel, unique.");			
				String[] optionten = {"A. standard, usual, conventional.", "B. different, novel, unique."};
				String ten = input.nextLine();
					
					while(!ten.equalsIgnoreCase("A") && !ten.equalsIgnoreCase("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. standard, usual, conventional.		B. different, novel, unique.");
						ten = input.nextLine();
					}
				
						System.out.println();
						
				System.out.println("A. focus on here and now. 		B. look to the future global perspective, big picture");	
				String[] optionfourteen = {"A. focus on here and now.", "B. look to the future global perspective, big picture"};
				String fourteen = input.nextLine();
					
					while(!fourteen.equalsIgnoreCase("A") && !fourteen.equalsIgnoreCase("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. focus on here and now. 		B. look to the future global perspective, big picture");
						fourteen = input.nextLine();
					}
				
						System.out.println();
						
				System.out.println("A. facts, things, what is. 		B. ideas, dreams, what could be, philosophical");
				String[] optioneighteen = {"A. facts, things, what is.", "B. ideas, dreams, what could be, philosophical"};
				String eighteen = input.nextLine();
					
					while(!eighteen.equalsIgnoreCase("A") && !eighteen.equalsIgnoreCase("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. facts, things, what is. 		B. ideas, dreams, what could be, philosophical");
						eighteen = input.nextLine();
					}
				
						System.out.println();
	
				//THREE
				
				System.out.println("THINKING T  VS  FEELING F");
				System.out.println("A. logical, thinking, questioning.		B. empathetic, feeling, accommodating");
				String[] optionthree = {"A. logical, thinking, questioning.", "B. empathetic, feeling, accommodating"};
				String three = input.nextLine();
					
					while(!three.equalsIgnoreCase("A") && !three.equalsIgnoreCase("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("THINKING T  VS  FEELING F");
						System.out.println("A. logical, thinking, questioning.		B. empathetic, feeling, accommodating");
						three = input.nextLine();
					}
				
						System.out.println();
	
				System.out.println("A. candid, straight forward, frank.			B. tactful, kind, encouraging");
				String[] optionseven = {"A. candid, straight forward, frank.",  "B. tactful, kind, encouraging"};
				String seven = input.nextLine();
					
					while(!seven.equalsIgnoreCase("A") && !seven.equalsIgnoreCase("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. candid, straight forward, frank.			B. tactful, kind, encouraging");
						seven = input.nextLine();
					}
				
						System.out.println();
						
				System.out.println("A. firm, tend to criticize, hold the line.		B. gentle, tend to appriciate, conciliate");
				String[] optioneleven = {"A. firm, tend to criticize, hold the line.",  "B. gentle, tend to appriciate, conciliate"};
				String eleven = input.nextLine();
					
					while(!eleven.equalsIgnoreCase("A") && !eleven.equalsIgnoreCase("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. firm, tend to criticize, hold the line.		B. gentle, tend to appriciate, conciliate");
						eleven = input.nextLine();
					}
				
						System.out.println();
						
				System.out.println("A. tough-minded, just.		B. tender-hearted, merciful.");
				String[] optionfiveteen = {"A. tough-minded, just.", "B. tender-hearted, merciful."};	
				String fiveteen = input.nextLine();
					
					while(!fiveteen.equalsIgnoreCase("A") && !fiveteen.equalsIgnoreCase("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. tough-minded, just.		B. tender-hearted, merciful.");
						fiveteen = input.nextLine();
					}
				
						System.out.println();
						
				System.out.println("A. matter of fact, issue-oriented.		B. sensitive, people-oriented, commpationate.");
				String[] optionnineteen = {"A. matter of fact, issue-oriented.",	"B. sensitive, people-oriented, commpationate."};	
				String nineteen = input.nextLine();		
					
					while(!nineteen.equalsIgnoreCase("A") && !nineteen.equalsIgnoreCase("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. matter of fact, issue-oriented.		B. sensitive, people-oriented, commpationate.");
						nineteen = input.nextLine();
					}
				
						System.out.println();
						
				//FOUR

				System.out.println("JUDGING J  PERCEPTIVE P");
				System.out.println("A. organizd, orderly.		B. flexible, adaptable");
				String[] optionfour = {"A. organizd, orderly.", "B. flexible, adaptable"};
				String four = input.nextLine();	
					
					while(!four.equalsIgnoreCase("A") && !four.equalsIgnoreCase("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("JUDGING J  PERCEPTIVE P");
						System.out.println("A. organizd, orderly.		B. flexible, adaptable");
						four = input.nextLine();
					}
				
						System.out.println();
						
				System.out.println("A. plan, schedule.		B. unplanned, spontanious");
				String[] optioneight = {"A. plan, schedule.",	"B. unplanned, spontanious"};
				String eight = input.nextLine();
					
					while(!eight.equalsIgnoreCase("A") && !eight.equalsIgnoreCase("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. plan, schedule.		B. unplanned, spontanious");
						eight = input.nextLine();
					}
				
						System.out.println();
				
				System.out.println("A. regulated, structured.		B. easy-going, live and let live");
				String[] optiontwelve = {"A. regulated, structured.", "B. easy-going, live and let live"};	
				String twelve = input.nextLine();		
					
					while(!twelve.equalsIgnoreCase("A") && !twelve.equalsIgnoreCase("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. regulated, structured.		B. easy-going, live and let live");
						twelve = input.nextLine();
					}
					
						System.out.println();
				
				System.out.println("A. preparation, plan ahead.		B. go with the flow, adapt as we go");
				String[] optionsixteen = {"A. preparation, plan ahead.", "B. go with the flow, adapt as we go"};	
				String sixteen = input.nextLine();		
					
					while(!sixteen.equalsIgnoreCase("A") && !sixteen.equalsIgnoreCase("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. preparation, plan ahead.		B. go with the flow, adapt as we go");
						sixteen = input.nextLine();
					}
					
							System.out.println();
				
				System.out.println("A. control, govern.		B. latitude, freedom");
				String[] optiontwenty = {"A. control, govern.", "B. latitude, freedom"};	
				String twenty = input.nextLine();		
					
					while(!twenty.equalsIgnoreCase("A") && !twenty.equalsIgnoreCase("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. control, govern.		B. latitude, freedom");
						twenty = input.nextLine();
					}
					
							System.out.println();
				
				System.out.println("Hello" +" " +  name + " " + "you selected");
				
				//ONE
				
				if(one.equalsIgnoreCase("A")) {
						countA++;
						System.out.println(optionone[0]);
					} else if (one.equalsIgnoreCase("B")) {
						countB++;
						System.out.println(optionone[1]);
					}
					
				if(five.equalsIgnoreCase("A")) {
						countA++;
						System.out.println(optionfive[0]);
					} else if (five.equalsIgnoreCase("B")) {
						countB++;
						System.out.println(optionfive[1]);
					} 
				
				if(nine.equalsIgnoreCase("A")) {
						countA++;
						System.out.println(optionnine[0]);
					} else if (nine.equalsIgnoreCase("B")) {
						countB++;
						System.out.println(optionnine[1]);
					} 
					
				if(thirteen.equalsIgnoreCase("A")) {
						countA++;
						System.out.println(optionthirteen[0]);	
					}	else if (thirteen.equalsIgnoreCase("B")) {
						countB++;
						System.out.println(optionthirteen[1]);
					}
				
				if(seventeen.equalsIgnoreCase("A")) {
						countA++;
						System.out.println(optionseventeen[0]);
					} else if (seventeen.equalsIgnoreCase("B")) {
						countB++;
						System.out.println(optionseventeen[1]); 
					}
					
						System.out.println();
					
				//TWO
				
				if(two.equalsIgnoreCase("A")) {
						countA++;
						System.out.println(optiontwo[0]);
					} else if (two.equalsIgnoreCase("B")) {
						countB++;
						System.out.println(optiontwo[1]);	
					}
				
				if(six.equalsIgnoreCase("A")) {
						countA++;
						System.out.println(optionsix[0]);
					} else if (six.equalsIgnoreCase("B")) {
						countB++;
						System.out.println(optionsix[1]);
					}	
					
				if(ten.equalsIgnoreCase("A")) {
						countA++;
						System.out.println(optionten[0]);
					} else if (ten.equalsIgnoreCase("B")) {
						countB++;
						System.out.println(optionten[1]);
					}		
						
				if(fourteen.equalsIgnoreCase("A")) {
						countA++;
						System.out.println(optionfourteen[0]);
					} else if (fourteen.equalsIgnoreCase("B")) {
						countB++;
						System.out.println(optionfourteen[1]);	
					}
					
				if(eighteen.equalsIgnoreCase("A")) {
						countA++;
						System.out.println(optioneighteen[0]);
					} else if (eighteen.equalsIgnoreCase("B")) {
						countB++;
						System.out.println(optioneighteen[1]);
					}
					
							System.out.println();
					
				//THREE	
				
				if(three.equalsIgnoreCase("A")) {
						countA++;
						System.out.println(optionthree[0]);
					} else if (three.equalsIgnoreCase("B")) {
						countB++;
						System.out.println(optionthree[1]);
					}	
					
				if(seven.equalsIgnoreCase("A")) {
						countA++;
						System.out.println(optionseven[0]);
					} else if (seven.equalsIgnoreCase("B")) {
						countB++;
						System.out.println(optionseven[1]);
					}
					
				if(eleven.equalsIgnoreCase("A")) {
						countA++;
						System.out.println(optioneleven[0]);
					} else if (eleven.equalsIgnoreCase("B")) {
						countB++;
						System.out.println(optioneleven[1]);	
					}
					
				if(fiveteen.equalsIgnoreCase("A")) {
						countA++;
						System.out.println(optionfiveteen[0]);
					} else if (fiveteen.equalsIgnoreCase("B")) {
						countB++;
						System.out.println(optionfiveteen[1]);
					}
					
				if(nineteen.equalsIgnoreCase("A")) {
						countA++;
						System.out.println(optionnineteen[0]);
					} else if (nineteen.equalsIgnoreCase("B")) {
						countB++;
						System.out.println(optionnineteen[1]);
					}	
					
							System.out.println();
					
					//FOUR
					
				if(four.equalsIgnoreCase("A")) {
						countA++;
						System.out.println(optionfour[0]);
					} else if (four.equalsIgnoreCase("B")) {
						countB++;
						System.out.println(optionfour[1]);	
					}
					
				if(eight.equalsIgnoreCase("A")) {
						countA++;
						System.out.println(optioneight[0]);
					} else if (eight.equalsIgnoreCase("B")) {
						countB++;
						System.out.println(optioneight[1]);
					}	

				if(twelve.equalsIgnoreCase("A")) {
						countA++;
						System.out.println(optiontwelve[0]);
					} else if (twelve.equalsIgnoreCase("B")) {
						countB++;
						System.out.println(optiontwelve[1]);	
					}
					
				if(sixteen.equalsIgnoreCase("A")) {
						countA++;
						System.out.println(optionsixteen[0]);
					} else if (sixteen.equalsIgnoreCase("B")) {
						countB++;
						System.out.println(optionsixteen[1]);	
					}	
					
				if(twenty.equalsIgnoreCase("A")) {
						countA++;
						System.out.println(optiontwenty[0]);
					} else if (twenty.equalsIgnoreCase("B")) {
						countB++;
						System.out.println(optiontwenty[1]);	
					}	
					
							System.out.println();
					
				System.out.println("A came out :" + countA + " " + "times");
				System.out.println("B came out :" + countB + " " + "times");
		}
	}