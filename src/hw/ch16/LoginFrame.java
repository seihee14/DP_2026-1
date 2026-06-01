package hw.ch16;

import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends Frame implements ActionListener, Mediator {

    private ColleagueCheckbox checkboxGuest;
    private ColleagueCheckbox checkboxLogin;
    private CheckboxGroup checkboxGroup;

    private ColleagueTextField textUser;
    private ColleagueTextField textPass;

    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    // ✅ 추가
    private ColleagueLabel statusLabel;

    public LoginFrame(String title) {
        super(title);
        setBackground(Color.lightGray);

        setLayout(new GridLayout(5, 2));

        createColleagues();

        add(new Label("Username:"));
        add(textUser);
        add(new Label("Password:"));
        add(textPass);
        add(checkboxGuest);
        add(checkboxLogin);
        add(buttonOk);
        add(buttonCancel);
        add(statusLabel);

        colleagueChanged();

        pack();
        setVisible(true);
    }

    @Override
    public void createColleagues() {
        checkboxGuest = new ColleagueCheckbox("Guest", true);
        checkboxLogin = new ColleagueCheckbox("Login", false);

        checkboxGroup = new CheckboxGroup();
        checkboxGuest.setCheckboxGroup(checkboxGroup);
        checkboxLogin.setCheckboxGroup(checkboxGroup);

        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        textPass.setEchoChar('*');

        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");

        // ✅ 추가
        statusLabel = new ColleagueLabel("● 로그인 불가");

        checkboxGuest.setMediator(this);
        checkboxLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);
        statusLabel.setMediator(this);

        checkboxGuest.addItemListener(checkboxGuest);
        checkboxLogin.addItemListener(checkboxLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    @Override
    public void colleagueChanged() {
        if (checkboxGuest.getState()) {
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);
            statusLabel.setColleagueEnabled(true);
        } else {
            textUser.setColleagueEnabled(true);
            userpassChanged();
        }
    }

    private void userpassChanged() {
        if (textUser.getText().length() >= 4) {
            textPass.setColleagueEnabled(true);

            if (textPass.getText().length() >= 4) {
                buttonOk.setColleagueEnabled(true);
                statusLabel.setColleagueEnabled(true);
            } else {
                buttonOk.setColleagueEnabled(false);
                statusLabel.setColleagueEnabled(false);
            }
        } else {
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
            statusLabel.setColleagueEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}