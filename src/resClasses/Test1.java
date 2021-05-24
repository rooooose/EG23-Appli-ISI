package resClasses;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class Test1 {
    public static void main(String[] a) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                Container pane = frame.getContentPane();
                JPanel panel = new JPanel();
                JTextArea textArea = new JTextArea(2, 10);
                JScrollPane scrollPane = new JScrollPane(textArea);
                JScrollBar scrollBar = new JScrollBar();//new JScrollBar(SwingConstants.HORIZONTAL);
                scrollBar.setModel(scrollPane.getHorizontalScrollBar().getModel());
                panel.add(textArea);
                panel.add(scrollPane);

                JPanel internal = new JPanel();
                for(int i = 0; i < 20; ++i) {
                    internal.add(new JLabel("TEXT"));
                }
                scrollPane.setViewportView(internal);
                scrollPane.setPreferredSize(new Dimension(100, 100));
                panel.add(scrollBar);
                pane.add(panel);
                frame.pack();
                frame.setLocationRelativeTo(null);

                frame.setVisible(true);
            }
        });
    }
}