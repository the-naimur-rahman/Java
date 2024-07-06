import javax.swing.JOptionPane;
public class GUI {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("What's your name?");
        String userName = JOptionPane.showInputDialog("What's your username?");
        int age = Integer.parseInt(JOptionPane.showInputDialog("What's your age?"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("What's your height"));

        JOptionPane.showMessageDialog(
        null,
        "You are " + name +
                "\nYour username is " + userName +
                "\nYour age is " + age +
                "\nYour height is " + height
        );
    }
}
