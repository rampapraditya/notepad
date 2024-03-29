package note;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

/**
 *
 * @author RAMPA
 */
public class Main extends javax.swing.JFrame {

    private UndoManager m = new UndoManager();
    private boolean kondisiWrap = false;

    public Main() {
        initComponents();

        menuWrap.setSelected(kondisiWrap);
        

        txtInput.getDocument().addUndoableEditListener(new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                m.addEdit(e.getEdit());
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtInput = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_new = new javax.swing.JMenuItem();
        menu_save = new javax.swing.JMenuItem();
        menu_open = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menu_exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuUndo = new javax.swing.JMenuItem();
        menuRedo = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuCut = new javax.swing.JMenuItem();
        menuCopy = new javax.swing.JMenuItem();
        menuPaste = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuWrap = new javax.swing.JCheckBoxMenuItem();
        menuFontFamily = new javax.swing.JMenu();
        menuArial = new javax.swing.JMenuItem();
        menuTimesNewRoman = new javax.swing.JMenuItem();
        menuCalibri = new javax.swing.JMenuItem();
        menuTahoma = new javax.swing.JMenuItem();
        menuFont = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Notepad");

        txtInput.setColumns(20);
        txtInput.setRows(5);
        jScrollPane1.setViewportView(txtInput);

        jMenu1.setText("File");

        menu_new.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_new.setText("New");
        menu_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_newActionPerformed(evt);
            }
        });
        jMenu1.add(menu_new);

        menu_save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_save.setText("Save");
        menu_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_saveActionPerformed(evt);
            }
        });
        jMenu1.add(menu_save);

        menu_open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_open.setText("Open");
        menu_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_openActionPerformed(evt);
            }
        });
        jMenu1.add(menu_open);
        jMenu1.add(jSeparator1);

        menu_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menu_exit.setText("Exit");
        menu_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_exitActionPerformed(evt);
            }
        });
        jMenu1.add(menu_exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        menuUndo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuUndo.setText("Undo");
        menuUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUndoActionPerformed(evt);
            }
        });
        jMenu2.add(menuUndo);

        menuRedo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuRedo.setText("Redo");
        menuRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRedoActionPerformed(evt);
            }
        });
        jMenu2.add(menuRedo);
        jMenu2.add(jSeparator2);

        menuCut.setText("Cut");
        menuCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCutActionPerformed(evt);
            }
        });
        jMenu2.add(menuCut);

        menuCopy.setText("Copy");
        menuCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCopyActionPerformed(evt);
            }
        });
        jMenu2.add(menuCopy);

        menuPaste.setText("Paste");
        menuPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPasteActionPerformed(evt);
            }
        });
        jMenu2.add(menuPaste);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Format");

        menuWrap.setText("Word Wrap");
        menuWrap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuWrapActionPerformed(evt);
            }
        });
        jMenu3.add(menuWrap);

        menuFontFamily.setText("Font Family");

        menuArial.setText("Arial");
        menuArial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArialActionPerformed(evt);
            }
        });
        menuFontFamily.add(menuArial);

        menuTimesNewRoman.setText("Times New Roman");
        menuTimesNewRoman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTimesNewRomanActionPerformed(evt);
            }
        });
        menuFontFamily.add(menuTimesNewRoman);

        menuCalibri.setText("Calibri");
        menuCalibri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCalibriActionPerformed(evt);
            }
        });
        menuFontFamily.add(menuCalibri);

        menuTahoma.setText("Tahoma");
        menuTahoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTahomaActionPerformed(evt);
            }
        });
        menuFontFamily.add(menuTahoma);

        jMenu3.add(menuFontFamily);

        menuFont.setText("Font");
        menuFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFontActionPerformed(evt);
            }
        });
        jMenu3.add(menuFont);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menu_exitActionPerformed

    private void menu_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_newActionPerformed
        txtInput.setText("");
    }//GEN-LAST:event_menu_newActionPerformed

    private void menu_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_saveActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text File", "txt");
        fileChooser.addChoosableFileFilter(filter);
        fileChooser.setFileFilter(filter);

        int option = fileChooser.showSaveDialog(Main.this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            // proses simpan
            try {
                String absolutePath = file.getAbsolutePath();
                if (!absolutePath.substring(absolutePath.lastIndexOf(".") + 1).equals("txt")) {
                    absolutePath += ".txt";
                }
                FileWriter myWriter = new FileWriter(absolutePath);
                myWriter.write(txtInput.getText());
                myWriter.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(Main.this, e.getMessage());
            }
        }
    }//GEN-LAST:event_menu_saveActionPerformed

    private void menu_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_openActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Text file", "txt"));
        fileChooser.setAcceptAllFileFilterUsed(true);
        int result = fileChooser.showOpenDialog(Main.this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                BufferedReader input = new BufferedReader(new InputStreamReader(
                        new FileInputStream(file)));
                txtInput.read(input, "READING FILE");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(Main.this, e.getMessage());
            }

        }
    }//GEN-LAST:event_menu_openActionPerformed

    private void menuUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUndoActionPerformed
        try {
            m.undo();
        } catch (CannotUndoException e) {
        }
    }//GEN-LAST:event_menuUndoActionPerformed

    private void menuRedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRedoActionPerformed
        try {
            m.redo();
        } catch (CannotRedoException e) {
        }
    }//GEN-LAST:event_menuRedoActionPerformed

    private void menuCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCutActionPerformed
        try {
            txtInput.cut();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_menuCutActionPerformed

    private void menuCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCopyActionPerformed
        try {
            txtInput.copy();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_menuCopyActionPerformed

    private void menuPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPasteActionPerformed
        try {
            txtInput.paste();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_menuPasteActionPerformed

    private void menuWrapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuWrapActionPerformed
        if (kondisiWrap) {
            kondisiWrap = false;
        } else {
            kondisiWrap = true;    
        }
        
        menuWrap.setSelected(kondisiWrap);
            
        txtInput.setLineWrap(kondisiWrap);
        txtInput.setWrapStyleWord(kondisiWrap);
    }//GEN-LAST:event_menuWrapActionPerformed

    private void menuArialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArialActionPerformed
        Font font = new Font("Arial", Font.PLAIN, 12);
        txtInput.setFont(font);
    }//GEN-LAST:event_menuArialActionPerformed

    private void menuTimesNewRomanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTimesNewRomanActionPerformed
        Font font = new Font("Times New Roman", Font.PLAIN, 12); 
        txtInput.setFont(font);
    }//GEN-LAST:event_menuTimesNewRomanActionPerformed

    private void menuCalibriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCalibriActionPerformed
        Font font = new Font("Calibri", Font.PLAIN, 12); 
        txtInput.setFont(font);
    }//GEN-LAST:event_menuCalibriActionPerformed

    private void menuTahomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTahomaActionPerformed
        Font font = new Font("Tahoma", Font.PLAIN, 12);
        txtInput.setFont(font);
    }//GEN-LAST:event_menuTahomaActionPerformed

    private void menuFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFontActionPerformed
        DialogFont df = new DialogFont(this, true);
        df.setLocationRelativeTo(this);
        df.setVisible(true);
    }//GEN-LAST:event_menuFontActionPerformed

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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem menuArial;
    private javax.swing.JMenuItem menuCalibri;
    private javax.swing.JMenuItem menuCopy;
    private javax.swing.JMenuItem menuCut;
    private javax.swing.JMenuItem menuFont;
    private javax.swing.JMenu menuFontFamily;
    private javax.swing.JMenuItem menuPaste;
    private javax.swing.JMenuItem menuRedo;
    private javax.swing.JMenuItem menuTahoma;
    private javax.swing.JMenuItem menuTimesNewRoman;
    private javax.swing.JMenuItem menuUndo;
    private javax.swing.JCheckBoxMenuItem menuWrap;
    private javax.swing.JMenuItem menu_exit;
    private javax.swing.JMenuItem menu_new;
    private javax.swing.JMenuItem menu_open;
    private javax.swing.JMenuItem menu_save;
    public static javax.swing.JTextArea txtInput;
    // End of variables declaration//GEN-END:variables

}
