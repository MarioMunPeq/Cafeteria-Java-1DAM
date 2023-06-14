/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author admin
 */
public class Ventana_otra_bebida extends javax.swing.JFrame {

    /**
     * Creates new form Otras_bebidas_3
     */
    public Ventana_otra_bebida() {
        initComponents();
         //inserccion de imagenes en los botones
// agua con gas C:\Users\admin\Desktop\OneDrive - Educacyl\PROGRAMACION\proyecto_cafe_probar\src\cafeteria_imagenes_botones\125x90\agua gas.png
        ImageIcon img_gas = new ImageIcon("src\\cafeteria_imagenes_botones\\125x90\\agua gas.png");
        // crea un objeto imagen en base a l incono anteior y toma las dimensiones del bototn que lo va a contener. getscaled lo redimensiona
        Image im_gas = img_gas.getImage().getScaledInstance(jb_agua_gas.getWidth(), jb_agua_gas.getHeight(), Image.SCALE_SMOOTH);
        jb_agua_gas.setIcon(new ImageIcon(im_gas));
// agua
        ImageIcon img_agua = new ImageIcon("src\\cafeteria_imagenes_botones\\125x90\\agua.png");
        Image im_agua = img_agua.getImage().getScaledInstance(jb_agua.getWidth(), jb_agua.getHeight(), Image.SCALE_SMOOTH);
        jb_agua.setIcon(new ImageIcon(im_agua));
// aquarius
        ImageIcon img_aquarios = new ImageIcon("src\\cafeteria_imagenes_botones\\125x90\\aquarius.png");
        Image im_aquarius = img_aquarios.getImage().getScaledInstance(jb_acuarius.getWidth(), jb_acuarius.getHeight(), Image.SCALE_SMOOTH);
        jb_acuarius.setIcon(new ImageIcon(im_aquarius));
// vino blanco
        ImageIcon img_blanco = new ImageIcon("src\\cafeteria_imagenes_botones\\125x90\\blanco.png");
        Image im_blanco = img_blanco.getImage().getScaledInstance(jb_blanco.getWidth(), jb_blanco.getHeight(), Image.SCALE_SMOOTH);
        jb_blanco.setIcon(new ImageIcon(im_blanco));
// caña
        ImageIcon img_cania = new ImageIcon("src\\cafeteria_imagenes_botones\\125x90\\caña.png");
        Image im_cania = img_cania.getImage().getScaledInstance(jb_cania.getWidth(), jb_cania.getHeight(), Image.SCALE_SMOOTH);
        jb_cania.setIcon(new ImageIcon(im_cania));
// cañon 
        ImageIcon img_canion = new ImageIcon("src\\cafeteria_imagenes_botones\\125x90\\cañon.png");
        Image im_canion = img_canion.getImage().getScaledInstance(jb_canion.getWidth(), jb_canion.getHeight(), Image.SCALE_SMOOTH);
        jb_canion.setIcon(new ImageIcon(im_canion));
// coca cola
        ImageIcon img_cola = new ImageIcon("src\\cafeteria_imagenes_botones\\125x90\\cola.png");
        Image im_cola = img_cola.getImage().getScaledInstance(jb_cocacola.getWidth(), jb_cocacola.getHeight(), Image.SCALE_SMOOTH);
        jb_cocacola.setIcon(new ImageIcon(im_cola));
// corto de cerveza
        ImageIcon img_corto = new ImageIcon("src\\cafeteria_imagenes_botones\\125x90\\corto.png");
        Image im_corto = img_corto.getImage().getScaledInstance(jb_corto.getWidth(), jb_corto.getHeight(), Image.SCALE_SMOOTH);
        jb_corto.setIcon(new ImageIcon(im_corto));
// fanta limon
        ImageIcon img_limon = new ImageIcon("src\\cafeteria_imagenes_botones\\125x90\\fanta limon.png");
        Image im_limon = img_limon.getImage().getScaledInstance(jb_f_limon.getWidth(), jb_f_limon.getHeight(), Image.SCALE_SMOOTH);
        jb_f_limon.setIcon(new ImageIcon(im_limon));
// fanta naranja
        ImageIcon img_naranja = new ImageIcon("src\\cafeteria_imagenes_botones\\125x90\\fanta naranja.png");
        Image im_naranja = img_naranja.getImage().getScaledInstance(jb_f_naranja.getWidth(), jb_f_naranja.getHeight(), Image.SCALE_SMOOTH);
        jb_f_naranja.setIcon(new ImageIcon(im_naranja));
// matini
        ImageIcon img_martini = new ImageIcon("src\\cafeteria_imagenes_botones\\125x90\\martini.png");
        Image im_martini = img_martini.getImage().getScaledInstance(jb_martini.getWidth(), jb_martini.getHeight(), Image.SCALE_SMOOTH);
        jb_martini.setIcon(new ImageIcon(im_martini));
// nestea
        ImageIcon img_nestea = new ImageIcon("src\\cafeteria_imagenes_botones\\125x90\\nestea.png");
        Image im_nestea = img_nestea.getImage().getScaledInstance(jb_nestea.getWidth(), jb_nestea.getHeight(), Image.SCALE_SMOOTH);
        jb_nestea.setIcon(new ImageIcon(im_nestea));
// vino rosado
        ImageIcon img_rosado = new ImageIcon("src\\cafeteria_imagenes_botones\\125x90\\rosado.png");
        Image im_rosado = img_rosado.getImage().getScaledInstance(jb_rosado.getWidth(), jb_rosado.getHeight(), Image.SCALE_SMOOTH);
        jb_rosado.setIcon(new ImageIcon(im_rosado));
// sprite
        ImageIcon img_sprite = new ImageIcon("src\\cafeteria_imagenes_botones\\125x90\\sprite.png");
        Image im_sprite = img_sprite.getImage().getScaledInstance(jb_sprite.getWidth(), jb_sprite.getHeight(), Image.SCALE_SMOOTH);
        jb_sprite.setIcon(new ImageIcon(im_sprite));
// vino tinto
        ImageIcon img_tinto = new ImageIcon("src\\cafeteria_imagenes_botones\\125x90\\tinto.png");
        Image im_tinto = img_tinto.getImage().getScaledInstance(jb_tinto.getWidth(), jb_tinto.getHeight(), Image.SCALE_SMOOTH);
        jb_tinto.setIcon(new ImageIcon(im_tinto));
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jb_f_naranja = new javax.swing.JButton();
        jb_agua = new javax.swing.JButton();
        jb_sprite = new javax.swing.JButton();
        jb_cocacola = new javax.swing.JButton();
        jb_acuarius = new javax.swing.JButton();
        jb_tinto = new javax.swing.JButton();
        jb_agua_gas = new javax.swing.JButton();
        jb_corto = new javax.swing.JButton();
        jb_nestea = new javax.swing.JButton();
        jb_f_limon = new javax.swing.JButton();
        jb_canion = new javax.swing.JButton();
        jb_martini = new javax.swing.JButton();
        jb_blanco = new javax.swing.JButton();
        jb_cania = new javax.swing.JButton();
        jb_rosado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_info_add_ticket_otras_bebidas = new javax.swing.JTextArea();
        jb_aniadir_ticket_iotras_bebidas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(217, 141, 98));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);

        jPanel2.setBackground(new java.awt.Color(242, 214, 189));

        jb_f_naranja.setBackground(new java.awt.Color(115, 184, 191));
        jb_f_naranja.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_f_naranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_f_naranjaActionPerformed(evt);
            }
        });

        jb_agua.setBackground(new java.awt.Color(115, 184, 191));
        jb_agua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_agua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_aguaActionPerformed(evt);
            }
        });

        jb_sprite.setBackground(new java.awt.Color(115, 184, 191));
        jb_sprite.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_sprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_spriteActionPerformed(evt);
            }
        });

        jb_cocacola.setBackground(new java.awt.Color(115, 184, 191));
        jb_cocacola.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_cocacola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cocacolaActionPerformed(evt);
            }
        });

        jb_acuarius.setBackground(new java.awt.Color(115, 184, 191));
        jb_acuarius.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_acuarius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_acuariusActionPerformed(evt);
            }
        });

        jb_tinto.setBackground(new java.awt.Color(115, 184, 191));
        jb_tinto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_tinto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_tintoActionPerformed(evt);
            }
        });

        jb_agua_gas.setBackground(new java.awt.Color(115, 184, 191));
        jb_agua_gas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_agua_gas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agua_gasActionPerformed(evt);
            }
        });

        jb_corto.setBackground(new java.awt.Color(115, 184, 191));
        jb_corto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_corto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cortoActionPerformed(evt);
            }
        });

        jb_nestea.setBackground(new java.awt.Color(115, 184, 191));
        jb_nestea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_nestea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_nesteaActionPerformed(evt);
            }
        });

        jb_f_limon.setBackground(new java.awt.Color(115, 184, 191));
        jb_f_limon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_f_limon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_f_limonActionPerformed(evt);
            }
        });

        jb_canion.setBackground(new java.awt.Color(115, 184, 191));
        jb_canion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_canion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_canionActionPerformed(evt);
            }
        });

        jb_martini.setBackground(new java.awt.Color(115, 184, 191));
        jb_martini.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_martini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_martiniActionPerformed(evt);
            }
        });

        jb_blanco.setBackground(new java.awt.Color(115, 184, 191));
        jb_blanco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_blanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_blancoActionPerformed(evt);
            }
        });

        jb_cania.setBackground(new java.awt.Color(115, 184, 191));
        jb_cania.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_cania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_caniaActionPerformed(evt);
            }
        });

        jb_rosado.setBackground(new java.awt.Color(115, 184, 191));
        jb_rosado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_rosado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_rosadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jb_acuarius, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_sprite, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_nestea, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jb_cocacola, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_f_naranja, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_f_limon, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jb_agua, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_agua_gas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_martini, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jb_corto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jb_cania, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jb_blanco, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jb_rosado, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_tinto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_canion, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_cocacola, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jb_f_naranja, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jb_f_limon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_acuarius, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_sprite, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_nestea, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_agua, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_agua_gas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_martini, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_corto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_cania, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_canion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_blanco, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_tinto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_rosado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jta_info_add_ticket_otras_bebidas.setEditable(false);
        jta_info_add_ticket_otras_bebidas.setColumns(20);
        jta_info_add_ticket_otras_bebidas.setRows(5);
        jScrollPane1.setViewportView(jta_info_add_ticket_otras_bebidas);

        jb_aniadir_ticket_iotras_bebidas.setBackground(new java.awt.Color(54, 115, 115));
        jb_aniadir_ticket_iotras_bebidas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jb_aniadir_ticket_iotras_bebidas.setForeground(new java.awt.Color(242, 214, 189));
        jb_aniadir_ticket_iotras_bebidas.setText("AÑADIR AL TICKET");
        jb_aniadir_ticket_iotras_bebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_aniadir_ticket_iotras_bebidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_aniadir_ticket_iotras_bebidas))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb_aniadir_ticket_iotras_bebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_f_naranjaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_f_naranjaActionPerformed
        // añade fanta naranja al jta_info_add_ticket_otras_bebidas
        jta_info_add_ticket_otras_bebidas.append("Fanta Naranja \t 2.40€\n");
    }// GEN-LAST:event_jb_f_naranjaActionPerformed

    private void jb_aguaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_aguaActionPerformed
        // añade agua mineral al jta_info_add_ticket_otras_bebidas
                jta_info_add_ticket_otras_bebidas.append("Agua Mineral \t 1.60€\n");

    }// GEN-LAST:event_jb_aguaActionPerformed

    private void jb_spriteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_spriteActionPerformed
        // añade sprite al jta_info_add_ticket_otras_bebidas
                jta_info_add_ticket_otras_bebidas.append("Sprite \t 2.40€\n");

    }// GEN-LAST:event_jb_spriteActionPerformed

    private void jb_cocacolaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_cocacolaActionPerformed
        // añade Coca cola al jta_info_add_ticket_otras_bebidas
                jta_info_add_ticket_otras_bebidas.append("Coca-cola \t 2.40€\n");

    }// GEN-LAST:event_jb_cocacolaActionPerformed

    private void jb_acuariusActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_acuariusActionPerformed
        // añade acuarius al jta_info_add_ticket_otras_bebidas:
                jta_info_add_ticket_otras_bebidas.append("Aquarius \t 2.40€\n");

    }// GEN-LAST:event_jb_acuariusActionPerformed

    private void jb_tintoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_tintoActionPerformed
        // añade vino tinto al jta_info_add_ticket_otras_bebidas
                jta_info_add_ticket_otras_bebidas.append("Vino Tinto \t 2.00€\n");

    }// GEN-LAST:event_jb_tintoActionPerformed

    private void jb_agua_gasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_agua_gasActionPerformed
        // añade agua con gas al jta_info_add_ticket_otras_bebidas
                jta_info_add_ticket_otras_bebidas.append("Agua con Gas \t 1.40€\n");

    }// GEN-LAST:event_jb_agua_gasActionPerformed

    private void jb_cortoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_cortoActionPerformed
        // añade corto al jta_info_add_ticket_otras_bebidas
                jta_info_add_ticket_otras_bebidas.append("Corto Ceveza \t 1.00€\n");

    }// GEN-LAST:event_jb_cortoActionPerformed

    private void jb_nesteaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_nesteaActionPerformed
        // añade nestea al jta_info_add_ticket_otras_bebidas
                jta_info_add_ticket_otras_bebidas.append("Nestea \t 2.40€\n");

    }// GEN-LAST:event_jb_nesteaActionPerformed

    private void jb_f_limonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_f_limonActionPerformed
        // añade fanta limón al jta_info_add_ticket_otras_bebidas
                jta_info_add_ticket_otras_bebidas.append("Fanta Limón \t 2.40€\n");

    }// GEN-LAST:event_jb_f_limonActionPerformed

    private void jb_canionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_canionActionPerformed
        // añade cañón al jta_info_add_ticket_otras_bebidas
                jta_info_add_ticket_otras_bebidas.append("Cañón de Cerveza \t 2.40€\n");

    }// GEN-LAST:event_jb_canionActionPerformed

    private void jb_martiniActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_martiniActionPerformed
        /// añade martini al jta_info_add_ticket_otras_bebidas
                jta_info_add_ticket_otras_bebidas.append("Martini \t 2.00€\n");

    }// GEN-LAST:event_jb_martiniActionPerformed

    private void jb_blancoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_blancoActionPerformed
        // añade vino blanco al jta_info_add_ticket_otras_bebidas
                jta_info_add_ticket_otras_bebidas.append("Vino Blanco \t 1.60€\n");

    }// GEN-LAST:event_jb_blancoActionPerformed

    private void jb_caniaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_caniaActionPerformed
        // añade caña al jta_info_add_ticket_otras_bebidas
                jta_info_add_ticket_otras_bebidas.append("Caña \t 1.80€\n");

    }// GEN-LAST:event_jb_caniaActionPerformed

    private void jb_rosadoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_rosadoActionPerformed
        // añade vino rosado al jta_info_add_ticket_otras_bebidas
                jta_info_add_ticket_otras_bebidas.append("Vino Rosado \t 1.80€\n");

    }// GEN-LAST:event_jb_rosadoActionPerformed

    private void jb_aniadir_ticket_iotras_bebidasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_aniadir_ticket_iotras_bebidasActionPerformed
        // añadir al ticket seleccionado los productos que se han recogido
        // OJO-- esto debe cerrar la ventana y volver al main
        Main_botones.otrasbebe3.dispose();
    }// GEN-LAST:event_jb_aniadir_ticket_iotras_bebidasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_otra_bebida.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_otra_bebida.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_otra_bebida.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_otra_bebida.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_otra_bebida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_acuarius;
    private javax.swing.JButton jb_agua;
    private javax.swing.JButton jb_agua_gas;
    private javax.swing.JButton jb_aniadir_ticket_iotras_bebidas;
    private javax.swing.JButton jb_blanco;
    private javax.swing.JButton jb_cania;
    private javax.swing.JButton jb_canion;
    private javax.swing.JButton jb_cocacola;
    private javax.swing.JButton jb_corto;
    private javax.swing.JButton jb_f_limon;
    private javax.swing.JButton jb_f_naranja;
    private javax.swing.JButton jb_martini;
    private javax.swing.JButton jb_nestea;
    private javax.swing.JButton jb_rosado;
    private javax.swing.JButton jb_sprite;
    private javax.swing.JButton jb_tinto;
    private javax.swing.JTextArea jta_info_add_ticket_otras_bebidas;
    // End of variables declaration//GEN-END:variables
}
