import java.awt.*;
import java.awt.event.*;

public class Сacucotor extends Frame {
    public Сacucotor(String title) {
        super(title);
        setLayout(null);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });

        setSize(400, 280);
        setVisible(true);

        Label text = new Label("UKRAINE");
        text.setBounds(105, 160, 150, 25);
        text.setFont(new Font("", Font.ITALIC | Font.BOLD, 30));
        text.setForeground(Color.BLUE);
        this.add(text);

        TextField input = new TextField("");
        input.setBounds(110, 40, 130, 25);
        input.setBackground(Color.WHITE);
        input.setFont(new Font("", Font.BOLD, 20));
        add(input);

        Button myButton = new Button("PUSH");
        myButton.setBounds(110, 80, 130, 30);
        myButton.setFont(new Font("", Font.ITALIC | Font.BOLD, 30));
        myButton.setBackground(Color.BLACK);
        myButton.setForeground(Color.WHITE);
        add(myButton);

        myButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText("PUSH нажата");
            }
        });

        Button gloryButton = new Button("GLORY TO UKRAINE");
        gloryButton.setBounds(110, 120, 130, 30);
        gloryButton.setBackground(Color.RED);
        gloryButton.setForeground(Color.WHITE);
        add(gloryButton);

        gloryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Frame messageFrame = new Frame("Message");
                messageFrame.setSize(200, 100);
                messageFrame.setLayout(new FlowLayout());
                Label messageLabel = new Label("GLORY TO HEROES");
                messageFrame.add(messageLabel);
                messageFrame.setVisible(true);
                messageFrame.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent ev) {
                        messageFrame.dispose();
                    }
                });
            }
        });
    }

    public static void main(String[] args) {
        Сacucotor raudied = new Сacucotor("CACUCOTOR!!!");
    }

    public void paint(Graphics g) {
    }
}
