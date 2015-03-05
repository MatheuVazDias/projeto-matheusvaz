 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import javax.swing.JOptionPane;
import modelo.Cidade;
import java.util.ArrayList;
import java.util.List;

public class CidadeTela extends javax.swing.JFrame {

    List<Cidade> lista;
    int posicao = 0;

    public CidadeTela() {
        initComponents();
        lista = new ArrayList<Cidade>();
    }

    public void Limpar() {
        txtcod.setText(null);
        txtnome.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        primeiro = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        proximo = new javax.swing.JButton();
        ultimo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cadastrar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cidade");

        jLabel2.setText("Código:");

        jLabel3.setText("Nome:");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("NAVEGAÇÃO")));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        primeiro.setText("Primeiro");
        primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeiroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(45, 20, 40, 0);
        jPanel1.add(primeiro, gridBagConstraints);

        anterior.setText("Anterior");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(45, 28, 40, 0);
        jPanel1.add(anterior, gridBagConstraints);

        proximo.setText("Próximo");
        proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(45, 39, 40, 0);
        jPanel1.add(proximo, gridBagConstraints);

        ultimo.setText("Último");
        ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(45, 36, 40, 73);
        jPanel1.add(ultimo, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setToolTipText("AÇÕES");
        jPanel2.setLayout(new java.awt.GridBagLayout());

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(cadastrar, new java.awt.GridBagConstraints());

        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });
        jPanel2.add(excluir, new java.awt.GridBagConstraints());

        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        jPanel2.add(consultar, new java.awt.GridBagConstraints());

        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });
        jPanel2.add(limpar, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcod)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        primeiro.setEnabled(true);
        anterior.setEnabled(false);
        proximo.setEnabled(true);
        ultimo.setEnabled(true);

        Cidade c = new Cidade();
        Boolean y = false;
        c.setNome(txtnome.getText());
        c.setCodigo(Integer.parseInt(txtcod.getText()));
        
        if (txtcod.getText().isEmpty() || txtnome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Preencha todas as lacunas!");
        } else {
            try {
                c.setCodigo(Integer.parseInt(txtcod.getText()));
                y = true;
            } catch (Exception e) {
                y = false;
                JOptionPane.showMessageDialog(rootPane, "O código é numérico!");
            }
            if (y == true) {
                lista.add(c);
                JOptionPane.showMessageDialog(rootPane, "Dados cadastrado com sucesso!");
                Limpar();
            }
        }


    }//GEN-LAST:event_cadastrarActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        Limpar();
    }//GEN-LAST:event_limparActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        lista.remove(lista.get(posicao));
        Limpar();
    }//GEN-LAST:event_excluirActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        Cidade c = new Cidade();
        String nome = JOptionPane.showInputDialog("Informe o nome da cidade a ser pesquisado;");
        int posicaoencontra = 0;
        Boolean encontrado = false;
        for (Cidade cidade : lista) {
            if (nome.equalsIgnoreCase(cidade.getNome())) {
                posicao = posicaoencontra;
                encontrado = true;
                txtcod.setText(cidade.getCodigo().toString());
                txtnome.setText(cidade.getNome());
                break;
            }
        
            posicaoencontra++;
            
        }
        if (encontrado == false) {
            JOptionPane.showMessageDialog(rootPane, "Essa cidade ainda não foi cadastrada!");
        }

    }//GEN-LAST:event_consultarActionPerformed

    private void primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeiroActionPerformed
        primeiro.setEnabled(true);
        anterior.setEnabled(false);
        proximo.setEnabled(true);
        ultimo.setEnabled(true);

        posicao = 0;

        Cidade c = lista.get(0);
        if (lista.size() > 0) {
            txtnome.setText(c.getNome());
            txtcod.setText(c.getCodigo().toString());

            if (lista.size() == 1) {
                proximo.setEnabled(false);
                anterior.setEnabled(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, " Não há nenhuma cidade cadastrada!!!");
        }

    }//GEN-LAST:event_primeiroActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        primeiro.setEnabled(true);
        anterior.setEnabled(true);
        proximo.setEnabled(true);
        ultimo.setEnabled(true);

        if (posicao > 0) {
            posicao = posicao - 1;
            Cidade c = lista.get(posicao);
            txtnome.setText(c.getNome());
            txtcod.setText(c.getCodigo().toString());

        } else {
            JOptionPane.showMessageDialog(null, " Não há nenhuma cidade cadastrada!!!");
        }


    }//GEN-LAST:event_anteriorActionPerformed

    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoActionPerformed
        primeiro.setEnabled(true);
        anterior.setEnabled(true);
        proximo.setEnabled(true);
        ultimo.setEnabled(true);

        posicao = posicao + 1;

        Cidade c = lista.get(posicao);
        txtnome.setText(c.getNome());
        txtcod.setText(c.getCodigo().toString());
        

        if (posicao == lista.size() - 1) {
            proximo.setEnabled(false);
            ultimo.setEnabled(true);
        }
    }//GEN-LAST:event_proximoActionPerformed

    private void ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimoActionPerformed
        primeiro.setEnabled(true);
        anterior.setEnabled(true);
        proximo.setEnabled(false);
        ultimo.setEnabled(false);

        posicao = lista.size() - 1;

        Cidade c = lista.get(posicao);
        txtnome.setText(c.getNome());
        txtcod.setText(c.getCodigo().toString());
        
    }//GEN-LAST:event_ultimoActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CidadeTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CidadeTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CidadeTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CidadeTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CidadeTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton consultar;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton limpar;
    private javax.swing.JButton primeiro;
    private javax.swing.JButton proximo;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtnome;
    private javax.swing.JButton ultimo;
    // End of variables declaration//GEN-END:variables
}
