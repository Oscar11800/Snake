import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame implements ActionListener {

    GamePanel gamePanel;
    JButton resetButton;
    GameFrame(){
        resetButton = new JButton();
        resetButton.setText("Restart");
        resetButton.setSize(100,50);
        resetButton.setLocation(100,100);
        resetButton.addActionListener(this);
        gamePanel = new GamePanel();

        this.add(resetButton);
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == resetButton){
            this.remove(gamePanel);
            gamePanel = new GamePanel();
            this.add(gamePanel);
            SwingUtilities.updateComponentTreeUI(this);
        }
    }
}
