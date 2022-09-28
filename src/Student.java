import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JTextField txtStdName;
    private JTextField txtMarks1;
    private JTextField txtMarks2;
    private JTextField txtMarks3;
    private JTextField txtTotal;
    private JTextField txtAvg;
    private JTextField txtGrade;
    private JButton calculateButton;
    private JPanel Main;
    private JLabel labelTotal;
    private JLabel labelMessage;
    private JLabel labelGrade;
    private JLabel labelAvg;

    public Student() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int m1, m2, m3, total;
                double avg;
                String studentName;

                studentName = String.valueOf(txtStdName.getText());
                m1 = Integer.parseInt(txtMarks1.getText());
                m2 = Integer.parseInt(txtMarks2.getText());
                m3 = Integer.parseInt(txtMarks3.getText());

                total = m1 + m2 + m3;
                labelTotal.setText(String.valueOf(total));

                avg = total / 3;
                labelAvg.setText(String.valueOf(avg));

                if (avg > 60) {
                    labelGrade.setText("Pass!");
                    labelMessage.setText("Congratulations " + studentName + "!");
                } else {
                    labelGrade.setText("Fail!");
                    labelMessage.setText("Sorry " + studentName + "!");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
