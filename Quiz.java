/*
 * A Java class created by Sonu.
 * If you don't know JAVA, then please stay far from it.
 * If you love Computer Science and JAVA, then YOU ARE WELCOME friend !!
 */
/**
 *
 * @author Sonu
 */
import java.io.*;
public class Quiz {
    public static void main(String[] args)throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        //ques[] is the array that holds both the questions and answers
        
        
        String ques[] = {"What is the capital city of india ?\n [A]Delhi [B]New Delhi "
                + "[C] Mumbai", 
        "Which city s called the commercial capital of India ?\n [A]Mumbai [B]New Delhi "
                + "[C] Hyderabad",
        "Whose picture is seen on the Currency notes of India ?\n [A]Rabindranath"
                + " Tagore [B]Mahatma Gandhi "
                + "[C] Narendra Modi",
        "Where is TAJ MAHAL located ?\n [A]Agra [B]Chennai "
                + "[C] Kolkata",
        "Which city is called the 'Pink City Of India' ?\n [A]Arambagh [B]Ramagarh "
                + "[C] Jaipur",
        "Who won the first Noble Prize in literature from India ?\n [A]Netaji Subhas"
                + "Chandra Bose [B]Azam Shah "
                + "[C] Rabindranath Tagore",
        "Where is Eden Gardens located ?\n [A]Delhi [B]Kolkata "
                + "[C] Mathura",
        "Which of these islands belong to India ?\n [A]Greenland [B]Lakshwadeep "
                + "[C] Hawaii",
        "Where is Marina Beach located ?\n [A]Chennai [B]Gurgaon "
                + "[C] Delhi",
        "Where is India Gate located ?\n [A]Ahmedabad [B]New Delhi "
                + "[C] Mumbai",
        
        










        "Hockey is the national sport of which country ?\n [A]South Africa [B]India "
                + "[C] England",
        "Which team was the first to win the Cricket World Cup in 1975?\n"
                + "[A]West Indies [B]England "
                + "[C]Australia",
        "Which country has the most number of FIFA World Cup titles ?\n [A]Argentina "
                + "[B]Belgium "
                + "[C]Brazil",
        "'IPL',the world's most popular franchise cricket league is hosted is which country?\n"
                + "[A]India [B]Australia [C]New Zealand",
        "Which of these players is termed as the 'GOD OF CRICKET'?\n "
                + "[A]Sachin Tendulkar [B]MS Dhoni [C]AB de Villiers",
        "Which of these players is associated with Tennis ?\n"
                + "[A]Lionel Messi [B]Rafael Nadal [C]Mario Gonjalbez",
        "In which year, the Indian Cricket team became World Champions for the first time ?\n"
                + "[A]1983 [B]2007 [C]2011",
        "Anup Kumar is associated to which sport ?\n"
                + "[A]Hockey [B]Kabaddi [C]Cricket",
        "WWE stands for :- \n"
                + "[A]World Wide Entity [B]World Wrestling Entertainment"
                + " [C]World Web Entertainment",
        "Which of these countries has never won the Cricket World Cup?\n"
                + "[A]Zimbabwe [B]Sri Lanka [C]Pakistan",
        
        
        
        
        
        
        
        
        
        "Who invented Boolean Algebra ?\n "
                + "[A]James Gosling [B]George Boole [C]Ada Lovelace",
        "The C programming language was developed by whom?\n"
                + "[A]Mark Zuckerberg [B]M.Lisbon [C]Dennis Ritchie",
        "Which of these is not a Programming language?\n"
                + "[A]Kotlin [B]Microsoft Word [C]Java",
        "The first generation computers mainly consisted of:-\n"
                + "[A]Transistors [B]ICs [C]Vaccum tubes",
        "A Compueter performs all of its tasks dealing with 2 numbers, they are:-\n"
                + "[A]1 and 2 [B]0 and 1 [C]10 and 0",
        "Which of these computers is invented by IBM ?\n"
                + "[A]HP Pavalion [B]PARAM [C]Deep Blue",
        "Who is called 'The World's first Programmer' ?\n"
                + "[A]Edward Saverin [B]Madam Ada Lovelace [C]Michael Dawson",
        "The computers developed by Apple uses which of these OSs?\n"
                + "[A]Linux OS [B]Macintosh OS [C]Chrome OS",
        "Who invented HTML, the language of the web?\n"
                + "[A]Marcus H.T.M.L [B]Bill Gates [C]Tim Berners Lee",
        "WWW stands for:-\n"
                + "[A]World With Web [B]World Wide Web [C]World Wide Weather",
  
               };
        
