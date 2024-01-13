import javax.swing.*;
public class Main {
    // Press Shift twice to open the Search Everywhere dialog and type show whitespaces,
// then press Enter. You can now see whitespace characters in your code.
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        float percentage;
        percentage= Float.parseFloat(JOptionPane.showInputDialog(null,"Enter your percentage"));

        if(percentage>=75){
            JOptionPane.showMessageDialog(null,"Qualify for interview");
        } else if (percentage<=75 && percentage>=60) {
            JOptionPane.showMessageDialog(null,"Qualify foe GD");
        }
        else{
            JOptionPane.showMessageDialog(null,"Not Qualify");
        }

    }
}

