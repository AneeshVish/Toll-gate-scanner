
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class tolldetails extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;


    public tolldetails() {
        initComponents();
    this.setLocationRelativeTo(null);
    dt();
        //conn=javaconnect.connecrDb();
    }
public tolldetails(String st,String ed,String vt,String us,String nu) {
        initComponents();
        //sta.setText(st);
       String s=st;
        String e=ed;
       String v=vt;
       String u=us;
       String n=nu;
       vehicle_number.setText(n);
        start.setText(s);
        end.setText(e);
       by.setText(vt);
       username.setText(u);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tollnames = new javax.swing.JTable();
        view = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        start = new javax.swing.JLabel();
        end = new javax.swing.JLabel();
        by = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        sum_of_amount = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tollverify = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        vehicle_number = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TOLL PAYMENT SYSTEM");

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        tollnames.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "toll_names", "amount"
            }
        ));
        jScrollPane1.setViewportView(tollnames);

        view.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        view.setText("VIEW TOLLS");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("FROM :-");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TO :-");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BY :-");

        submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        start.setBackground(new java.awt.Color(102, 255, 255));
        start.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        start.setForeground(new java.awt.Color(255, 255, 255));
        start.setText("jLabel5");

        end.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        end.setForeground(new java.awt.Color(255, 255, 255));
        end.setText("jLabel6");

        by.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        by.setForeground(new java.awt.Color(255, 255, 255));
        by.setText("jLabel7");

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButton1.setText("SINGLE TRIP");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButton2.setText("RETURN TRIP");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("TOTAL AMOUNT :-");

        sum_of_amount.setBackground(new java.awt.Color(51, 204, 255));
        sum_of_amount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("SELECT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tollverify.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "toll_names", "amount"
            }
        ));
        jScrollPane2.setViewportView(tollverify);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("user:-");

        username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        username.setText("username");

        vehicle_number.setForeground(new java.awt.Color(51, 204, 255));
        vehicle_number.setText("jLabel6");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("REMOVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        time.setForeground(new java.awt.Color(51, 204, 255));
        time.setText("jLabel8");

        date.setForeground(new java.awt.Color(51, 204, 255));
        date.setText("jLabel6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(end, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(by, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(time)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vehicle_number)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton1)
                                            .addComponent(jButton2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(sum_of_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(view)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(submit)
                                        .addGap(18, 18, 18)
                                        .addComponent(date))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(start)
                            .addComponent(end)
                            .addComponent(by)
                            .addComponent(vehicle_number)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(username))
                    .addComponent(time))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jToggleButton1)
                                    .addComponent(jButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jToggleButton2)
                                    .addComponent(jButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sum_of_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(submit)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(date))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
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

        jMenuItem3.setText("PROFILE");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setText("HISTORY");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem6.setText("FEDDBACK");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
tollnames.setModel(new DefaultTableModel(null,new String[]{"toll_names","amount"}));
   
String f,d,t;
f=start.getText();
d=end.getText();
t=by.getText();

try{
String url="com.mysql.cj.jdbc.Driver";
Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/toll","root","");
Statement s = c.createStatement();
String sql="select * from route where start='"+f+"' and end='"+d+"' and vehicle_type='"+t+"'";
ResultSet rs=s.executeQuery(sql);
while(rs.next()){
String toll_names=rs.getString("toll_name");
String amount=String.valueOf(rs.getInt("amount"));

String tbData[]={toll_names,amount};
DefaultTableModel tblModel=(DefaultTableModel)tollnames.getModel();

tblModel.addRow(tbData);
}
    
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null,"ERROR : Cannot insert data into database");
System.out.println(ex);
}         
// TODO add your handling code here:
    }//GEN-LAST:event_viewActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       String a; 
