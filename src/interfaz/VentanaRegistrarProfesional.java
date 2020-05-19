package interfaz;

import dominio.Sistema;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VentanaRegistrarProfesional extends javax.swing.JDialog {

    private Sistema sistema;
    private ImageIcon fotoDePerfilActual;
    private boolean primeraVez;

    public VentanaRegistrarProfesional(Sistema unSistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sistema = unSistema;
        this.fotoDePerfilActual = new ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png"));
        ocultarEtiquetas();
        this.primeraVez = true;
        cargarListaPaisesGraduacion();
        Calendar fecha = new GregorianCalendar();
        this.dateChooserFechaNacimiento.setMaxDate(fecha);
        this.dateChooserFechaGraduacion.setMaxDate(fecha);
        this.primeraVez = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        lblTituloVentana = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        icono = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        lblNuevoProfesional = new javax.swing.JLabel();
        lblIconoNuevoProfesional = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lblTituloProfesional = new javax.swing.JLabel();
        btnIngresarProfesionalASistema = new javax.swing.JButton();
        lblPaisGraduacion = new javax.swing.JLabel();
        listaPaisGraduacion = new javax.swing.JComboBox<>();
        listaTituloProfesional = new javax.swing.JComboBox<>();
        lblFechaNac = new javax.swing.JLabel();
        dateChooserFechaNacimiento = new datechooser.beans.DateChooserCombo();
        btnIngresarFotoPerfil = new javax.swing.JButton();
        lblFechaGraduacion = new javax.swing.JLabel();
        dateChooserFechaGraduacion = new datechooser.beans.DateChooserCombo();
        lblValidarNombre = new javax.swing.JLabel();
        lblValidarApellido = new javax.swing.JLabel();
        lblValidarTituloProfesional = new javax.swing.JLabel();
        lblValidarPaisGraduacion = new javax.swing.JLabel();
        lblDatosIncorrectos = new javax.swing.JLabel();
        lblNombreVacio = new javax.swing.JLabel();
        lblTituloVacio = new javax.swing.JLabel();
        lblPaisVacio = new javax.swing.JLabel();
        lblApellidoVacio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(1060, 800));
        setMinimumSize(new java.awt.Dimension(1060, 800));
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1060, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1060, 800));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(164, 211, 249));
        panel1.setMaximumSize(new java.awt.Dimension(270, 800));
        panel1.setMinimumSize(new java.awt.Dimension(270, 800));
        panel1.setPreferredSize(new java.awt.Dimension(270, 800));

        lblTituloVentana.setFont(new java.awt.Font("Segoe Script", 1, 50)); // NOI18N
        lblTituloVentana.setForeground(new java.awt.Color(0, 51, 153));
        lblTituloVentana.setText("Broccoli");

        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoVolverAtras.png"))); // NOI18N
        btnHome.setBorder(null);
        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setFocusPainted(false);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBrocoli.png"))); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(btnHome)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(0, 22, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(lblTituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome)
                .addGap(116, 116, 116)
                .addComponent(lblTituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(349, Short.MAX_VALUE))
        );

        panel2.setBackground(new java.awt.Color(51, 51, 51));
        panel2.setForeground(new java.awt.Color(51, 51, 51));
        panel2.setMaximumSize(new java.awt.Dimension(800, 800));
        panel2.setMinimumSize(new java.awt.Dimension(800, 800));
        panel2.setPreferredSize(new java.awt.Dimension(800, 800));
        panel2.setLayout(null);

        lblNuevoProfesional.setFont(new java.awt.Font("Levenim MT", 0, 65)); // NOI18N
        lblNuevoProfesional.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevoProfesional.setText("Nuevo Profesional");
        panel2.add(lblNuevoProfesional);
        lblNuevoProfesional.setBounds(149, 27, 530, 91);

        lblIconoNuevoProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png"))); // NOI18N
        panel2.add(lblIconoNuevoProfesional);
        lblIconoNuevoProfesional.setBounds(31, 27, 100, 100);

        lblNombre.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");
        panel2.add(lblNombre);
        lblNombre.setBounds(30, 180, 134, 38);

        lblApellido.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(255, 255, 255));
        lblApellido.setText("Apellido");
        panel2.add(lblApellido);
        lblApellido.setBounds(31, 223, 151, 38);

        txtNombre.setBackground(new java.awt.Color(227, 227, 227));
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombre.setMaximumSize(new java.awt.Dimension(6, 26));
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        panel2.add(txtNombre);
        txtNombre.setBounds(220, 180, 176, 38);

        txtApellido.setBackground(new java.awt.Color(227, 227, 227));
        txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtApellido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidoFocusLost(evt);
            }
        });
        panel2.add(txtApellido);
        txtApellido.setBounds(220, 230, 176, 33);

        lblTituloProfesional.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblTituloProfesional.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloProfesional.setText("Seleccione el título profesional");
        panel2.add(lblTituloProfesional);
        lblTituloProfesional.setBounds(31, 377, 446, 38);

        btnIngresarProfesionalASistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoConfirmar.png"))); // NOI18N
        btnIngresarProfesionalASistema.setBorderPainted(false);
        btnIngresarProfesionalASistema.setContentAreaFilled(false);
        btnIngresarProfesionalASistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarProfesionalASistemaActionPerformed(evt);
            }
        });
        panel2.add(btnIngresarProfesionalASistema);
        btnIngresarProfesionalASistema.setBounds(630, 650, 115, 94);

        lblPaisGraduacion.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblPaisGraduacion.setForeground(new java.awt.Color(255, 255, 255));
        lblPaisGraduacion.setText("Seleccione el pais de graduación");
        panel2.add(lblPaisGraduacion);
        lblPaisGraduacion.setBounds(31, 607, 497, 38);

        listaPaisGraduacion.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        listaPaisGraduacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaPaisGraduacionItemStateChanged(evt);
            }
        });
        panel2.add(listaPaisGraduacion);
        listaPaisGraduacion.setBounds(31, 663, 440, 31);

        listaTituloProfesional.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        listaTituloProfesional.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Ciencia de los alimentos", "Entrenador físico e instructor aeróbico", "Ingeniería en alimentos", "Licenciatura en nutrición", "Maestro de salud y educación física", "Medicina", "Nutrición Humana y Dietética", "Nutricionista", "Técnicatura en Gestión Gastronómica", "Técnicatura en tecnología de alimentos", "Técnico operador de alimentos", "Otro..." }));
        listaTituloProfesional.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaTituloProfesionalItemStateChanged(evt);
            }
        });
        panel2.add(listaTituloProfesional);
        listaTituloProfesional.setBounds(31, 421, 440, 31);

        lblFechaNac.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblFechaNac.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaNac.setText("Fecha de nacimiento");
        panel2.add(lblFechaNac);
        lblFechaNac.setBounds(31, 292, 338, 38);

        dateChooserFechaNacimiento.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooserFechaNacimiento.setFieldFont(new java.awt.Font("Century Gothic", java.awt.Font.PLAIN, 19));
    dateChooserFechaNacimiento.setMaxDate(new java.util.GregorianCalendar(2017, 10, 9));
    dateChooserFechaNacimiento.setMinDate(new java.util.GregorianCalendar(1917, 10, 1));
    panel2.add(dateChooserFechaNacimiento);
    dateChooserFechaNacimiento.setBounds(401, 292, 183, 38);

    btnIngresarFotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarFotoUsuario.png"))); // NOI18N
    btnIngresarFotoPerfil.setBorderPainted(false);
    btnIngresarFotoPerfil.setContentAreaFilled(false);
    btnIngresarFotoPerfil.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnIngresarFotoPerfilActionPerformed(evt);
        }
    });
    panel2.add(btnIngresarFotoPerfil);
    btnIngresarFotoPerfil.setBounds(579, 163, 158, 102);

    lblFechaGraduacion.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
    lblFechaGraduacion.setForeground(new java.awt.Color(255, 255, 255));
    lblFechaGraduacion.setText("Seleccione la fecha de graduación");
    panel2.add(lblFechaGraduacion);
    lblFechaGraduacion.setBounds(31, 489, 525, 38);

    dateChooserFechaGraduacion.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
