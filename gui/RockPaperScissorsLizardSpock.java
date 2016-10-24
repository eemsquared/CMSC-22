import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mmcalvarez on 10/24/2016.
 */
public class RockPaperScissorsLizardSpock extends Frame implements ActionListener{
    private Label yourChoice;
    private TextArea txt;
    private TextArea pScore;
    private TextArea cScore;
    private Label playerScore;
    private Label compScore;
    private Button btn;
    private Random rand = new Random();
    private CheckboxGroup grp = new CheckboxGroup();
    private int userScore = 0;
    private int computerScore = 0;

    public RockPaperScissorsLizardSpock() {
        //setLayout(new FlowLayout());
        setLayout(new GridLayout(15, 2));

        yourChoice = new Label("Your Choice:", Label.LEFT);
        yourChoice.setAlignment(Label.LEFT);

        txt = new TextArea("Results: ", 40, 20, TextArea.SCROLLBARS_VERTICAL_ONLY);
        txt.setEditable(false);
        txt.setBackground(Color.PINK);

        pScore = new TextArea("", 1, 10, TextArea.SCROLLBARS_NONE);
        pScore.setEditable(false);

        cScore = new TextArea("", 1, 10, TextArea.SCROLLBARS_NONE);
        cScore.setEditable(false);

        playerScore = new Label("Player's Score", Label.LEFT);
        compScore = new Label("Computer's Score", Label.LEFT);

        btn = new Button("RockPaperScissorsLizardSpock!");
        btn.addActionListener(this);

        Checkbox rck = new Checkbox("Rock", grp, true);
        Checkbox ppr = new Checkbox("Paper", grp, true);
        Checkbox scr = new Checkbox("Scissors", grp, true);
        Checkbox lzrd = new Checkbox("Lizard", grp, true);
        Checkbox spk = new Checkbox("Spock", grp, true);

        add(yourChoice);
        add(rck);
        add(ppr);
        add(scr);
        add(lzrd);
        add(spk);
        add(txt);
        add(btn);
        add(playerScore); add(pScore);
        add(compScore); add(cScore);

        setTitle("Rock Paper Scissors Lizard Spock");
        setSize(400, 700);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        int rand = randInt(1, 5);
        Checkbox choice = grp.getSelectedCheckbox();

        switch (rand){
            case 1: {
                if ((choice.getLabel() == "Spock" || choice.getLabel() == "Paper" ) && choice.getLabel() != "Rock") {
                    userScore++;
                    txt.setText("You chose " + choice.getLabel() + ".\n" + "Computer chose ROCK.\nYOU WON THIS ROUND.");
                }else {
                    if(choice.getLabel() != "Rock") {
                        computerScore++;
                        txt.setText("You chose " + choice.getLabel() + ".\n" + "Computer chose ROCK.\nCOMPUTER WON THIS ROUND.");
                    }
                    else {
                        txt.setText("DRAW!");
                    }
                }
                break;
            }
            case 2: {
                if((choice.getLabel() == "Scissors" || choice.getLabel() == "Lizard") && choice.getLabel() != "Paper"){
                    userScore++;
                    txt.setText("You chose " + choice.getLabel() + ".\n" + "Computer chose PAPER.\nYOU WON THIS ROUND.");
                }else {
                    if (choice.getLabel() != "Paper") {
                        computerScore++;
                        txt.setText("You chose " + choice.getLabel() + ".\n" + "Computer chose PAPER.\nCOMPUTER WON THIS ROUND.");
                    }
                    else {
                        txt.setText("DRAW!");
                    }
                }
                break;
            }
            case 3: {
                if((choice.getLabel() == "Rock" || choice.getLabel() == "Spock" )&& choice.getLabel() != "Scissors"){
                    userScore++;
                    txt.setText("You chose " + choice.getLabel() + ".\n" + "Computer chose SCISSORS.\nYOU WON THIS ROUND.");
                }else {
                    if(choice.getLabel() != "Scissors") {
                        computerScore++;
                        txt.setText("You chose " + choice.getLabel() + ".\n" + "Computer chose SCISSORS.\nCOMPUTER WON THIS ROUND.");
                    }
                    else {
                        txt.setText("DRAW!");
                    }
                }
                break;
            }
            case 4: {
                if((choice.getLabel() == "Rock" || choice.getLabel() == "Scissors" )&& choice.getLabel() != "Lizard"){
                    userScore++;
                    txt.setText("You chose " + choice.getLabel() + ".\n" + "Computer chose LIZARD.\nYOU WON THIS ROUND.");
                }else {
                    if(choice.getLabel() != "Lizard") {
                        computerScore++;
                        txt.setText("You chose " + choice.getLabel() + ".\n" + "Computer chose LIZARD.\nCOMPUTER WON THIS ROUND.");
                    }
                    else {
                        txt.setText("DRAW!");
                    }
                }
                break;
            }
            case 5: {
                if((choice.getLabel() == "Paper" || choice.getLabel() == "Lizard" ) && choice.getLabel() != "Spock"){
                    userScore++;
                    txt.setText("You chose " + choice.getLabel() + ".\n" + "Computer chose SPOCK.\nYOU WON THIS ROUND.");
                }else {
                    if(choice.getLabel() != "Spock") {
                        computerScore++;
                        txt.setText("You chose " + choice.getLabel() + ".\n" + "Computer chose SPOCK.\nCOMPUTER WON THIS ROUND.");
                    }
                    else {
                        txt.setText("DRAW!");
                    }
                }
                break;
            }
            default: {
                //
            }

        }
        pScore.setText(userScore + "");
        cScore.setText(computerScore + "");

        if(userScore == 5) {
            JOptionPane.showMessageDialog(this, "You Won!");
            setVisible(false);
            main(null);
        }
        else if(computerScore == 5) {
            JOptionPane.showMessageDialog(this, "Computer Won!");
            setVisible(false);
            main(null);
        }




    }

    public int randInt(int min, int max) {
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public static void main(String[] args) {
        new RockPaperScissorsLizardSpock();

    }


}
