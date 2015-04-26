/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1dam.vista;

import com.proyecto1dam.controlador.CrudProfesor;
import com.proyecto1dam.modelo.Profesor;
import java.awt.Color;
import java.awt.Dimension;
import java.util.List;
import javax.swing.BorderFactory;

/**
 *
 * @author andres
 */
public class ESAPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ESAPrincipal
     */
    public ESAPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoPanel = new javax.swing.JPanel();
        logoIMGPanel = new javax.swing.JPanel();
        imgLabel = new javax.swing.JLabel();
        nombrePanel = new javax.swing.JPanel();
        nombreESALabel = new javax.swing.JLabel();
        identificarPanel = new javax.swing.JPanel();
        identifLabel = new javax.swing.JLabel();
        usuarioLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        mainSeparator = new javax.swing.JSeparator();
        topMenuPanel = new javax.swing.JPanel();
        alumnosTopButton = new javax.swing.JButton();
        profesoresTopButton = new javax.swing.JButton();
        gruposTopButton = new javax.swing.JButton();
        centrosTopButton = new javax.swing.JButton();
        administradoresTopButton = new javax.swing.JButton();
        ayudaTopButton = new javax.swing.JButton();
        menuPanel = new javax.swing.JPanel();
        menuLabel = new javax.swing.JLabel();
        botonesMenu = new javax.swing.JPanel();
        alumnosButton = new javax.swing.JButton();
        profesoresButton = new javax.swing.JButton();
        gruposButton = new javax.swing.JButton();
        centrosButton = new javax.swing.JButton();
        adminButtons = new javax.swing.JButton();
        ayudaButton = new javax.swing.JButton();
        fondoLabel = new javax.swing.JLabel();
        profesoresPanel = new javax.swing.JPanel();
        profeLabel = new javax.swing.JLabel();
        buscarPanel = new javax.swing.JPanel();
        buscarLabel = new javax.swing.JLabel();
        nomProfesorLabel = new javax.swing.JLabel();
        apell1ProfesorLabel = new javax.swing.JLabel();
        apell2ProfesorLabel = new javax.swing.JLabel();
        dniProfesorLabel = new javax.swing.JLabel();
        nomProfesorField = new javax.swing.JTextField();
        apell1ProfesorField = new javax.swing.JTextField();
        apell2ProfesorField = new javax.swing.JTextField();
        dniProfesorField = new javax.swing.JTextField();
        localidadProfesorLabel = new javax.swing.JLabel();
        fijoProfesorLabel = new javax.swing.JLabel();
        movilProfesorLabel = new javax.swing.JLabel();
        emailProfesorLabel = new javax.swing.JLabel();
        localidadProfesorField = new javax.swing.JTextField();
        fijoProfesorField = new javax.swing.JTextField();
        movilProfesorField = new javax.swing.JTextField();
        emailProfesorField = new javax.swing.JTextField();
        buscarPrButton = new javax.swing.JButton();
        profeSeparator = new javax.swing.JSeparator();
        panelInferiorProfes = new javax.swing.JPanel();
        botoneraProfesPanel = new javax.swing.JPanel();
        addProfesorButton = new javax.swing.JButton();
        findAllProfesorButton = new javax.swing.JButton();
        volverMenuButton = new javax.swing.JButton();
        ayudaPrButton = new javax.swing.JButton();
        salirPrButton = new javax.swing.JButton();
        masOpcionesLabel = new javax.swing.JLabel();
        fullProfesoresPanel = new javax.swing.JPanel();
        profeLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        getContentPane().setLayout(null);

        logoPanel.setLayout(null);

        imgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/logoESAb.png"))); // NOI18N

        javax.swing.GroupLayout logoIMGPanelLayout = new javax.swing.GroupLayout(logoIMGPanel);
        logoIMGPanel.setLayout(logoIMGPanelLayout);
        logoIMGPanelLayout.setHorizontalGroup(
            logoIMGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        logoIMGPanelLayout.setVerticalGroup(
            logoIMGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        logoPanel.add(logoIMGPanel);
        logoIMGPanel.setBounds(0, 0, 100, 100);

        nombrePanel.setPreferredSize(new java.awt.Dimension(100, 60));

        nombreESALabel.setFont(new java.awt.Font("DejaVu Serif", 3, 36)); // NOI18N
        nombreESALabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreESALabel.setText("Escuela Sevillana de Ajedrez");

        javax.swing.GroupLayout nombrePanelLayout = new javax.swing.GroupLayout(nombrePanel);
        nombrePanel.setLayout(nombrePanelLayout);
        nombrePanelLayout.setHorizontalGroup(
            nombrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nombrePanelLayout.createSequentialGroup()
                .addComponent(nombreESALabel, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        nombrePanelLayout.setVerticalGroup(
            nombrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombreESALabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        logoPanel.add(nombrePanel);
        nombrePanel.setBounds(100, 0, 700, 60);

        identifLabel.setFont(new java.awt.Font("Droid Sans Fallback", 0, 12)); // NOI18N
        identifLabel.setText("Identificado como: ");

        usuarioLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuarioLabel.setText("usuario");

        logoutButton.setText("Salir");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout identificarPanelLayout = new javax.swing.GroupLayout(identificarPanel);
        identificarPanel.setLayout(identificarPanelLayout);
        identificarPanelLayout.setHorizontalGroup(
            identificarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(identificarPanelLayout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(identifLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutButton)
                .addGap(87, 87, 87))
        );
        identificarPanelLayout.setVerticalGroup(
            identificarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(identificarPanelLayout.createSequentialGroup()
                .addGroup(identificarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(identifLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usuarioLabel)
                    .addComponent(logoutButton))
                .addContainerGap())
        );

        logoPanel.add(identificarPanel);
        identificarPanel.setBounds(100, 60, 700, 40);

        getContentPane().add(logoPanel);
        logoPanel.setBounds(0, 0, 800, 100);
        getContentPane().add(mainSeparator);
        mainSeparator.setBounds(0, 100, 800, 30);

        topMenuPanel.setLayout(null);

        alumnosTopButton.setText("Alumnos");
        topMenuPanel.add(alumnosTopButton);
        alumnosTopButton.setBounds(0, 0, 130, 50);

        profesoresTopButton.setText("Profesores");
        profesoresTopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesoresTopButtonActionPerformed(evt);
            }
        });
        topMenuPanel.add(profesoresTopButton);
        profesoresTopButton.setBounds(133, 0, 130, 50);

        gruposTopButton.setText("Grupos");
        gruposTopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gruposTopButtonActionPerformed(evt);
            }
        });
        topMenuPanel.add(gruposTopButton);
        gruposTopButton.setBounds(266, 0, 130, 50);

        centrosTopButton.setText("Centros");
        centrosTopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centrosTopButtonActionPerformed(evt);
            }
        });
        topMenuPanel.add(centrosTopButton);
        centrosTopButton.setBounds(400, 0, 130, 50);

        administradoresTopButton.setText("Administradores");
        topMenuPanel.add(administradoresTopButton);
        administradoresTopButton.setBounds(533, 0, 130, 50);

        ayudaTopButton.setText("Ayuda");
        ayudaTopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaTopButtonActionPerformed(evt);
            }
        });
        topMenuPanel.add(ayudaTopButton);
        ayudaTopButton.setBounds(666, 0, 130, 50);

        getContentPane().add(topMenuPanel);
        topMenuPanel.setBounds(0, 100, 800, 50);
        topMenuPanel.setVisible(false);

        menuPanel.setLayout(null);

        menuLabel.setFont(new java.awt.Font("Ubuntu Light", 3, 24)); // NOI18N
        menuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuLabel.setText("MENÚ PRINCIPAL");
        menuPanel.add(menuLabel);
        menuLabel.setBounds(0, 0, 800, 50);

        botonesMenu.setPreferredSize(new java.awt.Dimension(300, 200));
        botonesMenu.setLayout(null);

        alumnosButton.setText("Alumnos");
        alumnosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnosButtonActionPerformed(evt);
            }
        });
        botonesMenu.add(alumnosButton);
        alumnosButton.setBounds(0, 0, 160, 160);

        profesoresButton.setText("Profesores");
        profesoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesoresButtonActionPerformed(evt);
            }
        });
        botonesMenu.add(profesoresButton);
        profesoresButton.setBounds(160, 0, 160, 160);

        gruposButton.setText("Grupos");
        botonesMenu.add(gruposButton);
        gruposButton.setBounds(320, 0, 160, 160);

        centrosButton.setText("Centros");
        botonesMenu.add(centrosButton);
        centrosButton.setBounds(0, 160, 160, 160);

        adminButtons.setText("Administradores");
        botonesMenu.add(adminButtons);
        adminButtons.setBounds(160, 160, 160, 160);

        ayudaButton.setText("Acerca de...");
        botonesMenu.add(ayudaButton);
        ayudaButton.setBounds(320, 160, 160, 160);

        menuPanel.add(botonesMenu);
        botonesMenu.setBounds(160, 50, 480, 320);

        fondoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/background_homeb.png"))); // NOI18N
        menuPanel.add(fondoLabel);
        fondoLabel.setBounds(0, 0, 800, 450);

        getContentPane().add(menuPanel);
        menuPanel.setBounds(0, 150, 800, 450);

        profesoresPanel.setBackground(new Color (0,0,0,0));
        profesoresPanel.setMinimumSize(new java.awt.Dimension(800, 450));
        profesoresPanel.setLayout(null);

        profeLabel.setFont(new java.awt.Font("Ubuntu Light", 3, 24)); // NOI18N
        profeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profeLabel.setText("PROFESORES");
        profesoresPanel.add(profeLabel);
        profeLabel.setBounds(300, 0, 200, 40);

        buscarPanel.setLayout(null);

        buscarLabel.setText("Buscar Profesor...");
        buscarPanel.add(buscarLabel);
        buscarLabel.setBounds(23, 12, 600, 17);

        nomProfesorLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nomProfesorLabel.setText("Nombre");
        buscarPanel.add(nomProfesorLabel);
        nomProfesorLabel.setBounds(20, 50, 120, 20);

        apell1ProfesorLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        apell1ProfesorLabel.setText("Apellido 1");
        buscarPanel.add(apell1ProfesorLabel);
        apell1ProfesorLabel.setBounds(20, 90, 120, 20);

        apell2ProfesorLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        apell2ProfesorLabel.setText("Apellido 2");
        buscarPanel.add(apell2ProfesorLabel);
        apell2ProfesorLabel.setBounds(20, 130, 120, 20);

        dniProfesorLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dniProfesorLabel.setText("DNI");
        buscarPanel.add(dniProfesorLabel);
        dniProfesorLabel.setBounds(20, 170, 120, 20);

        nomProfesorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomProfesorFieldActionPerformed(evt);
            }
        });
        buscarPanel.add(nomProfesorField);
        nomProfesorField.setBounds(162, 47, 150, 27);
        buscarPanel.add(apell1ProfesorField);
        apell1ProfesorField.setBounds(162, 87, 150, 27);
        buscarPanel.add(apell2ProfesorField);
        apell2ProfesorField.setBounds(162, 127, 150, 27);

        dniProfesorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniProfesorFieldActionPerformed(evt);
            }
        });
        buscarPanel.add(dniProfesorField);
        dniProfesorField.setBounds(162, 167, 150, 27);

        localidadProfesorLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        localidadProfesorLabel.setText("Localidad");
        buscarPanel.add(localidadProfesorLabel);
        localidadProfesorLabel.setBounds(350, 50, 120, 20);

        fijoProfesorLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fijoProfesorLabel.setText("Tel. Fijo");
        buscarPanel.add(fijoProfesorLabel);
        fijoProfesorLabel.setBounds(350, 90, 120, 20);

        movilProfesorLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        movilProfesorLabel.setText("Tel. Móvil");
        buscarPanel.add(movilProfesorLabel);
        movilProfesorLabel.setBounds(350, 130, 120, 20);

        emailProfesorLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailProfesorLabel.setText("E-Mail");
        buscarPanel.add(emailProfesorLabel);
        emailProfesorLabel.setBounds(350, 170, 120, 20);
        buscarPanel.add(localidadProfesorField);
        localidadProfesorField.setBounds(494, 47, 150, 27);
        buscarPanel.add(fijoProfesorField);
        fijoProfesorField.setBounds(494, 87, 150, 27);
        buscarPanel.add(movilProfesorField);
        movilProfesorField.setBounds(494, 127, 150, 27);

        emailProfesorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailProfesorFieldActionPerformed(evt);
            }
        });
        buscarPanel.add(emailProfesorField);
        emailProfesorField.setBounds(494, 167, 150, 27);

        buscarPrButton.setText("Buscar!");
        buscarPrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPrButtonActionPerformed(evt);
            }
        });
        buscarPanel.add(buscarPrButton);
        buscarPrButton.setBounds(710, 120, 70, 70);

        profesoresPanel.add(buscarPanel);
        buscarPanel.setBounds(0, 50, 800, 200);
        profesoresPanel.add(profeSeparator);
        profeSeparator.setBounds(0, 280, 800, 6);

        panelInferiorProfes.setBackground(new Color(0,0,0,0));
        panelInferiorProfes.setOpaque(false);
        panelInferiorProfes.setLayout(null);

        botoneraProfesPanel.setLayout(null);

        addProfesorButton.setText("<html><center>Añadir<br />Profesor</center></html>");
        addProfesorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProfesorButtonActionPerformed(evt);
            }
        });
        botoneraProfesPanel.add(addProfesorButton);
        addProfesorButton.setBounds(0, 0, 90, 90);

        findAllProfesorButton.setText("<html><center>Mostrar<br />todos</center></html>");
        findAllProfesorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findAllProfesorButtonActionPerformed(evt);
            }
        });
        botoneraProfesPanel.add(findAllProfesorButton);
        findAllProfesorButton.setBounds(90, 0, 90, 90);

        volverMenuButton.setText("<html><center>Volver<br />al Menú</center></html>");
        volverMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverMenuButtonActionPerformed(evt);
            }
        });
        botoneraProfesPanel.add(volverMenuButton);
        volverMenuButton.setBounds(180, 0, 90, 90);

        ayudaPrButton.setText("Ayuda");
        botoneraProfesPanel.add(ayudaPrButton);
        ayudaPrButton.setBounds(270, 0, 90, 90);

        salirPrButton.setText("Salir");
        salirPrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirPrButtonActionPerformed(evt);
            }
        });
        botoneraProfesPanel.add(salirPrButton);
        salirPrButton.setBounds(510, 0, 90, 90);

        panelInferiorProfes.add(botoneraProfesPanel);
        botoneraProfesPanel.setBounds(100, 50, 600, 90);

        masOpcionesLabel.setText("Más Opciones...");
        panelInferiorProfes.add(masOpcionesLabel);
        masOpcionesLabel.setBounds(23, 12, 114, 17);

        profesoresPanel.add(panelInferiorProfes);
        panelInferiorProfes.setBounds(0, 290, 800, 160);

        getContentPane().add(profesoresPanel);
        profesoresPanel.setBounds(0, 0, 800, 450);
        profesoresPanel.setVisible(false);

        fullProfesoresPanel.setLayout(null);

        profeLabel1.setFont(new java.awt.Font("Ubuntu Light", 3, 24)); // NOI18N
        profeLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profeLabel1.setText("PROFESORES");
        fullProfesoresPanel.add(profeLabel1);
        profeLabel1.setBounds(300, 0, 200, 40);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nombre");
        fullProfesoresPanel.add(jLabel1);
        jLabel1.setBounds(50, 60, 120, 17);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Apellido 1");
        fullProfesoresPanel.add(jLabel2);
        jLabel2.setBounds(50, 100, 120, 17);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellido 2");
        fullProfesoresPanel.add(jLabel3);
        jLabel3.setBounds(50, 140, 120, 17);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Sexo");
        fullProfesoresPanel.add(jLabel4);
        jLabel4.setBounds(50, 180, 120, 17);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Dirección");
        fullProfesoresPanel.add(jLabel5);
        jLabel5.setBounds(50, 220, 120, 17);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Localidad");
        fullProfesoresPanel.add(jLabel6);
        jLabel6.setBounds(50, 260, 120, 17);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Teléfono fijo");
        fullProfesoresPanel.add(jLabel7);
        jLabel7.setBounds(50, 300, 120, 17);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Teléfono móvil");
        fullProfesoresPanel.add(jLabel8);
        jLabel8.setBounds(50, 340, 120, 17);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("E-Mail");
        fullProfesoresPanel.add(jLabel9);
        jLabel9.setBounds(50, 380, 120, 17);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Usuario");
        fullProfesoresPanel.add(jLabel10);
        jLabel10.setBounds(400, 60, 145, 17);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Contraseña");
        fullProfesoresPanel.add(jLabel11);
        jLabel11.setBounds(400, 100, 145, 17);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("DNI");
        fullProfesoresPanel.add(jLabel12);
        jLabel12.setBounds(400, 140, 145, 17);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Nº Seguridad Social");
        fullProfesoresPanel.add(jLabel13);
        jLabel13.setBounds(400, 180, 145, 17);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("CCC");
        fullProfesoresPanel.add(jLabel14);
        jLabel14.setBounds(400, 220, 145, 17);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Material");
        fullProfesoresPanel.add(jLabel15);
        jLabel15.setBounds(400, 260, 145, 17);

        jButton1.setText("Guardar Profesor");
        fullProfesoresPanel.add(jButton1);
        jButton1.setBounds(450, 310, 210, 29);

        jButton2.setText("Volver atrás");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        fullProfesoresPanel.add(jButton2);
        jButton2.setBounds(450, 360, 210, 29);
        fullProfesoresPanel.add(jTextField1);
        jTextField1.setBounds(180, 55, 150, 30);
        fullProfesoresPanel.add(jTextField2);
        jTextField2.setBounds(180, 95, 150, 30);
        fullProfesoresPanel.add(jTextField3);
        jTextField3.setBounds(180, 135, 150, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        fullProfesoresPanel.add(jComboBox1);
        jComboBox1.setBounds(180, 175, 150, 30);
        fullProfesoresPanel.add(jTextField4);
        jTextField4.setBounds(180, 215, 150, 30);
        fullProfesoresPanel.add(jTextField5);
        jTextField5.setBounds(180, 255, 150, 30);
        fullProfesoresPanel.add(jTextField6);
        jTextField6.setBounds(180, 295, 150, 30);
        fullProfesoresPanel.add(jTextField7);
        jTextField7.setBounds(180, 335, 150, 30);
        fullProfesoresPanel.add(jTextField8);
        jTextField8.setBounds(180, 375, 150, 30);
        fullProfesoresPanel.add(jTextField9);
        jTextField9.setBounds(560, 55, 150, 30);
        fullProfesoresPanel.add(jTextField10);
        jTextField10.setBounds(560, 95, 150, 30);
        fullProfesoresPanel.add(jTextField11);
        jTextField11.setBounds(560, 135, 150, 30);

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        fullProfesoresPanel.add(jTextField12);
        jTextField12.setBounds(560, 175, 150, 30);
        fullProfesoresPanel.add(jTextField13);
        jTextField13.setBounds(560, 215, 150, 30);
        fullProfesoresPanel.add(jTextField14);
        jTextField14.setBounds(560, 255, 150, 30);

        getContentPane().add(fullProfesoresPanel);
        fullProfesoresPanel.setBounds(0, 150, 800, 450);
        fullProfesoresPanel.setVisible(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alumnosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumnosButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alumnosButtonActionPerformed

    private void profesoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profesoresButtonActionPerformed
        // TODO add your handling code here:
        profesoresPanel.setVisible(true);
        profesoresPanel.setBounds(0, 150, 800, 450);
        topMenuPanel.setVisible(true);
        menuPanel.setVisible(false);
        
    }//GEN-LAST:event_profesoresButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void ayudaTopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaTopButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ayudaTopButtonActionPerformed

    private void nomProfesorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomProfesorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomProfesorFieldActionPerformed

    private void dniProfesorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniProfesorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniProfesorFieldActionPerformed

    private void emailProfesorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailProfesorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailProfesorFieldActionPerformed

    private void profesoresTopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profesoresTopButtonActionPerformed
        // TODO add your handling code here:
        profesoresPanel.setVisible(true);
        profesoresPanel.setBounds(0, 150, 800, 450);
        topMenuPanel.setVisible(true);
        menuPanel.setVisible(false);
        fullProfesoresPanel.setVisible(false);
    }//GEN-LAST:event_profesoresTopButtonActionPerformed

    private void salirPrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirPrButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirPrButtonActionPerformed

    private void volverMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverMenuButtonActionPerformed
        // TODO add your handling code here:
        profesoresPanel.setVisible(false);
        topMenuPanel.setVisible(false);
        menuPanel.setVisible(true);
        menuPanel.setBounds(0, 150, 800, 450);
    }//GEN-LAST:event_volverMenuButtonActionPerformed

    private void centrosTopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centrosTopButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_centrosTopButtonActionPerformed

    private void findAllProfesorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findAllProfesorButtonActionPerformed
        
        CrudProfesor cp = new CrudProfesor ();
        
        List <Profesor> listado;
        listado = cp.findAll();
        
        for (Profesor p : listado) {
            System.out.println(p);
        }
    }//GEN-LAST:event_findAllProfesorButtonActionPerformed

    private void buscarPrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPrButtonActionPerformed
        
        String nombre = nomProfesorField.getText();
        String ap1 = apell1ProfesorField.getText();
        String ap2 = apell2ProfesorField.getText();
        String dni = dniProfesorField.getText();
        String localidad = localidadProfesorField.getText();
        String fijo = fijoProfesorField.getText();
        String mvl = movilProfesorField.getText();
        String email = emailProfesorField.getText();
        
        CrudProfesor cp = new CrudProfesor ();
        
        List <Profesor> listado;
        listado = cp.find(nombre, ap1, ap2, dni, localidad, fijo, mvl, email);
        
        for (Profesor p : listado) {
            System.out.println(p);
        }
        
    }//GEN-LAST:event_buscarPrButtonActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void addProfesorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProfesorButtonActionPerformed
        // TODO add your handling code here:
        profesoresPanel.setVisible(false);
        fullProfesoresPanel.setVisible(true);
        
        fullProfesoresPanel.setBounds(0, 150, 800, 450);
    }//GEN-LAST:event_addProfesorButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        fullProfesoresPanel.setVisible(false);
        profesoresPanel.setVisible(true);
        
        profesoresPanel.setBounds(0, 150, 800, 450);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void gruposTopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gruposTopButtonActionPerformed
        // TODO add your handling code here:
        profesoresPanel.setVisible(false);
        
        ProfesoresForm pf = new ProfesoresForm ();
        this.add(pf);
        pf.setBounds(0, 150, 800, 450);
        pf.setPreferredSize(new Dimension(800,450));
        pf.setVisible(true);
       
    }//GEN-LAST:event_gruposTopButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ESAPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ESAPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ESAPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ESAPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ESAPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProfesorButton;
    private javax.swing.JButton adminButtons;
    private javax.swing.JButton administradoresTopButton;
    private javax.swing.JButton alumnosButton;
    private javax.swing.JButton alumnosTopButton;
    private javax.swing.JTextField apell1ProfesorField;
    private javax.swing.JLabel apell1ProfesorLabel;
    private javax.swing.JTextField apell2ProfesorField;
    private javax.swing.JLabel apell2ProfesorLabel;
    private javax.swing.JButton ayudaButton;
    private javax.swing.JButton ayudaPrButton;
    private javax.swing.JButton ayudaTopButton;
    private javax.swing.JPanel botoneraProfesPanel;
    private javax.swing.JPanel botonesMenu;
    private javax.swing.JLabel buscarLabel;
    private javax.swing.JPanel buscarPanel;
    private javax.swing.JButton buscarPrButton;
    private javax.swing.JButton centrosButton;
    private javax.swing.JButton centrosTopButton;
    private javax.swing.JTextField dniProfesorField;
    private javax.swing.JLabel dniProfesorLabel;
    private javax.swing.JTextField emailProfesorField;
    private javax.swing.JLabel emailProfesorLabel;
    private javax.swing.JTextField fijoProfesorField;
    private javax.swing.JLabel fijoProfesorLabel;
    private javax.swing.JButton findAllProfesorButton;
    private javax.swing.JLabel fondoLabel;
    private javax.swing.JPanel fullProfesoresPanel;
    private javax.swing.JButton gruposButton;
    private javax.swing.JButton gruposTopButton;
    private javax.swing.JLabel identifLabel;
    private javax.swing.JPanel identificarPanel;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField localidadProfesorField;
    private javax.swing.JLabel localidadProfesorLabel;
    private javax.swing.JPanel logoIMGPanel;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JSeparator mainSeparator;
    private javax.swing.JLabel masOpcionesLabel;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JTextField movilProfesorField;
    private javax.swing.JLabel movilProfesorLabel;
    private javax.swing.JTextField nomProfesorField;
    private javax.swing.JLabel nomProfesorLabel;
    private javax.swing.JLabel nombreESALabel;
    private javax.swing.JPanel nombrePanel;
    private javax.swing.JPanel panelInferiorProfes;
    private javax.swing.JLabel profeLabel;
    private javax.swing.JLabel profeLabel1;
    private javax.swing.JSeparator profeSeparator;
    private javax.swing.JButton profesoresButton;
    private javax.swing.JPanel profesoresPanel;
    private javax.swing.JButton profesoresTopButton;
    private javax.swing.JButton salirPrButton;
    private javax.swing.JPanel topMenuPanel;
    private javax.swing.JLabel usuarioLabel;
    private javax.swing.JButton volverMenuButton;
    // End of variables declaration//GEN-END:variables
}