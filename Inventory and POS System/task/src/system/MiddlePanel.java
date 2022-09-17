package system;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MiddlePanel extends JPanel {
    public JLabel successLabel = new JLabel();
    public JLabel selectInstruction = new JLabel();
    public JLabel casesLabel = new JLabel("cases");
    public JLabel supplierLabel = new JLabel("Supplier");
    public JComboBox supplier = new JComboBox();
    public JComboBox amount = new JComboBox();
    public JLabel purchaseLabel = new JLabel("Purchased Price: $");
    public JTextField purchasePrice = new JTextField();
    public JLabel messageLabel = new JLabel();

    MiddlePanel() {
        setName("MiddlePanel");
        setVisible(false);
        setBorder(new EmptyBorder(20, 20, 20, 20));
        setBackground(new Color(229, 229, 229));
        GridBagLayout gbl_midPanel = new GridBagLayout();
        gbl_midPanel.columnWidths = new int[]{202, 202, 202, 0};
        gbl_midPanel.rowHeights = new int[]{0, 0, 0, 27, 50, 27, 50, 27, 0};
        gbl_midPanel.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
        gbl_midPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        setLayout(gbl_midPanel);

        successLabel.setName("SuccessLabel");
        successLabel.setForeground(Color.GREEN);
        successLabel.setVisible(false);
        successLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
        gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_3.gridx = 1;
        gbc_lblNewLabel_3.gridy = 1;
        add(successLabel, gbc_lblNewLabel_3);

        selectInstruction.setName("InstructionLabel");
        selectInstruction.setFont(new Font("Tahoma", Font.BOLD, 11));
        selectInstruction.setHorizontalAlignment(SwingConstants.LEFT);
        GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
        gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel.insets = new Insets(0, 5, 5, 5);
        gbc_lblNewLabel.gridx = 0;
        gbc_lblNewLabel.gridy = 3;
        add(selectInstruction, gbc_lblNewLabel);

        amount.setName("AmountComboBox");
        amount.setModel(new DefaultComboBoxModel(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
        amount.setMaximumRowCount(5);
        amount.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        GridBagConstraints gbc_comboBox = new GridBagConstraints();
        gbc_comboBox.fill = GridBagConstraints.BOTH;
        gbc_comboBox.insets = new Insets(0, 0, 5, 5);
        gbc_comboBox.gridx = 1;
        gbc_comboBox.gridy = 3;
        add(amount, gbc_comboBox);

        casesLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        casesLabel.setHorizontalAlignment(SwingConstants.LEFT);
        GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
        gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_1.insets = new Insets(0, 10, 5, 0);
        gbc_lblNewLabel_1.gridx = 2;
        gbc_lblNewLabel_1.gridy = 3;
        add(casesLabel, gbc_lblNewLabel_1);

        supplierLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        supplierLabel.setHorizontalAlignment(SwingConstants.LEFT);
        GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
        gbc_lblNewLabel_2.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_2.insets = new Insets(0, 5, 5, 5);
        gbc_lblNewLabel_2.gridx = 0;
        gbc_lblNewLabel_2.gridy = 5;
        add(supplierLabel, gbc_lblNewLabel_2);

        supplier.setName("SupplierComboBox");
        supplier.setEditable(true);
        GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
        gbc_comboBox_1.fill = GridBagConstraints.BOTH;
        gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
        gbc_comboBox_1.gridx = 1;
        gbc_comboBox_1.gridy = 5;
        add(supplier, gbc_comboBox_1);

        purchaseLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        purchaseLabel.setHorizontalAlignment(SwingConstants.LEFT);
        GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
        gbc_lblNewLabel_4.fill = GridBagConstraints.BOTH;
        gbc_lblNewLabel_4.insets = new Insets(0, 5, 0, 5);
        gbc_lblNewLabel_4.gridx = 0;
        gbc_lblNewLabel_4.gridy = 7;
        add(purchaseLabel, gbc_lblNewLabel_4);

        purchasePrice.setName("PurchasedPriceTextField");
        GridBagConstraints gbc_textField = new GridBagConstraints();
        gbc_textField.fill = GridBagConstraints.BOTH;
        gbc_textField.insets = new Insets(0, 0, 0, 5);
        gbc_textField.gridx = 1;
        gbc_textField.gridy = 7;
        add(purchasePrice, gbc_textField);
        purchasePrice.setColumns(10);
    }
}