dateChooserFechaGraduacion.setFieldFont(new java.awt.Font("Century Gothic", java.awt.Font.PLAIN, 19));
dateChooserFechaGraduacion.setMaxDate(new java.util.GregorianCalendar(2017, 10, 9));
dateChooserFechaGraduacion.setMinDate(new java.util.GregorianCalendar(1917, 10, 1));
panel2.add(dateChooserFechaGraduacion);
dateChooserFechaGraduacion.setBounds(31, 552, 183, 37);

lblValidarNombre.setForeground(new java.awt.Color(255, 255, 255));
lblValidarNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
panel2.add(lblValidarNombre);
lblValidarNombre.setBounds(420, 180, 32, 44);

lblValidarApellido.setForeground(new java.awt.Color(255, 255, 255));
lblValidarApellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
panel2.add(lblValidarApellido);
lblValidarApellido.setBounds(420, 220, 32, 44);

lblValidarTituloProfesional.setForeground(new java.awt.Color(255, 255, 255));
lblValidarTituloProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
panel2.add(lblValidarTituloProfesional);
lblValidarTituloProfesional.setBounds(490, 410, 32, 44);

lblValidarPaisGraduacion.setForeground(new java.awt.Color(255, 255, 255));
lblValidarPaisGraduacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png"))); // NOI18N
panel2.add(lblValidarPaisGraduacion);
lblValidarPaisGraduacion.setBounds(490, 660, 32, 44);

