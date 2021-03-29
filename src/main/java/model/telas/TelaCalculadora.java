/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.telas;
import model.util.Funcoes;

/**
 *
 * @author Israel Gadelha
 */
public class TelaCalculadora extends javax.swing.JFrame {

    private double valor_um;
    private double valor_dois;
    private String operacao;
    
    public TelaCalculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoAlternaSinal = new javax.swing.JButton();
        BotaoVirgula = new javax.swing.JButton();
        BotaoZero = new javax.swing.JButton();
        BotaoIgual = new javax.swing.JButton();
        BotaoUm = new javax.swing.JButton();
        BotaoDois = new javax.swing.JButton();
        BotaoTres = new javax.swing.JButton();
        BotaoSoma = new javax.swing.JButton();
        BotaoQuatro = new javax.swing.JButton();
        BotaoCinco = new javax.swing.JButton();
        BotaoSeis = new javax.swing.JButton();
        BotaoSubtracao = new javax.swing.JButton();
        BotaoOito = new javax.swing.JButton();
        BotaoMultiplicacao = new javax.swing.JButton();
        BotaoNove = new javax.swing.JButton();
        BotaoSete = new javax.swing.JButton();
        BotaoLimparTela = new javax.swing.JButton();
        BotaoPorcentagem = new javax.swing.JButton();
        BotaoDivisao = new javax.swing.JButton();
        BotaoBackspace = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreadaOperacao = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreadeEspera = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotaoAlternaSinal.setText("+/-");
        BotaoAlternaSinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlternaSinalActionPerformed(evt);
            }
        });

        BotaoVirgula.setText(",");
        BotaoVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVirgulaActionPerformed(evt);
            }
        });

        BotaoZero.setText("0");
        BotaoZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoZeroActionPerformed(evt);
            }
        });

        BotaoIgual.setText("=");
        BotaoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoIgualActionPerformed(evt);
            }
        });

        BotaoUm.setText("1");
        BotaoUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoUmActionPerformed(evt);
            }
        });

        BotaoDois.setText("2");
        BotaoDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDoisActionPerformed(evt);
            }
        });

        BotaoTres.setText("3");
        BotaoTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoTresActionPerformed(evt);
            }
        });

        BotaoSoma.setText("+");
        BotaoSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSomaActionPerformed(evt);
            }
        });

        BotaoQuatro.setText("4");
        BotaoQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoQuatroActionPerformed(evt);
            }
        });

        BotaoCinco.setText("5");
        BotaoCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCincoActionPerformed(evt);
            }
        });

        BotaoSeis.setText("6");
        BotaoSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSeisActionPerformed(evt);
            }
        });

        BotaoSubtracao.setText("-");
        BotaoSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSubtracaoActionPerformed(evt);
            }
        });

        BotaoOito.setText("8");
        BotaoOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoOitoActionPerformed(evt);
            }
        });

        BotaoMultiplicacao.setText("x");
        BotaoMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMultiplicacaoActionPerformed(evt);
            }
        });

        BotaoNove.setText("9");
        BotaoNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNoveActionPerformed(evt);
            }
        });

        BotaoSete.setText("7");
        BotaoSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSeteActionPerformed(evt);
            }
        });

        BotaoLimparTela.setText("C");
        BotaoLimparTela.setToolTipText("");
        BotaoLimparTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparTelaActionPerformed(evt);
            }
        });

        BotaoPorcentagem.setText("%");
        BotaoPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPorcentagemActionPerformed(evt);
            }
        });

        BotaoDivisao.setText("/");
        BotaoDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDivisaoActionPerformed(evt);
            }
        });

        BotaoBackspace.setText("<-");
        BotaoBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBackspaceActionPerformed(evt);
            }
        });

        AreadaOperacao.setEditable(false);
        AreadaOperacao.setColumns(20);
        AreadaOperacao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AreadaOperacao.setLineWrap(true);
        AreadaOperacao.setRows(2);
        AreadaOperacao.setMaximumSize(new java.awt.Dimension(40, 20));
        jScrollPane1.setViewportView(AreadaOperacao);

        AreadeEspera.setEditable(false);
        AreadeEspera.setColumns(20);
        AreadeEspera.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AreadeEspera.setLineWrap(true);
        AreadeEspera.setRows(2);
        AreadeEspera.setMaximumSize(new java.awt.Dimension(40, 20));
        jScrollPane2.setViewportView(AreadeEspera);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotaoUm, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoDois, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoTres, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotaoAlternaSinal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoZero, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotaoQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotaoSete, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoOito, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoNove, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotaoPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoLimparTela, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoLimparTela, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoSete, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoOito, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoNove, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoUm, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoDois, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoTres, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoAlternaSinal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoZero, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoZeroActionPerformed
        AreadaOperacao.setText((AreadaOperacao.getText() + "0"));
    }//GEN-LAST:event_BotaoZeroActionPerformed

    private void BotaoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoIgualActionPerformed
        if(AreadaOperacao.getText().equals("")){
            AreadaOperacao.setText("");
        }else{
            valor_dois = Double.parseDouble(AreadaOperacao.getText());
            double resultado = Funcoes.calcularResultado(valor_um, valor_dois, operacao);
            AreadaOperacao.setText(Double.toString(resultado));
        }
            
    }//GEN-LAST:event_BotaoIgualActionPerformed

    private void BotaoSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSeisActionPerformed
        AreadaOperacao.setText((AreadaOperacao.getText() + "6"));
    }//GEN-LAST:event_BotaoSeisActionPerformed

    private void BotaoDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDivisaoActionPerformed
        if(AreadaOperacao.getText().equals("")){
            operacao = "/";
            //Implementar a troca de sinal na área de espera na classe Funcoes
        } else {
            operacao = "/";
            valor_um = Double.parseDouble(AreadaOperacao.getText());
            AreadeEspera.setText(AreadaOperacao.getText() + "/");
            AreadaOperacao.setText(null); 
        }
    }//GEN-LAST:event_BotaoDivisaoActionPerformed
    
    
    private void BotaoUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoUmActionPerformed
        AreadaOperacao.setText((AreadaOperacao.getText() + "1"));
    }//GEN-LAST:event_BotaoUmActionPerformed

    private void BotaoDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDoisActionPerformed
        AreadaOperacao.setText((AreadaOperacao.getText() + "2"));
    }//GEN-LAST:event_BotaoDoisActionPerformed

    private void BotaoTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoTresActionPerformed
        AreadaOperacao.setText((AreadaOperacao.getText() + "3"));
    }//GEN-LAST:event_BotaoTresActionPerformed

    private void BotaoQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoQuatroActionPerformed
        AreadaOperacao.setText((AreadaOperacao.getText() + "4"));
    }//GEN-LAST:event_BotaoQuatroActionPerformed

    private void BotaoCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCincoActionPerformed
        AreadaOperacao.setText((AreadaOperacao.getText() + "5"));
    }//GEN-LAST:event_BotaoCincoActionPerformed

    private void BotaoSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSeteActionPerformed
        AreadaOperacao.setText((AreadaOperacao.getText() + "7"));
    }//GEN-LAST:event_BotaoSeteActionPerformed

    private void BotaoOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoOitoActionPerformed
        AreadaOperacao.setText((AreadaOperacao.getText() + "8"));
    }//GEN-LAST:event_BotaoOitoActionPerformed

    private void BotaoNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNoveActionPerformed
        AreadaOperacao.setText((AreadaOperacao.getText() + "9"));
    }//GEN-LAST:event_BotaoNoveActionPerformed

    private void BotaoSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSomaActionPerformed
        if(AreadaOperacao.getText().equals("")){
            operacao = "+";
            //Implementar a troca de sinal na área de espera na classe Funcoes
        } else {
            operacao = "+";
            valor_um = Double.parseDouble(AreadaOperacao.getText());
            AreadeEspera.setText(AreadaOperacao.getText() + "+");
            AreadaOperacao.setText(null); 
        }
    }//GEN-LAST:event_BotaoSomaActionPerformed

    private void BotaoSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSubtracaoActionPerformed
        if(AreadaOperacao.getText().equals("")){
            operacao = "-";
            //Implementar a troca de sinal na área de espera na classe Funcoes
        } else {
            operacao = "-";
            valor_um = Double.parseDouble(AreadaOperacao.getText());
            AreadeEspera.setText(AreadaOperacao.getText() + "-");
            AreadaOperacao.setText(null); 
        }
    }//GEN-LAST:event_BotaoSubtracaoActionPerformed

    private void BotaoMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMultiplicacaoActionPerformed
        if(AreadaOperacao.getText().equals("")){
            operacao = "*";
            //Implementar a troca de sinal na área de espera na classe Funcoes
        } else {
            operacao = "*";
            valor_um = Double.parseDouble(AreadaOperacao.getText());
            AreadeEspera.setText(AreadaOperacao.getText() + "x");
            AreadaOperacao.setText(null); 
        }
    }//GEN-LAST:event_BotaoMultiplicacaoActionPerformed

    private void BotaoBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBackspaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoBackspaceActionPerformed

    private void BotaoLimparTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparTelaActionPerformed
        AreadaOperacao.setText("");
        AreadeEspera.setText("");
        operacao = null;
        valor_um = 0;
        valor_dois = 0;
    }//GEN-LAST:event_BotaoLimparTelaActionPerformed

    private void BotaoPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPorcentagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoPorcentagemActionPerformed

    private void BotaoAlternaSinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlternaSinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoAlternaSinalActionPerformed

    private void BotaoVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVirgulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoVirgulaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreadaOperacao;
    private javax.swing.JTextArea AreadeEspera;
    private javax.swing.JButton BotaoAlternaSinal;
    private javax.swing.JButton BotaoBackspace;
    private javax.swing.JButton BotaoCinco;
    private javax.swing.JButton BotaoDivisao;
    private javax.swing.JButton BotaoDois;
    private javax.swing.JButton BotaoIgual;
    private javax.swing.JButton BotaoLimparTela;
    private javax.swing.JButton BotaoMultiplicacao;
    private javax.swing.JButton BotaoNove;
    private javax.swing.JButton BotaoOito;
    private javax.swing.JButton BotaoPorcentagem;
    private javax.swing.JButton BotaoQuatro;
    private javax.swing.JButton BotaoSeis;
    private javax.swing.JButton BotaoSete;
    private javax.swing.JButton BotaoSoma;
    private javax.swing.JButton BotaoSubtracao;
    private javax.swing.JButton BotaoTres;
    private javax.swing.JButton BotaoUm;
    private javax.swing.JButton BotaoVirgula;
    private javax.swing.JButton BotaoZero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
