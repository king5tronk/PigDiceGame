import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class JframeLayout extends JPanel implements ActionListener {

    private JButton enterButton1 = new JButton("Enter");

    private JPanel avatarContainer = new JPanel();
    private JPanel lifeContainerPlayer1 = new JPanel();
    private JPanel lifeContainerPlayer2 = new JPanel();
    private JButton gameRulesButton = new JButton("Fortsätt");

    private JButton avatar1Button = new JButton(new ImageIcon("src/tigerAvatar.png"));
    private JButton heartPNG1Player1 = new JButton(new ImageIcon("src/heartPNG.png"));
    private JButton heartPNG2Player1 = new JButton(new ImageIcon("src/heartPNG.png"));
    private JButton heartPNG3Player1 = new JButton(new ImageIcon("src/heartPNG.png"));
    private JButton heartPNG1Player2 = new JButton(new ImageIcon("src/heartPNG.png"));
    private JButton heartPNG2Player2 = new JButton(new ImageIcon("src/heartPNG.png"));
    private JButton heartPNG3Player2 = new JButton(new ImageIcon("src/heartPNG.png"));
    private JButton avatar2Button = new JButton(new ImageIcon("src/avatarFoxPic.png"));
    private JButton avatar3Button = new JButton(new ImageIcon("src/avatarPicRabb.png"));
    private JButton avatar4Button = new JButton(new ImageIcon("src/avatarPicSquir.png"));
    private JButton avatar5Button = new JButton(new ImageIcon("src/avatarRacoPic.png"));
    private JButton avatar6Button = new JButton(new ImageIcon("src/avatarPicEle.png"));

    private JButton avatarTextPlayer1 = new JButton(new ImageIcon("src/chooseAvatarPlayerOneText.jpg"));
    private JButton avatarTextPlayer2 = new JButton(new ImageIcon("src/chooseAvatarPlayerTwoText.jpg"));
    private JTextField userName1TextField = new JTextField(10);
    private JTextField userName2TextField = new JTextField(10);
    private JFrame frame = new JFrame("Dice Pig Game");
    private JPanel jpStartMeny;
    String test = userName1TextField.getText();
    private String player1Avatar = "";
    private String player2Avatar = "";
    private int spelareEttEllerTvå = 0;


    public JframeLayout() {

        StartMeny();

    }
    public void mainGame(){
        System.out.println(spelareEttEllerTvå);
        JLabel background3 = new JLabel(new ImageIcon(
                "src/gameWoodBackground.jpg"));
        frame.setContentPane(background3);
        if (spelareEttEllerTvå == 1) {
            spelareEttEllerTvå = 2;
            switch (player1Avatar) {
                case "TIGER":
                    frame.add(avatar1Button);
                    avatar1Button.setBounds(150,150,200,300);
                    avatar1Button.setEnabled(true);
                    avatar1Button.setOpaque(false);
                    avatar1Button.setBorderPainted(false);
                    avatar1Button.removeActionListener(this);
                    break;
                case "FOX":
                    frame.add(avatar2Button);
                    avatar2Button.setBounds(150,150,200,300);
                    avatar2Button.setEnabled(true);
                    avatar2Button.setOpaque(false);
                    avatar2Button.setBorderPainted(false);
                    avatar2Button.removeActionListener(this);
                    break;
                case "RABBIT":
                    frame.add(avatar3Button);
                    avatar3Button.setBounds(150,150,200,300);
                    avatar3Button.setEnabled(true);
                    avatar3Button.setOpaque(false);
                    avatar3Button.setBorderPainted(false);
                    avatar3Button.removeActionListener(this);
                    break;
                case "EKORRE":
                    frame.add(avatar4Button);
                    avatar4Button.setBounds(150,150,200,300);
                    avatar4Button.setEnabled(true);
                    avatar4Button.setOpaque(false);
                    avatar4Button.setBorderPainted(false);
                    avatar4Button.removeActionListener(this);
                    break;
                case "RACCOON":
                    frame.add(avatar5Button);
                    avatar5Button.setBounds(150,150,200,300);
                    avatar5Button.setEnabled(true);
                    avatar5Button.setOpaque(false);
                    avatar5Button.setBorderPainted(false);
                    avatar5Button.removeActionListener(this);
                    break;
                case "ELEPHANT":
                    frame.add(avatar6Button);
                    avatar6Button.setBounds(150,150,200,300);
                    avatar6Button.setEnabled(true);
                    avatar6Button.setOpaque(false);
                    avatar6Button.setBorderPainted(false);
                    avatar6Button.removeActionListener(this);
                    break;

            }
        }
        if (spelareEttEllerTvå == 2) {
            switch (player2Avatar) {
                case "TIGER":
                    frame.add(avatar1Button);
                    avatar1Button.setBounds(630,150,200,300);
                    avatar1Button.setEnabled(true);
                    avatar1Button.setOpaque(false);
                    avatar1Button.setBorderPainted(false);
                    avatar1Button.removeActionListener(this);
                    break;
                case "FOX":
                    frame.add(avatar2Button);
                    avatar2Button.setBounds(630,150,200,300);
                    avatar2Button.setEnabled(true);
                    avatar2Button.setOpaque(false);
                    avatar2Button.setBorderPainted(false);
                    avatar2Button.removeActionListener(this);
                    break;
                case "RABBIT":
                    frame.add(avatar3Button);
                    avatar3Button.setBounds(630,150,200,300);
                    avatar3Button.setEnabled(true);
                    avatar3Button.setOpaque(false);
                    avatar3Button.setBorderPainted(false);
                    avatar3Button.removeActionListener(this);
                    break;
                case "EKORRE":
                    frame.add(avatar4Button);
                    avatar4Button.setBounds(630,150,200,300);
                    avatar4Button.setEnabled(true);
                    avatar4Button.setOpaque(false);
                    avatar4Button.setBorderPainted(false);
                    avatar4Button.removeActionListener(this);
                    break;
                case "RACCOON":
                    frame.add(avatar5Button);
                    avatar5Button.setBounds(630,150,200,300);
                    avatar5Button.setEnabled(true);
                    avatar5Button.setOpaque(false);
                    avatar5Button.setBorderPainted(false);
                    avatar5Button.removeActionListener(this);
                    break;
                case "ELEPHANT":
                    frame.add(avatar6Button);
                    avatar6Button.setBounds(630,150,200,300);
                    avatar6Button.setEnabled(true);
                    avatar6Button.setOpaque(false);
                    avatar6Button.setBorderPainted(false);
                    avatar6Button.removeActionListener(this);
                    break;

            }
        }

        //Player 1 SetUP
        lifeContainerPlayer1.add(heartPNG1Player1);
        heartPNG1Player1.setBorderPainted(false);
        lifeContainerPlayer1.add(heartPNG2Player1);
        heartPNG2Player1.setBorderPainted(false);
        lifeContainerPlayer1.add(heartPNG3Player1);
        heartPNG3Player1.setBorderPainted(false);
        lifeContainerPlayer1.setOpaque(false);
        frame.add(lifeContainerPlayer1);
        lifeContainerPlayer1.setLayout(new GridLayout(1,3, 10,1));
        lifeContainerPlayer1.setBounds(100,480,300,80);

        //Player 2 Setup
        lifeContainerPlayer2.add(heartPNG1Player2);
        heartPNG1Player2.setBorderPainted(false);
        lifeContainerPlayer2.add(heartPNG2Player2);
        heartPNG2Player2.setBorderPainted(false);
        lifeContainerPlayer2.add(heartPNG3Player2);
        heartPNG3Player2.setBorderPainted(false);
        lifeContainerPlayer2.setOpaque(false);
        frame.add(lifeContainerPlayer2);
        lifeContainerPlayer2.setLayout(new GridLayout(1,3, 10,1));
        lifeContainerPlayer2.setBounds(580,480,300,80);

        gameRulesButton.setBounds(500,500,100,100);
        frame.remove(avatarTextPlayer2);
        frame.revalidate();
        frame.validate();
        frame.repaint();
        frame.pack();
    }
    public void chooseAvatar(){
        JLabel background2 = new JLabel(new ImageIcon(
                "src/avatarPic.png"));
        frame.setContentPane(background2);
        frame.add(avatarTextPlayer1).setBounds(370,40,310,100);
        avatarContainer.add(avatar1Button);
        avatar1Button.addActionListener(this);
        avatarContainer.add(avatar2Button);
        avatar2Button.addActionListener(this);
        avatarContainer.add(avatar3Button);
        avatar3Button.addActionListener(this);
        avatarContainer.add(avatar4Button);
        avatar4Button.addActionListener(this);
        avatarContainer.add(avatar5Button);
        avatar5Button.addActionListener(this);
        avatarContainer.add(avatar6Button);
        avatar6Button.addActionListener(this);
        avatarContainer.setLayout(new GridLayout(3,3));
        avatarContainer.setBounds(350, 150, 350 ,300);
        frame.add(avatarContainer);
        frame.revalidate();
        frame.repaint();
        frame.validate();
        frame.setVisible(true);
        frame.pack();

    }

    public void gameRules(){
        JLabel background4 = new JLabel(new ImageIcon(
                "src/gameRules.png"));
        frame.setContentPane(background4);
        gameRulesButton.setBounds(650,430,200,100);
        gameRulesButton.setVisible(true);
        gameRulesButton.addActionListener(this);
        frame.add(gameRulesButton);
        frame.repaint();
        frame.pack();
    }


    public void StartMeny() {
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        JLabel background = new JLabel(new ImageIcon(
                "src/login.jpg"));
        frame.setContentPane(background);
        frame.setPreferredSize(new Dimension(950, 600));
        frame.setResizable(false);
        frame.setVisible(true);
        userName1TextField.setBounds(365, 237 , 200, 30);
        userName2TextField.setBounds(365, 337 , 200, 30);
        frame.add(userName1TextField);
        frame.add(userName2TextField);
        enterButton1.setBounds(420, 380, 100 ,80);
        frame.add(enterButton1);
        enterButton1.addActionListener(this);
        frame.pack();
        paint(getGraphics());
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        try {

                if (e.getSource() == enterButton1) {
                    String playerOneName = userName1TextField.getText();
                    String playerTwoName = userName2TextField.getText();
                    Player playerOne = new Player(playerOneName, 0);
                    Player playerTwo = new Player(playerTwoName, 0);
                    System.out.println(playerOne);
                    System.out.println(playerTwo);
                    frame.remove(userName1TextField);
                    frame.remove(userName2TextField);
                    frame.remove(enterButton1);
                    frame.revalidate();
                    frame.repaint();
                    paint(getGraphics());
                    frame.pack();
                    chooseAvatar();
                }
                if (e.getSource() == avatar1Button){
                    if (spelareEttEllerTvå == 0) {
                        player1Avatar = "TIGER";
                        spelareEttEllerTvå++;
                    }else{
                        player2Avatar = "TIGER";
                        gameRules();
                        return;
                    }
                    System.out.println("Du valde Tiger");
                    avatar1Button.setEnabled(false);
                    frame.remove(avatarTextPlayer1);
                    frame.add(avatarTextPlayer2).setBounds(370,40,310,100);
                    frame.repaint();
            }
            if (e.getSource() == avatar2Button){
                if (spelareEttEllerTvå == 0) {
                    player1Avatar = "FOX";
                    spelareEttEllerTvå++;
                }else{
                    player2Avatar = "FOX";
                    gameRules();
                    return;
                }
                System.out.println("Du valde Räven");
                avatar2Button.setEnabled(false);
                frame.remove(avatarTextPlayer1);
                frame.add(avatarTextPlayer2).setBounds(370,40,310,100);
                frame.repaint();
            }
            if (e.getSource() == avatar3Button){
                if (spelareEttEllerTvå == 0) {
                    player1Avatar = "RABBIT";
                    spelareEttEllerTvå++;
                }else{
                    player2Avatar = "RABBIT";
                    gameRules();
                    return;
                }
                System.out.println("Du valde Kaninen");
                avatar3Button.setEnabled(false);
                frame.remove(avatarTextPlayer1);
                frame.add(avatarTextPlayer2).setBounds(370,40,310,100);
                frame.repaint();
            }
            if (e.getSource() == avatar4Button){
                if (spelareEttEllerTvå == 0) {
                    player1Avatar = "EKORRE";
                    spelareEttEllerTvå++;
                }else{
                    player2Avatar = "EKORRE";
                    gameRules();
                    return;
                }
                System.out.println("Du valde Ekoren");
                avatar4Button.setEnabled(false);
                frame.remove(avatarTextPlayer1);
                frame.add(avatarTextPlayer2).setBounds(370,40,310,100);
                frame.repaint();
            }
            if (e.getSource() == avatar5Button){
                if (spelareEttEllerTvå == 0) {
                    player1Avatar = "RACCOON";
                    spelareEttEllerTvå++;
                }else{
                    player2Avatar = "RACCOON";
                    gameRules();
                    return;
                }
                System.out.println("Du valde Tvättbjörnen");
                avatar5Button.setEnabled(false);
                frame.remove(avatarTextPlayer1);
                frame.add(avatarTextPlayer2).setBounds(370,40,310,100);
                frame.repaint();
            }
            if (e.getSource() == avatar6Button){
                if (spelareEttEllerTvå == 0) {
                    player1Avatar = "ELEPHANT";
                    spelareEttEllerTvå++;
                }else{
                    player2Avatar = "ELEPHANT";
                    gameRules();
                    return;
                }
                System.out.println("Du valde Elefanten");
                avatar6Button.setEnabled(false);
                frame.remove(avatarTextPlayer1);
                frame.add(avatarTextPlayer2).setBounds(370,40,310,100);
                frame.repaint();
            }
            if (e.getSource() == gameRulesButton){
                mainGame();
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}