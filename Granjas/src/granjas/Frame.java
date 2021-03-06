package granjas;
import com.toedter.calendar.JDateChooser;
import java.util.ArrayList;

public class Frame extends javax.swing.JFrame {

    public Frame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JDialog();
        JB_Registrar = new javax.swing.JButton();
        JB_Mostrar = new javax.swing.JButton();
        JB_Modificar = new javax.swing.JButton();
        JB_Eliminar = new javax.swing.JButton();
        JB_Exportar = new javax.swing.JButton();
        JButt_Session = new javax.swing.JButton();
        Eleccion = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        RegistrarAnimal = new javax.swing.JDialog();
        JButt_MenPrin = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        CalidadPez = new javax.swing.JComboBox<>();
        RazaPez = new javax.swing.JComboBox<>();
        FunciónPez = new javax.swing.JComboBox<>();
        CodigoPEz = new javax.swing.JFormattedTextField();
        DatePez = new com.toedter.calendar.JDateChooser();
        PesoPez = new javax.swing.JFormattedTextField();
        SavePez = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        RazaAve = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        FuncionAve = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        CodigoAve = new javax.swing.JFormattedTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        DateAve = new com.toedter.calendar.JDateChooser();
        PesoAve = new javax.swing.JFormattedTextField();
        SaveAve = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        EdadAve = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        RazaMami = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        FuncionMAmi = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        EdadMami = new javax.swing.JFormattedTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        DateMami = new com.toedter.calendar.JDateChooser();
        PesoMami = new javax.swing.JFormattedTextField();
        SaveMami = new javax.swing.JButton();
        CodigoMami = new javax.swing.JFormattedTextField();
        jFormattedTextField8 = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        Fondo2 = new javax.swing.JLabel();
        RegistrarPersona = new javax.swing.JDialog();
        JButt_MenPrin1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Fondo3 = new javax.swing.JLabel();
        RegistrarSiembra = new javax.swing.JDialog();
        JButt_MenPrin2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Fondo4 = new javax.swing.JLabel();
        RegistrarEmpaquetadora = new javax.swing.JDialog();
        JButt_MenPrin3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Fondo5 = new javax.swing.JLabel();
        RegistrarProcesadora = new javax.swing.JDialog();
        JButt_MenPrin4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Fondo6 = new javax.swing.JLabel();
        RyR = new javax.swing.JDialog();
        JButt_MenPrin5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Fondo7 = new javax.swing.JLabel();
        JButt_Ingresar = new javax.swing.JButton();
        JButt_Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TField_User = new javax.swing.JTextField();
        PW_Password = new javax.swing.JPasswordField();
        Fondo = new javax.swing.JLabel();

