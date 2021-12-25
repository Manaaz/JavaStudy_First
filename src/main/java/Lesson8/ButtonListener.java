package Lesson8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.ArrayList;

public class ButtonListener implements ActionListener {

    private JTextField inputField;
    ArrayList<String> mathSymbols = new ArrayList<String>(
            Arrays.asList("+", "-", "*", "/"));

    public ButtonListener(JTextField inputField) {

        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();

        String btnText = btn.getText();
        String result = "";
        String newValue = inputField.getText();

        if(btnText.equals("=")){
            result = calculateResult(newValue);
        } else if (btnText.equals("C")) {
            result = "";
        } else {
            result = newValue + btn.getText();
        }

        inputField.setText(result);
    }

    private String calculateResult(String stringToParse) {

        String[] arr = stringToParse.split("");

        boolean firstVal = true;
        int mathResult = 0;
        int parsedNewValue = 0;
        int lastIndex = arr.length-1;
        String newValue = "";
        String lastOperation = "";

        for (int i = 0; i < arr.length; i++) {

            if (mathSymbols.contains(arr[i])) {

                parsedNewValue = Integer.parseInt(newValue);

                if(firstVal){
                    firstVal = false;
                    mathResult = parsedNewValue;
                }

                lastOperation = arr[i];

                newValue = "";

            } else {
                newValue += arr[i];
            }

            if(i == lastIndex) {

                if(newValue != "") {
                    parsedNewValue = Integer.parseInt(newValue);
                }

                if(lastOperation.equals("+")){
                    mathResult += parsedNewValue;
                } else if (lastOperation.equals("-")) {
                    mathResult -= parsedNewValue;
                } else if (lastOperation.equals("*")) {
                    mathResult *= parsedNewValue;
                } else if (lastOperation.equals("/")) {
                    mathResult /= parsedNewValue;
                }

            }

        }

        return String.valueOf(mathResult);
    }
}
