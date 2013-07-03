package interfaces;

import ypareoEntities.Etudiant;


public class JFrameEtudiant extends javax.swing.JFrame
{
    public JFrameEtudiant()
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
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JSeparator();
        jMenuItem17 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Frame To Manage Students"); // NOI18N
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        setName("frameStudent"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setToolTipText("Student Frame"); // NOI18N

        jLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel.setText("Informations"); // NOI18N

        jLabel3.setText("ID :"); // NOI18N

        jLabel4.setText("Nom :"); // NOI18N

        jLabel5.setText("Prénom :"); // NOI18N

        code.setToolTipText("Student Code ! Click to edit"); // NOI18N
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

        name.setToolTipText("Student Name ! Click to edit"); // NOI18N
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

        age.setToolTipText("Student Age ! Click to edit"); // NOI18N
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

        jButton1.setText("Ajouter un étudiant"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEtudiant(evt);
            }
        });

        jButton2.setText("Sélectioner un étudiant"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectEtudiant(evt);
            }
        });

        jButton3.setText("Supprimer un étudiant"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteEtudiant(evt);
            }
        });

        jButton4.setText("Trouver un étudiant"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindEtudiant(evt);
            }
        });

        jButton7.setText("Retour Accueil"); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackHome(evt);
            }
        });

        jLabel8.setText("Nom de l'étudiant :"); // NOI18N

        combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListFindEtudiant(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
            .addComponent(jLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(code, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(age, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jButton7))
        );

        jMenu5.setText("Fichier"); // NOI18N
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFichier(evt);
            }
        });

        jMenuItem13.setText("Ajouter un étudiant"); // NOI18N
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAddEtudiant(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuItem14.setText("Sélectionner un étudiant"); // NOI18N
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSelectEtudiant(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuItem15.setText("Supprimer un étudiant"); // NOI18N
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDeleteEtudiant(evt);
            }
        });
        jMenu5.add(jMenuItem15);

        jMenuItem16.setText("Trouver un étudiant"); // NOI18N
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFindEtudiant(evt);
            }
        });
        jMenu5.add(jMenuItem16);
        jMenu5.add(jSeparator5);

        jMenuItem17.setText("Retour Accueil"); // NOI18N
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBackHome(evt);
            }
        });
        jMenu5.add(jMenuItem17);

        jMenuBar3.add(jMenu5);

        setJMenuBar(jMenuBar3);

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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void SelectEtudiant(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectEtudiant
    this.setEtudiant();
}//GEN-LAST:event_SelectEtudiant

private void AddEtudiant(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEtudiant
    this.addEtudiant();
}//GEN-LAST:event_AddEtudiant

private void codeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codeMouseClicked

}//GEN-LAST:event_codeMouseClicked

private void nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMouseClicked

}//GEN-LAST:event_nameMouseClicked

private void ageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ageMouseClicked

}//GEN-LAST:event_ageMouseClicked

private void DeleteEtudiant(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteEtudiant
    this.deleteEtudiant();
}//GEN-LAST:event_DeleteEtudiant

private void codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeActionPerformed

}//GEN-LAST:event_codeActionPerformed

private void FindEtudiant(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindEtudiant

}//GEN-LAST:event_FindEtudiant

private void MenuAddEtudiant(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAddEtudiant
    this.addEtudiant();
}//GEN-LAST:event_MenuAddEtudiant

private void MenuFichier(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFichier

}//GEN-LAST:event_MenuFichier

private void MenuDeleteEtudiant(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDeleteEtudiant
    this.deleteEtudiant();
}//GEN-LAST:event_MenuDeleteEtudiant

private void MenuFindEtudiant(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFindEtudiant

}//GEN-LAST:event_MenuFindEtudiant

private void MenuSelectEtudiant(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSelectEtudiant
    this.setEtudiant();
}//GEN-LAST:event_MenuSelectEtudiant

private void MenuBackHome(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBackHome
    this.hide();
}//GEN-LAST:event_MenuBackHome

private void codeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeKeyPressed
    if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER)
        this.setEtudiant();
}//GEN-LAST:event_codeKeyPressed

private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
     if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER)
        this.setEtudiant();
}//GEN-LAST:event_nameKeyPressed

private void ageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyPressed
     if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER)
        this.setEtudiant();
}//GEN-LAST:event_ageKeyPressed

private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    this.hide();
}//GEN-LAST:event_formWindowClosed

private void BackHome(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackHome
    this.hide();
}//GEN-LAST:event_BackHome

private void ListFindEtudiant(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListFindEtudiant

}//GEN-LAST:event_ListFindEtudiant

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
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
    
    
       
    private void selectedEtudiant()
    {
        
    }

    private void selectedEtudiant(int code)
    {
        
    }
    private void selectedEtudiant(String name)
    {
       
    }

    public void setEtudiant()
    {
        
    }

    public void deleteEtudiant()
    {
        
    }

    public void addEtudiant()
    {
        
    }

    private void findEtudiant(int idEtudiant)
    {
        
    }
    
    private void findEtudiant(String nom)
    {
        
    }
}