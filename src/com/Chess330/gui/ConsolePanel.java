package com.Chess330.gui;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class ConsolePanel extends JPanel{

    private static final Dimension CHAT_PANEL_DIMENSION = new Dimension(600, 150);
    private final JTextArea jTextArea;

    public ConsolePanel() {
        super(new BorderLayout());
        this.jTextArea = new JTextArea("");
        add(this.jTextArea);
        setPreferredSize(CHAT_PANEL_DIMENSION);
        validate();
        setVisible(true);
    }

    public void redo() {
        validate();
    }
    
}