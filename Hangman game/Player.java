public class Player {

    public Player(String name){
        this.level =1;
        this.name=name;
        this.missed_letter=0;

    }
    public void reset()
    {
        this.missed_letter=0;
    }
    String name;
    int level;
    int missed_letter;
}
