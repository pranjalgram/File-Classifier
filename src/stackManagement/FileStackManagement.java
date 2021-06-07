package stackManagement;

import javax.swing.*;

public class FileStackManagement {
    public static void main(String[] args) {
        Stacker obj = new Stacker();
        obj.setTitle("Stacker");
        obj.setVisible(true);
        obj.setResizable(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
