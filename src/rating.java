
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class rating extends javax.swing.JFrame {
String rating;
    /**
     * Creates new form rating
     */
    public rating() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        verygood = new javax.swing.JRadioButton();
        good = new javax.swing.JRadioButton();
        fair = new javax.swing.JRadioButton();
        ok = new javax.swing.JRadioButton();
        excellent = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        verygood.setBackground(new java.awt.Color(255, 0, 204));
        verygood.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        verygood.setForeground(new java.awt.Color(204, 0, 204));
        verygood.setText("VERY GOOD");
        verygood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verygoodActionPerformed(evt);
            }
        });

        good.setBackground(new java.awt.Color(255, 255, 51));
        good.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        good.setForeground(new java.awt.Color(255, 255, 51));
        good.setText("GOOD");
        good.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goodActionPerformed(evt);
            }
        });

        fair.setBackground(new java.awt.Color(255, 102, 51));
        fair.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fair.setForeground(new java.awt.Color(255, 102, 51));
        fair.setText("FAIR");
        fair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fairActionPerformed(evt);
            }
        });

        ok.setBackground(new java.awt.Color(255, 0, 0));
        ok.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ok.setForeground(new java.awt.Color(255, 0, 0));
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        excellent.setBackground(new java.awt.Color(51, 255, 51));
        excellent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        excellent.setForeground(new java.awt.Color(51, 255, 51));
        excellent.setText("EXCELLENT");
        excellent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excellentActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 204, 255));
        jLabel1.setForeground(new java.awt.Color(51, 204, 255));
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(68, 68, 68))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(good, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(verygood)
                            .addComponent(fair, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(excellent))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(excellent)
                .addGap(18, 18, 18)
                .addComponent(verygood)
                .addGap(18, 18, 18)
                .addComponent(good)
                .addGap(18, 18, 18)
                .addComponent(fair)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void excellentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excellentActionPerformed
 //excellent.setSelected(false);
 ok.setSelected(true);
 good.setSelected(true);
 fair.setSelected(true);
 verygood.setSelected(true);
 rating="excellent";
// TODO add your handling code here:
    }//GEN-LAST:event_excellentActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try
{
    String ur="com.mysql.cj.jdbc.Driver";

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toll","root","");
 Statement st = con.createStatement();
 //ResultSet r = st.executeQuery(code);
st.executeUpdate("UPDATE rating SET rate='"+rating+"' WHERE username='"+jLabel1.getText()+"'");
st.close();
this.setVisible(false);
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex);
} //
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void verygoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verygoodActionPerformed
excellent.setSelected(false);
 ok.setSelected(true);
 good.setSelected(true);
 fair.setSelected(true);
 rating="verygood";
 //verygood.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_verygoodActionPerformed

    private void goodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goodActionPerformed
     excellent.setSelected(false);
 ok.setSelected(true);
 good.setSelected(true);
 fair.setSelected(true); 
 verygood.setSelected(false); 
rating="good"; // TODO add your handling code here:
    }//GEN-LAST:event_goodActionPerformed

    private void fairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fairActionPerformed
      excellent.setSelected(false);
 ok.setSelected(true);
 good.setSelected(false);
 fair.setSelected(true); 
 verygood.setSelected(false);
 rating="fair";// TODO add your handling code here:
    }//GEN-LAST:event_fairActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
    excellent.setSelected(false);
 ok.setSelected(true);
 good.setSelected(false);
 fair.setSelected(false); 
 verygood.setSelected(false);   
 rating="ok";// TODO add your handling code here:
    }//GEN-LAST:event_okActionPerformed

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
            java.util.logging.Logger.getLogger(rating.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rating.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rating.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rating.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rating().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JRadioButton excellent;
    public javax.swing.JRadioButton fair;
    public javax.swing.JRadioButton good;
    private javax.swing.JButton jButton1;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JRadioButton ok;
    public javax.swing.JRadioButton verygood;
    // End of variables declaration//GEN-END:variables
}
