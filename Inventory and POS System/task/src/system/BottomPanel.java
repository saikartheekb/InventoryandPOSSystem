package system;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class BottomPanel extends JPanel {
    public JButton submitButton = new JButton();
    public JLabel messageLabel = new JLabel();

    BottomPanel(ActionListener sumitButtonClickedEvent){
        setBorder(new EmptyBorder(20, 0, 20, 0));
        setBackground(new Color(229, 229, 229));
        setName("BottomPanel");
        GridBagLayout gbl_bottomPanel = new GridBagLayout();
        gbl_bottomPanel.columnWidths = new int[] {46};
        gbl_bottomPanel.rowHeights = new int[] {30};
        gbl_bottomPanel.columnWeights = new double[]{0.0};
        gbl_bottomPanel.rowWeights = new double[]{0.0, 0.0};
        setLayout(gbl_bottomPanel);

        submitButton.setEnabled(false);
        submitButton.setText("Submit");
        submitButton.setBackground(Color.LIGHT_GRAY);
        submitButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        submitButton.setName("SubmitButton");
        submitButton.setForeground(Color.DARK_GRAY);
        GridBagConstraints gbc_submitButton = new GridBagConstraints();
        gbc_submitButton.insets = new Insets(0, 0, 5, 5);
        gbc_submitButton.gridx = 0;
        gbc_submitButton.gridy = 0;
        add(submitButton, gbc_submitButton);
        submitButton.addActionListener(sumitButtonClickedEvent);

        messageLabel.setName("MessageLabel");
        messageLabel.setVisible(false);
        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label = new GridBagConstraints();
        gbc_label.insets = new Insets(0, 0, 0, 5);
        gbc_label.gridx = 0;
        gbc_label.gridy = 1;
        add(messageLabel, gbc_label);
    }
}
