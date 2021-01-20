import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;
import javax.swing.*;
import java.awt.*;

public class Cheenie {
    public static void main(String args[]) throws LoginException {
        JDA jda = new JDABuilder(AccountType.BOT).setToken("token_here").build();
        Wallet chw = new Wallet();
        System.out.println(chw.createWallet());
        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon("C:\\Users\\jmorg\\Desktop\\CheenieCoin\\src\\coin.png");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("CheenieCoin 0.0.1");
        frame.setBounds(100,100,1000,500);
        frame.setIconImage(icon.getImage());
        frame.setResizable(false);
    }
}
