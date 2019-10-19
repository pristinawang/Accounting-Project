
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pristy
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        
        initComponents();
        tostartpage.setOpaque(false);
        tostartpage.setContentAreaFilled(false);
        tostartpage.setBorderPainted(false);
        
        enter.setOpaque(false);
        enter.setContentAreaFilled(false);
        enter.setBorderPainted(false);
        
        edit.setOpaque(false);
        edit.setContentAreaFilled(false);
        edit.setBorderPainted(false);
        
        delete.setOpaque(false);
        delete.setContentAreaFilled(false);
        delete.setBorderPainted(false);
        
        delete1.setOpaque(false);
        delete1.setContentAreaFilled(false);
        delete1.setBorderPainted(false);
        
        search.setOpaque(false);
        search.setContentAreaFilled(false);
        search.setBorderPainted(false);
        
        calculate.setOpaque(false);
        calculate.setContentAreaFilled(false);
        calculate.setBorderPainted(false);
        
        refresh.setOpaque(false);
        refresh.setContentAreaFilled(false);
        refresh.setBorderPainted(false);
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
        parentpanel = new javax.swing.JPanel();
        frontpage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        startredbackdrop = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tostartpage = new javax.swing.JButton();
        backdrop = new javax.swing.JLabel();
        start = new javax.swing.JPanel();
        backgroundcolor = new javax.swing.JPanel();
        redpane = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        item = new javax.swing.JTextField();
        money = new javax.swing.JTextField();
        day = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        month = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        display = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        enter = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        edit = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        search = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        delete1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        calculate = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 159, 28));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        parentpanel.setLayout(new java.awt.CardLayout());

        frontpage.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Morganite", 1, 380)); // NOI18N
        jLabel1.setText("SPEND IN");
        frontpage.add(jLabel1);
        jLabel1.setBounds(180, 140, 640, 360);

        startredbackdrop.setBackground(new java.awt.Color(230, 57, 70));
        startredbackdrop.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Morganite", 0, 48)); // NOI18N
        jLabel2.setText("START START START START START");
        startredbackdrop.add(jLabel2);
        jLabel2.setBounds(20, 0, 280, 60);

        tostartpage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tostartpage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tostartpageActionPerformed(evt);
            }
        });
        startredbackdrop.add(tostartpage);
        tostartpage.setBounds(0, 0, 310, 50);

        frontpage.add(startredbackdrop);
        startredbackdrop.setBounds(350, 520, 310, 50);

        backdrop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconimage/frontpage.png"))); // NOI18N
        frontpage.add(backdrop);
        backdrop.setBounds(0, -4, 960, 730);

        parentpanel.add(frontpage, "card3");

        start.setLayout(null);

        backgroundcolor.setBackground(new java.awt.Color(29, 53, 87));
        backgroundcolor.setLayout(null);

        redpane.setBackground(new java.awt.Color(230, 57, 70));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "日期", "價格", "項目"
            }
        ));
        jScrollPane1.setViewportView(table);

        jLabel3.setFont(new java.awt.Font("Morganite", 0, 70)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Table");

        javax.swing.GroupLayout redpaneLayout = new javax.swing.GroupLayout(redpane);
        redpane.setLayout(redpaneLayout);
        redpaneLayout.setHorizontalGroup(
            redpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, redpaneLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(redpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        redpaneLayout.setVerticalGroup(
            redpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, redpaneLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        backgroundcolor.add(redpane);
        redpane.setBounds(460, 0, 500, 720);

        jLabel4.setFont(new java.awt.Font("Morganite", 0, 70)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data");
        backgroundcolor.add(jLabel4);
        jLabel4.setBounds(40, 90, 52, 71);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("年                         月                    日");
        backgroundcolor.add(jLabel5);
        jLabel5.setBounds(90, 200, 280, 17);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("項目名稱");
        backgroundcolor.add(jLabel7);
        jLabel7.setBounds(240, 270, 60, 17);

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("本月總支出");
        backgroundcolor.add(jLabel9);
        jLabel9.setBounds(90, 360, 100, 22);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("＿＿＿＿＿＿＿＿＿＿    ＿＿＿＿＿＿＿＿＿＿\n");
        backgroundcolor.add(jLabel11);
        jLabel11.setBounds(90, 310, 290, 40);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("＿＿＿＿＿＿＿     ＿＿＿＿＿＿     ＿＿＿＿＿");
        backgroundcolor.add(jLabel13);
        jLabel13.setBounds(90, 230, 310, 40);

        item.setBackground(new java.awt.Color(29, 53, 87));
        item.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        item.setForeground(new java.awt.Color(255, 255, 255));
        item.setBorder(null);
        backgroundcolor.add(item);
        item.setBounds(240, 300, 130, 40);

        money.setBackground(new java.awt.Color(29, 53, 87));
        money.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        money.setForeground(new java.awt.Color(255, 255, 255));
        money.setBorder(null);
        backgroundcolor.add(money);
        money.setBounds(90, 300, 130, 40);

        day.setBackground(new java.awt.Color(29, 53, 87));
        day.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        day.setForeground(new java.awt.Color(255, 255, 255));
        day.setBorder(null);
        backgroundcolor.add(day);
        day.setBounds(300, 220, 60, 40);

        year.setBackground(new java.awt.Color(29, 53, 87));
        year.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        year.setForeground(new java.awt.Color(255, 255, 255));
        year.setBorder(null);
        backgroundcolor.add(year);
        year.setBounds(90, 220, 90, 40);

        month.setBackground(new java.awt.Color(29, 53, 87));
        month.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        month.setForeground(new java.awt.Color(255, 255, 255));
        month.setBorder(null);
        backgroundcolor.add(month);
        month.setBounds(200, 220, 80, 40);

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("金額");
        backgroundcolor.add(jLabel10);
        jLabel10.setBounds(90, 270, 40, 22);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿\n");
        backgroundcolor.add(jLabel6);
        jLabel6.setBounds(90, 400, 290, 30);

        display.setBackground(new java.awt.Color(29, 53, 87));
        display.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        display.setForeground(new java.awt.Color(255, 255, 255));
        display.setBorder(null);
        display.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        backgroundcolor.add(display);
        display.setBounds(90, 390, 280, 40);

        jPanel2.setBackground(new java.awt.Color(69, 123, 157));
        jPanel2.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Morganite", 0, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("enter");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(30, 0, 50, 60);

        enter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        jPanel2.add(enter);
        enter.setBounds(0, 0, 90, 50);

        backgroundcolor.add(jPanel2);
        jPanel2.setBounds(90, 460, 90, 50);

        jPanel3.setBackground(new java.awt.Color(69, 123, 157));
        jPanel3.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Morganite", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("edit");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(30, 10, 30, 40);

        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel3.add(edit);
        edit.setBounds(0, 0, 80, 50);

        backgroundcolor.add(jPanel3);
        jPanel3.setBounds(190, 460, 80, 50);

        jPanel6.setBackground(new java.awt.Color(69, 123, 157));
        jPanel6.setLayout(null);

        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel6.add(search);
        search.setBounds(0, 0, 130, 50);

        jLabel16.setFont(new java.awt.Font("Morganite", 0, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("search search");
        jPanel6.add(jLabel16);
        jLabel16.setBounds(10, 10, 130, 40);

        backgroundcolor.add(jPanel6);
        jPanel6.setBounds(90, 530, 130, 50);

        jPanel5.setBackground(new java.awt.Color(69, 123, 157));
        jPanel5.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Morganite", 0, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("delete delete");
        jPanel5.add(jLabel15);
        jLabel15.setBounds(20, 10, 100, 40);

        delete1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        jPanel5.add(delete1);
        delete1.setBounds(0, 0, 130, 50);

        backgroundcolor.add(jPanel5);
        jPanel5.setBounds(240, 530, 130, 50);

        jPanel4.setBackground(new java.awt.Color(69, 123, 157));
        jPanel4.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Morganite", 0, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("clear");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(16, 10, 60, 40);

        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel4.add(delete);
        delete.setBounds(0, 0, 80, 50);

        backgroundcolor.add(jPanel4);
        jPanel4.setBounds(280, 460, 90, 50);

        jPanel7.setBackground(new java.awt.Color(69, 123, 157));
        jPanel7.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Morganite", 0, 48)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("refresh");
        jPanel7.add(jLabel18);
        jLabel18.setBounds(30, 10, 70, 30);

        refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel7.add(refresh);
        refresh.setBounds(0, 0, 130, 50);

        backgroundcolor.add(jPanel7);
        jPanel7.setBounds(90, 600, 130, 50);

        jPanel8.setBackground(new java.awt.Color(69, 123, 157));
        jPanel8.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Morganite", 0, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("calculate");
        jPanel8.add(jLabel17);
        jLabel17.setBounds(30, 10, 70, 30);

        calculate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });
        jPanel8.add(calculate);
        calculate.setBounds(0, 0, 130, 50);

        backgroundcolor.add(jPanel8);
        jPanel8.setBounds(240, 600, 130, 50);

        start.add(backgroundcolor);
        backgroundcolor.setBounds(0, 0, 960, 720);

        parentpanel.add(start, "card2");

        getContentPane().add(parentpanel, "card4");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tostartpageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tostartpageActionPerformed
        parentpanel.removeAll();                // TODO add your handling code here:
        parentpanel.add(start);
        parentpanel.repaint();
        parentpanel.revalidate();
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        FileReader fr = null;
			try {
				fr=new FileReader("/Users/pristy/Documents/NCHU/NetBeansProjects/finalproject2/text.txt");
			}catch (IOException e) {
				System.out.println("file open error");
				System.exit(-1);
			}
			//read file
			BufferedReader b = new BufferedReader(fr);
			//data processing : importing data
			String input="";
                        String date,money,moneyfinal,item;
                        
			loop:{
			do{
                            int testzero=0,n=0;
				try {
					input = b.readLine();
				}catch(IOException e) {
					System.out.println("file reading error");
					System.exit(-2);
				}
				if(input == null || input.equals(null))
					break loop;
				date=input.substring(0,8);
                                money=input.substring(9, 16);
				
				while(testzero==0 && n<7) {
					if(n==6) {
						testzero=Integer.parseInt(money.substring(n));
					}
					else
						testzero=Integer.parseInt(money.substring(n,n+1));
					n=n+1;
				}
				moneyfinal=money.substring(n-1);
                                item=input.substring(17);
                                model.addRow(new Object[]{date,moneyfinal,item});
				
			}while( true) ;
			}
                        try {
					b.close();
				} catch (IOException e) {
					System.out.println("file close error");
				}
    }//GEN-LAST:event_tostartpageActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Spending sp=new Spending();
        String moneytemp;
        String monthss,dayss, datefinal,moneyss,itemss;
        String years=year.getText();
        int monthi=Integer.parseInt(month.getText());
        int dayi=Integer.parseInt(day.getText());
        if(monthi<=9) {
            monthss="0"+Integer.toString(monthi);
	}
	else {
            monthss=Integer.toString(monthi);
	}
        if(dayi<=9) {
            dayss="0"+Integer.toString(dayi);
	}
	else {
            dayss=Integer.toString(dayi);
	}
        //date confirmed
        datefinal=years+monthss+dayss;
        //money confirmed
        moneyss=money.getText();
        //item confirmed
        itemss=item.getText();
        model.addRow(new Object[]{datefinal,moneyss,itemss});
        //export table to txt
        FileWriter fw = null;
        String newLine = System.getProperty("line.separator");
        
			try {
				fw=new FileWriter("/Users/pristy/Documents/NCHU/NetBeansProjects/finalproject2/text.txt");
                                BufferedWriter bw=new BufferedWriter(fw);
                                
                                for(int i= 0; i < table.getRowCount(); i++){//row
                                    for(int j=0; j < table.getColumnCount();j++){//column
                                        if(j==1){
                                            moneytemp=table.getValueAt(i,j).toString();
                                            sp.setMoney(Integer.parseInt(moneytemp));
                                            bw.write(sp.getMoney()+" ");
                                        }
                                        else
                                            bw.write(table.getValueAt(i,j).toString()+" ");
                                    }
                                    bw.write(newLine);
                                }
                                bw.close();
                                fw.close();
			}catch (IOException e) {
				System.out.println("file open error");
				System.exit(-1);
			}
                        
        
    }//GEN-LAST:event_enterActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        year.setText("");
        month.setText("");
        day.setText("");
        item.setText("");
        money.setText("");
        display.setText("");
        
        //export table to txt
        FileWriter fw = null;
        String moneytemp;
        Spending sp = new Spending();
        String newLine = System.getProperty("line.separator");
        
			try {
				fw=new FileWriter("/Users/pristy/Documents/NCHU/NetBeansProjects/finalproject2/text.txt");
                                BufferedWriter bw=new BufferedWriter(fw);
                                
                                for(int i= 0; i < table.getRowCount(); i++){//row
                                    for(int j=0; j < table.getColumnCount();j++){//column
                                        if(j==1){
                                            moneytemp=table.getValueAt(i,j).toString();
                                            sp.setMoney(Integer.parseInt(moneytemp));
                                            bw.write(sp.getMoney()+" ");
                                        }
                                        else
                                            bw.write(table.getValueAt(i,j).toString()+" ");
                                    }
                                    bw.write(newLine);
                                }
                                bw.close();
                                fw.close();
			}catch (IOException e) {
				System.out.println("file open error");
				System.exit(-1);
			}
                        
                    
    }//GEN-LAST:event_deleteActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        String monthss,dayss, datefinal,moneyss,itemss;
        String years=year.getText();
        int monthi=Integer.parseInt(month.getText());
        int dayi=Integer.parseInt(day.getText());
        if(monthi<=9) {
            monthss="0"+Integer.toString(monthi);
	}
	else {
            monthss=Integer.toString(monthi);
	}
        if(dayi<=9) {
            dayss="0"+Integer.toString(dayi);
	}
	else {
            dayss=Integer.toString(dayi);
	}
        //date confirmed
        datefinal=years+monthss+dayss;
        //money confirmed
        moneyss=money.getText();
        //item confirmed
        itemss=item.getText();
        model.setValueAt(datefinal,table.getSelectedRow(),0);
        model.setValueAt(moneyss,table.getSelectedRow(),1);
        model.setValueAt(itemss,table.getSelectedRow(),2);
        //export table to txt
        FileWriter fw = null;
        String moneytemp;
        Spending sp=new Spending();
        String newLine = System.getProperty("line.separator");
        
			try {
				fw=new FileWriter("/Users/pristy/Documents/NCHU/NetBeansProjects/finalproject2/text.txt");
                                BufferedWriter bw=new BufferedWriter(fw);
                                
                                for(int i= 0; i < table.getRowCount(); i++){//row
                                    for(int j=0; j < table.getColumnCount();j++){//column
                                        if(j==1){
                                            moneytemp=table.getValueAt(i,j).toString();
                                            sp.setMoney(Integer.parseInt(moneytemp));
                                            bw.write(sp.getMoney()+" ");
                                        }
                                        else
                                            bw.write(table.getValueAt(i,j).toString()+" ");
                                    }
                                    bw.write(newLine);
                                }
                                bw.close();
                                fw.close();
			}catch (IOException e) {
				System.out.println("file open error");
				System.exit(-1);
			}
                        
    }//GEN-LAST:event_editActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.removeRow(table.getSelectedRow());
        //export table to txt
        FileWriter fw = null;
        String moneytemp;
        Spending sp=new Spending();
        String newLine = System.getProperty("line.separator");
        
			try {
				fw=new FileWriter("/Users/pristy/Documents/NCHU/NetBeansProjects/finalproject2/text.txt");
                                BufferedWriter bw=new BufferedWriter(fw);
                                
                                for(int i= 0; i < table.getRowCount(); i++){//row
                                    for(int j=0; j < table.getColumnCount();j++){//column
                                        if(j==1){
                                            moneytemp=table.getValueAt(i,j).toString();
                                            sp.setMoney(Integer.parseInt(moneytemp));
                                            bw.write(sp.getMoney()+" ");
                                        }
                                        else
                                            bw.write(table.getValueAt(i,j).toString()+" ");
                                    }
                                    bw.write(newLine);
                                }
                                bw.close();
                                fw.close();
			}catch (IOException e) {
				System.out.println("file open error");
				System.exit(-1);
			}
    }//GEN-LAST:event_delete1ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        String monthss,dayss, datefinal;
        String years=year.getText();
        int monthi=Integer.parseInt(month.getText());
        int dayi=Integer.parseInt(day.getText());
        if(monthi<=9) {
            monthss="0"+Integer.toString(monthi);
	}
	else {
            monthss=Integer.toString(monthi);
	}
        if(dayi<=9) {
            dayss="0"+Integer.toString(dayi);
	}
	else {
            dayss=Integer.toString(dayi);
	}
        //date confirmed
        datefinal=years+monthss+dayss;
        FileReader fr = null;
			try {
				fr=new FileReader("/Users/pristy/Documents/NCHU/NetBeansProjects/finalproject2/text.txt");
			}catch (IOException e) {
				System.out.println("file open error");
				System.exit(-1);
			}
			//read file
			BufferedReader b = new BufferedReader(fr);
			//data processing : importing data
			String input="";
                        model.setRowCount(0);
			loop:{
			do{
                          
				try {
					input = b.readLine();
				}catch(IOException e) {
					System.out.println("file reading error");
					System.exit(-2);
				}
				if(input == null || input.equals(null))
					break loop;
				if(input.substring(0,8).equals(datefinal))
                                    model.addRow(new Object[]{input.substring(0, 8),input.substring(9, 16),input.substring(17)});
				
			}while( true) ;
			}
                        try {
					b.close();
				} catch (IOException e) {
					System.out.println("file close error");
				}
        
    }//GEN-LAST:event_searchActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        FileReader fr = null;
			try {
				fr=new FileReader("/Users/pristy/Documents/NCHU/NetBeansProjects/finalproject2/text.txt");
			}catch (IOException e) {
				System.out.println("file open error");
				System.exit(-1);
			}
			//read file
			BufferedReader b = new BufferedReader(fr);
			//data processing : importing data
			String input="";
                        String date,money,moneyfinal,item;
                        
			loop:{
			do{
                            int testzero=0,n=0;
				try {
					input = b.readLine();
				}catch(IOException e) {
					System.out.println("file reading error");
					System.exit(-2);
				}
				if(input == null || input.equals(null))
					break loop;
				date=input.substring(0,8);
                                money=input.substring(9, 16);
				
				while(testzero==0 && n<7) {
					if(n==6) {
						testzero=Integer.parseInt(money.substring(n));
					}
					else
						testzero=Integer.parseInt(money.substring(n,n+1));
					n=n+1;
				}
				moneyfinal=money.substring(n-1);
                                item=input.substring(17);
                                model.addRow(new Object[]{date,moneyfinal,item});
				
			}while( true) ;
			}
                        try {
					b.close();
				} catch (IOException e) {
					System.out.println("file close error");
				}
    }//GEN-LAST:event_refreshActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        Spending sp=new Spending();
        display.setText(Integer.toString(sp.calculateTotalSpending()));// TODO add your handling code here:
        
    }//GEN-LAST:event_calculateActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewJFrame jf= new NewJFrame();
                jf.setVisible(true);
                jf.setSize(960,720);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backdrop;
    private javax.swing.JPanel backgroundcolor;
    private javax.swing.JButton calculate;
    private javax.swing.JTextField day;
    private javax.swing.JButton delete;
    private javax.swing.JButton delete1;
    private javax.swing.JTextField display;
    private javax.swing.JButton edit;
    private javax.swing.JButton enter;
    private javax.swing.JPanel frontpage;
    private javax.swing.JTextField item;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField money;
    private javax.swing.JTextField month;
    private javax.swing.JPanel parentpanel;
    private javax.swing.JPanel redpane;
    private javax.swing.JButton refresh;
    private javax.swing.JButton search;
    private javax.swing.JPanel start;
    private javax.swing.JPanel startredbackdrop;
    private javax.swing.JTable table;
    private javax.swing.JButton tostartpage;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