lblDatosIncorrectos.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
lblDatosIncorrectos.setForeground(new java.awt.Color(255, 153, 153));
lblDatosIncorrectos.setText("Aún quedan datos incorrectos");
panel2.add(lblDatosIncorrectos);
lblDatosIncorrectos.setBounds(330, 720, 312, 26);

lblNombreVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
lblNombreVacio.setForeground(new java.awt.Color(240, 128, 128));
lblNombreVacio.setText("Dato vacío");
panel2.add(lblNombreVacio);
lblNombreVacio.setBounds(460, 180, 134, 38);

lblTituloVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
lblTituloVacio.setForeground(new java.awt.Color(240, 128, 128));
lblTituloVacio.setText("Dato vacío");
panel2.add(lblTituloVacio);
lblTituloVacio.setBounds(530, 410, 134, 38);

lblPaisVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
lblPaisVacio.setForeground(new java.awt.Color(240, 128, 128));
lblPaisVacio.setText("Dato vacío");
panel2.add(lblPaisVacio);
lblPaisVacio.setBounds(530, 660, 120, 38);

lblApellidoVacio.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
lblApellidoVacio.setForeground(new java.awt.Color(240, 128, 128));
lblApellidoVacio.setText("Dato vacío");
panel2.add(lblApellidoVacio);
lblApellidoVacio.setBounds(460, 220, 134, 38);

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(layout.createSequentialGroup()
        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema unSistema) {
        this.sistema = unSistema;
    }

    public ImageIcon getFotoDePerfilActual() {
        return fotoDePerfilActual;
    }

    public void setFotoDePerfilActual(ImageIcon unaFoto) {
        this.fotoDePerfilActual = unaFoto;
    }

    public boolean getPrimeraVezEnSistema() {
        return primeraVez;
    }

    public void setPrimeraVezEnSistema(boolean primera) {
        this.primeraVez = primera;
    }

    private void btnIngresarProfesionalASistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarProfesionalASistemaActionPerformed
        String nombre = this.txtNombre.getText();
        String apellido = this.txtApellido.getText();
        String tituloProfesional = (String) this.listaTituloProfesional.getSelectedItem();
        String paisGraduacion = (String) this.listaPaisGraduacion.getSelectedItem();
        String fechaNacimiento = this.dateChooserFechaNacimiento.getText();
        String fechaGraduacion = this.dateChooserFechaGraduacion.getText();
        if (nombre.equals("") || apellido.equals("") || tituloProfesional.equals("Seleccione...") || paisGraduacion.equals("Seleccione...")) {
            this.lblDatosIncorrectos.setVisible(true);
            mostrarErrores(nombre, apellido, tituloProfesional, paisGraduacion);
        } else {
            this.lblDatosIncorrectos.setVisible(false);
            boolean seAgregoProfesional = this.getSistema().crearProfesional(nombre, apellido, fechaNacimiento, this.fotoDePerfilActual, tituloProfesional, fechaGraduacion, paisGraduacion);
            if (seAgregoProfesional) {
                this.txtNombre.setText("");
                this.txtApellido.setText("");
                VentanaMenuPrincipal vPrincipal = new VentanaMenuPrincipal(sistema);
                this.setVisible(false);
                vPrincipal.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnIngresarProfesionalASistemaActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        VentanaMenuPrincipal vPrincipal = new VentanaMenuPrincipal(sistema);
        this.setVisible(false);
        vPrincipal.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnIngresarFotoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarFotoPerfilActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter file = new FileNameExtensionFilter("PNG", "png");
        fileChooser.setFileFilter(file);
        fileChooser.setAcceptAllFileFilterUsed(false);
        int imagen = fileChooser.showOpenDialog(this);
        if (imagen == JFileChooser.APPROVE_OPTION) {
            ImageIcon iconoPerfil = new ImageIcon(fileChooser.getSelectedFile().getAbsolutePath());
            this.btnIngresarFotoPerfil.setIcon(iconoPerfil);
            this.fotoDePerfilActual = iconoPerfil;
        }
    }//GEN-LAST:event_btnIngresarFotoPerfilActionPerformed

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        String nombreIngresado = this.txtNombre.getText();
        if (nombreIngresado.equals("")) {
            this.lblValidarNombre.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarNombre.setVisible(true);
            this.lblNombreVacio.setVisible(true);
        } else {
            this.lblValidarNombre.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoCorrecto.png")));
            this.lblValidarNombre.setVisible(true);
            this.lblNombreVacio.setVisible(false);
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusLost
        String apellidoIngresado = this.txtApellido.getText();
        if (apellidoIngresado.equals("")) {
            this.lblValidarApellido.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarApellido.setVisible(true);
            this.lblApellidoVacio.setVisible(true);
        } else {
            this.lblValidarApellido.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoCorrecto.png")));
            this.lblValidarApellido.setVisible(true);
            this.lblApellidoVacio.setVisible(false);
        }
    }//GEN-LAST:event_txtApellidoFocusLost

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.sistema.guardarDatosSistema();
    }//GEN-LAST:event_formWindowClosing

    private void listaTituloProfesionalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaTituloProfesionalItemStateChanged
        String tituloIngresado = (String) this.listaTituloProfesional.getSelectedItem();
        if (tituloIngresado.equals("Seleccione...")) {
            this.lblValidarTituloProfesional.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarTituloProfesional.setVisible(true);
            this.lblTituloVacio.setVisible(true);
        } else {
            this.lblTituloVacio.setVisible(false);
            this.lblValidarTituloProfesional.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoCorrecto.png")));
            this.lblValidarTituloProfesional.setVisible(true);
        }
    }//GEN-LAST:event_listaTituloProfesionalItemStateChanged

    private void listaPaisGraduacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaPaisGraduacionItemStateChanged
        if (!this.primeraVez) {
            String paisGraduacionIngresado = (String) this.listaPaisGraduacion.getSelectedItem();
            if (paisGraduacionIngresado.equals("Seleccione...")) {
                this.lblValidarPaisGraduacion.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
                this.lblValidarPaisGraduacion.setVisible(true);
                this.lblPaisVacio.setVisible(true);
            } else {
                this.lblValidarPaisGraduacion.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoCorrecto.png")));
                this.lblValidarPaisGraduacion.setVisible(true);
                this.lblPaisVacio.setVisible(false);
            }
        }
    }//GEN-LAST:event_listaPaisGraduacionItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnIngresarFotoPerfil;
    private javax.swing.JButton btnIngresarProfesionalASistema;
    private datechooser.beans.DateChooserCombo dateChooserFechaGraduacion;
    private datechooser.beans.DateChooserCombo dateChooserFechaNacimiento;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblApellidoVacio;
    private javax.swing.JLabel lblDatosIncorrectos;
    private javax.swing.JLabel lblFechaGraduacion;
    private javax.swing.JLabel lblFechaNac;
    private javax.swing.JLabel lblIconoNuevoProfesional;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreVacio;
    private javax.swing.JLabel lblNuevoProfesional;
    private javax.swing.JLabel lblPaisGraduacion;
    private javax.swing.JLabel lblPaisVacio;
    private javax.swing.JLabel lblTituloProfesional;
    private javax.swing.JLabel lblTituloVacio;
    private javax.swing.JLabel lblTituloVentana;
    private javax.swing.JLabel lblValidarApellido;
    private javax.swing.JLabel lblValidarNombre;
    private javax.swing.JLabel lblValidarPaisGraduacion;
    private javax.swing.JLabel lblValidarTituloProfesional;
    private javax.swing.JComboBox<String> listaPaisGraduacion;
    private javax.swing.JComboBox<String> listaTituloProfesional;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void ocultarEtiquetas() {
        this.lblValidarNombre.setVisible(false);
        this.lblValidarApellido.setVisible(false);
        this.lblValidarTituloProfesional.setVisible(false);
        this.lblValidarPaisGraduacion.setVisible(false);
        this.lblDatosIncorrectos.setVisible(false);
        this.lblNombreVacio.setVisible(false);
        this.lblApellidoVacio.setVisible(false);
        this.lblTituloVacio.setVisible(false);
        this.lblPaisVacio.setVisible(false);
    }

    private void cargarListaPaisesGraduacion() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        ArrayList<String> paisesEnSistema = sistema.devolverListaPaises();
        this.listaPaisGraduacion.setModel(modelo);
        this.listaPaisGraduacion.addItem("Seleccione...");
        for (int i = 0; i < paisesEnSistema.size(); i++) {
            this.listaPaisGraduacion.addItem(paisesEnSistema.get(i));
        }
    }

    private void mostrarErrores(String nombre, String apellido, String tituloProfesional, String paisGraduacion) {
        if (nombre.equals("")) {
            this.lblValidarNombre.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarNombre.setVisible(true);
            this.lblNombreVacio.setVisible(true);
        }
        if (apellido.equals("")) {
            this.lblValidarApellido.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarApellido.setVisible(true);
            this.lblApellidoVacio.setVisible(true);
        }
        if (tituloProfesional.equals("Seleccione...")) {
            this.lblValidarTituloProfesional.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarTituloProfesional.setVisible(true);
            this.lblTituloVacio.setVisible(true);
        }
        if (paisGraduacion.equals("Seleccione...")) {
            this.lblValidarPaisGraduacion.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iconoCampoIncorrecto.png")));
            this.lblValidarPaisGraduacion.setVisible(true);
            this.lblPaisVacio.setVisible(true);
        }
    }

}
