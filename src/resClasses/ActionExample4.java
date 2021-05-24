package resClasses;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;

public class ActionExample4 extends JFrame {
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ActionExample4 frame = new ActionExample4();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public ActionExample4() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 778, 426);
        getContentPane().setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 101, 742, 276);
        //scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        getContentPane().add(scrollPane);

        JPanel borderlaoutpanel = new JPanel();
        scrollPane.setViewportView(borderlaoutpanel);
        borderlaoutpanel.setLayout(new BorderLayout(0, 0));

        JPanel columnpanel = new JPanel();
        borderlaoutpanel.add(columnpanel, BorderLayout.NORTH);
        columnpanel.setLayout(new GridLayout(0, 1, 0, 1));
        columnpanel.setBackground(Color.gray);

        for(int i=0;i<32;i++) {
            JPanel rowPanel = new JPanel();
            rowPanel.setPreferredSize(new Dimension(300,30));
            columnpanel.add(rowPanel);
            rowPanel.setLayout(null);

            JButton button = new JButton("New button");
            button.setBounds(20, 5, 89, 23);
            rowPanel.add(button);

            if(i%2==0)
                rowPanel.setBackground(SystemColor.inactiveCaptionBorder);
        }
    }
}