        String ans[] = {"B","A","B","A","C","C","B","B","A","B",
                      "B","A","C","A","A","B","A","B","B","A",
                      "B","C","B","C","B","C","B","B","C","B"};
       
        
        String main_choice = "";
        
        do{
        
        System.out.println("Enter Player name :");
        String name = in.readLine();
        
        //topic is the topic chosen
        int topic;
        int correct = 0;
        int score = 0;
        String choice;
        
        //MENU
        
        System.out.println("___________QUIZ GAME___________");
        System.out.println("Choose your topic : ");
        System.out.println("1 - My India");
        System.out.println("2 - Sports");
        System.out.println("3 - Computer Science");
        
        //TOPIC BEING CHOSEN
        topic = Integer.parseInt(in.readLine());
        while(topic!=1 && topic!=2 && topic!=3)
        {
            topic = Integer.parseInt(in.readLine());
        }
        
        switch(topic)
        {
            case 1:
                for(int i=0; i<10; i++){
                
                    System.out.println(ques[i]);
                    choice = in.readLine().toUpperCase().substring(0);
                    
                    
                    while(!(choice.equalsIgnoreCase("A")) && !(choice.equalsIgnoreCase("B")) &&
                            !(choice.equalsIgnoreCase("C")))
                    {
                        choice = in.readLine().toUpperCase();
                        choice = choice.substring(0);
                    }
                    if(choice.equals(ans[i]))
                    {
                        correct += 1;
                        score += 5;
                    }
                    
                    
                }
            if(correct<=10 && correct>=7)
                System.out.println(name+", you were awesome in this quiz.. !!");
            else
                System.out.println(name+", you need development on Indian Knowledge !!");
            
            System.out.println("Player name : "+name);
            System.out.println("Your total score in this quiz : "+score);
            System.out.println("Answers correct : "+correct);
            
            break;
                
                
            case 2:
                for(int i=10; i<20; i++){
                
                    System.out.println(ques[i]);
                    choice = in.readLine().toUpperCase().substring(0);
                    
                    
                    while(!(choice.equalsIgnoreCase("A")) && !(choice.equalsIgnoreCase("B")) &&
                            !(choice.equalsIgnoreCase("C")))
                    {
                        choice = in.readLine().toUpperCase();
                        choice = choice.substring(0);
                    }
                    if(choice.equals(ans[i]))
                    {
                        correct += 1;
                        score += 5;
                    }
                    
                    
                }
            if(correct<=10 && correct>=7)
                System.out.println(name+", you were awesome in this quiz.. !!");
            else
                System.out.println(name+", you need development on Sports Knowledge !!");
            
            System.out.println("Player name : "+name);
            System.out.println("Your total score in this quiz : "+score);
            System.out.println("Answers correct : "+correct);
                
            break;
                
            case 3:
                for(int i=20; i<30; i++){
                    System.out.println(ques[i]);
                    choice = in.readLine().toUpperCase().substring(0);
                    
                    
                    while(!(choice.equalsIgnoreCase("A")) && !(choice.equalsIgnoreCase("B")) &&
                            !(choice.equalsIgnoreCase("C")))
                    {
                        choice = in.readLine().toUpperCase();
                        choice = choice.substring(0);
                    }
                    if(choice.equals(ans[i]))
                    {
                        correct += 1;
                        score += 5;
                    }
                    
                    
                }
            if(correct<=10 && correct>=7)
                System.out.println(name+", you were awesome in this quiz.. !!");
            else
                System.out.println(name+", you need development on Computer Science !!");
            
            System.out.println("Player name : "+name);
            System.out.println("Your total score in this quiz : "+score);
            System.out.println("Answers correct : "+correct);

           break;
                
          default:
              System.out.println("SOMETHING WENT WRONG !!!");
                
        }
                        
            System.out.println("Do you want to play again ?? [Y/N]");
            main_choice = in.readLine().substring(0).toLowerCase();
            
            while (!main_choice.equals("y") && !main_choice.equals("n"))
            {
                main_choice = in.readLine().substring(0).toLowerCase();
            }
        }while(main_choice.equals("Y") || main_choice.equals("y"));
        
    }
    
}
