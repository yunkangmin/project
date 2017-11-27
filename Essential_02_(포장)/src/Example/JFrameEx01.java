package Example;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class JFrameEx01 extends JFrame {

 private JPanel contentPane;
 private JTextField textField1;
 private JLabel label;
 private JTextField textField2;
 private JPanel panel_1;

 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     JFrameEx01 frame = new JFrameEx01();
     frame.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }

 /**
  * Create the frame.
  */
 public JFrameEx01() {
  setTitle("난 프레임");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(100, 100, 450, 300);
  contentPane = new JPanel();
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
  setContentPane(contentPane);
  contentPane.setLayout(null);
  
  panel_1 = new JPanel();
  panel_1.setBounds(6, 5, 422, 99);
  contentPane.add(panel_1);
  panel_1.setLayout(null);
  
  textField1 = new JTextField();
  textField1.setBounds(12, 22, 176, 21);
  panel_1.add(textField1);
  textField1.setColumns(10);
  
  textField2 = new JTextField();
  textField2.setBounds(214, 22, 196, 21);
  panel_1.add(textField2);
  textField2.setColumns(10);
  
  JLabel lblNewLabel = new JLabel("-");
  lblNewLabel.setBounds(172, 26, 57, 15);
  panel_1.add(lblNewLabel);
  lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
  
  JButton btnNewButton = new JButton("주민등록번호 검증하기");
  btnNewButton.setBounds(104, 66, 196, 23);
  panel_1.add(btnNewButton);
  btnNewButton.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) {
    String str_frontNumber = textField1.getText();
    String str_backNumber = textField2.getText();
    
    boolean bCheck = false;
    String correctStr = null;
    
     String inputData = str_frontNumber + str_backNumber;
     
     if(str_frontNumber.length() == 6 && str_backNumber.length() == 7)
     {
      char[] inputChar = inputData.toCharArray();
      
      for (char c : inputChar) {
       if((int)c >= 48 && (int)c <= 57) //'0' ~ '9' 아스키코드값은 48 ~ 57
       {
        bCheck = true;
       } else {
        bCheck = false;
        label.setText("결과 : 주민등록번호에 숫자가 아닌 문자가 들어있습니다.");
        break;
       }
      }
      
     } else {
      label.setText("결과 : 주민등록번호 형식에 맞지 않습니다.");
      bCheck = false;
     }
    
     if(bCheck){
      correctStr = inputData; 
     }

    if (bCheck && chechJumin(correctStr)) {
     label.setText("결과 : 주민번호가 정확합니다.");
    } else {
     label.setText("결과 : 주민번호가 부정확합니다.");
    }

   }
  });
  
  label = new JLabel("결과");
  label.setFont(new Font("굴림", Font.PLAIN, 15));
  label.setHorizontalAlignment(SwingConstants.CENTER);
  label.setBounds(12, 114, 410, 33);
  contentPane.add(label);
 }
 
 public boolean chechJumin(String jumin) {
  // 처리
  String strJumin = jumin.replaceAll("-", "");
  int[] bits = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
  int sum = 0;
  for (int i = 0; i < bits.length; i++) {
   sum += Integer.parseInt(strJumin.substring(i, i + 1)) * bits[i];
  }

  int last = Integer.parseInt(strJumin.substring(12, 13));

  int result = (11 - (sum % 11)) % 10;

  if(last == result) {
   return true;
  } else {
   return false;
  }
 }
}



