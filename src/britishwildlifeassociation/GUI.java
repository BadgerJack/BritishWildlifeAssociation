package britishwildlifeassociation;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author hobbes
 */
public class GUI extends javax.swing.JFrame {

    static DefaultListModel animList = new DefaultListModel();
    static DefaultListModel profList = new DefaultListModel();
    static DefaultListModel volList = new DefaultListModel();
    static DefaultListModel obsList = new DefaultListModel();

    /**
     * Creates new form GUI and populates with hard coded values
     */
    public GUI(){
        initComponents();
        Controller.checkDates();
        Controller.populate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnNewObservation = new javax.swing.JButton();
        btnEditObservation = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstObservations = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        btnAddAnimal = new javax.swing.JButton();
        btnEditAnimal = new javax.swing.JButton();
        btnViewAlertHistory = new javax.swing.JButton();
        btnIssueAlert = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstAnimals = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        btnEditObserver = new javax.swing.JButton();
        btnNewObserver = new javax.swing.JButton();
        btnMakeProfessional = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstProfessional = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstVolunteer = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("British Wildlife Association");
        setResizable(false);

        btnNewObservation.setText("New Observation");
        btnNewObservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewObservationActionPerformed(evt);
            }
        });

        btnEditObservation.setText("Edit Observation");
        btnEditObservation.setMaximumSize(new java.awt.Dimension(112, 25));
        btnEditObservation.setMinimumSize(new java.awt.Dimension(112, 25));
        btnEditObservation.setPreferredSize(new java.awt.Dimension(112, 25));
        btnEditObservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditObservationActionPerformed(evt);
            }
        });

        lstObservations.setModel(obsList);
        jScrollPane1.setViewportView(lstObservations);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNewObservation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditObservation, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNewObservation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditObservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Observations", jPanel1);

        btnAddAnimal.setText("Add Animal");
        btnAddAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAnimalActionPerformed(evt);
            }
        });

        btnEditAnimal.setText("Edit Animal");
        btnEditAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAnimalActionPerformed(evt);
            }
        });

        btnViewAlertHistory.setText("View Alerts");
        btnViewAlertHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAlertHistoryActionPerformed(evt);
            }
        });

        btnIssueAlert.setText("Issue Alert");
        btnIssueAlert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueAlertActionPerformed(evt);
            }
        });

        lstAnimals.setModel(animList);
        jScrollPane2.setViewportView(lstAnimals);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddAnimal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditAnimal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIssueAlert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewAlertHistory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAddAnimal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditAnimal)
                        .addGap(62, 62, 62)
                        .addComponent(btnIssueAlert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewAlertHistory))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Watchlist", jPanel2);

        btnEditObserver.setText("Edit Observer");
        btnEditObserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditObserverActionPerformed(evt);
            }
        });

        btnNewObserver.setText("New Observer");
        btnNewObserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewObserverActionPerformed(evt);
            }
        });

        btnMakeProfessional.setText("Give Contract");
        btnMakeProfessional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeProfessionalActionPerformed(evt);
            }
        });

        lstProfessional.setModel(profList);
        lstProfessional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstProfessionalMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(lstProfessional);

        lstVolunteer.setModel(volList);
        lstVolunteer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstVolunteerMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(lstVolunteer);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnNewObserver, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(btnEditObserver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMakeProfessional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnNewObserver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditObserver)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnMakeProfessional)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane5.addTab("Observers", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewObservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewObservationActionPerformed
        JFrame newObs = new ObservationNew();
        newObs.setVisible(true);
    }//GEN-LAST:event_btnNewObservationActionPerformed

    private void btnEditObservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditObservationActionPerformed
        if (lstObservations.isSelectionEmpty() == false) {
            Observation observation = null;

            for (Animal animal : Controller.animals) {
                for (Observation obs : animal.getAnnualObservations()) {
                    if (obs.produceDescriptionString().equals(lstObservations.getSelectedValue())) {
                        observation = obs;
                        break;
                    }
                }
            }

            JFrame editObs = new ObservationEdit(observation);
            editObs.setVisible(true);
        }
    }//GEN-LAST:event_btnEditObservationActionPerformed

    private void btnAddAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAnimalActionPerformed
        JFrame newAnimal = new AnimalNew();
        newAnimal.setVisible(true);
    }//GEN-LAST:event_btnAddAnimalActionPerformed

    private void btnEditAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAnimalActionPerformed
        if (lstAnimals.isSelectionEmpty() == false) {
            Animal anim = null;

            for (Animal animal : Controller.animals) {
                if (animal.produceDescriptionString().equals(lstAnimals.getSelectedValue())) {
                    anim = animal;
                    break;
                }
            }
            JFrame editAnimal = new AnimalEdit(anim);
            editAnimal.setVisible(true);
        }
    }//GEN-LAST:event_btnEditAnimalActionPerformed

    private void btnIssueAlertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueAlertActionPerformed
        if (lstAnimals.isSelectionEmpty() == false) {
            Animal anim = null;

            for (Animal animal : Controller.animals) {
                if (animal.produceDescriptionString().equals(lstAnimals.getSelectedValue())) {
                    anim = animal;
                    break;
                }
            }
            JFrame newObsCall = new ObservationCallNew(anim);
            newObsCall.setVisible(true);
        }
    }//GEN-LAST:event_btnIssueAlertActionPerformed

    private void btnViewAlertHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAlertHistoryActionPerformed
        if (lstAnimals.isSelectionEmpty() == false) {
            Animal anim = null;

            for (Animal animal : Controller.animals) {
                if (animal.produceDescriptionString().equals(lstAnimals.getSelectedValue())) {
                    anim = animal;
                    break;
                }
            }
            JFrame ObsCallList = new ObservationCallList(anim);
            ObsCallList.setVisible(true);
        }
    }//GEN-LAST:event_btnViewAlertHistoryActionPerformed

    private void btnNewObserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewObserverActionPerformed
        JFrame newObserver = new ObserverNew();
        newObserver.setVisible(true);
    }//GEN-LAST:event_btnNewObserverActionPerformed

    private void btnEditObserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditObserverActionPerformed
        Observer volun = null;
        if (lstVolunteer.isSelectionEmpty() == false) {
            for (Volunteer volunteer : Controller.volunteers) {
                if (volunteer.produceDescriptionString().equals(lstVolunteer.getSelectedValue())) {
                    volun = volunteer;
                    break;
                }
            }

            JFrame editObserver = new ObserverEdit(volun);
            editObserver.setVisible(true);

        } else if (lstProfessional.isSelectionEmpty() == false) {
            for (Professional professional : Controller.professionals) {
                if (professional.produceDescriptionString().equals(lstProfessional.getSelectedValue())) {
                    volun = professional;
                    break;
                }
            }

            JFrame editObserver = new ObserverEdit(volun);
            editObserver.setVisible(true);
        }
    }//GEN-LAST:event_btnEditObserverActionPerformed

    private void btnMakeProfessionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeProfessionalActionPerformed
        if (lstVolunteer.isSelectionEmpty() == false) {
            Volunteer volun = null;

            for (Volunteer volunteer : Controller.volunteers) {
                if (volunteer.produceDescriptionString().equals(lstVolunteer.getSelectedValue())) {
                    volun = volunteer;
                    break;
                }
            }
            JFrame makeProf = new ObserverMakeProf(volun);
            makeProf.setVisible(true);
        }
    }//GEN-LAST:event_btnMakeProfessionalActionPerformed

    private void lstProfessionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstProfessionalMouseClicked
        lstVolunteer.clearSelection();
    }//GEN-LAST:event_lstProfessionalMouseClicked

    private void lstVolunteerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstVolunteerMouseClicked
        lstProfessional.clearSelection();
    }//GEN-LAST:event_lstVolunteerMouseClicked

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
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                    new GUI().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAnimal;
    private javax.swing.JButton btnEditAnimal;
    private javax.swing.JButton btnEditObservation;
    private javax.swing.JButton btnEditObserver;
    private javax.swing.JButton btnIssueAlert;
    private javax.swing.JButton btnMakeProfessional;
    private javax.swing.JButton btnNewObservation;
    private javax.swing.JButton btnNewObserver;
    private javax.swing.JButton btnViewAlertHistory;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JList lstAnimals;
    private javax.swing.JList lstObservations;
    private javax.swing.JList lstProfessional;
    private javax.swing.JList lstVolunteer;
    // End of variables declaration//GEN-END:variables
}
