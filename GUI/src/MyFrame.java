import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;

public class MyFrame extends JFrame{
    MyFrame(){
        this.setVisible(true);
        this.setSize(420, 420);
        this.setResizable(false);
        this.setTitle("MyFrame Title");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon image = new ImageIcon("C:\\Users\\iamnr\\Desktop\\Java\\GUI\\book.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(242, 204, 121));
    }
}
