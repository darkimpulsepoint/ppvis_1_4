package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Actions {
    public void showErrorMessageElementNotExist(){
        JOptionPane jOptionPane = new JOptionPane();
        jOptionPane.showMessageDialog(
                jOptionPane,
                "Element with this title does not exist!",
                "Error",
                jOptionPane.INFORMATION_MESSAGE);
    }
    public void selectButtonsDueText(JRadioButton[] jRadioButtons, String text){
        List<Integer> numbersRdaioButtonToSelect = new ArrayList<>();
        for (int i= 0 ; i<jRadioButtons.length; i++){
            if (jRadioButtons[i].getText().equals(text))
                numbersRdaioButtonToSelect.add(i);
        }
        if (numbersRdaioButtonToSelect.size()==0) {
            showErrorMessageElementNotExist();
        }

        for (int i = 0;i<jRadioButtons.length; i++)
            jRadioButtons[i].setSelected(false);

        int Current;
        for (int i = 0; i<numbersRdaioButtonToSelect.size();i++) {
            Current = numbersRdaioButtonToSelect.get(i);
            jRadioButtons[Current].setSelected(true);
        }
    }

    public void changeCheckBoxDueText(JCheckBox[] jCheckBoxes, String text){
        List<Integer> numbersCheckBoxToChange = new ArrayList<>();
        for (int i= 0 ; i<jCheckBoxes.length; i++){
            if (jCheckBoxes[i].getText().equals(text))
                numbersCheckBoxToChange.add(i);
        }
        if (numbersCheckBoxToChange.size()==0) {
            showErrorMessageElementNotExist();
        }

        int Current;
        for (Integer integer : numbersCheckBoxToChange) {
            Current = integer;
            jCheckBoxes[Current].setSelected(!jCheckBoxes[Current].isSelected());
        }
    }

    public void changeTwoButtonsText(JButton first, JButton second){
        String temp = first.getText();
        first.setText(second.getText());
        second.setText(temp);
    }
}
