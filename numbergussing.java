import java.util.*;
class game {
    public int number;
    public int numberofgusses;
    public int guessnumber;

    public void setnumberofgusses(int numberofgusses) {
        this.numberofgusses=numberofgusses;
    }

    public int getnumberofgusses()
    {
        return numberofgusses;
    }

    game()
    {
        
            Random rand=new Random();
            this.number=rand.nextInt(100)+0;
            System.out.println(number);

        
    }
    void takeuserinput()
    {
        System.out.println("guess the number");
        Scanner sc=new Scanner(System.in);
        guessnumber=sc.nextInt();
    }


    boolean iscorrectnumber(){
        if(guessnumber==number){
            System.out.println("congratulation, u guess exactnumber");
            System.out.format("you guess the number in %d attempts",i);
            return true;
        }
        else if(guessnumber>number){
            System.out.println("too high");
            return true;
        }
        else if(guessnumber<number){
            System.out.println("tooo low");
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        game g = new game();
        int i=0;
        while(int i)
        {
        g.takeuserinput();
        g.iscorrectnumber();
        i++;   
    }}
}