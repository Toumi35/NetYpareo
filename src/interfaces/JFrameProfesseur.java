package interfaces;


public class JFrameProfesseur extends javax.swing.JFrame
{
    public JFrameProfesseur()
    {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        combo2 = new javax.swing.JComboBox();
        jSeparator3 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teacher Frame To Manage Teachers"); // NOI18N
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        setName("frameStudent"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setToolTipText("Teacher Frame"); // NOI18N

        jLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel.setText("Informations"); // NOI18N

        jLabel3.setText("ID :"); // NOI18N

        jLabel4.setText("Nom :"); // NOI18N

        jLabel5.setText("Matière(s) :"); // NOI18N

        code.setToolTipText("Teacher Code ! Click to edit"); // NOI18N
        code.setEnabled(false);
        code.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                codeMouseClicked(evt);
            }
        });
        code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeActionPerformed(evt);
            }
        });
        code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codeKeyPressed(evt);
            }
        });

        name.setToolTipText("Teacher Name ! Click to edit"); // NOI18N
        name.setEnabled(false);
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameMouseClicked(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
        });

        age.setToolTipText("Teacher Age ! Click to edit"); // NOI18N
        age.setEnabled(false);
        age.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ageMouseClicked(evt);
            }
        });
        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageKeyPressed(evt);
            }
        });

        jButton1.setText("Ajouter un professeur"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProf(evt);
            }
        });

        jButton2.setText("Sélectionner un professeur"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectProf(evt);
            }
        });

        jButton3.setText("Supprimer un professeur"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteProf(evt);
            }
        });

        jButton4.setText("Chercher un professeur"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindProf(evt);
            }
        });

        jButton7.setText("Retour Accueil"); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackHome(evt);
            }
        });

        jLabel8.setText("Nom du professeur : "); // NOI18N

        combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListNomProf(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator3)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(code, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(age, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combo2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(25, 25, 25)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addGap(103, 103, 103)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("Fichier"); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFichier(evt);
            }
        });

        jMenuItem2.setText("Ajouter un professeur"); // NOI18N
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAddProf(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Sélectionner un professeur"); // NOI18N
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSelectProf(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Supprimer un professeur"); // NOI18N
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDeleteProf(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Trouver un professeur"); // NOI18N
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFindProf(evt);
            }
        });
        jMenu1.add(jMenuItem5);
        jMenu1.add(jSeparator2);

        jMenuItem6.setText("Retour Accueil"); // NOI18N
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBackHome(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void MenuAddProf(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAddProf
    this.addTeacher();
}//GEN-LAST:event_MenuAddProf

private void MenuFichier(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFichier

}//GEN-LAST:event_MenuFichier

private void MenuDeleteProf(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDeleteProf
    this.deleteTeacher();
}//GEN-LAST:event_MenuDeleteProf

private void MenuFindProf(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFindProf

}//GEN-LAST:event_MenuFindProf

private void MenuSelectProf(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSelectProf
    this.setTeacher();
}//GEN-LAST:event_MenuSelectProf

private void MenuBackHome(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBackHome
    this.hide();
}//GEN-LAST:event_MenuBackHome

private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    this.hide();
}//GEN-LAST:event_formWindowClosed

    private void ListNomProf(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListNomProf
    this.selectedTeacher((String)this.combo2.getSelectedItem());
    }//GEN-LAST:event_ListNomProf

    private void BackHome(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackHome
        this.hide();
    }//GEN-LAST:event_BackHome

    private void FindProf(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindProf

    }//GEN-LAST:event_FindProf

    private void DeleteProf(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteProf
        this.deleteTeacher();
    }//GEN-LAST:event_DeleteProf

    private void SelectProf(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectProf
        this.setTeacher();
    }//GEN-LAST:event_SelectProf

    private void AddProf(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProf
        this.addTeacher();
    }//GEN-LAST:event_AddProf

    private void ageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyPressed
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER)
            this.setTeacher();
    }//GEN-LAST:event_ageKeyPressed

    private void ageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ageMouseClicked

    }//GEN-LAST:event_ageMouseClicked

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
            this.setTeacher();
    }//GEN-LAST:event_nameKeyPressed

    private void nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMouseClicked

    }//GEN-LAST:event_nameMouseClicked

    private void codeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeKeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
            this.setTeacher();
    }//GEN-LAST:event_codeKeyPressed

    private void codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeActionPerformed

    }//GEN-LAST:event_codeActionPerformed

    private void codeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codeMouseClicked

    }//GEN-LAST:event_codeMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JTextField code;
    private javax.swing.JComboBox combo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
    
    private void selectedTeacher(int code)
    {
        
    }
    private void selectedTeacher(String name)
    {
        
    }

    public void setTeacher() 
    {
        
    }

    public void deleteTeacher()
    {
        
    }

    public void addTeacher()
    {
        
    }

    private void findTeacher(int code)
    {
        
    }
    
    private void findTeacher(String name)
    {
        
    }
}