package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ApplicationForm extends JFrame {

    private JTextField inputField;

    public ApplicationForm() throws HeadlessException {
        setTitle("Calculator");
        setBounds(300, 300, 400, 400);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setJMenuBar(createMenu());

        setLayout(new BorderLayout());

        add(createTop(), BorderLayout.NORTH);
        add(createBottom(), BorderLayout.CENTER);

        setVisible(true);
    }

    public JMenuBar createMenu() {

        JMenuBar menuBar = new JMenuBar();

        JMenu menu = new JMenu("File");
        menuBar.add(menu);

        menu.add(new JMenuItem("Clear"));
        JMenuItem exit = menu.add(new JMenuItem("Exit"));
        exit.addActionListener(new ExitButtonListener());

        return menuBar;

    }

    private JPanel createTop() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());

        inputField = new JTextField();
        inputField.setEditable(false);
        top.add(inputField);

        return top;
    }

    private void createButton(String buttonTitle,
                              ActionListener buttonListener,
                              JPanel panel){
        JButton btn = new JButton(buttonTitle);
        btn.addActionListener(buttonListener);
        panel.add(btn);
    }

    private JPanel createBottom() {
        JPanel bottom = new JPanel();
        bottom.setLayout(new BorderLayout());

        //digits
        JPanel digitsPanel = new JPanel();

        digitsPanel.setLayout(new GridLayout(4,3));
        ActionListener buttonListener = new ButtonListener(inputField);

        for (int i = 1; i < 10; i++) {
            String buttonTitle = String.valueOf(i);
            createButton(buttonTitle, buttonListener, digitsPanel);
        }

        //operators
        JPanel advPanel = new JPanel();
        advPanel.setLayout(new GridLayout(4,2));

        createButton("+", buttonListener, advPanel);
        createButton("-", buttonListener, advPanel);
        createButton("*", buttonListener, advPanel);
        createButton("/", buttonListener, advPanel);

        createButton("=", buttonListener, digitsPanel);
        createButton("0", buttonListener, digitsPanel);
        createButton("C", e -> inputField.setText(""), digitsPanel);

        bottom.add(digitsPanel, BorderLayout.CENTER);
        bottom.add(advPanel, BorderLayout.WEST);

        return bottom;
    }

}
