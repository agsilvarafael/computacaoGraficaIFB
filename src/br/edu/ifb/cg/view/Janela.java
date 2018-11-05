/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifb.cg.view;

/**
 *
 * @author jhdra
 */
public class Janela extends javax.swing.JFrame {

    /**
     * Creates new form Janela
     */
    public Janela() {
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

        panelOGL = new javax.media.opengl.GLJPanel();
        panelCoonfig = new javax.swing.JPanel();
        labelIntegrantes = new javax.swing.JLabel();
        comboFuncoes = new javax.swing.JComboBox<String>();
        labelMenuTitulo = new javax.swing.JLabel();
        labelFuncao = new javax.swing.JLabel();
        labelCor = new javax.swing.JLabel();
        panelCorSelecionada = new javax.swing.JPanel();
        buttonSelecionarCor = new javax.swing.JButton();
        labelAngulo = new javax.swing.JLabel();
        spinnerAngulo = new javax.swing.JSpinner();
        labelAnguloGraus = new javax.swing.JLabel();
        labelX = new javax.swing.JLabel();
        spinnerX = new javax.swing.JSpinner();
        spinnerY = new javax.swing.JSpinner();
        labelY = new javax.swing.JLabel();
        buttonEspelhaY = new javax.swing.JButton();
        buttonEspelhaX = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        labelEscala = new javax.swing.JLabel();
        sliderEscala = new javax.swing.JSlider();
        labelEscalaValor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("O incr�vel editor de pol�gonos 2D");
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setPreferredSize(new java.awt.Dimension(1080, 700));

        panelOGL.setMinimumSize(new java.awt.Dimension(800, 670));
        panelOGL.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout panelOGLLayout = new javax.swing.GroupLayout(panelOGL);
        panelOGL.setLayout(panelOGLLayout);
        panelOGLLayout.setHorizontalGroup(
            panelOGLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
        );
        panelOGLLayout.setVerticalGroup(
            panelOGLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelCoonfig.setMinimumSize(new java.awt.Dimension(280, 670));
        panelCoonfig.setPreferredSize(new java.awt.Dimension(285, 600));

        labelIntegrantes.setText("<html>\nINTEGRANTES:<br>\n- Gregory Henrique<br>\n- Jer�nimo Hermano<br>\n- Rafael (H)Araujo<br>\n</html>");
        labelIntegrantes.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        comboFuncoes.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Desenhar", "Editar" }));
        comboFuncoes.setMinimumSize(new java.awt.Dimension(36, 30));
        comboFuncoes.setName(""); // NOI18N
        comboFuncoes.setPreferredSize(new java.awt.Dimension(36, 30));

        labelMenuTitulo.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        labelMenuTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMenuTitulo.setText("Menu");
        labelMenuTitulo.setToolTipText("");

        labelFuncao.setText("Fun��o");
        labelFuncao.setMaximumSize(new java.awt.Dimension(41, 30));
        labelFuncao.setMinimumSize(new java.awt.Dimension(41, 30));
        labelFuncao.setName(""); // NOI18N
        labelFuncao.setPreferredSize(new java.awt.Dimension(41, 30));

        labelCor.setText("Cor");
        labelCor.setMaximumSize(new java.awt.Dimension(20, 30));
        labelCor.setMinimumSize(new java.awt.Dimension(20, 30));
        labelCor.setPreferredSize(new java.awt.Dimension(20, 30));
        labelCor.setVerifyInputWhenFocusTarget(false);

        panelCorSelecionada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelCorSelecionada.setToolTipText("Cor selecionada");
        panelCorSelecionada.setMinimumSize(new java.awt.Dimension(100, 30));
        panelCorSelecionada.setPreferredSize(new java.awt.Dimension(2, 30));

        javax.swing.GroupLayout panelCorSelecionadaLayout = new javax.swing.GroupLayout(panelCorSelecionada);
        panelCorSelecionada.setLayout(panelCorSelecionadaLayout);
        panelCorSelecionadaLayout.setHorizontalGroup(
            panelCorSelecionadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
        panelCorSelecionadaLayout.setVerticalGroup(
            panelCorSelecionadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        buttonSelecionarCor.setText("Selecionar");
        buttonSelecionarCor.setToolTipText("");
        buttonSelecionarCor.setMaximumSize(new java.awt.Dimension(73, 30));
        buttonSelecionarCor.setMinimumSize(new java.awt.Dimension(73, 30));
        buttonSelecionarCor.setPreferredSize(new java.awt.Dimension(73, 30));

        labelAngulo.setText("�ngulo");
        labelAngulo.setMaximumSize(new java.awt.Dimension(41, 30));
        labelAngulo.setMinimumSize(new java.awt.Dimension(41, 30));
        labelAngulo.setPreferredSize(new java.awt.Dimension(41, 30));

        spinnerAngulo.setMinimumSize(new java.awt.Dimension(39, 30));
        spinnerAngulo.setPreferredSize(new java.awt.Dimension(39, 30));

        labelAnguloGraus.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        labelAnguloGraus.setText("�");
        labelAnguloGraus.setMaximumSize(new java.awt.Dimension(6, 30));
        labelAnguloGraus.setMinimumSize(new java.awt.Dimension(6, 30));
        labelAnguloGraus.setPreferredSize(new java.awt.Dimension(6, 30));

        labelX.setText("X");
        labelX.setToolTipText("");
        labelX.setMaximumSize(new java.awt.Dimension(7, 30));
        labelX.setMinimumSize(new java.awt.Dimension(7, 30));
        labelX.setPreferredSize(new java.awt.Dimension(7, 30));

        spinnerX.setMinimumSize(new java.awt.Dimension(39, 30));
        spinnerX.setPreferredSize(new java.awt.Dimension(39, 30));

        spinnerY.setPreferredSize(new java.awt.Dimension(35, 30));

        labelY.setText("Y");
        labelY.setToolTipText("");
        labelY.setMaximumSize(new java.awt.Dimension(7, 30));
        labelY.setMinimumSize(new java.awt.Dimension(7, 30));
        labelY.setPreferredSize(new java.awt.Dimension(7, 30));

        buttonEspelhaY.setText("Espelhar em Y");
        buttonEspelhaY.setPreferredSize(new java.awt.Dimension(73, 30));

        buttonEspelhaX.setText("Espelhar em X");
        buttonEspelhaX.setPreferredSize(new java.awt.Dimension(73, 30));

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jButton1.setText("Salvar Projeto");

        labelEscala.setText("Escala");
        labelEscala.setPreferredSize(new java.awt.Dimension(38, 30));

        sliderEscala.setMaximum(1000);
        sliderEscala.setPreferredSize(new java.awt.Dimension(200, 30));
        sliderEscala.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                sliderEscalaAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        sliderEscala.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                sliderEscalaAncestorMoved1(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        sliderEscala.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                sliderEscalaPropertyChange(evt);
            }
        });

        labelEscalaValor.setText("0.0");

        javax.swing.GroupLayout panelCoonfigLayout = new javax.swing.GroupLayout(panelCoonfig);
        panelCoonfig.setLayout(panelCoonfigLayout);
        panelCoonfigLayout.setHorizontalGroup(
            panelCoonfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCoonfigLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCoonfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIntegrantes)
                    .addComponent(labelMenuTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelCoonfigLayout.createSequentialGroup()
                        .addGroup(panelCoonfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelCoonfigLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(labelEscala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sliderEscala, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(labelEscalaValor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonEspelhaX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonEspelhaY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelCoonfigLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(labelAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinnerAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelAnguloGraus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCoonfigLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(labelCor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelCorSelecionada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonSelecionarCor, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCoonfigLayout.createSequentialGroup()
                                .addGroup(panelCoonfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelCoonfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelCoonfigLayout.createSequentialGroup()
                                        .addComponent(spinnerX, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spinnerY, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(comboFuncoes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        panelCoonfigLayout.setVerticalGroup(
            panelCoonfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCoonfigLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMenuTitulo)
                .addGap(18, 18, 18)
                .addGroup(panelCoonfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboFuncoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCoonfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCoonfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelCorSelecionada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSelecionarCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCoonfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAnguloGraus, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCoonfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelEscala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sliderEscala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelEscalaValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonEspelhaX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonEspelhaY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelIntegrantes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelCoonfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOGL, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCoonfig, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
            .addComponent(panelOGL, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sliderEscalaAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_sliderEscalaAncestorMoved
        labelEscalaValor.setText( ((Integer)sliderEscala.getValue()).toString());
    }//GEN-LAST:event_sliderEscalaAncestorMoved

    private void sliderEscalaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_sliderEscalaPropertyChange
        
    }//GEN-LAST:event_sliderEscalaPropertyChange

    private void sliderEscalaAncestorMoved1(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_sliderEscalaAncestorMoved1
        labelEscalaValor.setText( ((Integer)sliderEscala.getValue()).toString());
    }//GEN-LAST:event_sliderEscalaAncestorMoved1

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEspelhaX;
    private javax.swing.JButton buttonEspelhaY;
    private javax.swing.JButton buttonSelecionarCor;
    private javax.swing.JComboBox<String> comboFuncoes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel labelAngulo;
    private javax.swing.JLabel labelAnguloGraus;
    private javax.swing.JLabel labelCor;
    private javax.swing.JLabel labelEscala;
    private javax.swing.JLabel labelEscalaValor;
    private javax.swing.JLabel labelFuncao;
    private javax.swing.JLabel labelIntegrantes;
    private javax.swing.JLabel labelMenuTitulo;
    private javax.swing.JLabel labelX;
    private javax.swing.JLabel labelY;
    private javax.swing.JPanel panelCoonfig;
    private javax.swing.JPanel panelCorSelecionada;
    private javax.media.opengl.GLJPanel panelOGL;
    private javax.swing.JSlider sliderEscala;
    private javax.swing.JSpinner spinnerAngulo;
    private javax.swing.JSpinner spinnerX;
    private javax.swing.JSpinner spinnerY;
    // End of variables declaration//GEN-END:variables
}