        Principal.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JB_Registrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JB_Registrar.setText("Registrar");
        JB_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_RegistrarActionPerformed(evt);
            }
        });
        Principal.getContentPane().add(JB_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 140, 50));

        JB_Mostrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JB_Mostrar.setText("Mostrar");
        Principal.getContentPane().add(JB_Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 140, 50));

        JB_Modificar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JB_Modificar.setText("Modificar");
        Principal.getContentPane().add(JB_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 140, 50));

        JB_Eliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JB_Eliminar.setText("Eliminar");
        Principal.getContentPane().add(JB_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 140, 50));

        JB_Exportar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JB_Exportar.setText("Exportar");
        Principal.getContentPane().add(JB_Exportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, 140, 50));

        JButt_Session.setBackground(new java.awt.Color(153, 0, 0));
        JButt_Session.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JButt_Session.setForeground(new java.awt.Color(153, 153, 153));
        JButt_Session.setText("Cerrar Sesion");
        JButt_Session.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButt_SessionActionPerformed(evt);
            }
        });
        Principal.getContentPane().add(JButt_Session, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 150, -1));

        Eleccion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Eleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personas", "Siembras", "Animales", "Empaquetadoras", "Procesadoras", "Registro y Reportes", "Usuarios" }));
        Principal.getContentPane().add(Eleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 180, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Menú Principal");
        Principal.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 270, 120));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/fondo.jpg"))); // NOI18N
        Principal.getContentPane().add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 706));

        RegistrarAnimal.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButt_MenPrin.setBackground(new java.awt.Color(153, 0, 0));
        JButt_MenPrin.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JButt_MenPrin.setForeground(new java.awt.Color(153, 153, 153));
        JButt_MenPrin.setText("Menú Principal");
        JButt_MenPrin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButt_MenPrinActionPerformed(evt);
            }
        });
        RegistrarAnimal.getContentPane().add(JButt_MenPrin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 160, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Raza");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 60, 50));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Función");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 100, 50));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Código");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 90, 50));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Nacimiento");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, 50));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Peso");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 60, 50));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Calidad");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, 50));

        CalidadPez.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CalidadPez.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baja", "Media", "Alta" }));
        jPanel1.add(CalidadPez, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 130, -1));

        RazaPez.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RazaPez.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tilapia", "Sardina", "Róbalo" }));
        jPanel1.add(RazaPez, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 130, -1));

        FunciónPez.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FunciónPez.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carne", "Reproducción" }));
        jPanel1.add(FunciónPez, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 130, -1));

        try {
            CodigoPEz.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(CodigoPEz, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 130, 30));
        jPanel1.add(DatePez, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 150, -1));

        PesoPez.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jPanel1.add(PesoPez, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 140, 30));

        SavePez.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Save.png"))); // NOI18N
        SavePez.setBorder(null);
        SavePez.setBorderPainted(false);
        SavePez.setContentAreaFilled(false);
        SavePez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavePezActionPerformed(evt);
            }
        });
        jPanel1.add(SavePez, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 70, 50));

        jTabbedPane1.addTab("PEZ", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Raza");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 60, 50));

        RazaAve.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RazaAve.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(RazaAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 130, -1));

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Función");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 100, 50));

        FuncionAve.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FuncionAve.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(FuncionAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 130, -1));

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Código");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 90, 50));

        try {
            CodigoAve.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(CodigoAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 130, 30));

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Peso");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 60, 50));

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("Nacimiento");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, 50));
        jPanel2.add(DateAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 150, -1));

        PesoAve.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jPanel2.add(PesoAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 140, 30));

        SaveAve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Save.png"))); // NOI18N
        SaveAve.setBorder(null);
        SaveAve.setBorderPainted(false);
        SaveAve.setContentAreaFilled(false);
        SaveAve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAveActionPerformed(evt);
            }
        });
        jPanel2.add(SaveAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, 70, 50));

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("Edad");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, 50));

        try {
            EdadAve.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(EdadAve, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 130, 30));

        jTabbedPane1.addTab("AVE", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("Edad");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, 50));

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("Raza");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 60, 50));

        RazaMami.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RazaMami.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(RazaMami, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 130, -1));

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("Función");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 100, 50));

        FuncionMAmi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FuncionMAmi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(FuncionMAmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 130, -1));

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Código");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 90, 50));

        try {
            EdadMami.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(EdadMami, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 130, 30));

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText("Peso");
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 60, 50));

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("Nacimiento");
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, 50));
        jPanel3.add(DateMami, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 150, -1));

        PesoMami.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jPanel3.add(PesoMami, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 140, 30));

        SaveMami.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Save.png"))); // NOI18N
        SaveMami.setBorder(null);
        SaveMami.setBorderPainted(false);
        SaveMami.setContentAreaFilled(false);
        SaveMami.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveMamiActionPerformed(evt);
            }
        });
        jPanel3.add(SaveMami, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, 70, 50));

        try {
            CodigoMami.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(CodigoMami, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 130, 30));

        try {
            jFormattedTextField8.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(jFormattedTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 130, 30));

        jTabbedPane1.addTab("MAMÍFERO", jPanel3);

        RegistrarAnimal.getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 800, 510));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Registrar Animal");
        RegistrarAnimal.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 90));

        Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/fondo.jpg"))); // NOI18N
        RegistrarAnimal.getContentPane().add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 706));

        RegistrarPersona.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButt_MenPrin1.setBackground(new java.awt.Color(153, 0, 0));
        JButt_MenPrin1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JButt_MenPrin1.setForeground(new java.awt.Color(153, 153, 153));
        JButt_MenPrin1.setText("Menú Principal");
        JButt_MenPrin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButt_MenPrin1ActionPerformed(evt);
            }
        });
        RegistrarPersona.getContentPane().add(JButt_MenPrin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 150, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Registrar Persona");
        RegistrarPersona.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 90));

        Fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/fondo.jpg"))); // NOI18N
        RegistrarPersona.getContentPane().add(Fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 706));

        RegistrarSiembra.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButt_MenPrin2.setBackground(new java.awt.Color(153, 0, 0));
        JButt_MenPrin2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JButt_MenPrin2.setForeground(new java.awt.Color(153, 153, 153));
        JButt_MenPrin2.setText("Menú Principal");
        JButt_MenPrin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButt_MenPrin2ActionPerformed(evt);
            }
        });
        RegistrarSiembra.getContentPane().add(JButt_MenPrin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 150, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Registrar Siembra");
        RegistrarSiembra.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 90));

        Fondo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/fondo.jpg"))); // NOI18N
        RegistrarSiembra.getContentPane().add(Fondo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 706));

        RegistrarEmpaquetadora.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButt_MenPrin3.setBackground(new java.awt.Color(153, 0, 0));
        JButt_MenPrin3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JButt_MenPrin3.setForeground(new java.awt.Color(153, 153, 153));
        JButt_MenPrin3.setText("Menú Principal");
        JButt_MenPrin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButt_MenPrin3ActionPerformed(evt);
            }
        });
        RegistrarEmpaquetadora.getContentPane().add(JButt_MenPrin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 150, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Registrar Empaquetadora");
        RegistrarEmpaquetadora.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 490, 90));

        Fondo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/fondo.jpg"))); // NOI18N
        RegistrarEmpaquetadora.getContentPane().add(Fondo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 706));

        RegistrarProcesadora.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButt_MenPrin4.setBackground(new java.awt.Color(153, 0, 0));
        JButt_MenPrin4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JButt_MenPrin4.setForeground(new java.awt.Color(153, 153, 153));
        JButt_MenPrin4.setText("Menú Principal");
        JButt_MenPrin4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButt_MenPrin4ActionPerformed(evt);
            }
        });
        RegistrarProcesadora.getContentPane().add(JButt_MenPrin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 150, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Registrar Procesadora");
        RegistrarProcesadora.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 90));

        Fondo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/fondo.jpg"))); // NOI18N
        RegistrarProcesadora.getContentPane().add(Fondo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 706));

        RyR.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButt_MenPrin5.setBackground(new java.awt.Color(153, 0, 0));
        JButt_MenPrin5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JButt_MenPrin5.setForeground(new java.awt.Color(153, 153, 153));
        JButt_MenPrin5.setText("Menú Principal");
        JButt_MenPrin5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButt_MenPrin5ActionPerformed(evt);
            }
        });
        RyR.getContentPane().add(JButt_MenPrin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 150, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Registro y R");
        RyR.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 90));

        Fondo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/fondo.jpg"))); // NOI18N
        RyR.getContentPane().add(Fondo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 706));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButt_Ingresar.setBackground(new java.awt.Color(0, 39, 68));
        JButt_Ingresar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        JButt_Ingresar.setForeground(new java.awt.Color(153, 153, 153));
        JButt_Ingresar.setText("Ingresar");
        JButt_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButt_IngresarActionPerformed(evt);
            }
        });
        getContentPane().add(JButt_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));

        JButt_Salir.setBackground(new java.awt.Color(153, 0, 0));
        JButt_Salir.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        JButt_Salir.setForeground(new java.awt.Color(153, 153, 153));
        JButt_Salir.setText("Salir");
        JButt_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButt_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(JButt_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Granjas el Tijuilote");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 430, 80));

        TField_User.setBackground(new java.awt.Color(75, 75, 75));
        TField_User.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TField_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TField_UserActionPerformed(evt);
            }
        });
        getContentPane().add(TField_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 130, -1));

        PW_Password.setBackground(new java.awt.Color(75, 75, 75));
        getContentPane().add(PW_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 130, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/fondo.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 477, 706));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ArrayList<Pez> ALPez = new ArrayList<>();
    ArrayList<Object> ALAve = new ArrayList<>();
    ArrayList<Object> ALMami = new ArrayList<>();
    ArrayList<Object> ALPersonas = new ArrayList<>();
    ArrayList<Object> ALEmpaquetadoras = new ArrayList<>();
    ArrayList<Object> ALProcesadoras = new ArrayList<>();
    ArrayList<Object> ALSiembra = new ArrayList<>();

    private void JButt_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButt_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JButt_SalirActionPerformed

    private void JButt_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButt_IngresarActionPerformed
        Principal.pack();
        Principal.setVisible(true);
        Principal.setLocationRelativeTo(this);
        this.setVisible(false);
    }//GEN-LAST:event_JButt_IngresarActionPerformed

    private void JButt_SessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButt_SessionActionPerformed
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(this);
        Principal.setVisible(false);
    }//GEN-LAST:event_JButt_SessionActionPerformed

    private void JButt_MenPrinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButt_MenPrinActionPerformed
        Principal.pack();
        Principal.setVisible(true);
        Principal.setLocationRelativeTo(this);
        RegistrarAnimal.setVisible(false);
    }//GEN-LAST:event_JButt_MenPrinActionPerformed

    private void JButt_MenPrin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButt_MenPrin1ActionPerformed
        Principal.pack();
        Principal.setVisible(true);
        Principal.setLocationRelativeTo(this);
        RegistrarPersona.setVisible(false);
    }//GEN-LAST:event_JButt_MenPrin1ActionPerformed

    private void JButt_MenPrin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButt_MenPrin2ActionPerformed
        Principal.pack();
        Principal.setVisible(true);
        Principal.setLocationRelativeTo(this);
        RegistrarSiembra.setVisible(false);
    }//GEN-LAST:event_JButt_MenPrin2ActionPerformed

    private void JButt_MenPrin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButt_MenPrin3ActionPerformed
        Principal.pack();
        Principal.setVisible(true);
        Principal.setLocationRelativeTo(this);
        RegistrarEmpaquetadora.setVisible(false);
    }//GEN-LAST:event_JButt_MenPrin3ActionPerformed

    private void JButt_MenPrin4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButt_MenPrin4ActionPerformed
        Principal.setVisible(true);
        Principal.pack();
        Principal.setLocationRelativeTo(this);
        RegistrarProcesadora.setVisible(false);
    }//GEN-LAST:event_JButt_MenPrin4ActionPerformed

    private void JButt_MenPrin5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButt_MenPrin5ActionPerformed
        Principal.setVisible(true);
        Principal.pack();
        Principal.setLocationRelativeTo(this);
        Principal.setVisible(false);
    }//GEN-LAST:event_JButt_MenPrin5ActionPerformed

    private void JB_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_RegistrarActionPerformed
        try {
            String temp = Eleccion.getSelectedItem().toString();
            System.out.println(temp);
            if (temp == "Personas") {
                RegistrarPersona.setVisible(true);
                RegistrarPersona.pack();
                RegistrarPersona.setLocationRelativeTo(this);
                Principal.setVisible(false);
            } else if (temp == "Siembras") {
                RegistrarSiembra.setVisible(true);
                RegistrarSiembra.pack();
                RegistrarSiembra.setLocationRelativeTo(this);
                Principal.setVisible(false);
            } else if (temp == "Animales") {
                RegistrarAnimal.setVisible(true);
                RegistrarAnimal.pack();
                RegistrarAnimal.setLocationRelativeTo(this);
                Principal.setVisible(false);
            } else if (temp == "Empaquetadoras") {
                RegistrarEmpaquetadora.setVisible(true);
                RegistrarEmpaquetadora.pack();
                RegistrarEmpaquetadora.setLocationRelativeTo(this);
                Principal.setVisible(false);
            } else if (temp == "Procesadoras") {
                RegistrarProcesadora.setVisible(true);
                RegistrarProcesadora.pack();
                RegistrarProcesadora.setLocationRelativeTo(this);
                Principal.setVisible(false);
            } else if (temp == "Usuarios") {
                /*Principal.setVisible(true);
                Principal.pack();
                Principal.setLocationRelativeTo(this);
                Principal.setVisible(false);*/
            } else if (temp == "Registro y Reportes") {
                /*Principal.setVisible(true);
                Principal.pack();
                Principal.setLocationRelativeTo(this);
                Principal.setVisible(false);*/
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_JB_RegistrarActionPerformed

    private void SavePezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavePezActionPerformed
        try {
            String Calidad = CalidadPez.getSelectedItem().toString(), 
                    Raza = RazaPez.getSelectedItem().toString(), 
                    Funcion = FunciónPez.getSelectedItem().toString();
            char[] Codigo = CodigoPEz.getText().toCharArray();
            JDateChooser Nacimiento = DatePez;
            float Peso = Float.parseFloat(PesoPez.getText());
            Pez temp = new Pez(Calidad, Raza, Funcion, Codigo, Nacimiento, Peso);
            ALPez.add(temp);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_SavePezActionPerformed

    private void SaveAveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAveActionPerformed
        try {
            int Edad = Integer.parseInt(EdadAve.getText());
            String Raza = RazaAve.getSelectedItem().toString(), 
                   Funcion = FuncionAve.getSelectedItem().toString();
            char[] Codigo = CodigoAve.getText().toCharArray();
            JDateChooser Nacimiento = DateAve;
            float Peso = Float.parseFloat(PesoAve.getText());
            Ave temp = new Ave(Edad, Raza, Funcion, Codigo, Nacimiento, Peso);
            ALAve.add(temp);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_SaveAveActionPerformed

    private void SaveMamiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveMamiActionPerformed
        try {
            int Edad = Integer.parseInt(EdadMami.getText());
            String Raza = RazaMami.getSelectedItem().toString(), 
                   Funcion = FuncionMAmi.getSelectedItem().toString();
            char[] Codigo = CodigoMami.getText().toCharArray();
            JDateChooser Nacimiento = DateMami;
            float Peso = Float.parseFloat(PesoMami.getText());
            Mamifero temp = new Mamifero(Edad, Raza, Funcion, Codigo, Nacimiento, Peso);
            ALMami.add(temp);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_SaveMamiActionPerformed

    private void TField_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TField_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TField_UserActionPerformed
    

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CalidadPez;
    private javax.swing.JFormattedTextField CodigoAve;
    private javax.swing.JFormattedTextField CodigoMami;
    private javax.swing.JFormattedTextField CodigoPEz;
    private com.toedter.calendar.JDateChooser DateAve;
    private com.toedter.calendar.JDateChooser DateMami;
    private com.toedter.calendar.JDateChooser DatePez;
    private javax.swing.JFormattedTextField EdadAve;
    private javax.swing.JFormattedTextField EdadMami;
    private javax.swing.JComboBox<String> Eleccion;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JLabel Fondo3;
    private javax.swing.JLabel Fondo4;
    private javax.swing.JLabel Fondo5;
    private javax.swing.JLabel Fondo6;
    private javax.swing.JLabel Fondo7;
    private javax.swing.JComboBox<String> FuncionAve;
    private javax.swing.JComboBox<String> FuncionMAmi;
    private javax.swing.JComboBox<String> FunciónPez;
    private javax.swing.JButton JB_Eliminar;
    private javax.swing.JButton JB_Exportar;
    private javax.swing.JButton JB_Modificar;
    private javax.swing.JButton JB_Mostrar;
    private javax.swing.JButton JB_Registrar;
    private javax.swing.JButton JButt_Ingresar;
    private javax.swing.JButton JButt_MenPrin;
    private javax.swing.JButton JButt_MenPrin1;
    private javax.swing.JButton JButt_MenPrin2;
    private javax.swing.JButton JButt_MenPrin3;
    private javax.swing.JButton JButt_MenPrin4;
    private javax.swing.JButton JButt_MenPrin5;
    private javax.swing.JButton JButt_Salir;
    private javax.swing.JButton JButt_Session;
    private javax.swing.JPasswordField PW_Password;
    private javax.swing.JFormattedTextField PesoAve;
    private javax.swing.JFormattedTextField PesoMami;
    private javax.swing.JFormattedTextField PesoPez;
    private javax.swing.JDialog Principal;
    private javax.swing.JComboBox<String> RazaAve;
    private javax.swing.JComboBox<String> RazaMami;
    private javax.swing.JComboBox<String> RazaPez;
    private javax.swing.JDialog RegistrarAnimal;
    private javax.swing.JDialog RegistrarEmpaquetadora;
    private javax.swing.JDialog RegistrarPersona;
    private javax.swing.JDialog RegistrarProcesadora;
    private javax.swing.JDialog RegistrarSiembra;
    private javax.swing.JDialog RyR;
    private javax.swing.JButton SaveAve;
    private javax.swing.JButton SaveMami;
    private javax.swing.JButton SavePez;
    private javax.swing.JTextField TField_User;
    private javax.swing.JFormattedTextField jFormattedTextField8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
