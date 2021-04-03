package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class JPanelSetter {
    Actions actions = new Actions();

    public void setFirstPanel(JPanel panel){
        JButton button = new JButton();
        JComboBox comboBox = new JComboBox();
        JTextField textField = new JTextField();

        button.setBounds(0, 0, 100, 50);
        button.setText("BUTTON_1");
        button.addActionListener(e ->
                {
                    boolean isExists = false;
                    for (int i = 0; i<comboBox.getItemCount(); i++){
                        String comboboxResult = comboBox.getItemAt(i).toString();
                        String textFieldResult = textField.getText();
                        if (comboboxResult.equals(textFieldResult)) {
                            isExists = true;
                        }
                    }

                    if(!isExists) {
                        comboBox.addItem(textField.getText());
                    }
                }
        );

        comboBox.setBounds(0, 150, 170, 20);

        textField.setBounds(0, 15, 170, 20);

        button.setBounds(0,60, 100,50);

        panel.add(textField);
        panel.add(button);
        panel.add(comboBox);
    }

    public void setSecondPanel(JPanel panel){
        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JTextField textField = new JTextField();

        textField.setBounds(0, 15, 170, 20);

        button1.setBounds(0, 60, 100, 50);
        button1.setText("Button_1");
        button1.addActionListener(e -> button2.setText(textField.getText()));

        button2.setBounds(0, 150, 100, 50);
        button2.setText("Button_2");
        button2.addActionListener(e -> actions.changeTwoButtonsText(button1, button2));

        panel.add(textField);
        panel.add(button1);
        panel.add(button2);
    }

    public void setThirdPanel(JPanel panel){
        JButton button1 = new JButton();
        JTextField textField = new JTextField();
        JRadioButton[] jRadioButtons = new JRadioButton[3];
        for (int i = 0; i < 3; i++) {
            jRadioButtons[i] = new JRadioButton();
            jRadioButtons[i].setBounds(0, 130 + i * 45, 150, 30);
            jRadioButtons[i].setText("RadioButton" + i);
        }

        textField.setBounds(0, 15, 170, 20);

        button1.setBounds(0, 60, 100, 50);
        button1.setText("Button_1");
        button1.addActionListener(e-> {
            actions.selectButtonsDueText(jRadioButtons, textField.getText());
        });

        panel.add(textField);
        panel.add(button1);
        panel.add(jRadioButtons[0]);
        panel.add(jRadioButtons[1]);
        panel.add(jRadioButtons[2]);
    }

    public void setFourthPanel(JPanel panel){
        JButton button1 = new JButton();
        JTextField textField = new JTextField();
        JCheckBox[] jCheckBox = new JCheckBox[3];
        for (int i = 0; i < 3; i++) {
            jCheckBox[i] = new JCheckBox();
            jCheckBox[i].setBounds(0, 130 + i * 45, 150, 30);
            jCheckBox[i].setText("CheckBox"+i);
        }

        textField.setBounds(0, 15, 170, 20);

        button1.setBounds(0, 60, 100, 50);
        button1.setText("Button_1");
        button1.addActionListener(e->actions.changeCheckBoxDueText(jCheckBox, textField.getText()));

        panel.add(textField);
        panel.add(button1);
        panel.add(jCheckBox[0]);
        panel.add(jCheckBox[1]);
        panel.add(jCheckBox[2]);
    }

    public void setFifthPanel(JPanel panel){
//        JButton[] jButtons = new JButton[3];
//        for (int i = 0; i < 3; i++) {
//            jButtons[i] = new JButton();
//        }
//        JTextField jTextField = new JTextField();

        JTable jTable = new JTable();
        JScrollPane scrollPane = new JScrollPane(jTable);
        jTable.setFillsViewportHeight(true);

//        jTable.setFillsViewportHeight(true);
//        JScrollPane scrollPane = new JScrollPane(jTable);


//        model.addColumn("Col1");
//        model.addColumn("Col2");
//        model.addRow(new Object[]{"v1", "v2"});

//        jTextField.setBounds(0, 15, 170, 20);

//        for (int i = 0; i < 3; i++) {
//            jButtons[i].setBounds(0, 60 + i * 60, 100, 50);
//        }

//        jTable.setBounds(0, 280, 250, 200);

//        panel.add(scrollPane);
//        panel.add(jTextField);
        panel.add(scrollPane);
//        panel.add(new JScrollPane(jTable));
//        panel.add(jTable);
//        panel.add(jButtons[0]);
//        panel.add(jButtons[1]);
//        panel.add(jButtons[2]);
    }
}
