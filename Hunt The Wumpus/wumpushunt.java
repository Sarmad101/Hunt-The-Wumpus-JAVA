
package javaapplication1;
 
import java.util.*;
/**
 *
 * @author Sarmad
 */
public class wumpushunt {
    Scanner sc= new Scanner(System.in);
    String st=null;
    int score=1000;
    int agent=1;
    int shoot=5;
    int g1,p1,p2,p3,w,ag=1;
    int counter=1,exit=1,counter1=0;
    Random rd = new Random();
    String one="1",two="2",three="3",four="4",five="5",six="6",seven="7",eight="8",
            nine="9",ten="10",eleven="11",twelve="12",thirteen="13",fourteen="14",fifteen="15",sixteen="16";
    String[] strArray2 = {one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen,fifteen,sixteen}; 
    int pit,bat,pit2,pit3,gold;
   
    
    void gold(){
        gold=rd.nextInt(16);
      
        
    }
    void pit(){
        pit=rd.nextInt(16);
       
        pit2=rd.nextInt(16);
      
        pit3=rd.nextInt(16);
     
    }
    
    void bat(){
        bat=rd.nextInt(16);
       
    }
    void moveagent(){
        
       
        
       
            
            for(;;){
        System.out.println("You are at the cave number "+agent+" you can move left by pressing L, right by pressing R, up by pressing u, down by pressing d and for exit press E ");
        st= sc.nextLine();
        
        if(st.equals("U")|| st.equals("u")){
            if(agent>12){
                
            }else{
            agent+=4;
            score-=20;
            }
            break;
        }else if(st.equals("L") || st.equals("l")){
            if(agent==1 || agent==5 || agent==9 || agent==13){
                
            }else{
            agent-=1;
            score-=20;
            }
            break;
        }else if(st.equals("R") || st.equals("r")){
            if(agent==4|| agent==8||agent==12 ||agent==16){
                
            }else{
            agent+=1;
            score-=20;
            }
            break;
        }else if(st.equals("d") || st.equals("D")){
            if(agent<5){
                
            }else{
            agent-=4;
            score-=20;
            }
            break;
        }else if(st.equals("E") || st.equals("e")){
            exit();
            break;
        }else{
            System.out.println("Please select the specified input, thanks");
        }
        
        }
        
        
        
        
        if(agent<1){
            agent=1;
        }else if(agent>16){
            agent=16;
        }
        
        
    }
     void th(){
       
       
        
           pit();
        bat();
        while(true){
        if(pit==bat || bat==gold || gold==pit || gold==0 || pit==0 || pit3==0 ||pit2==0|| bat==0 
                || pit2==bat || pit3==bat || pit2==gold || pit3==gold || pit2==pit3 || pit==pit2 || pit==pit3
                ){
            pit();
            bat();
            if(gold==0){
                gold();
               
                       }   
            
                 }
        else{
            break;
            }
                   } 
        
        
         while(true){
             
            enviornment();
       
        moveagent();
        
        System.out.println("You moved at cave number "+agent);
        
        if(gold==agent){
            score=score+1000;
            System.out.println("You won! You grabbed the Gold You got "+score+" points!");break;
            
        }
        if(shoot>0){
        System.out.println("Wanna shoot ? for shoot press S otherwise press n");
        String shooter=sc.nextLine();
        if(shooter.equals("s")){
           if(agent==pit || agent==pit2 || agent==pit3 || agent==bat){
            
            
            if(agent==pit || agent==pit2 || agent==pit3){
                System.out.println("You shoot and a pit died"); 
            }
            if(agent==bat){
                System.out.println("You shoot and a wumpus died");
            }
           
          //  break;
            
        }
           
         shoot--;
         System.out.println("You have "+shoot+" remaining arrows");
         if(shoot==0){
             System.out.println("Your arrows have been ended! now survive technically!");
         }
        }else{
            if(agent==pit || agent==pit2 || agent==pit3 || agent==bat){
            
            System.out.println("Your agent died");
            if(agent==pit || agent==pit2 || agent==pit3){
                System.out.println("You fall into a pit"); 
            }
            if(agent==bat){
                System.out.println("Wumpus has eaten you");
            }
             score-=1000;
            break;
        }
           
        }
        
        
        }else{
            if(agent==pit || agent==pit2 || agent==pit3 || agent==bat){
            
            System.out.println("Your agent died");
            if(agent==pit || agent==pit2 || agent==pit3){
                System.out.println("You fall into a pit"); 
            }
            if(agent==bat){
                System.out.println("Wumpus has eaten you");
            }
            score-=1000;
            break;
        }
            
        }
        
        if(gold==agent){
            score=score+1000;
            System.out.println("You won! You grabbed the Gold");break;
        }
        
       
        
        
         }
        
    }
     void enviornment(){
         for (int i = 0; i < strArray2.length; i++) {
             g1=Integer.parseInt(strArray2[i]);
             p1=Integer.parseInt(strArray2[i]);
             p2=Integer.parseInt(strArray2[i]);
             p3=Integer.parseInt(strArray2[i]);
             w=Integer.parseInt(strArray2[i]);
             ag=Integer.parseInt(strArray2[i]);
             if(g1==gold){
                strArray2[i]="G";
             }
             if(p1==pit){
                strArray2[i]="P"; 
             }if(p2==pit2){
                 strArray2[i]="P";
             }if(p3==pit3){
                 strArray2[i]="P";
             }if(w==bat){
                 strArray2[i]="W";
             }if(ag==agent){
                 strArray2[i]="A";
             }
             if(strArray2[i].equals("A")||strArray2[i].equals("W")||strArray2[i].equals("G")||strArray2[i].equals("P")){
             }else{
                 strArray2[i]=" ";
             }
             
	
}
         System.out.println
        ("+-----|------|------|-------+\n" +
                
                
         "  "+strArray2[12]+"      "+strArray2[13]+"     "+strArray2[14]+"     "+strArray2[15]+"\n" +
         "+-----|------|------|-------+\n" +
                
         "  "+strArray2[8]+"       "+strArray2[9]+"      "+strArray2[10]+"     "+strArray2[11]+"\n" +
         "+-----|------|------|-------+\n" +
                 
         "  "+strArray2[4]+"       "+strArray2[5]+"     "+strArray2[6]+"       "+strArray2[7]+"\n" +
         "+-----|------|------|-------+\n" +
                 
         "  "+strArray2[0]+"       "+strArray2[1]+"      "+strArray2[2]+"       "+strArray2[3]+"\n" +
         "+-----|------|------|-------+");
         strArray2[0]=one;strArray2[1]=two;strArray2[2]=three;strArray2[3]=four;strArray2[4]=five;strArray2[5]=six;
         strArray2[6]=seven;strArray2[7]=eight;strArray2[8]=nine;strArray2[9]=ten;strArray2[10]=eleven;strArray2[11]=twelve;
         strArray2[12]=thirteen;strArray2[13]=fourteen;strArray2[14]=fifteen;strArray2[15]=sixteen;
         
         
     }
     void exit(){
         System.out.println("exited");
         System.exit(0);
     }
     void again(){
         st=null;
     
      agent=1;
    shoot=5;
    
     counter=1;exit=1;counter1=0;
    
    one="1";two="2";three="3";four="4";five="5";six="6";seven="7";eight="8";
            nine="9";ten="10";eleven="11";twelve="12";thirteen="13";fourteen="14";fifteen="15";sixteen="16";
     
    
     }
     public static void main(String  args[]){
         
     
         wumpushunt y= new wumpushunt();
        
        System.out.println("                    Hunt The Wumpus\n"+
                            "                    '''''''''''''''\n");
        System.out.println(""
+"       Welcome to the hunt the wumpus game! follow the below instructions\n" +
"       The world is a rectangular grid, and your agent knows this;\n" +
"       The agent will start from a random cave;\n" +
"       Your score will be 1000 after grabbing the gold;\n" +
"       Your agent does not know the dimensions and configuration of the environment;\n" +
"       Your agent has only 5 arrows left on each shoot the arrows decrease\n"+
"       A square may contain only one entity (e.g. pit, wumpus, gold).\n\n\n"
                + "");
        while(true){
        y.gold();
        y.th();
        if(y.score>0){
        System.out.println("Your points are "+y.score+" You can Play again ?, press p to play or any button to exit");
        String played=y.sc.nextLine();
        if(played.equals("p") || played.equals("P")){
            y.again();
           
        }else{
            System.out.println("Exited!, your score is "+y.score);
            
            break;
            
        }
        
        }else{
            System.out.println("Exited!, your score is 0");
            break;
            
        }
        }
        
     }
    
}
