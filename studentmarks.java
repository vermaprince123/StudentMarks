import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class studentmarks {
    private JTextField txtStudentname;
    private JTextField txtmarks1;
    private JTextField txtmarks2;
    private JTextField txtmarks3;
    private JTextField texttotl;
    private JButton calculatedVaueButton;
    private JPanel Main;
    private JTextField txttotal;
    private JTextField txtaverage;
    private JTextField txtgrade;

    public static void main(String[] args) {
        JFrame frame = new JFrame("studentmarks");
        frame.setContentPane(new studentmarks().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public studentmarks() {
        calculatedVaueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int m1, m2, m3, tot;
            double avg;
            m1 = Integer.parseInt(txtmarks1.getText());
            m2 = Integer.parseInt(txtmarks2.getText());
            m3 = Integer.parseInt(txtmarks3.getText());
            tot = m1+m2+m3;
            txttotal.setText(String.valueOf(tot));
            avg = tot/3;
            txtaverage.setText(String.valueOf(avg));
            if (avg >50){
                txtgrade.setText("pass");
            }else{
                txtgrade.setText("fail");
            }
            }
        });
    }
}
