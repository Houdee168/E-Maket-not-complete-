package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CategoryLabel implements MouseListener {
    static JLabel getCategoryLabel(String Name, Color backgroundColor, Color foregroundColor, int X, int Y){
        JLabel category = new JLabel(Name);
        category.setBounds(X, Y, 220, 110);
        category.setHorizontalAlignment(JLabel.CENTER);
        category.setFont(new Font("Arial", Font.PLAIN, 34));
        category.setForeground(foregroundColor);
        category.setOpaque(true);
        category.setBackground(backgroundColor);
        return category;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        JLabel label = (JLabel)e.getSource();
        System.out.println("gettext label: " + label.getText().toString());;
        JLayeredPane layeredPane = (JLayeredPane)((JLabel) e.getSource()).getParent();
        //Operation.search("", )
//        layeredPane.remove(((JLabel) e.getSource()).getParent());
//        layeredPane.add()
        System.out.println("second print: " + layeredPane.getClass());
        layeredPane.removeAll();
        layeredPane.repaint();
        layeredPane.revalidate();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
