
package com.mycompany.crosswordpuzzle;
//importation of java classes for the project
import java.awt.Component;
import static java.lang.Thread.sleep;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Puzzle4_4One extends javax.swing.JFrame {
    //Declaration and Initialization of global Variables
    static boolean state =true;
    int puzzle =10028;
    int Score;
    
    
    public Puzzle4_4One() {
        initComponents();
        
         // Setting input limit to one character
        txtNum1.setDocument(new Limited(1));
        txtNum2.setDocument(new Limited(1));
        txtNum4.setDocument(new Limited(1));
        txtNum6.setDocument(new Limited(1));
        txtNum8.setDocument(new Limited(1));
        txtNum9.setDocument(new Limited(1));
        txtNum10.setDocument(new Limited(1));
        txtNum11.setDocument(new Limited(1));
        txtNum12.setDocument(new Limited(1));
        txtNum14.setDocument(new Limited(1));
        txtNum16.setDocument(new Limited(1));
        
     
    }
    //Declaration and Initialization of time Variables.
    static int millisecond = 0;
    static int second = 0;
    static int minute = 0;
    static int hour = 0;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtNum1 = new javax.swing.JTextField();
        txtNum4 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        txtNum3 = new javax.swing.JTextField();
        txtNum5 = new javax.swing.JTextField();
        txtNum6 = new javax.swing.JTextField();
        txtNum7 = new javax.swing.JTextField();
        txtNum8 = new javax.swing.JTextField();
        txtNum11 = new javax.swing.JTextField();
        txtNum12 = new javax.swing.JTextField();
        txtNum10 = new javax.swing.JTextField();
        txtNum9 = new javax.swing.JTextField();
        txtNum16 = new javax.swing.JTextField();
        txtNum15 = new javax.swing.JTextField();
        txtNum14 = new javax.swing.JTextField();
        txtNum13 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txtHr = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtM = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtS = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtMS = new javax.swing.JTextField();
        lblpuzzle = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnReset1 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 3));

        txtNum1.setBackground(new java.awt.Color(0, 0, 255));
        txtNum1.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNum1.setForeground(new java.awt.Color(255, 255, 255));
        txtNum1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum1KeyPressed(evt);
            }
        });

        txtNum4.setBackground(new java.awt.Color(255, 255, 0));
        txtNum4.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNum4.setForeground(new java.awt.Color(51, 51, 255));
        txtNum4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum4ActionPerformed(evt);
            }
        });
        txtNum4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum4KeyPressed(evt);
            }
        });

        txtNum2.setBackground(new java.awt.Color(255, 255, 0));
        txtNum2.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNum2.setForeground(new java.awt.Color(51, 51, 255));
        txtNum2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum2KeyPressed(evt);
            }
        });

        txtNum3.setBackground(new java.awt.Color(0, 0, 255));
        txtNum3.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNum3.setForeground(new java.awt.Color(255, 255, 255));
        txtNum3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum3.setText("p");

        txtNum5.setBackground(new java.awt.Color(0, 0, 255));
        txtNum5.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNum5.setForeground(new java.awt.Color(255, 255, 255));
        txtNum5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum5.setText("*");
        txtNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum5ActionPerformed(evt);
            }
        });

        txtNum6.setBackground(new java.awt.Color(255, 255, 0));
        txtNum6.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNum6.setForeground(new java.awt.Color(51, 51, 255));
        txtNum6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum6KeyPressed(evt);
            }
        });

        txtNum7.setBackground(new java.awt.Color(0, 0, 255));
        txtNum7.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNum7.setForeground(new java.awt.Color(255, 255, 255));
        txtNum7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum7.setText("*");

        txtNum8.setBackground(new java.awt.Color(255, 255, 0));
        txtNum8.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNum8.setForeground(new java.awt.Color(51, 51, 255));
        txtNum8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum8KeyPressed(evt);
            }
        });

        txtNum11.setBackground(new java.awt.Color(0, 0, 255));
        txtNum11.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNum11.setForeground(new java.awt.Color(255, 255, 255));
        txtNum11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum11KeyPressed(evt);
            }
        });

        txtNum12.setBackground(new java.awt.Color(255, 255, 0));
        txtNum12.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNum12.setForeground(new java.awt.Color(51, 51, 255));
        txtNum12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum12ActionPerformed(evt);
            }
        });
        txtNum12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum12KeyPressed(evt);
            }
        });

        txtNum10.setBackground(new java.awt.Color(255, 255, 0));
        txtNum10.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNum10.setForeground(new java.awt.Color(51, 51, 255));
        txtNum10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum10KeyPressed(evt);
            }
        });

        txtNum9.setBackground(new java.awt.Color(0, 0, 255));
        txtNum9.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNum9.setForeground(new java.awt.Color(255, 255, 255));
        txtNum9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum9KeyPressed(evt);
            }
        });

        txtNum16.setBackground(new java.awt.Color(255, 255, 0));
        txtNum16.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNum16.setForeground(new java.awt.Color(51, 51, 255));
        txtNum16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum16KeyPressed(evt);
            }
        });

        txtNum15.setBackground(new java.awt.Color(0, 0, 255));
        txtNum15.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNum15.setForeground(new java.awt.Color(255, 255, 255));
        txtNum15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum15.setText("*");

        txtNum14.setBackground(new java.awt.Color(255, 255, 0));
        txtNum14.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNum14.setForeground(new java.awt.Color(51, 51, 255));
        txtNum14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNum14KeyPressed(evt);
            }
        });

        txtNum13.setBackground(new java.awt.Color(0, 0, 255));
        txtNum13.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNum13.setForeground(new java.awt.Color(255, 255, 255));
        txtNum13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum13.setText("*");
        txtNum13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum13ActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("(4).Look or search around a place,Thrust in a particular Direction");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("(2).A building or large Room used for meeting,or events");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("(3).Having the same characteristics or qualities as,similar to.");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 255));
        jLabel17.setText("Dear Player Look for a word That best describe the sentence and fill in the word in each box");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("(1).Feeling of expectation and desire for particular thing to happen.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(150, Short.MAX_VALUE)))
        );

        btnExit.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnStart.setBackground(new java.awt.Color(0, 153, 0));
        btnStart.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnStart.setForeground(new java.awt.Color(255, 255, 255));
        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(0, 0, 225));
        btnSubmit.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(255, 255, 0));
        btnNext.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("NEXT>>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 4));

        txtHr.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtHr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHr.setText("00:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("HR");

        txtM.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtM.setText("00:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("M");

        txtS.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtS.setText("00:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("S");

        txtMS.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtMS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMS.setText("0000");
        txtMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMSActionPerformed(evt);
            }
        });

        lblpuzzle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblpuzzle.setForeground(new java.awt.Color(51, 51, 255));
        lblpuzzle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpuzzle.setText("ID:10028");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("MS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMS, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtS, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtM, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHr, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblpuzzle, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(81, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(txtHr, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(lblpuzzle, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(269, 269, 269)
                    .addComponent(jLabel16)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        btnReset1.setBackground(new java.awt.Color(0, 0, 0));
        btnReset1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnReset1.setForeground(new java.awt.Color(255, 255, 255));
        btnReset1.setText("Reset");
        btnReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset1ActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(51, 0, 255));
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 0));
        jRadioButton1.setText("ON");

        jRadioButton2.setBackground(new java.awt.Color(51, 0, 255));
        jRadioButton2.setForeground(new java.awt.Color(255, 51, 51));
        jRadioButton2.setText("OFF");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME TO PUZZLE ONE 4*4.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNum16, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNum15, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNum14, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNum13, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNum10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNum11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNum12, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(42, 42, 42)
                                .addComponent(jRadioButton2)
                                .addGap(25, 25, 25))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNum4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNum10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNum11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNum12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNum16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNum15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNum13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNum14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReset1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    
      
     
     
    
    private void txtNum1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum1KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNum1.setEditable(true);
        }
        else{
            txtNum1.setEditable(false);
            JOptionPane.showMessageDialog(this, "You cannot enter a number");

        }
    }//GEN-LAST:event_txtNum1KeyPressed

    private void txtNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNum4ActionPerformed

    private void txtNum4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum4KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNum4.setEditable(true);
        }
        else{
            txtNum4.setEditable(false);
            JOptionPane.showMessageDialog(this, "You cannot enter a number");

        }
    }//GEN-LAST:event_txtNum4KeyPressed

    private void txtNum2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum2KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNum2.setEditable(true);
        }
        else{
            txtNum2.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNum2KeyPressed

    private void txtNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNum5ActionPerformed

    private void txtNum6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum6KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNum6.setEditable(true);
        }
        else{
            txtNum6.setEditable(false);
            JOptionPane.showMessageDialog(this, "You cannot enter a number");

        }
    }//GEN-LAST:event_txtNum6KeyPressed

    private void txtNum8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum8KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNum8.setEditable(true);
        }
        else{
            txtNum8.setEditable(false);
            JOptionPane.showMessageDialog(this, "You cannot enter a number");

        }
    }//GEN-LAST:event_txtNum8KeyPressed

    private void txtNum12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNum12ActionPerformed

    private void txtNum12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum12KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNum12.setEditable(true);
        }
        else{
            txtNum12.setEditable(false);
            JOptionPane.showMessageDialog(this, "You cannot enter a number");

        }
    }//GEN-LAST:event_txtNum12KeyPressed

    private void txtNum11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum11KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNum11.setEditable(true);
        }
        else{
            txtNum11.setEditable(false);
            JOptionPane.showMessageDialog(this, "You cannot enter a number");

        }
    }//GEN-LAST:event_txtNum11KeyPressed

    private void txtNum10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum10KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNum10.setEditable(true);
        }
        else{
            txtNum10.setEditable(false);
            JOptionPane.showMessageDialog(this, "You cannot enter a number");

        }
    }//GEN-LAST:event_txtNum10KeyPressed

    private void txtNum9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum9KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNum9.setEditable(true);
        }
        else{
            txtNum9.setEditable(false);
            JOptionPane.showMessageDialog(this, "You cannot enter a number");

        }
    }//GEN-LAST:event_txtNum9KeyPressed

    private void txtNum16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum16KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNum16.setEditable(true);
        }
        else{
            txtNum16.setEditable(false);
            JOptionPane.showMessageDialog(this, "You cannot enter a number");

        }
    }//GEN-LAST:event_txtNum16KeyPressed

    private void txtNum14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum14KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNum14.setEditable(true);
        }
        else{
            txtNum14.setEditable(false);
            JOptionPane.showMessageDialog(this, "You cannot enter a number");

        }
    }//GEN-LAST:event_txtNum14KeyPressed

    private void txtNum13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNum13ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // Code for Exit Button
        Component frame = new JFrame("Exit");

        if(JOptionPane.showConfirmDialog(frame, "Do you want to Exit","Puzzle Game?",
            JOptionPane.YES_NO_OPTION )==JOptionPane.YES_NO_OPTION){

        System.exit(0);

        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed

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
                            txtMS.setText(" : " +millisecond);
                            millisecond++;
                            txtS.setText(" : " +second);
                            txtM.setText(" : " +minute );
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

    }//GEN-LAST:event_btnStartActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        state = false;
        //Code To ask for a user Name and display the Name And Welcome Message
        String name;
        name =  JOptionPane.showInputDialog("Please Enter your Name");
        JOptionPane.showMessageDialog(null, "Welcome!!! : " + name  );

        //code to Diplay The puzzle Id.
        lblpuzzle.getText();
        JOptionPane.showMessageDialog(null, "Your Puzzle id is:"+puzzle );
        // These lines of code give the score according to how many answers were right.
        if(txtNum1.getText().equals("h")&&txtNum2.getText().equals("o")&&txtNum4.getText().equals("e")){
            
            JOptionPane.showMessageDialog(null, "Your Score is 300Points:" +" "+"Thanks for Attempting the puzzle..");
            
        }
           
       
        //Calling Time Method.
        timeTaken();

        DBConnect connect = new  DBConnect();
        connect.connectAndenter(puzzle, name, hour, minute, second, millisecond);

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        new Puzzle4_4Two().setVisible(true);
        this.dispose();
        


    }//GEN-LAST:event_btnNextActionPerformed

    private void txtMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMSActionPerformed

    private void btnReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset1ActionPerformed
               //Reset code to reset the time and the textfield.      
       state = false;
        hour = 0;
        minute = 0;
        second = 0;
        millisecond = 0;
        
        txtHr.setText(" 00: ");
        txtM.setText(" 00: ");
        txtS.setText(" 00: ");
        txtMS.setText(" 0000: ");
        txtNum1.setText(" ");
        txtNum2.setText(" ");
        txtNum3.setText("p");
        txtNum4.setText(" ");
        txtNum5.setText("* ");
        txtNum6.setText("");
        txtNum7.setText("* ");
        txtNum8.setText("");
        txtNum9.setText(" ");
        txtNum10.setText(" ");
        txtNum11.setText(" ");
        txtNum12.setText(" ");
        txtNum13.setText(" ");
        txtNum14.setText("*");
        txtNum15.setText(" ");
        txtNum16.setText("*");
    }//GEN-LAST:event_btnReset1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // This line of code take the user back to the leadBoard. 
        new LeadBoard().setVisible(true);
         
    }//GEN-LAST:event_btnBackActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        //uneditable boxes with asteriks in them 
        txtNum5.setText("*");
        txtNum5.setEditable(false);
        
        txtNum7.setText("*");
        txtNum7.setEditable(false);
        
        txtNum13.setText("*");
        txtNum13.setEditable(false);
        
        txtNum15.setText("*");
        txtNum15.setEditable(false);
        
        txtNum3.setText("p");
        txtNum3.setEditable(false);
        
        
    }//GEN-LAST:event_formComponentShown

    
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
            java.util.logging.Logger.getLogger(Puzzle4_4One.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Puzzle4_4One.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Puzzle4_4One.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Puzzle4_4One.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Puzzle4_4One().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnReset1;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel lblpuzzle;
    private javax.swing.JTextField txtHr;
    private javax.swing.JTextField txtM;
    private javax.swing.JTextField txtMS;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum10;
    private javax.swing.JTextField txtNum11;
    private javax.swing.JTextField txtNum12;
    private javax.swing.JTextField txtNum13;
    private javax.swing.JTextField txtNum14;
    private javax.swing.JTextField txtNum15;
    private javax.swing.JTextField txtNum16;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtNum3;
    private javax.swing.JTextField txtNum4;
    private javax.swing.JTextField txtNum5;
    private javax.swing.JTextField txtNum6;
    private javax.swing.JTextField txtNum7;
    private javax.swing.JTextField txtNum8;
    private javax.swing.JTextField txtNum9;
    private javax.swing.JTextField txtS;
    // End of variables declaration//GEN-END:variables
}
