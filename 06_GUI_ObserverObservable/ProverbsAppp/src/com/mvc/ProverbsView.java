package com.mvc;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;

public class ProverbsView extends JFrame implements UI{

    private JPanel panel;
    private JLabel label;
    private JButton button;

    public ProverbsView(){
        super("Proverbs Generator");

        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        add(panel);

        button = new JButton("Change Proverbs");
        panel.add(button);

        label = new JLabel();
        label.setText("Set a jemsus proverb ma'am");
        panel.add(label);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 300);
        setVisible(true);
    }

    public JLabel getLabel() {
        return label;
    }

    @Override
    public void setController(ProverbsController pc) {
        button.addActionListener(pc);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof ProverbsModel){
            label.setText((String) arg);
        }
    }
}
