
package com.mycompany.crosswordpuzzle;
//Importation of classes for the project.
import java.awt.Component;
import static java.lang.Thread.sleep;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Puzzle4_4Two extends javax.swing.JFrame {
//Declaration and Initialization of global Variables
    static boolean state =true;
    int puzzle =10028;
    int puzzles = 10025;
   
    public Puzzle4_4Two() {
        initComponents();
        // Setting input limit to one character
        TxtNum1.setDocument(new Limited(1));
        TxtNum2.setDocument(new Limited(1));
        TxtNum4.setDocument(new Limited(1));
        TxtNum5.setDocument(new Limited(1));
        TxtNum6.setDocument(new Limited(1));
        TxtNum8.setDocument(new Limited(1));
        TxtNum9.setDocument(new Limited(1));
        TxtNum10.setDocument(new Limited(1));
        TxtNum11.setDocument(new Limited(1));
        TxtNum12.setDocument(new Limited(1));
        TxtNum13.setDocument(new Limited(1));
        TxtNum16.setDocument(new Limited(1));
       
    }
    //Declaration and Initialization of time Variables.
    static int millisecond = 0;
    static int second = 0;
    static int minute = 0;
    static int hour = 0;
    int scores;

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        TxtNum2 = new javax.swing.JTextField();
        TxtNum1 = new javax.swing.JTextField();
        TxtNum3 = new javax.swing.JTextField();
        TxtNum4 = new javax.swing.JTextField();
        TxtNum7 = new javax.swing.JTextField();
        TxtNum8 = new javax.swing.JTextField();
        TxtNum6 = new javax.swing.JTextField();
        TxtNum5 = new javax.swing.JTextField();
        TxtNum10 = new javax.swing.JTextField();
        TxtNum11 = new javax.swing.JTextField();
        TxtNum12 = new javax.swing.JTextField();
        TxtNum9 = new javax.swing.JTextField();
        TxtNum16 = new javax.swing.JTextField();
        TxtNum15 = new javax.swing.JTextField();
        TxtNum14 = new javax.swing.JTextField();
        TxtNum13 = new javax.swing.JTextField();
        BtnReset = new javax.swing.JButton();
        BtnExit = new javax.swing.JButton();
        BtnSubmit = new javax.swing.JButton();
        BtnStart = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtHr = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtm = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txts = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtMs = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lblpuzzle = new javax.swing.JLabel();
        BtnNext = new javax.swing.JButton();
        BtnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 3));

        TxtNum2.setBackground(new java.awt.Color(0, 0, 255));
        TxtNum2.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNum2.setForeground(new java.awt.Color(255, 255, 255));
        TxtNum2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNum2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNum2KeyPressed(evt);
            }
        });

        TxtNum1.setBackground(new java.awt.Color(255, 255, 0));
        TxtNum1.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNum1.setForeground(new java.awt.Color(0, 0, 255));
        TxtNum1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNum1KeyPressed(evt);
            }
        });

        TxtNum3.setBackground(new java.awt.Color(255, 255, 0));
        TxtNum3.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNum3.setForeground(new java.awt.Color(0, 0, 255));
        TxtNum3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNum3.setText("l");

        TxtNum4.setBackground(new java.awt.Color(0, 0, 255));
        TxtNum4.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNum4.setForeground(new java.awt.Color(255, 255, 255));
        TxtNum4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNum4ActionPerformed(evt);
            }
        });
        TxtNum4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNum4KeyPressed(evt);
            }
        });

        TxtNum7.setBackground(new java.awt.Color(255, 255, 0));
        TxtNum7.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNum7.setForeground(new java.awt.Color(0, 0, 255));
        TxtNum7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNum7.setText("*");

        TxtNum8.setBackground(new java.awt.Color(0, 0, 255));
        TxtNum8.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNum8.setForeground(new java.awt.Color(255, 255, 255));
        TxtNum8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNum8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNum8KeyPressed(evt);
            }
        });

        TxtNum6.setBackground(new java.awt.Color(0, 0, 255));
        TxtNum6.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNum6.setForeground(new java.awt.Color(255, 255, 255));
        TxtNum6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNum6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNum6KeyPressed(evt);
            }
        });

        TxtNum5.setBackground(new java.awt.Color(255, 255, 0));
        TxtNum5.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNum5.setForeground(new java.awt.Color(0, 0, 255));
        TxtNum5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNum5ActionPerformed(evt);
            }
        });
        TxtNum5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNum5KeyPressed(evt);
            }
        });

        TxtNum10.setBackground(new java.awt.Color(0, 0, 255));
        TxtNum10.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNum10.setForeground(new java.awt.Color(255, 255, 255));
        TxtNum10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNum10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNum10KeyPressed(evt);
            }
        });

        TxtNum11.setBackground(new java.awt.Color(255, 255, 0));
        TxtNum11.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNum11.setForeground(new java.awt.Color(0, 0, 255));
        TxtNum11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNum11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNum11KeyPressed(evt);
            }
        });

        TxtNum12.setBackground(new java.awt.Color(0, 0, 255));
        TxtNum12.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNum12.setForeground(new java.awt.Color(255, 255, 255));
        TxtNum12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNum12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNum12ActionPerformed(evt);
            }
        });
        TxtNum12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNum12KeyPressed(evt);
            }
        });

        TxtNum9.setBackground(new java.awt.Color(255, 255, 0));
        TxtNum9.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNum9.setForeground(new java.awt.Color(0, 0, 255));
        TxtNum9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNum9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNum9KeyPressed(evt);
            }
        });

        TxtNum16.setBackground(new java.awt.Color(0, 0, 255));
        TxtNum16.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNum16.setForeground(new java.awt.Color(255, 255, 255));
        TxtNum16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNum16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNum16KeyPressed(evt);
            }
        });

        TxtNum15.setBackground(new java.awt.Color(255, 255, 0));
        TxtNum15.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNum15.setForeground(new java.awt.Color(0, 0, 255));
        TxtNum15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNum15.setText("*");

        TxtNum14.setBackground(new java.awt.Color(0, 0, 255));
        TxtNum14.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNum14.setForeground(new java.awt.Color(255, 255, 255));
        TxtNum14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNum14.setText("*");

        TxtNum13.setBackground(new java.awt.Color(255, 255, 0));
        TxtNum13.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNum13.setForeground(new java.awt.Color(0, 0, 255));
        TxtNum13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNum13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNum13ActionPerformed(evt);
            }
        });
        TxtNum13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNum13KeyPressed(evt);
            }
        });

        BtnReset.setBackground(new java.awt.Color(0, 0, 0));
        BtnReset.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        BtnReset.setForeground(new java.awt.Color(255, 255, 255));
        BtnReset.setText("Reset");
        BtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetActionPerformed(evt);
            }
        });

        BtnExit.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        BtnExit.setText("Exit");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });

        BtnSubmit.setBackground(new java.awt.Color(0, 0, 225));
        BtnSubmit.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        BtnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        BtnSubmit.setText("Submit");
        BtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubmitActionPerformed(evt);
            }
        });

        BtnStart.setBackground(new java.awt.Color(0, 153, 0));
        BtnStart.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        BtnStart.setForeground(new java.awt.Color(255, 255, 255));
        BtnStart.setText("Start");
        BtnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStartActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Dear Player Look for a word That best describe the sentence and fill in the word in each box");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("(2).A mixture of  a colour with white which increases lightness.");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("(1).Speak in order to give information or express ideals.");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("(5).A vulnerable joint that bears a great deal of Stress form everyday activities.");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("(3).A local Area Network that interconnects computers.");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("(4).Equivalent to the product of 3 and 3,one more than Eight or less than ten.");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 4));

        txtHr.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtHr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHr.setText("00:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("HR");

        txtm.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtm.setText("00:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("M");

        txts.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txts.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txts.setText("00:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("S");

        txtMs.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtMs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMs.setText("0000");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("MS");

        lblpuzzle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblpuzzle.setForeground(new java.awt.Color(51, 51, 255));
        lblpuzzle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpuzzle.setText("ID:10025");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHr, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtm, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txts, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMs, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblpuzzle, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtHr, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtm, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txts, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMs, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblpuzzle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        BtnNext.setBackground(new java.awt.Color(255, 255, 0));
        BtnNext.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        BtnNext.setForeground(new java.awt.Color(255, 255, 255));
        BtnNext.setText("NEXT>>");
        BtnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNextActionPerformed(evt);
            }
        });

        BtnBack.setBackground(new java.awt.Color(0, 0, 255));
        BtnBack.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        BtnBack.setForeground(new java.awt.Color(255, 255, 255));
        BtnBack.setText("<<BACK");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("WELCOME TO PUZZLE TWO 4*4");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(TxtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(TxtNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(TxtNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtNum10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtNum11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtNum12, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(TxtNum16, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtNum15, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtNum14, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtNum13, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(BtnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(BtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNum10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNum11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNum12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNum16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNum15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNum14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNum13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnNext)
                    .addComponent(BtnBack))
                .addGap(26, 26, 26))
        );

        jRadioButton1.setBackground(new java.awt.Color(51, 51, 255));
        jRadioButton1.setForeground(new java.awt.Color(255, 51, 51));
        jRadioButton1.setText("OFF");

        jRadioButton2.setBackground(new java.awt.Color(51, 51, 255));
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 51));
        jRadioButton2.setText("ON");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(445, Short.MAX_VALUE)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(11, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(712, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(35, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
     public void timeTaken(){
        if(state==false){
            txtHr.getText();   
            JOptionPane.showMessageDialog(null, "You have played the game for a Time of:" + hour +":" + minute+":" +second+":" +millisecond);
            JOptionPane.showMessageDialog(null, "Thanks for playing the Game." +" "+ "Good Bye!!!");
           
        }
    }
     
     
    private void TxtNum2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNum2KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNum2.setEditable(true);
        }
        else{
            TxtNum2.setEditable(false);
            JOptionPane.showMessageDialog(this, "You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNum2KeyPressed

    private void TxtNum1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNum1KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNum1.setEditable(true);
        }
        else{
            TxtNum1.setEditable(false);
            JOptionPane.showMessageDialog(this, "You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNum1KeyPressed

    private void TxtNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNum4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNum4ActionPerformed

    private void TxtNum4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNum4KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNum4.setEditable(true);
        }
        else{
            TxtNum4.setEditable(false);
            JOptionPane.showMessageDialog(this, "You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNum4KeyPressed

    private void TxtNum8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNum8KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNum8.setEditable(true);
        }
        else{
            TxtNum8.setEditable(false);
            JOptionPane.showMessageDialog(this, "You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNum8KeyPressed

    private void TxtNum6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNum6KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNum6.setEditable(true);
        }
        else{
            TxtNum6.setEditable(false);
            JOptionPane.showMessageDialog(this, "You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNum6KeyPressed

    private void TxtNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNum5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNum5ActionPerformed

    private void TxtNum5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNum5KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNum5.setEditable(true);
        }
        else{
            TxtNum5.setEditable(false);
            JOptionPane.showMessageDialog(this, "You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNum5KeyPressed

    private void TxtNum10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNum10KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNum10.setEditable(true);
        }
        else{
            TxtNum10.setEditable(false);
            JOptionPane.showMessageDialog(this, "You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNum10KeyPressed

    private void TxtNum11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNum11KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNum11.setEditable(true);
        }
        else{
            TxtNum11.setEditable(false);
            JOptionPane.showMessageDialog(this, "You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNum11KeyPressed

    private void TxtNum12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNum12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNum12ActionPerformed

    private void TxtNum12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNum12KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNum12.setEditable(true);
        }
        else{
            TxtNum12.setEditable(false);
            JOptionPane.showMessageDialog(this, "You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNum12KeyPressed

    private void TxtNum9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNum9KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNum9.setEditable(true);
        }
        else{
            TxtNum9.setEditable(false);
            JOptionPane.showMessageDialog(this, "You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNum9KeyPressed

    private void TxtNum16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNum16KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNum16.setEditable(true);
        }
        else{
            TxtNum16.setEditable(false);
            JOptionPane.showMessageDialog(this, "You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNum16KeyPressed

    private void TxtNum13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNum13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNum13ActionPerformed

    private void TxtNum13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNum13KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNum13.setEditable(true);
        }
        else{
            TxtNum13.setEditable(false);
            JOptionPane.showMessageDialog(this, "You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNum13KeyPressed

    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
        //Reset code

        state = false;

        hour = 0;
        minute = 0;
        second = 0;
        millisecond = 0;
        txtHr.setText(" 00: ");
        txtm.setText(" 00: ");
        txts.setText(" 00: ");
        txtMs.setText(" 0000: ");

        TxtNum1.setText(" ");
        TxtNum2.setText(" ");
        TxtNum3.setText("l");
        TxtNum4.setText(" ");
        TxtNum5.setText("* ");
        TxtNum6.setText("");
        TxtNum7.setText("* ");
        TxtNum8.setText("");
        TxtNum9.setText(" ");
        TxtNum10.setText(" ");
        TxtNum11.setText(" ");
        TxtNum12.setText(" ");
        TxtNum13.setText(" ");
        TxtNum14.setText("*");
        TxtNum15.setText(" *");
        TxtNum16.setText("");

    }//GEN-LAST:event_BtnResetActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        // Code for Exit Button
        Component frame = new JFrame("Exit");

        if(JOptionPane.showConfirmDialog(frame, "Do you want to Exit","Puzzle Game?",
            JOptionPane.YES_NO_OPTION )==JOptionPane.YES_NO_OPTION){

        System.exit(0);

        }
    }//GEN-LAST:event_BtnExitActionPerformed

    private void BtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubmitActionPerformed
        state = false;
        //Code To ask for a user Name and display the Name And Welcome Message
        String name;
        name =  JOptionPane.showInputDialog("Please Enter your Name");
        JOptionPane.showMessageDialog(null, "Welcome!!! : " + name  );

        //code to Diplay The puzzle Id.
        lblpuzzle.getText();
        JOptionPane.showMessageDialog(null, "Your Puzzle id is:"+puzzles );
        
         if(TxtNum1.getText().equals("t")&&TxtNum2.getText().equals("a")&&TxtNum4.getText().equals("k")){
            
            JOptionPane.showMessageDialog(null, "Your Score is 300Points:" +" "+"Thanks for Attempting the puzzle..");
            
        }

        //Calling Time Method.
        timeTaken();

    }//GEN-LAST:event_BtnSubmitActionPerformed

    private void BtnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStartActionPerformed

        state = true;
        Thread t = new Thread(){

            public void run(){

                for(;;){

                    if(state == true){
                        try{
                            sleep(8);
                            if(millisecond >100){
                                millisecond = 0;
                                second++;

                            }
                            else if (second>60){

                                millisecond = 0;
                                second = 0;
                                minute++;
                            }
                            else if(minute>60){
                                millisecond = 0;
                                second = 0;
                                minute = 0;
                                hour++;
                            }
                            txtMs.setText(" : " +millisecond);
                            millisecond++;
                            txts.setText(" : " +second);
                            txtm.setText(" : " +minute );
                            txtHr.setText(" : " +hour);

                        }
                        catch(Exception e){

                        }

                    }
                    else{
                        break;
                    }
                }
            }
        };
        t.start();

    }//GEN-LAST:event_BtnStartActionPerformed

    private void BtnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNextActionPerformed
    //This lines of code allow the user to next to the Next puzzle.
    new Puzzle6_6Two().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_BtnNextActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        //These lines of code takes user back to the previous page.
        new Puzzle4_4One().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnBackActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        TxtNum3.setText("l");
        TxtNum3.setEditable(false);
        
        TxtNum14.setText("*");
        TxtNum14.setEditable(false);
        
        TxtNum7.setText("*");
        TxtNum7.setEditable(false);
        
        TxtNum15.setText("*");
        TxtNum15.setEditable(false);
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(Puzzle4_4Two.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Puzzle4_4Two.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Puzzle4_4Two.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Puzzle4_4Two.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Puzzle4_4Two().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnNext;
    private javax.swing.JButton BtnReset;
    private javax.swing.JButton BtnStart;
    private javax.swing.JButton BtnSubmit;
    private javax.swing.JTextField TxtNum1;
    private javax.swing.JTextField TxtNum10;
    private javax.swing.JTextField TxtNum11;
    private javax.swing.JTextField TxtNum12;
    private javax.swing.JTextField TxtNum13;
    private javax.swing.JTextField TxtNum14;
    private javax.swing.JTextField TxtNum15;
    private javax.swing.JTextField TxtNum16;
    private javax.swing.JTextField TxtNum2;
    private javax.swing.JTextField TxtNum3;
    private javax.swing.JTextField TxtNum4;
    private javax.swing.JTextField TxtNum5;
    private javax.swing.JTextField TxtNum6;
    private javax.swing.JTextField TxtNum7;
    private javax.swing.JTextField TxtNum8;
    private javax.swing.JTextField TxtNum9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel lblpuzzle;
    private javax.swing.JTextField txtHr;
    private javax.swing.JTextField txtMs;
    private javax.swing.JTextField txtm;
    private javax.swing.JTextField txts;
    // End of variables declaration//GEN-END:variables
}
