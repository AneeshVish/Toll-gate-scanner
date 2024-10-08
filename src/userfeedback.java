
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;

public class userfeedback extends javax.swing.JFrame {

    public userfeedback() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jButton1.setBackground(new java.awt.Color(51, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("RATING");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel.setText("USERNAME");

        username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jButton2.setBackground(new java.awt.Color(51, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("LOST VEHICLE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Description");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("COMPLAINT / SUGGESTION");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("SUBMIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(116, 116, 116))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel)
                                .addGap(46, 46, 46)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jMenu1.setText("MAIN MENU");

        jMenuItem2.setText("HOME");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem5.setText("PAY");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem1.setText("HISTORY");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("PROFILE");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem6.setText("FEEDBACK");
        jMenu1.add(jMenuItem6);

        jMenuItem4.setText("SIGN OUT");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try
{
    String ur="com.mysql.cj.jdbc.Driver";

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toll","root","");
 Statement st = con.createStatement();
String code = "SELECT rate FROM rating WHERE username='"+username.getText()+"'";
ResultSet rec = st.executeQuery(code);
while(rec.next())
{
//String r=rec.getString("rate");

if(rec.getString("rate").equals("excellent")){
  rating rating = new rating();
  rating.excellent.setSelected(true);
  rating.ok.setSelected(true);
 rating.good.setSelected(true);
 rating.fair.setSelected(true);
 rating.verygood.setSelected(true);
  rating.jLabel1.setText(username.getText());
rating.setVisible(true);
}
else if(rec.getString("rate").equals("verygood")){
  rating rating = new rating();
  rating.excellent.setSelected(false);
  rating.ok.setSelected(true);
 rating.good.setSelected(true);
 rating.fair.setSelected(true);
 rating.verygood.setSelected(true);
  rating.jLabel1.setText(username.getText());
rating.setVisible(true);
}
else if(rec.getString("rate").equals("good")){
  rating rating = new rating();
  rating.excellent.setSelected(false);
  rating.ok.setSelected(true);
 rating.good.setSelected(true);
 rating.fair.setSelected(true);
 rating.verygood.setSelected(false);
  rating.jLabel1.setText(username.getText());
rating.setVisible(true);
}
else if(rec.getString("rate").equals("fair")){
  rating rating = new rating();
  rating.excellent.setSelected(false);
  rating.ok.setSelected(true);
 rating.good.setSelected(false);
 rating.fair.setSelected(true);
 rating.verygood.setSelected(false);
  rating.jLabel1.setText(username.getText());
rating.setVisible(true);
}
else if(rec.getString("rate").equals("ok")){
  rating rating = new rating();
  rating.excellent.setSelected(false);
  rating.ok.setSelected(true);
 rating.good.setSelected(false);
 rating.fair.setSelected(false);
 rating.verygood.setSelected(false);
  rating.jLabel1.setText(username.getText());
rating.setVisible(true);
}
else
{
rating rating = new rating();
rating.jLabel1.setText(username.getText());
rating.setVisible(true);
}
}}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex);
}
      
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try
{
    String ur="com.mysql.cj.jdbc.Driver";

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toll","root","");
 Statement st = con.createStatement();
 String sql="select * from profile where username='"+username.getText()+"'";
ResultSet rs=st.executeQuery(sql);  
while(rs.next()){
    String contactno=rs.getString("contact_no");
 //ResultSet r = st.executeQuery(code);

 lostvehicle lostvehicle=new lostvehicle();
lostvehicle.username.setText(username.getText());
lostvehicle.contactno.setText(contactno);
lostvehicle.setVisible(true);
}}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex);
}
       
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try
{
    String ur="com.mysql.cj.jdbc.Driver";

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toll","root","");
 Statement st = con.createStatement();
 String sql="select * from profile where username='"+username.getText()+"'";
ResultSet rs=st.executeQuery(sql);  
while(rs.next()){
    String contactno=rs.getString("contact_no");
 //ResultSet r = st.executeQuery(code);

st.execute("INSERT INTO feedback(username,contact_no,status,complaint) VALUES('"+username.getText()+"','"+contactno+"','feedback','"+jTextArea1.getText()+"')");
st.close();
jTextArea1.setText("");
}}
catch(Exception ex)
{
//JOptionPane.showMessageDialog(null, ex);
}// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        String u=username.getText();
        try
        {
            String url="com.mysql.cj.jdbc.Driver";
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/toll","root","");
            Statement s = c.createStatement();
            String code = "SELECT wallet FROM userregister where username='"+u+"'";
            ResultSet rec = s.executeQuery(code);
            while(rec.next())
            {String am=rec.getString("wallet");

                useraccount useraccount=new useraccount();
                useraccount.username.setText(u);
                useraccount.wallet.setText(am);
                useraccount.setVisible(true);
                this.setVisible(false);
            }}
            catch(Exception e)
            {
                System.out.println(e);
            }
            // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        route route=new route();
        String u=username.getText();
        route.username.setText(u);
        route.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
 try{
  String url="com.mysql.cj.jdbc.Driver";
Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/toll","root","");
Statement s = c.createStatement();
String code = "SELECT * FROM profile where username='"+username.getText()+"'";
ResultSet rec = s.executeQuery(code);
while(rec.next())
{ 
    userprofile userprofile = new userprofile();
    userprofile.setVisible(true);
userprofile.name.setText(rec.getString("name"));
userprofile.contactno.setText(rec.getString("contact_no"));
userprofile.address.setText(rec.getString("address"));
String date=rec.getString("dob");
//userprofile.dob.set JDateChooser(date);

userprofile.jLabel7.setVisible(false);
userprofile.username.setText(username.getText());
this.setVisible(false);
}
}
catch(Exception e)
{
System.out.println(e);
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        userreport userreport=new userreport();
        String u=username.getText();
        userreport.username.setText(u);
        userreport.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        user user=new user();
        user.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(userfeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userfeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userfeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userfeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userfeedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
