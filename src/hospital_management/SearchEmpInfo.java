/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospital_management;

// import com.sun.org.apache.bcel.internal.generic.GOTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tirke
 */
public class SearchEmpInfo extends javax.swing.JFrame {

    /**
     * Creates new form SearchEmpInfo
     */
    public SearchEmpInfo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Name = new javax.swing.JRadioButton();
        empid = new javax.swing.JRadioButton();
        search_var = new javax.swing.JTextField();
        search_button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SEARCH BY", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        Name.setText("Name");

        empid.setText("Employee ID");

        search_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search_button.setForeground(new java.awt.Color(153, 0, 153));
        search_button.setText("SEARCH");
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(search_var, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Name)
                                    .addComponent(empid)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(search_button)))
                        .addGap(0, 116, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Name)
                .addGap(1, 1, 1)
                .addComponent(search_var, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(empid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(search_button))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONTACT INFO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jTextField2.setEditable(false);

        jTextField3.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(jTextField3))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 0));
        jButton2.setText("CLEAR FIELDS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp ID", "Name", "Gender", "Address", "EmpType", "Date of Joining", "Email ID", "Dept Name", "Salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Search Employee Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(100, 100, 100)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButton1)
                        .addGap(54, 54, 54)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
        String hg=search_var.getText();
        if(hg.equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please Search a valid data value");
        }
        else{
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hm_db", "root", "myOracle9@ju");
                Statement stmt = conn.createStatement();
                String str, query, query1;
                ResultSet rs, rs1, rs2, rs3, rs4;
                int eid, i , j;
                if (Name.isSelected() == true) {
                    Statement stmt2 = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                    str = search_var.getText();
                    query = "Select empid from employee where fname like \"%" + str + "%\";";
                    rs = stmt2.executeQuery(query);
                    System.out.println(query);
                    int deptid = 0, k = 0;
                    int empidf[] = new int[100];
                    if (rs.next()) {
                        rs.previous();
                        i=0;
                        while (rs.next()) {
                            empidf[k] = rs.getInt(1);
                            k++;
                        }
                        for (int x = 0; x < k; x++) {
                            eid = empidf[x];
                            query = "SELECT empid,CONCAT(fname,\" \", mname,\" \", lname),"
                            + "gender,CONCAT(Hno,\" \",Street,\" \", City,\" \",State),emptype,date_of_joining,email,deptid FROM employee WHERE empid=" + eid + ";";
                            rs4 = stmt.executeQuery(query);
                            System.out.println(query);
                            String etype = "DOCTOR";
                            if (rs4.next()) {
                                model.addRow(new Object[]{"" + rs4.getInt(1), rs4.getString(2), rs4.getString(3), rs4.getString(4), rs4.getString(5),
                                    rs4.getString(6), rs4.getString(7)});
                            deptid = rs4.getInt(8);
                            etype = "" + rs4.getString(5);
                        }
                        rs4.close();

                        query = "Select dname from department where deptid=" + deptid + ";";
                        rs2 = stmt.executeQuery(query);
                        System.out.println(query);

                        if (rs2.next()) {
                            model.setValueAt(rs2.getString(1), model.getRowCount() - 1, 7);
                        }
                        rs2.close();
                        query = "Select salary from salary where etype=\"" + etype + "\";";
                        rs3 = stmt.executeQuery(query);
                        System.out.println(query);
                        if (rs3.next()) {
                            model.setValueAt(rs3.getFloat(1), model.getRowCount() - 1, 8);
                        }

                    }
                }
                else
                {
                    i=10;
                }
                query = "Select empid from employee_inactive where fname like \"%" + str + "%\";";
                System.out.println(""+query);
                rs1 = stmt.executeQuery(query);
                System.out.println(query);
                if(rs1.next()) {
                    rs1.previous();
                    j=0;
                    while (rs1.next()) {
                        empidf[k] = rs1.getInt(1);
                        k++;
                    }
                    for (int x = 0; x < k; x++) {
                        eid = empidf[x];
                        query = "SELECT empid,CONCAT(fname,\" \", mname,\" \",lname),gender,"
                        + "CONCAT(Hno,\" \", Street, \" \",City,\" \", State),emptype,date_of_joining,email FROM employee_inactive WHERE empid=" + eid + ";";
                        rs4 = stmt.executeQuery(query);
                        System.out.println(query);
                        String etype = "DOCTOR";
                        if (rs4.next()) {
                            model.addRow(new Object[]{"" + rs4.getInt(1), rs4.getString(2), rs4.getString(3), rs4.getString(4), rs4.getString(5),
                                rs4.getString(6), rs4.getString(7),"NULL"});
                        etype = rs4.getString(5);
                    }
                    query = "Select salary from salary where etype=\"" + etype + "\";";
                    rs3 = stmt.executeQuery(query);
                    System.out.println(query);

                    if (rs3.next()) {
                        System.out.println(""+rs3.getFloat(1));
                        model.setValueAt(rs3.getFloat(1), model.getRowCount() - 1, 8);
                    }
                }
            }
            else
            {
                j=10;
            }
            if(i==10 && j==10)
            {
                i=j=0;
                JOptionPane.showMessageDialog(null,"Record Not Found!");
            }
        } else if (empid.isSelected() == true) {
            eid = Integer.parseInt(search_var.getText());
            query = "Select empid from employee where empid=" + eid + ";";
            rs = stmt.executeQuery(query);
            int deptid = 0;
            if (rs.next()) {
                i=0;
                query = "SELECT empid,CONCAT(fname,\" \", mname,\" \", lname),"
                + "gender,CONCAT(Hno,\" \", Street,\" \", City,\" \", State),emptype,date_of_joining,email,deptid FROM employee WHERE empid=" + eid + ";";
                rs = stmt.executeQuery(query);
                String etype = "DOCTOR";
                if (rs.next()) {
                    System.out.println("" + rs.getString(2));
                    model.addRow(new Object[]{"" + rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7)});
                deptid = rs.getInt(8);
                etype = "" + rs.getString(5);
            }
            rs.close();
            query1 = "Select phoneno from emp_phone where empid=" + eid + ";";
            rs1 = stmt.executeQuery(query1);

            if (rs1.next()) {
                jTextField2.setText("" + rs1.getString(1));
            }
            if (rs1.next()) {
                jTextField3.setText("" + rs1.getString(1));
            }
            rs1.close();

            query = "Select dname from department where deptid=" + deptid + ";";
            rs2 = stmt.executeQuery(query);
            if (rs2.next()) {
                model.setValueAt(rs2.getString(1), model.getRowCount() - 1, 7);
            }
            rs2.close();
            query = "Select salary from salary where etype=\"" + etype + "\";";
            rs3 = stmt.executeQuery(query);
            if (rs3.next()) {
                model.setValueAt(rs3.getFloat(1), model.getRowCount() - 1, 8);
            }
            rs.close();
            rs1.close();
            rs3.close();
            rs2.close();
        }
        else
        {
            i=10;
        }
        query = "Select empid from employee_inactive where empid=" + eid + ";";
        System.out.println("" +eid);
        rs1 = stmt.executeQuery(query);
        if (rs1.next()) {
            j=0;
            rs1.close();
            query = "SELECT empid,CONCAT(fname, mname, lname),gender,"
            + "CONCAT(Hno, Street, City, State),emptype,date_of_joining,email FROM employee_inactive WHERE empid=" + eid + ";";
            rs = stmt.executeQuery(query);
            String etype = "DOCTOR";
            if (rs.next()) {
                System.out.println("" + rs.getString(2));
                model.addRow(new Object[]{"" + rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                    rs.getString(6), rs.getString(7),"NULL"});
            etype =""+rs.getString(5);
        }
        rs.close();
        query1 = "Select phoneno from emp_phone where empid=" + eid + ";";
        rs1 = stmt.executeQuery(query1);
        if (rs1.next()) {
            jTextField2.setText("" + rs1.getString(1));
        }
        if (rs1.next()) {
            jTextField3.setText("" + rs1.getString(1));
        }
        query = "Select salary from salary where etype=\"" + etype+ "\";";
        rs3 = stmt.executeQuery(query);
        if (rs3.next()) {
            model.setValueAt(rs3.getFloat(1), model.getRowCount() - 1, 8);
        }
        }else
        {
            j=10;
        }
        if(i==10 && j==10)
        {
            i=j=0;
            JOptionPane.showMessageDialog(null,"Record Not Found!");
        }

        }

        stmt.close();
        conn.close();
        search_var.setText("");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in connectivity" + e.getMessage());
        }
        }// TODO add your handling code here:
        
    }//GEN-LAST:event_search_buttonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        search_var.setText(null);
        Name.setSelected(true);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rows = model.getRowCount();
        if (rows > 0) {
            for (int i = 0; i < rows; i++) {
                model.removeRow(0);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new AdminInfo().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        Name.setSelected(true);        // TODO add your handling code here:
    }                                 

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased

        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyReleased

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
            java.util.logging.Logger.getLogger(SearchEmpInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchEmpInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchEmpInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchEmpInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchEmpInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Name;
    private javax.swing.JRadioButton empid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton search_button;
    private javax.swing.JTextField search_var;
    // End of variables declaration//GEN-END:variables
}