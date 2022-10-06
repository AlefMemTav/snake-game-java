
package snake;

import javax.swing.JFrame;

/**
 *
 * @author Micro
 */
public class GameFrame extends JFrame{
    GameFrame(){
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("apple_icone.png")));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
