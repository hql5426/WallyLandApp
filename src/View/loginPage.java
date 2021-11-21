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
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.FileReader;

/**
 *
 * @author hayde
 */
public class loginPage extends javax.swing.JFrame {

    private LoginController loginCntrl;
    private NavigationController navCntrl;

    /**
     * Creates new form viewTickets
     */
    public loginPage(LoginController loginCntrl) {
        this.loginCntrl = loginCntrl;
        initComponents();
    }
    
    /**
     * Method to connect to our LoginController
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

        jTextField1 = new javax.swing.JTextField();
        PasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        adminLogin = new javax.swing.JButton();
        signUpButtonL = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("LOGIN");

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        adminLogin.setText("Admin Login");
        adminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLoginActionPerformed(evt);
            }
        });

        signUpButtonL.setText("Register");
        signUpButtonL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonLActionPerformed(evt);
            }
        });

        jLabel2.setText("Email:");

        jLabel3.setText("Password:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(adminLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginButton)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1)
                        .addGap(101, 101, 101)
                        .addComponent(signUpButtonL)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(signUpButtonL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminLogin)
                    .addComponent(loginButton))
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(33, 124, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
       JSONArray jrr = new JSONArray();
       JSONParser Jp = new JSONParser();

       Object ob = null;
       
      

       

       try{
           FileReader file = new FileReader("UserData.json");
           ob=Jp.parse(file);
           jrr=(JSONArray) ob;
           file.close();  
       } catch(Exception ex){
           JOptionPane.showMessageDialog(null,"Error Occured While fetching");
       }
              
       JSONObject obj = new JSONObject();
       int size = jrr.size();
       obj.put("Email",jTextField1.getText());
       obj.put("Password", PasswordField1.getText());
       // obj.put("Password", PasswordField1.getPassword());

       jrr.add(obj);
       
       for(int i=0; i<size; i++){
       if(obj.equals(jrr.get(i))){
           JOptionPane.showMessageDialog(null, "Password Matched");
            navCntrl = new NavigationController();
           break;   
       }else if(i==size-1){
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
       
        try{
           FileReader file = new FileReader("UserData.json");
           jrr=(JSONArray)jp.parse(file);    
       }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error occured");   
       } 

      obj.put("Email",jTextField1.getText());
      obj.put("Password", PasswordField1.getText());
      // obj.put("Password", PasswordField1.getPassword());
      jrr.add(obj);

        
       //obj.put("FirstName", jTextField2.getText());
       //obj.put("LastName", jTextField3.getText());
       //obj.put("Password", PasswordField4.getPassword());
       
      
       try{
           FileWriter file = new FileWriter("UserData.json");
           file.write(jrr.toJSONString());
           file.close();
       } catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Error occured");   
           
       }
      
       JOptionPane.showMessageDialog(null,"Infomation Saved"); // TODO add your handling code here:
                     
    }//GEN-LAST:event_signUpButtonLActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField1;
    public javax.swing.JButton adminLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JButton loginButton;
    public javax.swing.JButton signUpButtonL;
    // End of variables declaration//GEN-END:variables
}

