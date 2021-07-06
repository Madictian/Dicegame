import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class game {
    ArrayList<Player> playersList;
    private int highestRoll = 0;
    private int roof = 0;


    public void roll(Player player){
        int roll = 0;
        int currentRoll = 0;

        while(roll < roof){
            Scanner scanner = new Scanner(System.in);
            if (scanner.nextInt() == 1){
                Random random = new Random();
                currentRoll = (random.nextInt(6)+1) + (random.nextInt(6 + 1)+1);
                System.out.println(currentRoll);
                roll += currentRoll;
            } else {
                if(roll > highestRoll){
                    highestRoll = roll;
                }
                break;
            }
        }
        player.setPoints(roll);

    }

    public int getHighestRoll() {
        return highestRoll;
    }

    public void setHighestRoll(int highestRoll) {
        this.highestRoll = highestRoll;
    }
    public int getRoof() {
        return roof;
    }

    public void setRoof(int roof) {
        this.roof = roof;
    }

}
