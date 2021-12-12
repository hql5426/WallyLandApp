package View;

import Controller.TicketsOrderController;
import Model.Ticket;
import Model.SeasonTicket;
import Model.DayTicket;
import Model.WeekTicket;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author bpardee
 */
public class TicketOrderUI extends javax.swing.JFrame {
    private TicketsOrderController orderCntrl;
    private Ticket ticket;
    private TicketOrderUI menuUI;
    private SeasonTicket seasonTix;
    private DayTicket dayTix;
    private WeekTicket weekTix;
    /**
     * Creates new form RestaurantMenuUI
     * @param restCntrl references the Restaurant Controller class
     * @param restaurant references the Restaurants class
     */
    public TicketOrderUI(TicketsOrderController orderCntrl, SeasonTicket seasonTix, WeekTicket weekTix, DayTicket dayTix){
        this.orderCntrl = orderCntrl;
        /*this.ticket = ticket;*/
        initComponents();
        progressBar = new javax.swing.JProgressBar(0, 100);
        jPanel2.add(progressBar);
        progressBar.setSize(350,40);
        progressBar.setValue(2);
        progressBar.setVisible(true);
    }
    
    /**
     * Method to connect to our RestaurantController
     * @param restController a menu
     * @return the connection status
     */   
    public boolean connectedRestServer(TicketsOrderController orderController) {
        orderCntrl = orderController;
        return true;
    }

    /*Getters and setters for Season Ticket price, title, and amount as indicated
    by the spinner
    */
    
    public JLabel getSeasonTicketItem() {
        return seasonTicketItem;
    }
    public void setSeasonTicketItem(String seasonTicketItem) {
        this.seasonTicketItem.setText(seasonTicketItem);
    }

    public JLabel getSeasonTicketPrice() {
        return seasonTicketPrice;
    }
    public void setSeasonTicketPrice(Double seasonTicketPrice){
        this.seasonTicketPrice.setText(String.format("%.2f", seasonTicketPrice));
    }
    public JSpinner getSeasonTixAmt() {
        return seasonTixAmt;
    }
    public void setSeasonTixAmt(JSpinner seasonTixAmt) {
        this.seasonTixAmt = seasonTixAmt;
    }

    /*Getters and setters for Week Ticket price, title, and amount as indicated
    by the spinner
    */
    
    public JLabel getWeekTicketItem() {
        return weekTicketItem;
    }
    public void setWeekTicketItem(String weekTicketItem) {
        this.weekTicketItem.setText(weekTicketItem);
    }
    public JLabel getWeekTicketPrice() {
        return weekTicketPrice;
    }
    public void setWeekTicketPrice(Double weekTicketPrice) {
        this.weekTicketPrice.setText(String.format("%.2f", weekTicketPrice));
    }
    public JSpinner getWeekTixAmt() {
        return weekTixAmt;
    }
    public void setWeekTixAmt(JSpinner weekTixAmt) {
        this.weekTixAmt = weekTixAmt;
    }
    
    /*Getters and setters for Week Ticket price, title, and amount as indicated
    by the spinner
    */
    
    public JLabel getDayTicketItem() {
        return dayTicketItem;
    }
    public void setDayTicketItem(String dayTicketItem) {
        this.dayTicketItem.setText(dayTicketItem);
    }
    public JLabel getDayTicketPrice() {
        return dayTicketPrice;
    }
    public void setDayTicketPrice(Double dayTicketPrice) {
        this.dayTicketPrice.setText(String.format("%.2f", dayTicketPrice));
    }
    public JSpinner getDayTixAmt() {
        return dayTixAmt;
    }
    public void setDayTixAmt(JSpinner dayTixAmt) {
        this.dayTixAmt = dayTixAmt;
    }

    
    public JButton getMenuBtn() {
        return menuBtn;
    }
    public void setMenuBtn(JButton menuBtn) {
        this.menuBtn = menuBtn;
    }
    
    
    public JLabel getMenuTitle() {
        return menuTitle;
    }
    public void setMenuTitle(JLabel menuTitle) {
        this.menuTitle = menuTitle;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        menuTitle = new javax.swing.JLabel();
        menuItem1 = new javax.swing.JLabel();
        dayTicketItem = new javax.swing.JLabel();
        weekTicketItem = new javax.swing.JLabel();
        seasonTicketItem = new javax.swing.JLabel();
        dayTixAmt = new javax.swing.JSpinner();
        weekTixAmt = new javax.swing.JSpinner();
        seasonTixAmt = new javax.swing.JSpinner();
        purchaseTixBtn = new javax.swing.JButton();
        dayTicketPrice = new javax.swing.JLabel();
        weekTicketPrice = new javax.swing.JLabel();
        seasonTicketPrice = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        menuBtn = new javax.swing.JButton();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(238, 190, 122));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 400));

        menuTitle.setBackground(new java.awt.Color(255, 255, 255));
        menuTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        menuTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuTitle.setText("Tickets");

        dayTicketItem.setText("null");

        weekTicketItem.setText("null");

        seasonTicketItem.setText("null");

        dayTixAmt.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        weekTixAmt.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        seasonTixAmt.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        purchaseTixBtn.setText("Purchase");
        purchaseTixBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseTixBtnActionPerformed(evt);
            }
        });

        dayTicketPrice.setText("null");

        weekTicketPrice.setText("null");

        seasonTicketPrice.setText("null");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        menuBtn.setText("Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(menuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuItem1)
                            .addComponent(dayTicketItem)
                            .addComponent(weekTicketItem)
                            .addComponent(seasonTicketItem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dayTicketPrice)
                            .addComponent(weekTicketPrice)
                            .addComponent(seasonTicketPrice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dayTixAmt, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(weekTixAmt)
                            .addComponent(seasonTixAmt))
                        .addGap(68, 68, 68))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(purchaseTixBtn)
                .addGap(109, 109, 109))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(menuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuItem1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayTicketItem)
                    .addComponent(dayTixAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayTicketPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weekTicketItem)
                    .addComponent(weekTixAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weekTicketPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seasonTicketItem)
                    .addComponent(seasonTixAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seasonTicketPrice))
                .addGap(93, 93, 93)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purchaseTixBtn)
                    .addComponent(menuBtn))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void purchaseTixBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseTixBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purchaseTixBtnActionPerformed

    private javax.swing.JProgressBar progressBar;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dayTicketItem;
    private javax.swing.JLabel dayTicketPrice;
    private javax.swing.JSpinner dayTixAmt;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JButton menuBtn;
    private javax.swing.JLabel menuItem1;
    private javax.swing.JLabel menuTitle;
    public javax.swing.JButton purchaseTixBtn;
    private javax.swing.JLabel seasonTicketItem;
    private javax.swing.JLabel seasonTicketPrice;
    private javax.swing.JSpinner seasonTixAmt;
    private javax.swing.JLabel weekTicketItem;
    private javax.swing.JLabel weekTicketPrice;
    private javax.swing.JSpinner weekTixAmt;
    // End of variables declaration//GEN-END:variables
    }
