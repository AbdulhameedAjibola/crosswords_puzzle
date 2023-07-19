
package com.mycompany.crosswordpuzzle;
//Importation of classes for the project
import java.awt.Component;
import static java.lang.Thread.sleep;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Puzzle6_6One extends javax.swing.JFrame {
   //Declaration And Initialization of Global Variables used in the Project
    static boolean state= true;
    int Puzzle=1001 ;
    int Puzzles=1002;
    int hour=0;
    int minute=0;
    int second =0;
    int millisecond =0;

    
    public Puzzle6_6One() {
        initComponents();
       
         //code for a single Character.
        TxtNumber2.setDocument(new Limited(1));
        TxtNumber3.setDocument(new Limited(1));
        TxtNumber5.setDocument(new Limited(1));
        TxtNumber6.setDocument(new Limited(1));
        TxtNumber9.setDocument(new Limited(1));
        TxtNumber11.setDocument(new Limited(1));
        TxtNumber12.setDocument(new Limited(1));
        TxtNumber13.setDocument(new Limited(1));
        TxtNumber14.setDocument(new Limited(1));
        TxtNumber15.setDocument(new Limited(1));
        TxtNumber16.setDocument(new Limited(1));
        TxtNumber17.setDocument(new Limited(1));
        TxtNumber18.setDocument(new Limited(1));
        TxtNumber19.setDocument(new Limited(1));
        TxtNumber20.setDocument(new Limited(1));
        TxtNumber22.setDocument(new Limited(1));
        TxtNumber23.setDocument(new Limited(1));
        TxtNumber24.setDocument(new Limited(1));
        TxtNumber25.setDocument(new Limited(1));
        TxtNumber26.setDocument(new Limited(1));
        TxtNumber27.setDocument(new Limited(1));
        TxtNumber28.setDocument(new Limited(1));
        TxtNumber29.setDocument(new Limited(1));
        TxtNumber30.setDocument(new Limited(1));
        TxtNumber33.setDocument(new Limited(1));
        TxtNumber35.setDocument(new Limited(1));
        TxtNumber36.setDocument(new Limited(1));
        
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

        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        TxtNumber1 = new javax.swing.JTextField();
        TxtNumber6 = new javax.swing.JTextField();
        TxtNumber2 = new javax.swing.JTextField();
        TxtNumber3 = new javax.swing.JTextField();
        TxtNumber4 = new javax.swing.JTextField();
        TxtNumber5 = new javax.swing.JTextField();
        TxtNumber7 = new javax.swing.JTextField();
        TxtNumber8 = new javax.swing.JTextField();
        TxtNumber9 = new javax.swing.JTextField();
        TxtNumber10 = new javax.swing.JTextField();
        TxtNumber11 = new javax.swing.JTextField();
        TxtNumber12 = new javax.swing.JTextField();
        TxtNumber15 = new javax.swing.JTextField();
        TxtNumber16 = new javax.swing.JTextField();
        TxtNumber18 = new javax.swing.JTextField();
        TxtNumber13 = new javax.swing.JTextField();
        TxtNumber14 = new javax.swing.JTextField();
        TxtNumber17 = new javax.swing.JTextField();
        TxtNumber23 = new javax.swing.JTextField();
        TxtNumber20 = new javax.swing.JTextField();
        TxtNumber21 = new javax.swing.JTextField();
        TxtNumber24 = new javax.swing.JTextField();
        TxtNumber19 = new javax.swing.JTextField();
        TxtNumber22 = new javax.swing.JTextField();
        TxtNumber26 = new javax.swing.JTextField();
        TxtNumber30 = new javax.swing.JTextField();
        TxtNumber29 = new javax.swing.JTextField();
        TxtNumber28 = new javax.swing.JTextField();
        TxtNumber27 = new javax.swing.JTextField();
        TxtNumber25 = new javax.swing.JTextField();
        TxtNumber36 = new javax.swing.JTextField();
        TxtNumber35 = new javax.swing.JTextField();
        TxtNumber34 = new javax.swing.JTextField();
        TxtNumber33 = new javax.swing.JTextField();
        TxtNumber32 = new javax.swing.JTextField();
        TxtNumber31 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        BtnExit = new javax.swing.JButton();
        BtnStart = new javax.swing.JButton();
        BtnNext = new javax.swing.JButton();
        BtnReset = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        TxtHr = new javax.swing.JTextField();
        TxtM = new javax.swing.JTextField();
        TxtS = new javax.swing.JTextField();
        TxtMS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPuzzleIds = new javax.swing.JLabel();
        BtnSubmit1 = new javax.swing.JButton();
        BtnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();

        jRadioButton2.setText("jRadioButton2");

        jRadioButton4.setBackground(new java.awt.Color(51, 51, 255));
        jRadioButton4.setForeground(new java.awt.Color(255, 51, 51));
        jRadioButton4.setText("OFF");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 4));

        TxtNumber1.setBackground(new java.awt.Color(0, 0, 255));
        TxtNumber1.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber1.setForeground(new java.awt.Color(255, 255, 255));
        TxtNumber1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber1.setText("s");
        TxtNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumber1ActionPerformed(evt);
            }
        });

        TxtNumber6.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber6.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber6.setForeground(new java.awt.Color(0, 0, 255));
        TxtNumber6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber6KeyPressed(evt);
            }
        });

        TxtNumber2.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber2.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber2.setForeground(new java.awt.Color(0, 0, 255));
        TxtNumber2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber2KeyPressed(evt);
            }
        });

        TxtNumber3.setBackground(new java.awt.Color(0, 0, 255));
        TxtNumber3.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber3.setForeground(new java.awt.Color(255, 255, 255));
        TxtNumber3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber3KeyPressed(evt);
            }
        });

        TxtNumber4.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber4.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber4.setForeground(new java.awt.Color(0, 0, 255));
        TxtNumber4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber4.setText("o");

        TxtNumber5.setBackground(new java.awt.Color(0, 0, 255));
        TxtNumber5.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber5.setForeground(new java.awt.Color(255, 255, 255));
        TxtNumber5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber5KeyPressed(evt);
            }
        });

        TxtNumber7.setBackground(new java.awt.Color(0, 0, 255));
        TxtNumber7.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber7.setForeground(new java.awt.Color(255, 255, 255));
        TxtNumber7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber7.setText("*");

        TxtNumber8.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber8.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber8.setForeground(new java.awt.Color(0, 0, 255));
        TxtNumber8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber8.setText("*");

        TxtNumber9.setBackground(new java.awt.Color(0, 0, 255));
        TxtNumber9.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber9.setForeground(new java.awt.Color(255, 255, 255));
        TxtNumber9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber9.setText("*");
        TxtNumber9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber9KeyPressed(evt);
            }
        });

        TxtNumber10.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber10.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber10.setForeground(new java.awt.Color(0, 0, 255));
        TxtNumber10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber10.setText("*");

        TxtNumber11.setBackground(new java.awt.Color(0, 0, 255));
        TxtNumber11.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber11.setForeground(new java.awt.Color(255, 255, 255));
        TxtNumber11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber11KeyPressed(evt);
            }
        });

        TxtNumber12.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber12.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber12.setForeground(new java.awt.Color(0, 0, 255));
        TxtNumber12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber12KeyPressed(evt);
            }
        });

        TxtNumber15.setBackground(new java.awt.Color(0, 0, 255));
        TxtNumber15.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber15.setForeground(new java.awt.Color(255, 255, 255));
        TxtNumber15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber15KeyPressed(evt);
            }
        });

        TxtNumber16.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber16.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber16.setForeground(new java.awt.Color(0, 0, 255));
        TxtNumber16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber16KeyPressed(evt);
            }
        });

        TxtNumber18.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber18.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber18.setForeground(new java.awt.Color(0, 0, 255));
        TxtNumber18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber18KeyPressed(evt);
            }
        });

        TxtNumber13.setBackground(new java.awt.Color(0, 0, 255));
        TxtNumber13.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber13.setForeground(new java.awt.Color(255, 255, 255));
        TxtNumber13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber13KeyPressed(evt);
            }
        });

        TxtNumber14.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber14.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber14.setForeground(new java.awt.Color(0, 0, 255));
        TxtNumber14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber14KeyPressed(evt);
            }
        });

        TxtNumber17.setBackground(new java.awt.Color(0, 0, 255));
        TxtNumber17.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber17.setForeground(new java.awt.Color(255, 255, 255));
        TxtNumber17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber17KeyPressed(evt);
            }
        });

        TxtNumber23.setBackground(new java.awt.Color(0, 0, 255));
        TxtNumber23.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber23.setForeground(new java.awt.Color(255, 255, 255));
        TxtNumber23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber23KeyPressed(evt);
            }
        });

        TxtNumber20.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber20.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber20.setForeground(new java.awt.Color(0, 0, 255));
        TxtNumber20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber20KeyPressed(evt);
            }
        });

        TxtNumber21.setBackground(new java.awt.Color(0, 0, 255));
        TxtNumber21.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber21.setForeground(new java.awt.Color(255, 255, 255));
        TxtNumber21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber21.setText("c");

        TxtNumber24.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber24.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber24.setForeground(new java.awt.Color(0, 0, 255));
        TxtNumber24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber24KeyPressed(evt);
            }
        });

        TxtNumber19.setBackground(new java.awt.Color(0, 0, 255));
        TxtNumber19.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber19.setForeground(new java.awt.Color(255, 255, 255));
        TxtNumber19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumber19ActionPerformed(evt);
            }
        });
        TxtNumber19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber19KeyPressed(evt);
            }
        });

        TxtNumber22.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber22.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber22.setForeground(new java.awt.Color(0, 0, 255));
        TxtNumber22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber22KeyPressed(evt);
            }
        });

        TxtNumber26.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber26.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber26.setForeground(new java.awt.Color(0, 0, 255));
        TxtNumber26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumber26ActionPerformed(evt);
            }
        });
        TxtNumber26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber26KeyPressed(evt);
            }
        });

        TxtNumber30.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber30.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber30.setForeground(new java.awt.Color(0, 0, 255));
        TxtNumber30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber30.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber30KeyPressed(evt);
            }
        });

        TxtNumber29.setBackground(new java.awt.Color(0, 0, 255));
        TxtNumber29.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber29.setForeground(new java.awt.Color(255, 255, 255));
        TxtNumber29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumber29ActionPerformed(evt);
            }
        });
        TxtNumber29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber29KeyPressed(evt);
            }
        });

        TxtNumber28.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber28.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber28.setForeground(new java.awt.Color(0, 0, 255));
        TxtNumber28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber28KeyPressed(evt);
            }
        });

        TxtNumber27.setBackground(new java.awt.Color(0, 0, 255));
        TxtNumber27.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber27.setForeground(new java.awt.Color(255, 255, 255));
        TxtNumber27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber27KeyPressed(evt);
            }
        });

        TxtNumber25.setBackground(new java.awt.Color(0, 0, 255));
        TxtNumber25.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber25.setForeground(new java.awt.Color(255, 255, 255));
        TxtNumber25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber25KeyPressed(evt);
            }
        });

        TxtNumber36.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber36.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber36.setForeground(new java.awt.Color(0, 0, 255));
        TxtNumber36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber36.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber36KeyPressed(evt);
            }
        });

        TxtNumber35.setBackground(new java.awt.Color(0, 0, 255));
        TxtNumber35.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber35.setForeground(new java.awt.Color(255, 255, 255));
        TxtNumber35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber35.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber35KeyPressed(evt);
            }
        });

        TxtNumber34.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber34.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber34.setForeground(new java.awt.Color(0, 0, 255));
        TxtNumber34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber34.setText("*");

        TxtNumber33.setBackground(new java.awt.Color(0, 0, 255));
        TxtNumber33.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber33.setForeground(new java.awt.Color(255, 255, 255));
        TxtNumber33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber33.setText("*");
        TxtNumber33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumber33KeyPressed(evt);
            }
        });

        TxtNumber32.setBackground(new java.awt.Color(255, 255, 0));
        TxtNumber32.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber32.setForeground(new java.awt.Color(0, 0, 255));
        TxtNumber32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber32.setText("*");

        TxtNumber31.setBackground(new java.awt.Color(0, 0, 255));
        TxtNumber31.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        TxtNumber31.setForeground(new java.awt.Color(255, 255, 255));
        TxtNumber31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNumber31.setText("*");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 4));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("(6).Non volatile ROM that enables idividual byte of data");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("(1).An institution for educating children");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("(5).A village in Sloviakia");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("(3).Very Beautiful or Attractive");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("(4).A container in which something is kept for cooling");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("(2).Chemical element,A white lustrus metal");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 255));
        jLabel26.setText("Dear Player,Look For A Word that Best Describes the sentence and fill in the word in each Box.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(17, 17, 17)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(128, 128, 128)))
        );

        BtnExit.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        BtnExit.setText("Exit Game");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });

        BtnStart.setBackground(new java.awt.Color(0, 153, 0));
        BtnStart.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnStart.setForeground(new java.awt.Color(255, 255, 255));
        BtnStart.setText("Start");
        BtnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStartActionPerformed(evt);
            }
        });

        BtnNext.setBackground(new java.awt.Color(255, 255, 0));
        BtnNext.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnNext.setForeground(new java.awt.Color(255, 255, 255));
        BtnNext.setText("NEXT>>");
        BtnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNextActionPerformed(evt);
            }
        });

        BtnReset.setBackground(new java.awt.Color(0, 0, 0));
        BtnReset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnReset.setForeground(new java.awt.Color(255, 255, 255));
        BtnReset.setText("Reset");
        BtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetActionPerformed(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 4));

        TxtHr.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TxtHr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtHr.setText("00:");

        TxtM.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TxtM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtM.setText("00:");

        TxtS.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TxtS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtS.setText("00:");

        TxtMS.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TxtMS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtMS.setText("0000");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HR");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("M");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("S");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MS");

        lblPuzzleIds.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPuzzleIds.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuzzleIds.setText("ID:1001");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtS, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtM, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtHr, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TxtMS, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPuzzleIds, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtHr, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtM, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(TxtMS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(lblPuzzleIds, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        BtnSubmit1.setBackground(new java.awt.Color(0, 0, 255));
        BtnSubmit1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnSubmit1.setForeground(new java.awt.Color(255, 255, 255));
        BtnSubmit1.setText("Submit");
        BtnSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubmit1ActionPerformed(evt);
            }
        });

        BtnBack.setBackground(new java.awt.Color(51, 51, 255));
        BtnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnBack.setForeground(new java.awt.Color(255, 255, 255));
        BtnBack.setText("<<BACK");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("WELCOME TO PUZZZLE ONE 6*6");

        jRadioButton5.setBackground(new java.awt.Color(51, 51, 255));
        jRadioButton5.setForeground(new java.awt.Color(255, 51, 51));
        jRadioButton5.setText("OFF");

        jRadioButton6.setBackground(new java.awt.Color(51, 51, 255));
        jRadioButton6.setForeground(new java.awt.Color(255, 255, 0));
        jRadioButton6.setText("ON");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BtnSubmit1)
                                .addGap(43, 43, 43)
                                .addComponent(BtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BtnBack))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnNext)
                            .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(TxtNumber13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber14, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber15, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber16, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber17, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber18, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(TxtNumber24, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber23, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber22, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber21, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber20, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber19, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(TxtNumber25, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber26, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber27, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber28, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber29, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber30, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(TxtNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(TxtNumber12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(TxtNumber36, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber35, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber34, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber33, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber32, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtNumber31, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(24, 24, 24))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jRadioButton6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton5)))))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TxtNumber12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtNumber11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtNumber9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtNumber8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtNumber7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TxtNumber10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNumber13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber15, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber17, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber18, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNumber24, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber23, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber22, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber21, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber20, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber19, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNumber25, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber26, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber27, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber28, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber29, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber30, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNumber36, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber35, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber34, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber33, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber32, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumber31, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSubmit1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        //This lines of code takes the user Back to the Leadboard. 
       new LeadBoard().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BtnBackActionPerformed

    private void BtnSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubmit1ActionPerformed
        
          //Code To ask for a user Name and display the Name And Welcome Message
        state = false;
        String name;
        name =  JOptionPane.showInputDialog("Please Enter your Name");
        JOptionPane.showMessageDialog(null, "Welcome!!! " +name  );

        //code to Diplay The puzzle Id.
        lblPuzzleIds.getText();
        JOptionPane.showMessageDialog(null, "Your Puzzle id is:"+Puzzles );
             if(TxtNumber1.getText().equals("s")&&TxtNumber2.getText().equals("c")&&TxtNumber3.getText().equals("h")
                     &&TxtNumber5.getText().equals("o")&&TxtNumber6.getText().equals("l")){
            
            JOptionPane.showMessageDialog(null, "Your Score is 500Points"+""+"Thanks for Attempting the puzzle..");
            
        }
        
        //Calling Time Method.
        timeTaken();
    }//GEN-LAST:event_BtnSubmit1ActionPerformed

    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed

        // Reset Time code.
        hour = 0;
        minute = 0;
        second = 0;
        millisecond = 0;

        TxtHr.setText(" 00: ");
        TxtM.setText(" 00: ");
        TxtS.setText(" 00: ");
        TxtMS.setText(" 0000: ");

        // Reset Text code.
        TxtNumber1.setText(" s");
        TxtNumber2.setText(" ");
        TxtNumber3.setText("");
        TxtNumber4.setText(" p");
        TxtNumber5.setText(" ");
        TxtNumber6.setText("");
        TxtNumber7.setText(" *");
        TxtNumber8.setText("*");
        TxtNumber9.setText("* ");
        TxtNumber10.setText("* ");
        TxtNumber11.setText(" ");
        TxtNumber12.setText(" ");
        TxtNumber13.setText(" ");
        TxtNumber14.setText("");
        TxtNumber15.setText(" ");
        TxtNumber16.setText("");
        TxtNumber17.setText(" ");
        TxtNumber18.setText(" ");
        TxtNumber19.setText(" ");
        TxtNumber20.setText(" ");
        TxtNumber19.setText(" ");
        TxtNumber20.setText(" ");
        TxtNumber21.setText(" c");
        TxtNumber22.setText(" ");
        TxtNumber23.setText(" ");
        TxtNumber24.setText(" ");
        TxtNumber25.setText(" ");
        TxtNumber26.setText(" ");
        TxtNumber27.setText(" ");
        TxtNumber28.setText(" ");
        TxtNumber29.setText(" ");
        TxtNumber30.setText(" ");
        TxtNumber31.setText(" *");
        TxtNumber32.setText(" *");
        TxtNumber33.setText("* ");
        TxtNumber34.setText("* ");
        TxtNumber35.setText("");
        TxtNumber36.setText("");
    }//GEN-LAST:event_BtnResetActionPerformed

    private void BtnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNextActionPerformed
        //Thesa lines of code will take you to the next puzzle.
          new Puzzle6_6Two().setVisible(true);
          this.dispose();
    }//GEN-LAST:event_BtnNextActionPerformed

    private void BtnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStartActionPerformed
        // Code For Time,that is Method to make the time running dynamically.

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
                            TxtMS.setText(" : " +millisecond);
                            millisecond++;
                            TxtS.setText(" : " +second);
                            TxtM.setText(" : " +minute );
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
    }//GEN-LAST:event_BtnStartActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        // This is the Exit code for Puzzle 1

        Component frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Do you Really want to Exit","Puzzle Game?",
            JOptionPane.YES_NO_OPTION )==JOptionPane.YES_NO_OPTION){

        System.exit(0);

        }
    }//GEN-LAST:event_BtnExitActionPerformed

    private void TxtNumber33KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber33KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber33.setEditable(true);
        }
        else{
            TxtNumber33.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber33KeyPressed

    private void TxtNumber35KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber35KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber35.setEditable(true);
        }
        else{
            TxtNumber35.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber35KeyPressed

    private void TxtNumber36KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber36KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber36.setEditable(true);
        }
        else{
            TxtNumber36.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber36KeyPressed

    private void TxtNumber25KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber25KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber25.setEditable(true);
        }
        else{
            TxtNumber25.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber25KeyPressed

    private void TxtNumber27KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber27KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber27.setEditable(true);
        }
        else{
            TxtNumber27.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber27KeyPressed

    private void TxtNumber28KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber28KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber28.setEditable(true);
        }
        else{
            TxtNumber28.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber28KeyPressed

    private void TxtNumber29KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber29KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber29.setEditable(true);
        }
        else{
            TxtNumber29.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber29KeyPressed

    private void TxtNumber29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumber29ActionPerformed

    }//GEN-LAST:event_TxtNumber29ActionPerformed

    private void TxtNumber30KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber30KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber30.setEditable(true);
        }
        else{
            TxtNumber30.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber30KeyPressed

    private void TxtNumber26KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber26KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber26.setEditable(true);
        }
        else{
            TxtNumber26.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber26KeyPressed

    private void TxtNumber22KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber22KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber22.setEditable(true);
        }
        else{
            TxtNumber22.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber22KeyPressed

    private void TxtNumber19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber19KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber19.setEditable(true);
        }
        else{
            TxtNumber19.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber19KeyPressed

    private void TxtNumber19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumber19ActionPerformed

    }//GEN-LAST:event_TxtNumber19ActionPerformed

    private void TxtNumber24KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber24KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber24.setEditable(true);
        }
        else{
            TxtNumber24.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber24KeyPressed

    private void TxtNumber20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber20KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber20.setEditable(true);
        }
        else{
            TxtNumber20.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber20KeyPressed

    private void TxtNumber23KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber23KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber23.setEditable(true);
        }
        else{
            TxtNumber23.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber23KeyPressed

    private void TxtNumber17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber17KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber17.setEditable(true);
        }
        else{
            TxtNumber17.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber17KeyPressed

    private void TxtNumber14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber14KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber14.setEditable(true);
        }
        else{
            TxtNumber14.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber14KeyPressed

    private void TxtNumber13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber13KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber13.setEditable(true);
        }
        else{
            TxtNumber13.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber13KeyPressed

    private void TxtNumber18KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber18KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber18.setEditable(true);
        }
        else{
            TxtNumber18.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber18KeyPressed

    private void TxtNumber16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber16KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber16.setEditable(true);
        }
        else{
            TxtNumber16.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber16KeyPressed

    private void TxtNumber15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber15KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber15.setEditable(true);
        }
        else{
            TxtNumber15.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber15KeyPressed

    private void TxtNumber12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber12KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber12.setEditable(true);
        }
        else{
            TxtNumber12.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber12KeyPressed

    private void TxtNumber11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber11KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber11.setEditable(true);
        }
        else{
            TxtNumber11.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber11KeyPressed

    private void TxtNumber9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber9KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber9.setEditable(true);
        }
        else{
            TxtNumber9.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber9KeyPressed

    private void TxtNumber5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber5KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber5.setEditable(true);
        }
        else{
            TxtNumber5.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber5KeyPressed

    private void TxtNumber3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber3KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber3.setEditable(true);
        }
        else{
            TxtNumber3.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber3KeyPressed

    private void TxtNumber2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber2KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber2.setEditable(true);
        }
        else{
            TxtNumber2.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber2KeyPressed

    private void TxtNumber6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumber6KeyPressed
        // code JTextfield that can accept letters,Whitespace and delete backspase key only.
        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){

            TxtNumber6.setEditable(true);
        }
        else{
            TxtNumber6.setEditable(false);
            JOptionPane.showMessageDialog(this, " Dear User You cannot enter a number");

        }
    }//GEN-LAST:event_TxtNumber6KeyPressed

    private void TxtNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumber1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNumber1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        
        //code for UnEditable Text for First puzzle 6*6 
              
        TxtNumber1.setText("s");
        TxtNumber1.setEditable(false);
        
        TxtNumber4.setText("o");
        TxtNumber4.setEditable(false);
        
        TxtNumber7.setText("*");
        TxtNumber7.setEditable(false);
        
        TxtNumber8.setText("*");
        TxtNumber8.setEditable(false);
        
        TxtNumber10.setText("*");
        TxtNumber10.setEditable(false);
            
        TxtNumber21.setText(" c");
        TxtNumber21.setEditable(false);
        
        TxtNumber31.setText("*");
        TxtNumber31.setEditable(false);
        
        TxtNumber32.setText("*");
        TxtNumber32.setEditable(false);
        
        TxtNumber34.setText("*");
        TxtNumber34.setEditable(false);
        
        TxtNumber9.setText("*");
        TxtNumber9.setEditable(false);
        
        TxtNumber33.setText("*");
        TxtNumber33.setEditable(false);
    }//GEN-LAST:event_formComponentShown

    private void TxtNumber26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumber26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNumber26ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Puzzle6_6One.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Puzzle6_6One.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Puzzle6_6One.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Puzzle6_6One.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Puzzle6_6One().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnNext;
    private javax.swing.JButton BtnReset;
    private javax.swing.JButton BtnStart;
    private javax.swing.JButton BtnSubmit1;
    private javax.swing.JTextField TxtHr;
    private javax.swing.JTextField TxtM;
    private javax.swing.JTextField TxtMS;
    private javax.swing.JTextField TxtNumber1;
    private javax.swing.JTextField TxtNumber10;
    private javax.swing.JTextField TxtNumber11;
    private javax.swing.JTextField TxtNumber12;
    private javax.swing.JTextField TxtNumber13;
    private javax.swing.JTextField TxtNumber14;
    private javax.swing.JTextField TxtNumber15;
    private javax.swing.JTextField TxtNumber16;
    private javax.swing.JTextField TxtNumber17;
    private javax.swing.JTextField TxtNumber18;
    private javax.swing.JTextField TxtNumber19;
    private javax.swing.JTextField TxtNumber2;
    private javax.swing.JTextField TxtNumber20;
    private javax.swing.JTextField TxtNumber21;
    private javax.swing.JTextField TxtNumber22;
    private javax.swing.JTextField TxtNumber23;
    private javax.swing.JTextField TxtNumber24;
    private javax.swing.JTextField TxtNumber25;
    private javax.swing.JTextField TxtNumber26;
    private javax.swing.JTextField TxtNumber27;
    private javax.swing.JTextField TxtNumber28;
    private javax.swing.JTextField TxtNumber29;
    private javax.swing.JTextField TxtNumber3;
    private javax.swing.JTextField TxtNumber30;
    private javax.swing.JTextField TxtNumber31;
    private javax.swing.JTextField TxtNumber32;
    private javax.swing.JTextField TxtNumber33;
    private javax.swing.JTextField TxtNumber34;
    private javax.swing.JTextField TxtNumber35;
    private javax.swing.JTextField TxtNumber36;
    private javax.swing.JTextField TxtNumber4;
    private javax.swing.JTextField TxtNumber5;
    private javax.swing.JTextField TxtNumber6;
    private javax.swing.JTextField TxtNumber7;
    private javax.swing.JTextField TxtNumber8;
    private javax.swing.JTextField TxtNumber9;
    private javax.swing.JTextField TxtS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JLabel lblPuzzleIds;
    // End of variables declaration//GEN-END:variables
}
