package ejercicio3;

import java.util.Random;
import javax.swing.JOptionPane;

public class Ejercicio3 extends javax.swing.JFrame {

    public Ejercicio3() {
        initComponents();
        //Se establece el valor en 'false'
        //al label que contiene el texto 'CURP GENERADA'
        lb_curp.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lb_curp = new javax.swing.JLabel();
        lb_curp_generada = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nombre_completo = new javax.swing.JTextField();
        cb_dia = new javax.swing.JComboBox<>();
        cb_mes = new javax.swing.JComboBox<>();
        cb_anio = new javax.swing.JComboBox<>();
        cb_entidad_federativa = new javax.swing.JComboBox<>();
        cbx_mujer = new javax.swing.JCheckBox();
        cbx_hombre = new javax.swing.JCheckBox();
        btn_generar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        lb_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trámite CURP_ITSSAT");
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio3/images/img_persona.png"))); // NOI18N
        jLabel2.setToolTipText("Imagen decorativa");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 90, 80));

        lb_curp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lb_curp.setForeground(new java.awt.Color(0, 0, 0));
        lb_curp.setText("CURP GENERADA");
        lb_curp.setToolTipText("");
        getContentPane().add(lb_curp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 140, -1));

        lb_curp_generada.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lb_curp_generada.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lb_curp_generada, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 290, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio3/images/img_nombre.png"))); // NOI18N
        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 110, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio3/images/img_calendar.png"))); // NOI18N
        jLabel5.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 196, 220, 20));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio3/images/img_ubicacion.png"))); // NOI18N
        jLabel6.setText("Lugar de nacimiento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 246, 220, 20));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio3/images/img_sexo.png"))); // NOI18N
        jLabel7.setText("Sexo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 296, 90, 20));

        txt_nombre_completo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txt_nombre_completo.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombre_completo.setToolTipText("Escribe tu nombre completo. Empezando por apellidos");
        getContentPane().add(txt_nombre_completo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 270, 20));

        cb_dia.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cb_dia.setForeground(new java.awt.Color(0, 0, 0));
        cb_dia.setMaximumRowCount(8);
        cb_dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cb_dia.setToolTipText("Selecciona el día");
        getContentPane().add(cb_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 50, -1));

        cb_mes.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cb_mes.setForeground(new java.awt.Color(0, 0, 0));
        cb_mes.setMaximumRowCount(8);
        cb_mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01 Enero", "02 Febrero", "03 Marzo", "04 Abril", "05 Mayo", "06 Junio", "07 Julio", "08 Agosto", "09 Septiembre", "10 Octubre", "11 Noviembre", "12 Diciembre" }));
        cb_mes.setToolTipText("Selecciona un mes");
        getContentPane().add(cb_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        cb_anio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cb_anio.setForeground(new java.awt.Color(0, 0, 0));
        cb_anio.setMaximumRowCount(8);
        cb_anio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" }));
        cb_anio.setSelectedIndex(100);
        cb_anio.setToolTipText("Selecciona un año");
        getContentPane().add(cb_anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        cb_entidad_federativa.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cb_entidad_federativa.setForeground(new java.awt.Color(0, 0, 0));
        cb_entidad_federativa.setMaximumRowCount(8);
        cb_entidad_federativa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AGUASCALIENTES", "BAJA CALIFORNIA NTE", "BAJA CALIFORNIA SUR", "CAMPECHE", "COAHUILA", "COLIMA", "CHIAPAS", "CHIHUAHUA", "DISTRITO FEDERAL", "DURANGO", "GUANAJUATO", "GUERRERO", "HIDALGO", "JALISCO", "MEXICO", "MICHOACAN", "MORELOS", "NAYARIT", "NUEVO LEON", "OAXACA", "PUEBLA", "QUERETARO", "QUINTANA ROO", "SAN LUIS POTOSI", "SINALOA", "SONORA", "TABASCO", "TAMAULIPAS", "TLAXCALA", "VERACRUZ", "YUCATAN", "ZACATECAS" }));
        cb_entidad_federativa.setToolTipText("Selecciona un estado");
        getContentPane().add(cb_entidad_federativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 230, -1));

        cbx_mujer.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cbx_mujer.setForeground(new java.awt.Color(0, 0, 0));
        cbx_mujer.setText("MUJER");
        cbx_mujer.setToolTipText("Selecciona tu sexo");
        cbx_mujer.setContentAreaFilled(false);
        cbx_mujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_mujerActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_mujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        cbx_hombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cbx_hombre.setForeground(new java.awt.Color(0, 0, 0));
        cbx_hombre.setText("HOMBRE");
        cbx_hombre.setToolTipText("Selecciona tu sexo");
        cbx_hombre.setContentAreaFilled(false);
        cbx_hombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_hombreActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_hombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

        btn_generar.setBackground(new java.awt.Color(88, 174, 255));
        btn_generar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_generar.setForeground(new java.awt.Color(0, 0, 0));
        btn_generar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio3/images/img_ok.png"))); // NOI18N
        btn_generar.setText("GENERAR");
        btn_generar.setToolTipText("Clic para generar tu CURP");
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 120, 50));

        btn_limpiar.setBackground(new java.awt.Color(88, 174, 255));
        btn_limpiar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(0, 0, 0));
        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio3/images/img_trash.png"))); // NOI18N
        btn_limpiar.setText("LIMPIAR");
        btn_limpiar.setToolTipText("Clic para limpiar los campos");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 120, 50));

        lb_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio3/images/img_fondo.png"))); // NOI18N
        getContentPane().add(lb_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_mujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_mujerActionPerformed
        //Si la casilla "MUJER" está seleccionada y también la casilla "HOMBRE"
        //la selección de "HOMBRE" será deseleccionada.
        if (cbx_hombre.isSelected()) 
            cbx_hombre.setSelected(false);
    }//GEN-LAST:event_cbx_mujerActionPerformed

    private void cbx_hombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_hombreActionPerformed
        //Si la casilla "HOMBRE" está seleccionada y también la casilla "MUJER"
        //la selección de "MUJER" será deseleccionada.
        if (cbx_mujer.isSelected())
            //Se establece el valor "true" al checkbox 'Mujer'
            cbx_mujer.setSelected(false);
    }//GEN-LAST:event_cbx_hombreActionPerformed

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed
        //Se crea un array unidimensional que tome el valor de nuestro TextField y separando los valores
        //mediante un split que toma los espacios en blanco
        String[] nombreSeparado = txt_nombre_completo.getText().toUpperCase().split(" ");
        //Identificadores de dia, mes y año, que van tomando los 2 primeros caracteres de las selecciones
        String dia = cb_dia.getSelectedItem().toString().substring(0, 2), //Toma los dos primeros caracteres
               mes = cb_mes.getSelectedItem().toString().substring(0, 2), //Toma los dos primeros caracteres
               anio = cb_anio.getSelectedItem().toString().substring(2, 4); //Tina los dos primeros caracteres
        //Llama al metodo 'getEntidadFederativa' metiendole un parámetro de entrada de tipo String
        String entidadFederativa = getEntidadFederativa(cb_entidad_federativa.getSelectedItem().toString()); 
        String sexo = getSexoSeleccionado(); //Se crea una variable de tipo String llamando al método 'getSexo()'
        //Se crea dos variables de tipo String que será en donde se vaya concatenando todo los datos obtenidos
        String PrimeraConsonante = new String(); 
        String CURP = new String();
        
        //Verificacion de si el campo de nombre tiene texto, si no tiene texto envia un mensaje
        //de error para que se llene este campo
        if (txt_nombre_completo.getText().isEmpty()) {
            //Envio de mensaje medianete JOptionPane
            JOptionPane.showMessageDialog(rootPane, 
                    "Por favor rellene el campo de nombre.",
                    "IMPORTANTE", 
                    JOptionPane.WARNING_MESSAGE);
            //Retorna para evitar que el programa siga corriendo.
            return;
        }
        //Verificación para ver si esta seleccionado una casilla de sexo
        //Si no hay ninguna casilla seleccionada, se envia el mensaje de error.
        if (sexo.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, 
                    "Por favor seleccione su sexo.", 
                    "IMPORTANTE", 
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //switch para tomar la cantidad de valores de nuestro array 'nombreSeparado'
        switch (nombreSeparado.length) {
            //Si la longitud de nombreSeparado es igual a 4, significa que la persona
            //Tiene 2 nombres propis
            case 4 -> {
                //Se toma la primera letra del primer apellido (H = hERNANDEZ)
                CURP += String.valueOf(nombreSeparado[2].charAt(0)); 
                //Se toma la primera vocal del primer apellido (E = HeRNANDEZ)
                CURP += getVocalAndConsonantes(2, nombreSeparado, "vocal");
                //Se agrega primera letra del apellido materno (S = SANTOS)
                CURP += String.valueOf(nombreSeparado[3].charAt(0));
                //Se toma la primera consonante del primer apellido (R = HErNANDEZ)
                PrimeraConsonante += getVocalAndConsonantes(2, nombreSeparado, "consonante");
                //Se toma la primera consonante del segundo apellido (N = SAnTOS)
                PrimeraConsonante += getVocalAndConsonantes(3, nombreSeparado, "consonante");
            }
            //Si la longitud de nombreSeparado es igual a 3, significa que la persona
            //tiene solo 1 nombre propio
            case 3 -> {
                //Se toma la primera letra del primer apellido (H = hERNANDEZ)
                CURP += String.valueOf(nombreSeparado[1].charAt(0));
                //Se toma la primera vocal del primer apellido (E = HeRNANDEZ)
                CURP += getVocalAndConsonantes(1, nombreSeparado, "vocal");
                //Se agrega primera letra del apellido materno (S = SANTOS)
                CURP += String.valueOf(nombreSeparado[2].charAt(0));
                //Se toma la primera consonante del primer apellido (R = HErNANDEZ)
                PrimeraConsonante += getVocalAndConsonantes(1, nombreSeparado, "consonante");
                //Se toma la primera consonante del segundo apellido (N = SAnTOS)
                PrimeraConsonante += getVocalAndConsonantes(2, nombreSeparado, "consonante");
            }
            //Acción por defecto en donde si no cumple con las propiedades adecuada
            //enviará un mensaje en donde se indica que escirba su nombre correctamente.
            default -> {
                JOptionPane.showMessageDialog(rootPane,
                        "El campo 'Nombre' no cumple con el formato pedido",
                        "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        //Se agrega primera letra del nombre propio (J = jONATHAN)
        CURP += String.valueOf(nombreSeparado[0].charAt(0));
        //Se agrega la primera consonante del nombre propio (N = JOnATHAN)
        PrimeraConsonante += getVocalAndConsonantes(0, nombreSeparado, "consonante");
        
        //Se concatena toda la información obtenida.
        //Se hace un llamado a la clase Random en donde genera un número aleatorio entre el 1 y 9.
        CURP += anio + mes + dia + sexo + entidadFederativa + PrimeraConsonante + "A" + new Random().nextInt(1, 9);
        
        //Se hace visible el label lb_curp que muestra el siguiente texto: 'CURP GENERADA'
        lb_curp.setVisible(true);
        //En el label que esta vacio se escribe el valor que se encuentra en la
        //variable CURP
        this.lb_curp_generada.setText(CURP);
    }//GEN-LAST:event_btn_generarActionPerformed

    //Este método sirve para limpiar todas las casillas y utilizar de nuevo el programa
    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        //Se hace una verificacion en donde si los campos de nombre y sexo estan vacios, no ejecutaran
        //nada, por que no hay nada que limpiar.
        if (txt_nombre_completo.getText().isEmpty() || getSexoSeleccionado().isEmpty()) {
            //Mensaje de error avisando que no hay nada que limpiar
            JOptionPane.showMessageDialog(rootPane, "No hay cosas por limpiar!!", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //Se establecen los valores a null
        txt_nombre_completo.setText("");
        cb_dia.setSelectedIndex(0);
        cb_mes.setSelectedIndex(0);
        cb_anio.setSelectedIndex(0);
        cb_entidad_federativa.setSelectedIndex(0);
        cbx_mujer.setSelected(false);
        cbx_hombre.setSelected(false);
        lb_curp_generada.setText("");
        lb_curp.setVisible(false);
    }//GEN-LAST:event_btn_limpiarActionPerformed

    //Método que obtiene si las palabras son consonantes o vocales
    //contiene 3 parametros de entrada, el primero de tipo int, el segundo un array unidimensional 
    //y el último de tipo string
    public String getVocalAndConsonantes(int posicion, String[] formato, String tipo) {
        //Si el valor de 'tipo' es consonante, entonces solo obtendrá las letras 
        //que sean consonantes de una palabra
         if (tipo.matches("consonante")) {
            for (int i=1;i<formato[posicion].length();i++) { //La posición que se encuentra los apellidos
                if (!esVocal(formato[posicion].charAt(i))) { //verifica si las letras no son vocales (consonantes)
                    return String.valueOf(formato[posicion].charAt(i));//retorna el valor obtenido
                }
            }
        }//Si el valor de 'tipo' es vocal, entonces solo obtendrá las letras
         //que sean vocales de una palabra
        if (tipo.matches("vocal")) {
            for (int i=1;i<formato[posicion].length()-1;i++) {
                if (esVocal(formato[posicion].charAt(i))) {
                     return String.valueOf(formato[posicion].charAt(i));//retorna el valor obtenido
                }
            }
        }
        return "";//retorna un campo vacio si no se cumple lo anterior.
    }
    
    //Método en donde se verifica si el caracter ingresado es
    //vocal y lo retorna en mayúsculas
    public boolean esVocal(char caracter) {
        return "aeiou".contains(String.valueOf(caracter).toLowerCase());
    }
    
    //Método que obtiene que casilla esta seleccionada
    private String getSexoSeleccionado() {
        //Si la casilla mujer esta seleccionada
        //retornará una M
        if (cbx_mujer.isSelected()) {
            return "M";
        //Si la casilla hombre esta seleccionada
        //retornara una H
        } else if (cbx_hombre.isSelected()) {
            return "H";
        }
        //Si ninguno de los dos valores anteriores se cumple
        //retornara un campo vacio
        return "";
    }
    
    //Método que obtiene del combo box el valor seleccionado
    //y dependiendo el valor, retornara un valor establecido.
    private String getEntidadFederativa(String entidad) {
        //Obtiene el valor asignado y lo traspasa a mayúsculas
        //para que el valor coincida con los ya establecidos
        String enti = entidad.toUpperCase();
        return switch (enti) {
            case "AGUASCALIENTES" -> "AS";
            case "BAJA CALIFORNIA NTE" -> "BC";
            case "BAJA CALIFORNIA SUR" -> "BS";
            case "CAMPECHE" -> "CC";
            case "COAHUILA" -> "CL";
            case "COLIMA" -> "CM";
            case "CHIAPAS" -> "CS";
            case "CHIHUAHUA" -> "CH";
            case "DISTRITO FEDERAL" -> "DF";
            case "DURANGO" -> "DG";
            case "GUANAJUATO" -> "GT";
            case "GUERRERO" -> "GR";
            case "HIDALGO" -> "HG";
            case "JALISCO" -> "JC";
            case "MEXICO" -> "MC";
            case "MICHOACAN" -> "MN";
            case "MORELOS" -> "MS";
            case "NAYARIT" -> "NT";
            case "NUEVO LEON" -> "NL";
            case "OAXACA" -> "OC";
            case "PUEBLA" -> "PL";
            case "QUERETARO" -> "QT";
            case "QUINTANA ROO" -> "QR";
            case "SAN LUIS POTOSI" -> "SP";
            case "SINALOA" -> "SL";
            case "SONORA" -> "SR";
            case "TABASCO" -> "TC";
            case "TAMAULIPAS" -> "TS";
            case "TLAXCALA" -> "TL";
            case "VERACRUZ" -> "VZ";
            case "YUCATAN" -> "YN";
            case "ZACATECAS" -> "ZS";
            default -> "NE";
        };
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Ejercicio3().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_generar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JComboBox<String> cb_anio;
    private javax.swing.JComboBox<String> cb_dia;
    private javax.swing.JComboBox<String> cb_entidad_federativa;
    private javax.swing.JComboBox<String> cb_mes;
    private javax.swing.JCheckBox cbx_hombre;
    private javax.swing.JCheckBox cbx_mujer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lb_curp;
    private javax.swing.JLabel lb_curp_generada;
    private javax.swing.JLabel lb_fondo;
    private javax.swing.JTextField txt_nombre_completo;
    // End of variables declaration//GEN-END:variables
}