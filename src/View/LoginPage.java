/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import Controller.LoginController;
import Controller.NavigationController;
import Controller.SingleTicketViewController;
import Controller.TicketsOrderController;
import Controller.ViewTicketsController;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.FileReader;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author hayde
 */
public class LoginPage extends javax.swing.JFrame {

    private LoginController loginCntrl;
    private NavigationController navCntrl;

    /**
     * Creates new form viewTickets
     */
    public LoginPage(LoginController loginCntrl) {
        this.loginCntrl = loginCntrl;
        initComponents();
    }

    /**
     * Method to connect to our LoginController
     *
     * @param loginController a login screen
     * @return the connection status
     */
    public boolean connectedRestServer(LoginController loginController) {
        loginCntrl = loginController;
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        PasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        adminLogin = new javax.swing.JButton();
        signUpButtonL = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(181, 181, 255));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Email:");

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        PasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        PasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("WallyLand World of Adventure");

        loginButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Vistior Login");
        loginButton.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        loginButton.setMargin(new java.awt.Insets(0, 4, 0, 4));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        adminLogin.setBackground(new java.awt.Color(181, 181, 255));
        adminLogin.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        adminLogin.setForeground(new java.awt.Color(255, 255, 255));
        adminLogin.setText("Admin Login");
        adminLogin.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        adminLogin.setMaximumSize(new java.awt.Dimension(56, 30));
        adminLogin.setMinimumSize(new java.awt.Dimension(56, 30));
        adminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLoginActionPerformed(evt);
            }
        });

        signUpButtonL.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        signUpButtonL.setForeground(new java.awt.Color(255, 255, 255));
        signUpButtonL.setText("Register");
        signUpButtonL.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        signUpButtonL.setMargin(new java.awt.Insets(0, 4, 0, 4));
        signUpButtonL.setMaximumSize(new java.awt.Dimension(56, 30));
        signUpButtonL.setMinimumSize(new java.awt.Dimension(56, 30));
        signUpButtonL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonLActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Password:");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-iOS-Email Open.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-iOS-Email Open.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-Gradient-Theme Park.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(signUpButtonL, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(adminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(PasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(83, 83, 83))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(signUpButtonL, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(PasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))))
                    .addComponent(jLabel3))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        JSONArray jrr = new JSONArray();
        JSONParser Jp = new JSONParser();

        Object ob = null;

        try {
            FileReader file = new FileReader("UserData.json");
            ob = Jp.parse(file);
            jrr = (JSONArray) ob;
            file.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Occured While fetching");
        }

        JSONObject obj = new JSONObject();
        int size = jrr.size();
        obj.put("Email", jTextField1.getText());
        obj.put("Password", PasswordField1.getText());
        
        
        
       // obj.put("Email", jTextField1.getText(userText.setText()));

        // obj.put("Password", PasswordField1.getPassword());

        jrr.add(obj);

        for (int i = 0; i < size; i++) {
            
//            if (i == null){
//                   JOptionPane.showMessageDialog(null, "Password Matched");
//            }
             if (obj.equals(jrr.get(i))){
                
                
                JOptionPane.showMessageDialog(null, "Password Matched");

//           NavigationUI navigation = new NavigationUI();
//           //navigation = getNavCntrl().getNavgiationUI();
//           navigation.setVisible(true);
                navCntrl = new NavigationController();
                break;
            
            
            } else if (i == size - 1 ) {
                JOptionPane.showMessageDialog(null, "Wrong EmailAddress/Password!!");
                loginCntrl.setAct(false);
            }
        }  // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

    private void adminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLoginActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_adminLoginActionPerformed

    private void signUpButtonLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonLActionPerformed
        JSONObject obj = new JSONObject();
        JSONArray jrr = new JSONArray();
        JSONParser jp = new JSONParser();

        try {
            FileReader file = new FileReader("UserData.json");
            jrr = (JSONArray) jp.parse(file);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error occured");
        }
        
        
        obj.put("Email", jTextField1.getText());
        obj.put("Password", PasswordField1.getText());
        // obj.put("Password", PasswordField1.getPassword());
        
//        if(obj.equals("")){
//           JOptionPane.showMessageDialog(null, "Error occured");
//        }
//        else{
//            jrr.add(obj);
//        }

        //obj.put("FirstName", jTextField2.getText());
        //obj.put("LastName", jTextField3.getText());
        //obj.put("Password", PasswordField4.getPassword());
        try {
            FileWriter file = new FileWriter("UserData.json");
            file.write(jrr.toJSONString());
            file.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error occured");

        }

        JOptionPane.showMessageDialog(null, "Infomation Saved"); // TODO add your handling code here:

    }//GEN-LAST:event_signUpButtonLActionPerformed

    private void PasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordField1ActionPerformed

    
    public JTextField getCurrentUser() {
        return jTextField1;
    }

    
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField1;
    public javax.swing.JButton adminLogin;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField jTextField1;
    public javax.swing.JButton loginButton;
    public javax.swing.JButton signUpButtonL;
    // End of variables declaration//GEN-END:variables
}
