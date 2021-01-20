import java.util.Random;

public class Wallet {
    Random ran = new Random();
    String randcharacters = "ABCDEFGHIJKJLMNOPQRSTUVWXYZ1234567890";
    public String createWallet(){
        StringBuffer randStr = new StringBuffer();
        for(int i=0; i < 20; i++){
            int number = ran.nextInt(30);
            char ch = randcharacters.charAt(number);
            randStr.append(ch);
        }
        return randStr.toString();
    }
    public String getWallet(){
        return randcharacters;
    }
}
