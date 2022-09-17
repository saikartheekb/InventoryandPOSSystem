package system;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class TopPanel extends JPanel {
    public ButtonGroup rbGroup;
    JRadioButton merlot;
    JRadioButton rose;
    JRadioButton sauvignon;

    TopPanel(ActionListener onRadioButtonClicked){
        setName("TopPanel");
        setBorder(new EmptyBorder(70, 20, 20, 20));
        setBackground(new Color(150, 0, 0));
        setLayout(new BorderLayout(20, 50));

        JLabel topInstruction = new JLabel("Select the type of wine: ");
        topInstruction.setForeground(new Color(154, 205, 50));
        topInstruction.setName("InstructionLabel");
        topInstruction.setFont(new Font("Tahoma", Font.BOLD, 14));
        topInstruction.setHorizontalAlignment(SwingConstants.CENTER);
        add(topInstruction, BorderLayout.NORTH);

        merlot = new JRadioButton("Merlot");
        merlot.setForeground(Color.BLACK);
        merlot.setHorizontalAlignment(SwingConstants.CENTER);
        merlot.setFont(new Font("Tahoma", Font.BOLD, 14));
        merlot.setName("MerlotButton");
        merlot.setBackground(new Color(150, 0, 0));
        add(merlot, BorderLayout.WEST);

        rose = new JRadioButton("Rose");
        rose.setForeground(Color.BLACK);
        rose.setFont(new Font("Tahoma", Font.BOLD, 14));
        rose.setName("RoseButton");
        rose.setBackground(new Color(150, 0, 0));
        rose.setHorizontalAlignment(SwingConstants.CENTER);
        add(rose, BorderLayout.CENTER);

        sauvignon = new JRadioButton("Sauvignon");
        sauvignon.setForeground(Color.BLACK);
        sauvignon.setFont(new Font("Tahoma", Font.BOLD, 14));
        sauvignon.setName("SauvignonButton");
        sauvignon.setBackground(new Color(150, 0, 0));
        sauvignon.setHorizontalAlignment(SwingConstants.CENTER);
        add(sauvignon, BorderLayout.EAST);

        // Adding a ButtonGroup so only one radio button is selected at a time
        rbGroup = new ButtonGroup();
        rbGroup.add(rose);
        rbGroup.add(sauvignon);
        rbGroup.add(merlot);


        // Actions Events:

        rose.addActionListener(onRadioButtonClicked);

        merlot.addActionListener(onRadioButtonClicked);

        sauvignon.addActionListener(onRadioButtonClicked);
    }
}
