/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echostops;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.graphstream.algorithm.Dijkstra;
import org.graphstream.graph.Edge;
import org.graphstream.graph.implementations.MultiGraph;

/**
 *
 * @author cgcv
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        MemberList = new LinkedList();
        Prizes = new Queue();
        graph = new MultiGraph("Map");
        DefaultListModel m = (DefaultListModel) this.jl_memberList.getModel();
        m.addElement(new Member("Caca", "Roto", 123, "321dsasd",20, true));
        this.jl_memberList.setModel(m);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventana_register = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        tf_lastname = new javax.swing.JTextField();
        jSpinner2 = new javax.swing.JSpinner();
        rb_fem = new javax.swing.JRadioButton();
        rb_man = new javax.swing.JRadioButton();
        tf_numtel = new javax.swing.JTextField();
        jb_register = new javax.swing.JButton();
        bg_registerw = new javax.swing.ButtonGroup();
        ventana_delete = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_memberList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jb_deleteMember = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mi_help = new javax.swing.JMenuItem();
        ventana_help = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mi_RegistrarMiembro = new javax.swing.JMenuItem();
        mi_deleteMember = new javax.swing.JMenuItem();

        jLabel1.setText("REGISTRO DE MIEMBROS");

        jLabel3.setText("Nombre");

        jLabel6.setText("Apellido");

        jLabel7.setText("Genero");

        jLabel8.setText("Num.Tel");

        jLabel9.setText("Edad");

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(18, 18, 149, 1));

        bg_registerw.add(rb_fem);
        rb_fem.setText("Femenino");

        bg_registerw.add(rb_man);
        rb_man.setText("Masculino");

        jb_register.setText("Agregar nuevo miembro");
        jb_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_registerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ventana_registerLayout = new javax.swing.GroupLayout(ventana_register.getContentPane());
        ventana_register.getContentPane().setLayout(ventana_registerLayout);
        ventana_registerLayout.setHorizontalGroup(
            ventana_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_registerLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(ventana_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_register)
                    .addGroup(ventana_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ventana_registerLayout.createSequentialGroup()
                            .addGroup(ventana_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3))
                            .addGap(46, 46, 46)
                            .addGroup(ventana_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_lastname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ventana_registerLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ventana_registerLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(28, 28, 28)
                            .addGroup(ventana_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rb_man)
                                .addComponent(rb_fem)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ventana_registerLayout.createSequentialGroup()
                            .addGroup(ventana_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGap(46, 46, 46)
                            .addGroup(ventana_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_numtel)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        ventana_registerLayout.setVerticalGroup(
            ventana_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_registerLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(ventana_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ventana_registerLayout.createSequentialGroup()
                        .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ventana_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ventana_registerLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel9)))
                .addGroup(ventana_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventana_registerLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8))
                    .addGroup(ventana_registerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tf_numtel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(ventana_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rb_fem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_man)
                .addGap(28, 28, 28)
                .addComponent(jb_register)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jl_memberList.setModel(new DefaultListModel());
        jl_memberList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_memberListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jl_memberList);

        jLabel2.setText("LISTA DE MIEMBROS");

        jb_deleteMember.setText("Borrar Registro");
        jb_deleteMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_deleteMemberMouseClicked(evt);
            }
        });
        jb_deleteMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_deleteMemberActionPerformed(evt);
            }
        });

        jMenu2.setText("Opcion");

        mi_help.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        mi_help.setText("Ayuda...");
        mi_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_helpActionPerformed(evt);
            }
        });
        jMenu2.add(mi_help);

        jMenuBar2.add(jMenu2);

        ventana_delete.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout ventana_deleteLayout = new javax.swing.GroupLayout(ventana_delete.getContentPane());
        ventana_delete.getContentPane().setLayout(ventana_deleteLayout);
        ventana_deleteLayout.setHorizontalGroup(
            ventana_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_deleteLayout.createSequentialGroup()
                .addGroup(ventana_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventana_deleteLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(ventana_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ventana_deleteLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jb_deleteMember)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        ventana_deleteLayout.setVerticalGroup(
            ventana_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_deleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jb_deleteMember)
                .addContainerGap())
        );

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Para eliminar un registro,\nseleccione un elemento de la\nlista y luego presione el\nbotón de \"aceptar\".");
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout ventana_helpLayout = new javax.swing.GroupLayout(ventana_help.getContentPane());
        ventana_help.getContentPane().setLayout(ventana_helpLayout);
        ventana_helpLayout.setHorizontalGroup(
            ventana_helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_helpLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ventana_helpLayout.setVerticalGroup(
            ventana_helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_helpLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Opciones");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        mi_RegistrarMiembro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mi_RegistrarMiembro.setText("Registrar nuevo Miembro");
        mi_RegistrarMiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_RegistrarMiembroActionPerformed(evt);
            }
        });
        jMenu1.add(mi_RegistrarMiembro);

        mi_deleteMember.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        mi_deleteMember.setText("Borrar Miembros");
        mi_deleteMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_deleteMemberActionPerformed(evt);
            }
        });
        jMenu1.add(mi_deleteMember);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void mi_RegistrarMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_RegistrarMiembroActionPerformed
        this.ventana_register.pack();
        this.ventana_register.show();
    }//GEN-LAST:event_mi_RegistrarMiembroActionPerformed

    private void jb_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_registerMouseClicked
        String name = this.tf_name.getText();
        String last_name = this.tf_lastname.getText();
        int ID;
        String phone = this.tf_numtel.getText();
        int age = (int) this.jSpinner2.getValue();
        boolean gender = false;

        if (this.rb_fem.isSelected()) {
            gender = true;
        } else if (this.rb_man.isSelected()) {
            gender = false;
        }

        Member temp = new Member("1232122", name, last_name, 00000001, phone, age, gender);
        System.out.println(temp.toString());

        int numero = (int) (Math.random() * 100) + 20;
        System.out.println(numero);

        int x = JOptionPane.showConfirmDialog(this.ventana_register, "¿Desea continuar");

        if (x == 1) {
            this.ventana_register.dispose();
        }

    }//GEN-LAST:event_jb_registerMouseClicked

    private void mi_deleteMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_deleteMemberActionPerformed
        this.ventana_delete.pack();
        this.ventana_delete.show();

        // TODO add your handling code here:
    }//GEN-LAST:event_mi_deleteMemberActionPerformed

    private void mi_helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_helpActionPerformed
        this.ventana_help.pack();
        this.ventana_help.show();

    }//GEN-LAST:event_mi_helpActionPerformed

    private void jb_deleteMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_deleteMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_deleteMemberActionPerformed

    private void jb_deleteMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_deleteMemberMouseClicked

        if (this.jl_memberList.getSelectedIndex() > -1) {
            int selected = this.jl_memberList.getSelectedIndex();

            this.MemberList.remove(selected);

            DefaultListModel model = (DefaultListModel) this.jl_memberList.getModel();
            model.remove(selected);

            this.jl_memberList.setModel(model);
        } else {
            JOptionPane.showMessageDialog(this.ventana_delete, "Seleccione un elemento valido");
        }


    }//GEN-LAST:event_jb_deleteMemberMouseClicked

    private void jl_memberListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_memberListMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jl_memberListMouseClicked

    public void PrizeGenerator() {

        int numero = (int) (Math.random() * 1) + 4;

        System.out.println(numero);

        switch (numero) {
            case 1:
                Prizes.Queue("$25");
                break;
            case 2:
                Prizes.Queue("Game Voucher");
                break;

            case 3:
                Prizes.Queue("Tuxedo Voucher");
                break;
            case 4:
                Prizes.Queue("Super Baleadas Ticket");
                break;
            default:
        }
    }

    public double Calculate_distance(String EcoStop_ID, String PowerPlant_ID) {
        Dijkstra dijkstra = new Dijkstra(Dijkstra.Element.EDGE, null, "Distance");
        dijkstra.init(graph);
        dijkstra.setSource(graph.getNode(EcoStop_ID));
        dijkstra.compute();
        double retval = 0;
        for (Edge edge : dijkstra.getPathEdges(graph.getNode(PowerPlant_ID))) {
            retval += (double) edge.getAttribute("Distance");
        }
        dijkstra.clear();
        return retval;

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
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_registerw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jb_deleteMember;
    private javax.swing.JButton jb_register;
    private javax.swing.JList<String> jl_memberList;
    private javax.swing.JMenuItem mi_RegistrarMiembro;
    private javax.swing.JMenuItem mi_deleteMember;
    private javax.swing.JMenuItem mi_help;
    private javax.swing.JRadioButton rb_fem;
    private javax.swing.JRadioButton rb_man;
    private javax.swing.JTextField tf_lastname;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_numtel;
    private javax.swing.JDialog ventana_delete;
    private javax.swing.JDialog ventana_help;
    private javax.swing.JDialog ventana_register;
    // End of variables declaration//GEN-END:variables
    private LinkedList MemberList;
    private Queue Prizes;
    private int contador_miembros;
    private MultiGraph graph;
}