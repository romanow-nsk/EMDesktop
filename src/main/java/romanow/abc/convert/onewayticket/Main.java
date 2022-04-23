/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romanow.abc.convert.onewayticket;

import java.awt.FileDialog;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author romanow
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private OWTDiscipline base = new OWTDiscipline();
    public final  static String delim="//-----------------";
    public Main() {
        initComponents();
        setBounds(200,200,620,500);
        }

    public void loadBase(){
        try {
            String fname = getInputFileName("База вопросов", "txt", null);
            if (fname == null)
                return;
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fname), "Windows-1251"));
            base.clear();
            OWTReader reader = new OWTReader(in);
            base.read(reader);
            StringBuffer sb = new StringBuffer();
            base.toLog(sb,true);
            Log.append(sb.toString());
            }catch (Exception ee){ Log.append(ee.toString()+"\n");}
        }
    public void generate(){
        base.clearSelected();
        int nTickets = 0;
        int nTests = 0;
        try {
            nTickets = Integer.parseInt(TicketCount.getText());
            nTests = Integer.parseInt(TestCount.getText());
            } catch (Exception ee){ Log.append("Нечисловой формат\n");
                return;
                }
        String fname = getOutputFileDir("Вопросы тестов","txt","Тесты "+base.getHead()+".txt");
        if (fname==null)
            return;
        try {
            ArrayList<OWTTask> zz = new ArrayList<>();
            for(int i=0;i<nTickets;i++){
                boolean doc = DOC.isSelected();
                String fname2 = fname + "/"+base.getHead()+"-"+(i+1)+(doc ? ".doc" : ".txt");
                OWT_Writer out = doc ? new OWTDocWriter() : new OWTTextWriter();
                out.open(fname2);
                out.write("Тестовый набор "+(i+1));
                out.space();
                zz.clear();
                while (zz.size()!=nTests){
                    base.testAndClearSelected();
                    int k = (int)(Math.random()*base.size());
                    if (k==base.size())
                        continue;
                    OWTTheme qq = base.get(k);
                    int k2 = (int)(Math.random()*qq.size());
                    if (k2==qq.size())
                        continue;
                    OWTTask dd = qq.get(k2);
                    if (dd.selected)
                        continue;
                    boolean found=false;
                    for(OWTTask ss : zz)
                        if (ss==dd){
                            found = true;
                            break;
                        }
                    if (!found){
                        dd.selected=true;
                        zz.add(dd);
                        out.write("Тест "+zz.size()+" ------------------------------------------------");
                        out.write("Тема: "+qq.getQuestion());
                        if (qq.getHeader()!=null && qq.getHeader().length()!=0){
                            out.write(qq.getHeader());
                            }
                        out.space();
                        for(String vv : dd){
                            if (vv.length()==0)
                                continue;
                            out.write(vv);
                            }
                        out.space();
                        }
                    }
                out.close();
                }
            Log.append("Вне нормально\n");
            }catch (Exception ee){ Log.append(ee.toString()+"\n");}
        }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TicketCount = new javax.swing.JTextField();
        Generate = new javax.swing.JButton();
        Load = new javax.swing.JButton();
        Log = new java.awt.TextArea();
        jLabel3 = new javax.swing.JLabel();
        TestCount = new javax.swing.JTextField();
        DOC = new javax.swing.JCheckBox();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("Билетов");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 35, 60, 14);

        TicketCount.setText("30");
        getContentPane().add(TicketCount);
        TicketCount.setBounds(90, 30, 40, 25);

        Generate.setText("Генерировать");
        Generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateActionPerformed(evt);
            }
        });
        getContentPane().add(Generate);
        Generate.setBounds(480, 30, 110, 23);

        Load.setText("Загрузить");
        Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadActionPerformed(evt);
            }
        });
        getContentPane().add(Load);
        Load.setBounds(280, 30, 100, 23);
        getContentPane().add(Log);
        Log.setBounds(30, 60, 560, 340);

        jLabel3.setText("Тестов в билете");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 35, 110, 14);

        TestCount.setText("10");
        getContentPane().add(TestCount);
        TestCount.setBounds(230, 30, 40, 25);

        DOC.setSelected(true);
        DOC.setText("doc");
        getContentPane().add(DOC);
        DOC.setBounds(390, 30, 43, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadActionPerformed
        loadBase();
    }//GEN-LAST:event_LoadActionPerformed

    private void GenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateActionPerformed
        generate();
    }//GEN-LAST:event_GenerateActionPerformed

    public String getInputFileName(String title, final String defName, String defDir){
        FileDialog dlg=new FileDialog(this,title,FileDialog.LOAD);
        if (defDir!=null){
            dlg.setDirectory(defDir);
            }
        if (defName.indexOf(".")==-1)
            dlg.setFile("*."+defName);
        else
            dlg.setFile(defName);
        dlg.show();
        String fname=dlg.getDirectory();
        if (fname==null) return null;
        return fname+"/"+dlg.getFile();
        }
    public String getOutputFileName(String title, final String defName, String srcName){
        FileDialog dlg=new FileDialog(this,title,FileDialog.SAVE);
        dlg.setFile(srcName);
        dlg.setFilenameFilter(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith("."+defName);
                }
            });
        dlg.show();
        if (dlg.getDirectory()==null) return null;
        String fname = dlg.getFile();
        if (!fname.endsWith("."+defName))
            fname+="."+defName;
        return dlg.getDirectory()+"/"+fname;
        }
    public String getOutputFileDir(String title, final String defName, String srcName){
        FileDialog dlg=new FileDialog(this,title,FileDialog.SAVE);
        dlg.setFile(srcName);
        dlg.setFilenameFilter(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith("."+defName);
                }
            });
        dlg.show();
        return dlg.getDirectory();
    }
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox DOC;
    private javax.swing.JButton Generate;
    private javax.swing.JButton Load;
    private java.awt.TextArea Log;
    private javax.swing.JTextField TestCount;
    private javax.swing.JTextField TicketCount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
