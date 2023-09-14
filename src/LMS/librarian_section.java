package LMS;
import java.sql.*;
import javax.swing.JOptionPane;

public class librarian_section extends javax.swing.JFrame {

    public librarian_section() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        view_issue_bookpg_btn = new javax.swing.JButton();
        issue_bookpg_btn = new javax.swing.JButton();
        logout_btn = new javax.swing.JButton();
        add_bookpg_btn = new javax.swing.JButton();
        view_bookpg_btn = new javax.swing.JButton();
        return_bookpg_btn = new javax.swing.JButton();
        view_return_bookpg_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Old English Text MT", 0, 48)); // NOI18N
        jLabel1.setText(" Librarian section");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        view_issue_bookpg_btn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        view_issue_bookpg_btn.setText("VIEW ISSUE BOOKS");
        view_issue_bookpg_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_issue_bookpg_btnActionPerformed(evt);
            }
        });

        issue_bookpg_btn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        issue_bookpg_btn.setText("ISSUE BOOKS");
        issue_bookpg_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issue_bookpg_btnActionPerformed(evt);
            }
        });

        logout_btn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        logout_btn.setText("LOGOUT");
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });

        add_bookpg_btn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add_bookpg_btn.setText("ADD BOOKS");
        add_bookpg_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_bookpg_btnActionPerformed(evt);
            }
        });

        view_bookpg_btn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        view_bookpg_btn.setText("VIEW BOOKS");
        view_bookpg_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_bookpg_btnActionPerformed(evt);
            }
        });

        return_bookpg_btn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        return_bookpg_btn.setText("RETUREN BOOKS");
        return_bookpg_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_bookpg_btnActionPerformed(evt);
            }
        });

        view_return_bookpg_btn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        view_return_bookpg_btn.setText("VIEW RETUREN BOOKS");
        view_return_bookpg_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_return_bookpg_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(view_bookpg_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_bookpg_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(return_bookpg_btn))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(issue_bookpg_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(view_return_bookpg_btn)
                            .addComponent(view_issue_bookpg_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_bookpg_btn)
                    .addComponent(issue_bookpg_btn))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(view_bookpg_btn)
                    .addComponent(view_issue_bookpg_btn))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(return_bookpg_btn)
                    .addComponent(view_return_bookpg_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(logout_btn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void issue_bookpg_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issue_bookpg_btnActionPerformed
        issue_books.main(new String[] {});
    }//GEN-LAST:event_issue_bookpg_btnActionPerformed

    private void view_issue_bookpg_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_issue_bookpg_btnActionPerformed
            view_issue_books.main(new String[] {});
    }//GEN-LAST:event_view_issue_bookpg_btnActionPerformed

    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
         Main_Page.main(new String[] {});
    }//GEN-LAST:event_logout_btnActionPerformed

    private void add_bookpg_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_bookpg_btnActionPerformed
        add_books.main(new String[] {});
    }//GEN-LAST:event_add_bookpg_btnActionPerformed

    private void return_bookpg_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_bookpg_btnActionPerformed
         return_books.main(new String[] {});
    }//GEN-LAST:event_return_bookpg_btnActionPerformed

    private void view_bookpg_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_bookpg_btnActionPerformed
            view_books.main(new String[] {});   
    }//GEN-LAST:event_view_bookpg_btnActionPerformed

    private void view_return_bookpg_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_return_bookpg_btnActionPerformed
        view_return_books.main(new String[] {});
    }//GEN-LAST:event_view_return_bookpg_btnActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new librarian_section().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_bookpg_btn;
    private javax.swing.JButton issue_bookpg_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout_btn;
    private javax.swing.JButton return_bookpg_btn;
    private javax.swing.JButton view_bookpg_btn;
    private javax.swing.JButton view_issue_bookpg_btn;
    private javax.swing.JButton view_return_bookpg_btn;
    // End of variables declaration//GEN-END:variables
}
