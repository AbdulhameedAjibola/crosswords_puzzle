
package com.mycompany.crosswordpuzzle;
//Importation of classes for the project.

import java.awt.Component;
import static java.lang.Thread.sleep;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Puzzle6_6Two extends javax.swing.JFrame {
   //Declaration And Initialization of Global Variables used in the Project
    static boolean state= true;
    int Puzzle=1001 ;
    int Puzzles=1002;
    
    int hour=0;
    int minute=0;
    int second =0;
    int millisecond =0;

    public Puzzle6_6Two() {
        initComponents();
        
        
        //code for a single Character.
        txtNumber2.setDocument(new Limited(1));
        txtNumber3.setDocument(new Limited(1));
        txtNumber5.setDocument(new Limited(1));
        txtNumber6.setDocument(new Limited(1));
        txtNumber9.setDocument(new Limited(1));
        txtNumber11.setDocument(new Limited(1));
        txtNumber12.setDocument(new Limited(1));
        txtNumber13.setDocument(new Limited(1));
        txtNumber14.setDocument(new Limited(1));
        txtNumber15.setDocument(new Limited(1));
        txtNumber16.setDocument(new Limited(1));
        txtNumber17.setDocument(new Limited(1));
        txtNumber18.setDocument(new Limited(1));
        txtNumber21.setDocument(new Limited(1));
        txtNumber22.setDocument(new Limited(1));
        txtNumber24.setDocument(new Limited(1));
        txtNumber25.setDocument(new Limited(1));
        txtNumber26.setDocument(new Limited(1));
        txtNumber27.setDocument(new Limited(1));
        txtNumber28.setDocument(new Limited(1));
        txtNumber29.setDocument(new Limited(1));
        txtNumber30.setDocument(new Limited(1));
        txtNumber31.setDocument(new Limited(1));
        txtNumber32.setDocument(new Limited(1));
        txtNumber35.setDocument(new Limited(1));
        txtNumber33.setDocument(new Limited(1));
        txtNumber36.setDocument(new Limited(1));
        txtNumber19.setDocument(new Limited(1));
        txtNumber20.setDocument(new Limited(1));
        txtNumber22.setDocument(new Limited(1));
        txtNumber23.setDocument(new Limited(1));
        txtNumber24.setDocument(new Limited(1));
    }
    
       public void timeTaken(){
        if(state==false){
            TxtHr.getText();   
            JOptionPane.showMessageDialog(null, "You have played the game for a Time of:" + hour +":" + minute+":" +second+":" +millisecond);
            JOptionPane.showMessageDialog(null, "Thanks for playing the Game." +" "+ "Good Bye!!!");
           
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        txtNumber1 = new javax.swing.JTextField();
        txtNumber6 = new javax.swing.JTextField();
        txtNumber2 = new javax.swing.JTextField();
        txtNumber3 = new javax.swing.JTextField();
        txtNumber4 = new javax.swing.JTextField();
        txtNumber5 = new javax.swing.JTextField();
        txtNumber7 = new javax.swing.JTextField();
        txtNumber8 = new javax.swing.JTextField();
        txtNumber9 = new javax.swing.JTextField();
        txtNumber10 = new javax.swing.JTextField();
        txtNumber11 = new javax.swing.JTextField();
        txtNumber12 = new javax.swing.JTextField();
        txtNumber15 = new javax.swing.JTextField();
        txtNumber16 = new javax.swing.JTextField();
        txtNumber18 = new javax.swing.JTextField();
        txtNumber13 = new javax.swing.JTextField();
        txtNumber14 = new javax.swing.JTextField();
        txtNumber17 = new javax.swing.JTextField();
        txtNumber23 = new javax.swing.JTextField();
        txtNumber20 = new javax.swing.JTextField();
        txtNumber21 = new javax.swing.JTextField();
        txtNumber24 = new javax.swing.JTextField();
        txtNumber19 = new javax.swing.JTextField();
        txtNumber22 = new javax.swing.JTextField();
        txtNumber26 = new javax.swing.JTextField();
        txtNumber30 = new javax.swing.JTextField();
        txtNumber29 = new javax.swing.JTextField();
        txtNumber28 = new javax.swing.JTextField();
        txtNumber27 = new javax.swing.JTextField();
        txtNumber25 = new javax.swing.JTextField();
        txtNumber36 = new javax.swing.JTextField();
        txtNumber35 = new javax.swing.JTextField();
        txtNumber34 = new javax.swing.JTextField();
        txtNumber33 = new javax.swing.JTextField();
        txtNumber32 = new javax.swing.JTextField();
        txtNumber31 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnExit1 = new javax.swing.JButton();
        BtnStart1 = new javax.swing.JButton();
        BtnSubmit1 = new javax.swing.JButton();
        btnRESET = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        TxtHr = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtM1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TxtS1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TxtMS1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        lblPuzzleIds = new javax.swing.JLabel();
        BtnSubmit2 = new javax.swing.JButton();
        BtnSubmit3 = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 4));

        txtNumber1.setBackground(new java.awt.Color(0, 0, 255));
        txtNumber1.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber1.setForeground(new java.awt.Color(255, 255, 255));
        txtNumber1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber1.setText("p");
        txtNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumber1ActionPerformed(evt);
            }
        });

        txtNumber6.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber6.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber6.setForeground(new java.awt.Color(0, 0, 255));
        txtNumber6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber6KeyPressed(evt);
            }
        });

        txtNumber2.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber2.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber2.setForeground(new java.awt.Color(0, 0, 255));
        txtNumber2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber2KeyPressed(evt);
            }
        });

        txtNumber3.setBackground(new java.awt.Color(0, 0, 255));
        txtNumber3.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber3.setForeground(new java.awt.Color(255, 255, 255));
        txtNumber3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber3KeyPressed(evt);
            }
        });

        txtNumber4.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber4.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber4.setForeground(new java.awt.Color(0, 0, 255));
        txtNumber4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber4.setText("p");

        txtNumber5.setBackground(new java.awt.Color(0, 0, 255));
        txtNumber5.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber5.setForeground(new java.awt.Color(255, 255, 255));
        txtNumber5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber5KeyPressed(evt);
            }
        });

        txtNumber7.setBackground(new java.awt.Color(51, 51, 255));
        txtNumber7.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber7.setText("*");

        txtNumber8.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber8.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber8.setForeground(new java.awt.Color(0, 0, 255));
        txtNumber8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber8.setText("*");

        txtNumber9.setBackground(new java.awt.Color(0, 0, 255));
        txtNumber9.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber9.setForeground(new java.awt.Color(255, 255, 255));
        txtNumber9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber9KeyPressed(evt);
            }
        });

        txtNumber10.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber10.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber10.setForeground(new java.awt.Color(0, 0, 255));
        txtNumber10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber10.setText("*");

        txtNumber11.setBackground(new java.awt.Color(0, 0, 255));
        txtNumber11.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber11.setForeground(new java.awt.Color(255, 255, 255));
        txtNumber11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber11KeyPressed(evt);
            }
        });

        txtNumber12.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber12.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber12.setForeground(new java.awt.Color(0, 0, 255));
        txtNumber12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumber12ActionPerformed(evt);
            }
        });
        txtNumber12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber12KeyPressed(evt);
            }
        });

        txtNumber15.setBackground(new java.awt.Color(0, 0, 255));
        txtNumber15.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber15.setForeground(new java.awt.Color(255, 255, 255));
        txtNumber15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber15.setText("*");
        txtNumber15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber15KeyPressed(evt);
            }
        });

        txtNumber16.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber16.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber16.setForeground(new java.awt.Color(0, 0, 255));
        txtNumber16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber16KeyPressed(evt);
            }
        });

        txtNumber18.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber18.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber18.setForeground(new java.awt.Color(0, 0, 255));
        txtNumber18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber18KeyPressed(evt);
            }
        });

        txtNumber13.setBackground(new java.awt.Color(0, 0, 255));
        txtNumber13.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber13.setForeground(new java.awt.Color(255, 255, 255));
        txtNumber13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber13KeyPressed(evt);
            }
        });

        txtNumber14.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber14.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber14.setForeground(new java.awt.Color(0, 0, 255));
        txtNumber14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber14KeyPressed(evt);
            }
        });

        txtNumber17.setBackground(new java.awt.Color(0, 0, 255));
        txtNumber17.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber17.setForeground(new java.awt.Color(255, 255, 255));
        txtNumber17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber17.setText("*");
        txtNumber17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber17KeyPressed(evt);
            }
        });

        txtNumber23.setBackground(new java.awt.Color(0, 0, 255));
        txtNumber23.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber23.setForeground(new java.awt.Color(255, 255, 255));
        txtNumber23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber23KeyPressed(evt);
            }
        });

        txtNumber20.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber20.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber20.setForeground(new java.awt.Color(0, 0, 255));
        txtNumber20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumber20ActionPerformed(evt);
            }
        });
        txtNumber20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber20KeyPressed(evt);
            }
        });

        txtNumber21.setBackground(new java.awt.Color(0, 0, 255));
        txtNumber21.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber21.setForeground(new java.awt.Color(255, 255, 255));
        txtNumber21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber21.setText("a");

        txtNumber24.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber24.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber24.setForeground(new java.awt.Color(0, 0, 255));
        txtNumber24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber24KeyPressed(evt);
            }
        });

        txtNumber19.setBackground(new java.awt.Color(0, 0, 255));
        txtNumber19.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber19.setForeground(new java.awt.Color(255, 255, 255));
        txtNumber19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber19KeyPressed(evt);
            }
        });

        txtNumber22.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber22.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber22.setForeground(new java.awt.Color(0, 0, 255));
        txtNumber22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumber22ActionPerformed(evt);
            }
        });
        txtNumber22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber22KeyPressed(evt);
            }
        });

        txtNumber26.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber26.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber26.setForeground(new java.awt.Color(0, 0, 255));
        txtNumber26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber26KeyPressed(evt);
            }
        });

        txtNumber30.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber30.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber30.setForeground(new java.awt.Color(0, 0, 255));
        txtNumber30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber30.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber30KeyPressed(evt);
            }
        });

        txtNumber29.setBackground(new java.awt.Color(0, 0, 255));
        txtNumber29.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber29.setForeground(new java.awt.Color(255, 255, 255));
        txtNumber29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumber29ActionPerformed(evt);
            }
        });
        txtNumber29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber29KeyPressed(evt);
            }
        });

        txtNumber28.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber28.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber28.setForeground(new java.awt.Color(0, 0, 255));
        txtNumber28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber28KeyPressed(evt);
            }
        });

        txtNumber27.setBackground(new java.awt.Color(0, 0, 255));
        txtNumber27.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber27.setForeground(new java.awt.Color(255, 255, 255));
        txtNumber27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber27KeyPressed(evt);
            }
        });

        txtNumber25.setBackground(new java.awt.Color(0, 0, 255));
        txtNumber25.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber25.setForeground(new java.awt.Color(255, 255, 255));
        txtNumber25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber25KeyPressed(evt);
            }
        });

        txtNumber36.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber36.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber36.setForeground(new java.awt.Color(0, 0, 255));
        txtNumber36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber36.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber36KeyPressed(evt);
            }
        });

        txtNumber35.setBackground(new java.awt.Color(0, 0, 255));
        txtNumber35.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber35.setForeground(new java.awt.Color(255, 255, 255));
        txtNumber35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber35.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber35KeyPressed(evt);
            }
        });

        txtNumber34.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber34.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber34.setForeground(new java.awt.Color(0, 0, 255));
        txtNumber34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber34.setText("*");

        txtNumber33.setBackground(new java.awt.Color(0, 0, 255));
        txtNumber33.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtNumber33.setForeground(new java.awt.Color(255, 255, 255));
        txtNumber33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumber33KeyPressed(evt);
            }
        });

        txtNumber32.setBackground(new java.awt.Color(255, 255, 0));
        txtNumber32.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber32.setForeground(new java.awt.Color(0, 0, 255));
        txtNumber32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber32.setText("*");
        txtNumber32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumber32ActionPerformed(evt);
            }
        });

        txtNumber31.setBackground(new java.awt.Color(0, 0, 255));
        txtNumber31.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        txtNumber31.setForeground(new java.awt.Color(255, 255, 255));
        txtNumber31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumber31.setText("*");

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 4));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("(6).One's Father's Name ");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("(5)A soluble powder obtained from certain lichens");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("(1).Human Beigns in general or collectively");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("(3).Content is available,Sale or selling");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("(2). school children that are taught by a teacher");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("(4).Form an ideal of,imagine or conceive ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Dear Player,Look For A Word that Best Describes the sentence and fill in the word in each Box.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        BtnExit1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        BtnExit1.setText("Exit Game");
        BtnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExit1ActionPerformed(evt);
            }
        });

        BtnStart1.setBackground(new java.awt.Color(0, 153, 0));
        BtnStart1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        BtnStart1.setForeground(new java.awt.Color(255, 255, 255));
        BtnStart1.setText("Start");
        BtnStart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStart1ActionPerformed(evt);
            }
        });

        BtnSubmit1.setBackground(new java.awt.Color(0, 0, 255));
        BtnSubmit1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        BtnSubmit1.setForeground(new java.awt.Color(255, 255, 255));
        BtnSubmit1.setText("Submit");
        BtnSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubmit1ActionPerformed(evt);
            }
        });

        btnRESET.setBackground(new java.awt.Color(0, 0, 0));
        btnRESET.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnRESET.setForeground(new java.awt.Color(255, 255, 255));
        btnRESET.setText("Reset");
        btnRESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRESETActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 4));

        TxtHr.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TxtHr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtHr.setText("00:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("HR");

        TxtM1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TxtM1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtM1.setText("00:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("M");

        TxtS1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TxtS1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtS1.setText("00:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("S");

        TxtMS1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TxtMS1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtMS1.setText("0000");
        TxtMS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMS1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("MS");

        lblPuzzleIds.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPuzzleIds.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuzzleIds.setText("ID:1002");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPuzzleIds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(43, 43, 43))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TxtM1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtHr, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtS1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtMS1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtHr, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtM1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtS1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtMS1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(lblPuzzleIds, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BtnSubmit2.setBackground(new java.awt.Color(255, 255, 0));
        BtnSubmit2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        BtnSubmit2.setForeground(new java.awt.Color(255, 255, 255));
        BtnSubmit2.setText("NEXT>>");
        BtnSubmit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubmit2ActionPerformed(evt);
            }
        });

        BtnSubmit3.setBackground(new java.awt.Color(51, 51, 255));
        BtnSubmit3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        BtnSubmit3.setForeground(new java.awt.Color(255, 255, 255));
        BtnSubmit3.setText("<<BACK");
        BtnSubmit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubmit3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(BtnStart1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(BtnSubmit3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(BtnSubmit2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(BtnSubmit1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRESET, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtNumber12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtNumber13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber14, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber15, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber16, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber17, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber18, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtNumber24, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber23, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber22, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber21, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber20, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber19, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtNumber25, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber26, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber27, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber28, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber29, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber30, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtNumber36, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber35, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber34, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber33, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber32, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber31, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNumber12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNumber11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNumber9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNumber8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNumber7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNumber10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumber13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber15, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber17, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber18, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumber24, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber23, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber22, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber21, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber20, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber19, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumber25, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber26, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber27, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber28, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber29, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber30, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumber36, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber35, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber34, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber33, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber32, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumber31, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnSubmit1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnStart1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRESET, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnSubmit3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(BtnSubmit2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(44, 44, 44))
        );

        jRadioButton2.setBackground(new java.awt.Color(51, 51, 255));
        jRadioButton2.setForeground(new java.awt.Color(255, 51, 51));
        jRadioButton2.setText("OFF");

        jRadioButton3.setBackground(new java.awt.Color(51, 51, 255));
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 0));
        jRadioButton3.setText("ON");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME TO PUZZLE TWO 6*6.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(710, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void txtNumber6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber6KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber6.setEditable(true);
        }
        else{
            txtNumber6.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber6KeyPressed

    private void txtNumber2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber2KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber2.setEditable(true);
        }
        else{
            txtNumber2.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber2KeyPressed

    private void txtNumber3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber3KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber3.setEditable(true);
        }
        else{
            txtNumber3.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber3KeyPressed

    private void txtNumber5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber5KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber5.setEditable(true);
        }
        else{
            txtNumber5.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber5KeyPressed

    private void txtNumber9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber9KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber9.setEditable(true);
        }
        else{
            txtNumber9.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber9KeyPressed

    private void txtNumber11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber11KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber11.setEditable(true);
        }
        else{
            txtNumber11.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber11KeyPressed

    private void txtNumber12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber12KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber12.setEditable(true);
        }
        else{
            txtNumber12.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber12KeyPressed

    private void txtNumber15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber15KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber15.setEditable(true);
        }
        else{
            txtNumber15.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber15KeyPressed

    private void txtNumber16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber16KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber16.setEditable(true);
        }
        else{
            txtNumber16.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber16KeyPressed

    private void txtNumber18KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber18KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber18.setEditable(true);
        }
        else{
            txtNumber18.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber18KeyPressed

    private void txtNumber13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber13KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber13.setEditable(true);
        }
        else{
            txtNumber13.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber13KeyPressed

    private void txtNumber14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber14KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber14.setEditable(true);
        }
        else{
            txtNumber14.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber14KeyPressed

    private void txtNumber17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber17KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber17.setEditable(true);
        }
        else{
            txtNumber17.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber17KeyPressed

    private void txtNumber23KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber23KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber23.setEditable(true);
        }
        else{
            txtNumber23.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber23KeyPressed

    private void txtNumber20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumber20ActionPerformed

    }//GEN-LAST:event_txtNumber20ActionPerformed

    private void txtNumber20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber20KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber20.setEditable(true);
        }
        else{
            txtNumber20.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber20KeyPressed

    private void txtNumber24KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber24KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber24.setEditable(true);
        }
        else{
            txtNumber24.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber24KeyPressed

    private void txtNumber19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber19KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber19.setEditable(true);
        }
        else{
            txtNumber19.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber19KeyPressed

    private void txtNumber22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumber22ActionPerformed

    }//GEN-LAST:event_txtNumber22ActionPerformed

    private void txtNumber22KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber22KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber22.setEditable(true);
        }
        else{
            txtNumber22.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber22KeyPressed

    private void txtNumber26KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber26KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber26.setEditable(true);
        }
        else{
            txtNumber26.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber26KeyPressed

    private void txtNumber30KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber30KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber30.setEditable(true);
        }
        else{
            txtNumber30.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber30KeyPressed

    private void txtNumber29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumber29ActionPerformed

    }//GEN-LAST:event_txtNumber29ActionPerformed

    private void txtNumber29KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber29KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber29.setEditable(true);
        }
        else{
            txtNumber29.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber29KeyPressed

    private void txtNumber28KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber28KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber28.setEditable(true);
        }
        else{
            txtNumber28.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber28KeyPressed

    private void txtNumber27KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber27KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber27.setEditable(true);
        }
        else{
            txtNumber27.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber27KeyPressed

    private void txtNumber25KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber25KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber25.setEditable(true);
        }
        else{
            txtNumber25.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber25KeyPressed

    private void txtNumber36KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber36KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber36.setEditable(true);
        }
        else{
            txtNumber36.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber36KeyPressed

    private void txtNumber35KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber35KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber35.setEditable(true);
        }
        else{
            txtNumber35.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber35KeyPressed

    private void txtNumber33KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumber33KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            txtNumber33.setEditable(true);
        }
        else{
            txtNumber33.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_txtNumber33KeyPressed

    private void txtNumber32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumber32ActionPerformed

    }//GEN-LAST:event_txtNumber32ActionPerformed

    private void BtnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExit1ActionPerformed
        // This is the Exit code for Puzzle 2
        Component frame = new JFrame("Exit");

        if(JOptionPane.showConfirmDialog(frame, "Do you Really want to Exit","Puzzle Game?",
            JOptionPane.YES_NO_OPTION )==JOptionPane.YES_NO_OPTION){

        System.exit(0);

        }
    }//GEN-LAST:event_BtnExit1ActionPerformed

    private void BtnStart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStart1ActionPerformed
        // Code For Time Taken As the Game Starts

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
                            TxtMS1.setText(" : " +millisecond);
                            millisecond++;
                            TxtS1.setText(" : " +second);
                            TxtM1.setText(" : " +minute );
                            TxtHr.setText(" : " +hour);

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
    }//GEN-LAST:event_BtnStart1ActionPerformed

    private void BtnSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubmit1ActionPerformed

        //Code To ask for a user Name and display the Name And Welcome Message
        state = false;
        String name;
        name =  JOptionPane.showInputDialog("Please Enter your Name");
        JOptionPane.showMessageDialog(null, "Welcome!!! " +name  );

        //code to Diplay The puzzle Id.
        lblPuzzleIds.getText();
        JOptionPane.showMessageDialog(null, "Your Puzzle id is:"+Puzzles );
            if(txtNumber1.getText().equals("p")&&txtNumber2.getText().equals("e")&&txtNumber3.getText().equals("o")
                     &&txtNumber5.getText().equals("l")&&txtNumber6.getText().equals("e")){
            
            JOptionPane.showMessageDialog(null, "Your Score is 500Points:" +" "+"Thanks for Attempting the puzzle..");
            
        }
        
        //Calling Time Method.
        timeTaken();

    }//GEN-LAST:event_BtnSubmit1ActionPerformed

    private void btnRESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRESETActionPerformed

        // These Lines of code help to Reset The Time After attempting the Puzzle.
        hour = 0;
        minute = 0;
        second = 0;
        millisecond = 0;
        TxtHr.setText(" 00: ");
        TxtM1.setText(" 00: ");
        TxtS1.setText(" 00: ");
        TxtMS1.setText(" 0000: ");

        // These Lines of code Help to Reset the Puzzle After Attempting the puzzle.
        txtNumber1.setText("p");
        txtNumber2.setText(" ");
        txtNumber3.setText("");
        txtNumber4.setText("p");
        txtNumber5.setText("");
        txtNumber6.setText("");
        txtNumber7.setText("*");
        txtNumber8.setText("*");
        txtNumber9.setText(" ");
        txtNumber10.setText("*");
        txtNumber11.setText("");
        txtNumber12.setText("");
        txtNumber13.setText("");
        txtNumber14.setText("");
        txtNumber15.setText("*");
        txtNumber16.setText("");
        txtNumber17.setText(" *");
        txtNumber18.setText(" ");
        txtNumber21.setText("a");
        txtNumber19.setText(" ");
        txtNumber20.setText(" ");
        txtNumber22.setText(" ");
        txtNumber23.setText(" ");
        txtNumber24.setText(" ");
        txtNumber25.setText(" ");
        txtNumber26.setText(" ");
        txtNumber27.setText(" ");
        txtNumber28.setText(" ");
        txtNumber29.setText(" ");
        txtNumber30.setText(" ");
        txtNumber31.setText("*");
        txtNumber32.setText("*");
        txtNumber33.setText(" ");
        txtNumber34.setText("*");
        txtNumber35.setText(" ");
        txtNumber36.setText(" ");

    }//GEN-LAST:event_btnRESETActionPerformed

    private void TxtMS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMS1ActionPerformed

    }//GEN-LAST:event_TxtMS1ActionPerformed

    private void BtnSubmit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubmit2ActionPerformed
        //This lines of code takes the user back to the leadboard.
        new LeadBoard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnSubmit2ActionPerformed

    private void BtnSubmit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubmit3ActionPerformed
        new Puzzle6_6One().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnSubmit3ActionPerformed

    private void txtNumber12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumber12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumber12ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        //code for UnEditable Text for Second puzzle 6*6 
        //Only The admin can edit this .
        txtNumber1.setText("p");
        txtNumber1.setEditable(false);
        
        txtNumber4.setText("p");
        txtNumber4.setEditable(false);
        
        txtNumber7.setText("*");
        txtNumber7.setEditable(false);
        
        txtNumber8.setText("*");
        txtNumber8.setEditable(false);
        
        txtNumber10.setText("*");
        txtNumber10.setEditable(false);
              
        txtNumber31.setText("*");
        txtNumber31.setEditable(false);
        
        txtNumber32.setText("*");
        txtNumber32.setEditable(false);
        
        txtNumber15.setText("*");
        txtNumber15.setEditable(false);
        txtNumber17.setText("*");
        txtNumber17.setEditable(false);
        
        txtNumber34.setText("*");
        txtNumber34.setEditable(false);
        
        txtNumber21.setText("a");
        txtNumber21.setEditable(false);
    }//GEN-LAST:event_formComponentShown

    private void txtNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumber1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumber1ActionPerformed

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
            java.util.logging.Logger.getLogger(Puzzle6_6Two.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Puzzle6_6Two.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Puzzle6_6Two.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Puzzle6_6Two.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Puzzle6_6Two().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExit1;
    private javax.swing.JButton BtnStart1;
    private javax.swing.JButton BtnSubmit1;
    private javax.swing.JButton BtnSubmit2;
    private javax.swing.JButton BtnSubmit3;
    private javax.swing.JTextField TxtHr;
    private javax.swing.JTextField TxtM1;
    private javax.swing.JTextField TxtMS1;
    private javax.swing.JTextField TxtS1;
    private javax.swing.JButton btnRESET;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JLabel lblPuzzleIds;
    private javax.swing.JTextField txtNumber1;
    private javax.swing.JTextField txtNumber10;
    private javax.swing.JTextField txtNumber11;
    private javax.swing.JTextField txtNumber12;
    private javax.swing.JTextField txtNumber13;
    private javax.swing.JTextField txtNumber14;
    private javax.swing.JTextField txtNumber15;
    private javax.swing.JTextField txtNumber16;
    private javax.swing.JTextField txtNumber17;
    private javax.swing.JTextField txtNumber18;
    private javax.swing.JTextField txtNumber19;
    private javax.swing.JTextField txtNumber2;
    private javax.swing.JTextField txtNumber20;
    private javax.swing.JTextField txtNumber21;
    private javax.swing.JTextField txtNumber22;
    private javax.swing.JTextField txtNumber23;
    private javax.swing.JTextField txtNumber24;
    private javax.swing.JTextField txtNumber25;
    private javax.swing.JTextField txtNumber26;
    private javax.swing.JTextField txtNumber27;
    private javax.swing.JTextField txtNumber28;
    private javax.swing.JTextField txtNumber29;
    private javax.swing.JTextField txtNumber3;
    private javax.swing.JTextField txtNumber30;
    private javax.swing.JTextField txtNumber31;
    private javax.swing.JTextField txtNumber32;
    private javax.swing.JTextField txtNumber33;
    private javax.swing.JTextField txtNumber34;
    private javax.swing.JTextField txtNumber35;
    private javax.swing.JTextField txtNumber36;
    private javax.swing.JTextField txtNumber4;
    private javax.swing.JTextField txtNumber5;
    private javax.swing.JTextField txtNumber6;
    private javax.swing.JTextField txtNumber7;
    private javax.swing.JTextField txtNumber8;
    private javax.swing.JTextField txtNumber9;
    // End of variables declaration//GEN-END:variables
}
