package system;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.util.Objects;

public class RootWindow extends JFrame {
    public final TopPanel topPanel;
    public final MiddlePanel midPanel;
    public final BottomPanel bottomPanel;
    private final JPanel contentPane;
    private String wineSelected;
    public RootWindow() {

        setTitle("Wine Merchant");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 770, 622);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(229, 229, 229));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout());

        topPanel = new TopPanel(this::radioButtonAction);
        contentPane.add(topPanel, BorderLayout.NORTH);

        midPanel = new MiddlePanel();
        contentPane.add(midPanel, BorderLayout.CENTER);

        bottomPanel = new BottomPanel(this::submitPurchase);
        contentPane.add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);

    }
    private void radioButtonAction(ActionEvent radioButtonClicked){
        wineSelected = getWineSelected();
        midPanel.setVisible(true);
        bottomPanel.submitButton.setEnabled(true);
        midPanel.successLabel.setVisible(false);
        bottomPanel.messageLabel.setVisible(false);
        midPanel.selectInstruction.setVisible(true);
        midPanel.selectInstruction.setText(String.format("Selected type:  %s", wineSelected));
        midPanel.casesLabel.setVisible(true);
        midPanel.supplierLabel.setVisible(true);
        midPanel.supplier.setVisible(true);
        midPanel.supplier.removeAllItems();
        midPanel.amount.setVisible(true);
        midPanel.purchaseLabel.setVisible(true);
        midPanel.purchasePrice.setVisible(true);
        midPanel.purchasePrice.setText("");
    }

    private void submitPurchase(ActionEvent submitButtonClickedEvent){
        String supplierBox;
        try {
            supplierBox = Objects.requireNonNull(midPanel.supplier.getSelectedItem()).toString();
        } catch (NullPointerException except){
            supplierBox = null;
        }
        String priceField = midPanel.purchasePrice.getText();
        int numberOfCases = Integer.parseInt((String) Objects.requireNonNull(midPanel.amount.getSelectedItem()));
        if (supplierBox != null && priceField != null &&
                supplierBox.matches("^[a-zA-Z]*$") && priceField.matches("[+-]?([0-9]*[.])?[0-9]+")) {

            midPanel.successLabel.setVisible(true);
            midPanel.messageLabel.setText(String.format("Added %d cases of %s from %s (%d bottles).",
                                                         numberOfCases, wineSelected, supplierBox, numberOfCases*12));
            midPanel.messageLabel.setVisible(true);
            midPanel.selectInstruction.setVisible(false);
            midPanel.casesLabel.setVisible(false);
            midPanel.supplierLabel.setVisible(false);
            midPanel.supplier.setVisible(false);
            midPanel.amount.setVisible(false);
            midPanel.purchaseLabel.setVisible(false);
            midPanel.purchasePrice.setVisible(false);
            bottomPanel.submitButton.setEnabled(false);
        } else {
            bottomPanel.messageLabel.setText("Error");
            bottomPanel.messageLabel.setForeground(Color.RED);
            midPanel.messageLabel.setVisible(true);
            midPanel.selectInstruction.setVisible(true);
            midPanel.casesLabel.setVisible(true);
            midPanel.supplierLabel.setVisible(true);
            midPanel.supplier.setVisible(true);
            midPanel.amount.setVisible(true);
            midPanel.purchaseLabel.setVisible(true);
            midPanel.purchasePrice.setVisible(true);
        }
    }

    private String getWineSelected(){
        if (topPanel.rose.isSelected()) return "Rose";
        if (topPanel.merlot.isSelected()) return "Merlot";
        return "Sauvignon";
    }
}