a=sum_of_amount.getText(); 
String f,d,t,u,n;
u=username.getText();
f=start.getText();
d=end.getText();
n=vehicle_number.getText();
t=by.getText();

        try
{
String url="com.mysql.cj.jdbc.Driver";
Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/toll","root","");
for(int i=0;i<tollverify.getRowCount();i++){

String toll=tollverify.getValueAt(i,0).toString();
String am=tollverify.getValueAt(i,1).toString();
Statement st = c.createStatement();
if(tollcheck.toll(toll,n))
{ 
  JOptionPane.showMessageDialog(null,"Allready paid for this toll");
}
else
{st.execute("INSERT INTO history ( username,start,end,toll_name,date,time,vehicle_number,vehicle_type, amount ,verification) VALUES ('"+u+"','"+f+"','"+d+"','"+toll+"','"+date.getText()+"','"+time.getText()+"','"+n+"','"+t+"','"+am+"','Paid/not verified')");
st.close();
JOptionPane.showMessageDialog(null,"paid for toll","paid for toll",JOptionPane.INFORMATION_MESSAGE);
try
{
String ur="com.mysql.cj.jdbc.Driver";
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toll","root","");
Statement stt = con.createStatement();
String sql = "SELECT wallet FROM userregister where username='"+u+"'";
ResultSet r = stt.executeQuery(sql);
while(r.next())
{String w=r.getString("wallet");
                                         
userpayment userpayment=new userpayment();
userpayment.start.setText(f);
userpayment.end.setText(d);
userpayment.by.setText(t);
userpayment.username.setText(u);
userpayment.amount.setText(a);
userpayment.jLabel3.setText(a);
userpayment.wallet.setText(w);
userpayment.setVisible(true);
this.setVisible(false);
 }}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null,ex);
System.out.println(ex);
}}}}
        catch(Exception ex)
{
JOptionPane.showMessageDialog(null,ex);
System.out.println(ex);
}
        
    }//GEN-LAST:event_submitActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        int sum = 0;
jToggleButton2.setSelected(false);
        for(int i = 0; i < tollverify.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(tollverify.getValueAt(i,1).toString());
        }
        sum_of_amount.setText(Integer.toString(sum));
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        int sum = 0;
        float s;
        jToggleButton1.setSelected(false);
        for(int i = 0; i < tollverify.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(tollverify.getValueAt(i,1).toString());
        }
        s=sum+(sum/2);
        sum_of_amount.setText(Float.toString(s));
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
tollverify.setModel(new DefaultTableModel(null,new String[]{"toll_names","amount"}));
        TableModel model1 = tollnames.getModel();
        int indexs[] = tollnames.getSelectedRows();
        
        Object[] row = new Object[4];
        DefaultTableModel model2=(DefaultTableModel)tollverify.getModel();
        
        for(int i = 0; i < indexs.length; i++)
        {
            row[0] = model1.getValueAt(indexs[i], 0);
            row[1] = model1.getValueAt(indexs[i], 1);            
            model2.addRow(row);
        } // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
userprofile userprofile = new userprofile();
userprofile.setVisible(true);
userprofile.username.setText(username.getText());
this.setVisible(false);
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
int selectedRow = tollverify.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)tollverify.getModel();
        int SelectedRowIndex = tollverify.getSelectedRow();
model.removeRow(SelectedRowIndex);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
userfeedback userfeedback=new userfeedback();
userfeedback.setVisible(true);
userfeedback.username.setText(username.getText());
this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(tolldetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tolldetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tolldetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tolldetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tolldetails().setVisible(true);
            }
        });
    }
public void dt(){
Calendar Calendar= new GregorianCalendar();
int month=Calendar.get(Calendar.MONTH);
int year=Calendar.get(Calendar.YEAR);
int day=Calendar.get(Calendar.DAY_OF_MONTH);
date.setText((day+"-"+(month+1)+"-"+year));
int second=Calendar.get(Calendar.SECOND);
int minute=Calendar.get(Calendar.MINUTE);
int hour=Calendar.get(Calendar.HOUR);
time.setText(hour+":"+minute+":"+second);
}

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel by;
    private javax.swing.JLabel date;
    public javax.swing.JLabel end;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    public javax.swing.JLabel start;
    private javax.swing.JButton submit;
    private javax.swing.JLabel sum_of_amount;
    private javax.swing.JLabel time;
    private javax.swing.JTable tollnames;
    private javax.swing.JTable tollverify;
    public javax.swing.JLabel username;
    public javax.swing.JLabel vehicle_number;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables

}
class tollcheck
{
static boolean toll(String toll_name,String vehicle_number)
{
try
{
    String ur="com.mysql.cj.jdbc.Driver";
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toll","root","");
Statement s = con.createStatement();
String code = "SELECT username,toll_name,vehicle_number,vehicle_type, verification FROM history";
ResultSet rec = s.executeQuery(code);
while(rec.next())
{
if(toll_name.equals(rec.getString("toll_name")) && vehicle_number.equals(rec.getString("vehicle_number")) && "Paid/not verified".equals(rec.getString("verification")))
{return true;
}}
return false;
}
catch(Exception e)
{
System.out.println(e);
}
return false;
}
private void displayError(String err)
{
JOptionPane.showMessageDialog(null,err,"ERROR",JOptionPane.ERROR_MESSAGE);
}}
