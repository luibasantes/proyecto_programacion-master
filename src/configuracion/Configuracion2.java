package configuracion;
import Adicionales.Abrir_xml;
import static Directorio.CarDir.strRuta;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class Configuracion2 extends javax.swing.JInternalFrame {
    public static List<JCheckBox> checkTags = new ArrayList<>();
    public static List<String> strTags = new ArrayList<>();
    public static List<String> strTagsConf = new ArrayList<>();
    public static String rutaDeEscrituraDirectorio;
    public String rutaPlantillaSeleccionada;
    //public static String rutaDeLecturaDirectorio;
    public static String rutaPlantilla;
    public List <String> nombres;
    public List <String> archivos;
    public Configuracion2() {
        initComponents();
        archivos = new ArrayList<>();          
        nombres = new ArrayList<>(); 
        //rutXls.setText("XMLs/configuracion/factura/configuracion.xml");
        //checkEtiquetasXml();
        System.out.print(""); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Guardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        togBut = new javax.swing.JToggleButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        rutXml = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        rutXls = new javax.swing.JTextField();
        Buscar2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Personalizar");

        Guardar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Guardar.setMnemonic('g');
        Guardar.setText("Guardar Rutas");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        panel.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane2.setViewportView(panel);

        jButton1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton1.setText("Cargar Plantilla...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        togBut.setText("Marcar Todo");
        togBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togButActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Facturas", "Retención", "Nota de Débito", "Nota de Crédito" }));
        jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox1FocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ruta XML:");

        jButton2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ruta XLS:");

        Buscar2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Buscar2.setText("...");
        Buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton3.setText("Guardar Plantilla...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rutXls)
                                    .addComponent(rutXml, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Buscar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(togBut)
                                    .addComponent(jButton3)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(togBut, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rutXml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rutXls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Buscar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Guardar)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        try {
            guardarRutas();
             checkTags.clear();      //Limpiamos al lista 
             panel.removeAll();      //limpiamos el panely
             
            //guardarNuevo();
            //etiquetasSel();
     //       generarXLS();
            //dispose();
        } catch (SAXException ex) {
            Logger.getLogger(Configuracion2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Configuracion2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Configuracion2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(Configuracion2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void togButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togButActionPerformed
        if(togBut.isSelected()){
        for(int i=0; i<checkTags.size(); i++)
        {
          togBut.setText("Desmarcar Todo");
        checkTags.get(i).setSelected(true);
        }
        } else{
        
        for(int i=0; i<checkTags.size(); i++)
        {
        togBut.setText("Marcar Todo");
        checkTags.get(i).setSelected(false);
        }
        }
    }//GEN-LAST:event_togButActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            //abrirPlantilla();
            readXML();
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Configuracion2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(Configuracion2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Configuracion2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusLost
//       if (jComboBox1.getSelectedItem().equals("Facturas")) {
//               rutXls.setText("XMLs/configuracion/factura/configuracion.xml");
//            }else if (jComboBox1.getSelectedItem().equals("Retención")) {
//                rutXls.setText("XMLs/configuracion/retencion/configuracion.xml");
//            }else if (jComboBox1.getSelectedItem().equals("Nota de Débito")) {
//              rutXls.setText("XMLs/configuracion/notadebito/configuracion.xml");
//            }else if (jComboBox1.getSelectedItem().equals("Nota de Crédito")) {
//               rutXls.setText("XMLs/configuracion/notacredito/configuracion.xml");
//       }
    }//GEN-LAST:event_jComboBox1FocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        buscarDirectorio();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar2ActionPerformed
        asignarDirectorio();
    }//GEN-LAST:event_Buscar2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            guardarTxt();
        } catch (IOException ex) {
            Logger.getLogger(Configuracion2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar2;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel;
    public static javax.swing.JTextField rutXls;
    public static javax.swing.JTextField rutXml;
    private javax.swing.JToggleButton togBut;
    // End of variables declaration//GEN-END:variables

    
    private void buscarDirectorio(){ 
            JFileChooser buscarDirectorioFileChooser=new JFileChooser();
            buscarDirectorioFileChooser.setDialogTitle("Buscar directorio");
            buscarDirectorioFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

            if (buscarDirectorioFileChooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION)
            {
                String rutaDeLecturaDirectorio=buscarDirectorioFileChooser.getSelectedFile().getPath();
                rutXml.setText(rutaDeLecturaDirectorio);
            }    
    }
    private void buscarPlantilla(){ 
            JFileChooser buscarDirectorioFileChooser=new JFileChooser();
            buscarDirectorioFileChooser.setDialogTitle("Buscar directorio");
            //buscarDirectorioFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            rutaPlantilla="";
            if (buscarDirectorioFileChooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION)
            {
                String rutaDeLecturaDirectorio=buscarDirectorioFileChooser.getSelectedFile().getPath();
                rutaPlantilla = rutaDeLecturaDirectorio;
                 try
        { 
            File xmlDocument=null;
                xmlDocument = new File(rutaDeLecturaDirectorio); //Crea el objeto directorio de tipo File a partir del valor de pathname.
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlDocument);
             Element raiz = document.getDocumentElement();
            //Obtener la lista de nodos que tienen etiqueta "EMPLEADO"
    NodeList listaEmpleados = raiz.getElementsByTagName("*");
    //Recorrer la lista de empleados
    for(int i=0; i<listaEmpleados.getLength(); i++) {   
        //Obtener de la lista un empleado tras otro
        Node empleado = listaEmpleados.item(i);
        //System.out.println("Parametrizacion ");
        //System.out.println("==========");    

        //Obtener la lista de los datos que contiene ese empleado
        NodeList datosEmpleado = empleado.getChildNodes();
        //Recorrer la lista de los datos que contiene el empleado
        for(int j=0; j<datosEmpleado.getLength(); j++) {
            //Obtener de la lista de datos un dato tras otro
            Node dato = datosEmpleado.item(j);
if (dato.getNodeValue().contains("si")) {
                    //Se checkea con si
                    checkTags.get(i).setSelected(true);
                        }else{
                            //se checkea con no
                          checkTags.get(i).setSelected(false);
                        }
        }
    }   
        }catch (IOException e) 
        {
         System.out.println("IOException " + e.getMessage());
        } 
        catch (ParserConfigurationException e) 
        {
         System.out.println("ParserConfigurationException " + e.getMessage());
        } 
        catch (SAXException e) 
        {
         System.out.println("SAXException " + e.getMessage());
        }
                //rutXml.setText(rutaDeLecturaDirectorio);
            }    
    }
    private void asignarDirectorio(){
            JFileChooser buscarDirectorioFileChooser=new JFileChooser();
            buscarDirectorioFileChooser.setDialogTitle("Asignar directorio");
            buscarDirectorioFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

            if (buscarDirectorioFileChooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION)
            {
                rutaDeEscrituraDirectorio=buscarDirectorioFileChooser.getSelectedFile().getPath();
                rutXls.setText(rutaDeEscrituraDirectorio);
            }     
    }
    
    private void checkEtiquetasXml() 
    {
        try
        {
            String ext="";
            JFileChooser buscarDirectorioFileChooser=new JFileChooser();
            buscarDirectorioFileChooser.setDialogTitle("Buscar directorio");
            
            //buscarDirectorioFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            rutaPlantilla="";
            if (buscarDirectorioFileChooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION)
            {
                String rutaDeLecturaDirectorio=buscarDirectorioFileChooser.getSelectedFile().getPath();
                rutaPlantilla = rutaDeLecturaDirectorio;
                rutaPlantillaSeleccionada =rutaPlantilla;
                 ext = rutaPlantilla.substring(rutaPlantilla.lastIndexOf(".") + 1, rutaPlantilla.length());
            }
            File xmlDocument = new File(rutaPlantilla); //Crea el objeto directorio de tipo File a partir del valor de pathname.
            //File xmlDocument = null;
//              if (jComboBox1.getSelectedItem().equals("Facturas")) {
//               xmlDocument = new File("XMLs/configuracion/factura/configuracion.xml"); //Crea el objeto directorio de tipo File a partir del valor de pathname.
//            }else if (jComboBox1.getSelectedItem().equals("Retención")) {
//                xmlDocument = new File("XMLs/configuracion/retencion/configuracion.xml"); //Crea el objeto directorio de tipo File a partir del valor de pathname.
//            }else if (jComboBox1.getSelectedItem().equals("Nota de Débito")) {
//              xmlDocument = new File("XMLs/configuracion/notadebito/configuracion.xml"); //Crea el objeto directorio de tipo File a partir del valor de pathname.
//            }else if (jComboBox1.getSelectedItem().equals("Nota de Crédito")) {
//               xmlDocument = new File("XMLs/configuracion/notacredito/configuracion.xml"); //Crea el objeto directorio de tipo File a partir del valor de pathname.
//       }
           //File ruta = new File(strRut+"\\"+buscarDirectorioFileChooser.getSelectedFile().getName()); //Obtenemos carpeta seleccionada
            if (ext.equals("xml")) {
//                InputStream inputStream= new FileInputStream(xmlDocument);
//Reader reader = new InputStreamReader(inputStream,"UTF-8");
//InputSource is = new InputSource(reader);
//is.setEncoding("UTF-8");
//saxParser.parse(is, handler);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlDocument);
            NodeList nodeList = document.getElementsByTagName("*");

             checkTags.clear();      //Limpiamos al lista 
             panel.removeAll();      //limpiamos el panely
             String tipo = "";
            for (int i = 0; i < nodeList.getLength(); i++)         
            {   
               // if (nodeList.item(i).getNodeName().equals("Listas") || nodeList.item(i).getNodeName().equals("Lista") || nodeList.item(i).getNodeName().equals("Tipos") || nodeList.item(i).getNodeName().equals("Tipo")) {
                 //   if (nodeList.item(i).getNodeName().equals("Tipo")) {
                        Node nodeTipo = nodeList.item(i);
                        NodeList datosTipo = nodeTipo.getChildNodes();
                        System.out.println(datosTipo.item(0).getNodeValue());
//                        tipo=datosTipo.item(0).getNodeValue();
//                        if (!datosTipo.item(0).getNodeValue().equals(jComboBox1.getSelectedItem())) {
//                            JOptionPane.showMessageDialog(null, "Seleccione una plantilla del mismo tipo seleccionado.");
//                            break;
//                        }
//                    }
//                }else{
//                    if (!tipo.equals("")) {
                      JCheckBox jCheckBox1= new JCheckBox(nodeList.item(i).getNodeName());
                        checkTags.add(jCheckBox1);
                        panel.add(jCheckBox1).revalidate();
                for (int j = 0; j <= datosTipo.getLength(); j++) {
                      JCheckBox jCheckBox= new JCheckBox(nodeList.item(j).getNodeName());
                        //System.out.println(nodeList.item(i));
                        //System.out.println(nodeList.item(i).getNodeName());
                        checkTags.add(jCheckBox);
                        panel.add(jCheckBox).revalidate();
                }
 
                      
                    //}else{
                      //      JOptionPane.showMessageDialog(null, "Seleccione una plantilla del mismo tipo seleccionado.");
                        //    break;
                    
                    //}
                
              //  }
                
            }
            }else{
               JOptionPane.showMessageDialog(null, "Seleccione una plantilla .xml");
            }
        }
            catch (IOException e) 
        {
         System.out.println("IOException " + e.getMessage());
        } 
        catch (ParserConfigurationException e) 
        {
         System.out.println("ParserConfigurationException " + e.getMessage());
        } 
        catch (SAXException e) 
        {
            e.printStackTrace();
         System.out.println("SAXException " + e.getMessage());
        }

    }
    
    private void etiquetasSel(){
        strTags.clear();
        for (JCheckBox checkBox : checkTags) {
            strTagsConf.add(checkBox.getText());
            if (checkBox.isSelected()) {
                strTags.add(checkBox.getText());
            }
        }
    }
   private void abrirPlantilla() 
    {
        try
        { 
//            File xmlDocument=null;
//            if (jComboBox1.getSelectedItem().equals("Facturas")) {
//                xmlDocument = new File("XMLs/plantillas/factura/plantilla.xml"); //Crea el objeto directorio de tipo File a partir del valor de pathname.
//            }else if (jComboBox1.getSelectedItem().equals("Retención")) {
//                xmlDocument = new File("XMLs/plantillas/retencion/plantilla.xml"); //Crea el objeto directorio de tipo File a partir del valor de pathname.
//            }else if (jComboBox1.getSelectedItem().equals("Nota de Débito")) {
//                xmlDocument = new File("XMLs/plantillas/notadebito/plantilla.xml"); //Crea el objeto directorio de tipo File a partir del valor de pathname.
//            }else if (jComboBox1.getSelectedItem().equals("Nota de Crédito")) {
//                xmlDocument = new File("XMLs/plantillas/notacredito/plantilla.xml"); //Crea el objeto directorio de tipo File a partir del valor de pathname.
//            }
             String ext="";
            JFileChooser buscarDirectorioFileChooser=new JFileChooser();
            buscarDirectorioFileChooser.setDialogTitle("Buscar directorio");
            
            //buscarDirectorioFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            rutaPlantilla="";
            if (buscarDirectorioFileChooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION)
            {
                String rutaDeLecturaDirectorio=buscarDirectorioFileChooser.getSelectedFile().getPath();
                rutaPlantilla = rutaDeLecturaDirectorio;
                rutaPlantillaSeleccionada =rutaPlantilla;
                 ext = rutaPlantilla.substring(rutaPlantilla.lastIndexOf(".") + 1, rutaPlantilla.length());
            }
            File xmlDocument = new File(rutaPlantilla);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlDocument);
             Element raiz = document.getDocumentElement();
            //Obtener la lista de nodos que tienen etiqueta "EMPLEADO"
    NodeList listaEmpleados = raiz.getElementsByTagName("*");
    //Recorrer la lista de empleados
    for(int i=0; i<listaEmpleados.getLength(); i++) {   
        //Obtener de la lista un empleado tras otro
        Node empleado = listaEmpleados.item(i);
        //System.out.println("Parametrizacion ");
        //System.out.println("==========");    

        //Obtener la lista de los datos que contiene ese empleado
        NodeList datosEmpleado = empleado.getChildNodes();
        //Recorrer la lista de los datos que contiene el empleado
        //JCheckBox jCheckBox1= new JCheckBox(datosEmpleado.item(i).getNodeName());
                        //checkTags.add(jCheckBox1);
                        //panel.add(jCheckBox1).revalidate();
        for(int j=0; j<datosEmpleado.getLength(); j++) {
            //Obtener de la lista de datos un dato tras otro
            Node dato = datosEmpleado.item(j);
             JCheckBox jCheckBox2= new JCheckBox(dato.getNodeName());
                        checkTags.add(jCheckBox2);
                        panel.add(jCheckBox2).revalidate();
if (dato.getNodeValue().contains("si")) {
                    //Se checkea con si
                    checkTags.get(j).setSelected(true);
                        }else{
                            //se checkea con no
                          checkTags.get(j).setSelected(false);
                        }
        }
    }   
        }catch (IOException e) 
        {
         System.out.println("IOException " + e.getMessage());
        } 
        catch (ParserConfigurationException e) 
        {
         System.out.println("ParserConfigurationException " + e.getMessage());
        } 
        catch (SAXException e) 
        {
         System.out.println("SAXException " + e.getMessage());
        }

    }
private void guardarNuevo() throws SAXException, ParserConfigurationException, IOException, TransformerConfigurationException, TransformerException 
    {
        String rutaXml="";
        String filepath = "";
                if (rutaPlantilla==null || rutaPlantilla.isEmpty()) {
                filepath ="XMLs/configuracion/factura/configuracion.xml";
        }else{
                 filepath =rutaPlantilla;
                }
                
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = docBuilder.parse(filepath);
                 Element raiz = doc.getDocumentElement();
		// Get the root element
		Node company = doc.getFirstChild();

		// Get the staff element , it may not working if tag has spaces, or
		// whatever weird characters in front...it's better to use
		// getElementsByTagName() to get it directly.
		 //Node staff = company.getFirstChild();

		// loop the staff child node
		NodeList list = raiz.getElementsByTagName("*");
		for (int i = 0; i < list.getLength(); i++) {
                   Node node= list.item(i);
                    if (checkTags.get(i).isSelected()) {
                        node.setTextContent("si");
                    }else{
                        node.setTextContent("no");
                    }
		}
		// write the content into xml file
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(rutXml.getText()+"\\Sheet.xml");
		transformer.transform(source, result);
                JOptionPane.showMessageDialog(null, "Transaccion Exitosa");		
//System.out.println("Done");
	   }
private void rutaSel()
    {
      strRuta.clear();
    for (JCheckBox checkBox : checkTags) {
     //   if (checkBox.isSelected()) {
            strRuta.add(checkBox.getText());
      // }
    }
    }

 //Esta funcion recibe el nombre del comprobante seleccionado, la ruta del directorio actual
    //un arreglo con los nombre de los archivos contenidos por el directorio seleccionado y 
    //el JFrame "Abrir_xml" en donde se agregaran los nombres de los archivos a convertir
    /*
        Se abre uno por uno los archivos existentes en el directorio
        para buscar la etiqueta del comprobante que se ha seleccionado
        para posteriormente agregar el nombre del archivo en el JPanel
    */
    private int abrirArcXml(String opcion, File ruta, File[] contenido, Abrir_xml Abrir) {
        int contador=0;
        try{
            for (File archivo_n : contenido) {
                //realizamos recorrido de los archivos
                File fileXML = new File(ruta+"\\"+archivo_n.getName()); //cargamos el contenido del n-ésimo contenido
                if (fileXML.isFile() && archivo_n.getName().toLowerCase().endsWith(".xml")) {//Nos aseguramos que sea un archivo xml
                    // Definimos una nueva instancia de un API para generar arbol XML
                    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                    // Definimos nuevo arbol XML
                    DocumentBuilder builder = factory.newDocumentBuilder();
                    // Representamos el archivo XML especificado en el arbol
                    Document document = builder.parse(fileXML);
                    // SI no se encuentra la etiqueta <comprobante>  --> (documento sin autorizacion)
                    if (document.getElementsByTagName("Tipos").getLength() == 0) { //considerar esta parte del codigo para los filtros
                        // SI se encuentra una etiqueta con el nombre del comprobante seleccionado
                        if (document.getElementsByTagName(opcion).getLength()!=0) {
                           
                            contador++; // Incrementamos la cuenta de los archivos encontrados
                        }
                        
                    } 
                    
                }
            }
        }
        catch (IOException e) { System.out.println(e.getMessage()); }
        catch (ParserConfigurationException e) { System.out.println("ParserConfigurationException " + e.getMessage()); } 
        catch (SAXException e) { System.out.println("SAXException " + e.getMessage()); }  
        Abrir.tipo_comprobante = opcion;
        return contador;
    }
    public void guardarRutas() throws SAXException, ParserConfigurationException, IOException, TransformerConfigurationException, TransformerException{
                DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = docBuilder.parse("XMLs/Parametrizacion/parametrizacion.xml");
                 Element raiz = doc.getDocumentElement();
		// Get the root element
		Node company = doc.getFirstChild();

		// Get the staff element , it may not working if tag has spaces, or
		// whatever weird characters in front...it's better to use
		// getElementsByTagName() to get it directly.
		 //Node staff = company.getFirstChild();

		// loop the staff child node
		NodeList list = raiz.getElementsByTagName("*");
		for (int i = 0; i < list.getLength(); i++) {
                   Node node= list.item(i);
                    if (node.getNodeName().equals("rutaXml")) {
                        if (!rutXml.getText().isEmpty()) {
                             node.setTextContent(rutXml.getText());
                        }
                    }else if(node.getNodeName().equals("rutaXls")) {
                    if (!rutXls.getText().isEmpty()) {
                             node.setTextContent(rutXls.getText());
                        }
                    }
                }
                        
		// write the content into xml file
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult("XMLs/Parametrizacion/parametrizacion.xml");
		transformer.transform(source, result);
                JOptionPane.showMessageDialog(null, "Transaccion Exitosa");
    }
    public void guardarPlantilla() throws ParserConfigurationException, SAXException, TransformerConfigurationException, TransformerException, IOException{
            JFileChooser buscarDirectorioFileChooser=new JFileChooser();
            buscarDirectorioFileChooser.setDialogTitle("Buscar directorio");
            buscarDirectorioFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            buscarDirectorioFileChooser.setApproveButtonText("Guardar");
            String rutaPlantilla2="";
            if (buscarDirectorioFileChooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION)
            {
                String rutaDeLecturaDirectorio=buscarDirectorioFileChooser.getSelectedFile().getPath();
                rutaPlantilla2 = rutaDeLecturaDirectorio;
            }
          DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
          //  DOMImplementation implementation = builder.getDOMImplementation();
            String name =jComboBox1.getSelectedItem().toString();//+" - " + new Date();
            Document document = builder.newDocument();
            
            Element rootElement = document.createElement("Listas");
		document.appendChild(rootElement);
                
            Element staffTipo = document.createElement("Tipos");
		rootElement.appendChild(staffTipo);
// firstname elements
		Element firstnameTipo = document.createElement("Tipo");
		firstnameTipo.appendChild(document.createTextNode(jComboBox1.getSelectedItem().toString()));
		staffTipo.appendChild(firstnameTipo);

                // staff elements
		Element staff = document.createElement("Lista");
		rootElement.appendChild(staff);

                for(int i=0; i<checkTags.size();i++){
                    if (checkTags.get(i).isSelected()) {
                        Element firstname = document.createElement(checkTags.get(i).getText());
                        firstname.appendChild(document.createTextNode("si"));
                        staff.appendChild(firstname);
                    }else{
                     Element firstname = document.createElement(checkTags.get(i).getText());
                        firstname.appendChild(document.createTextNode("no"));
                        staff.appendChild(firstname);
                    }
                }
            //Indicamos donde lo queremos almacenar
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File(rutaPlantilla2+"\\"+name + ".xml")); //nombre del archivo
            StreamResult result2 =  new StreamResult(System.out);
            transformer.transform(source, result); 
            JOptionPane.showMessageDialog(null, "Transaccion Exitosa");		
    
    }
    public void readXML() throws ParserConfigurationException, SAXException, IOException{
        String ext="";
            JFileChooser buscarDirectorioFileChooser=new JFileChooser();
            buscarDirectorioFileChooser.setDialogTitle("Buscar directorio");
            if (rutaPlantillaSeleccionada!=null) {
            buscarDirectorioFileChooser.setCurrentDirectory(new File(rutaPlantillaSeleccionada));
        }
            //buscarDirectorioFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            rutaPlantilla="";
            if (buscarDirectorioFileChooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION)
            {
                String rutaDeLecturaDirectorio=buscarDirectorioFileChooser.getSelectedFile().getPath();
                rutaPlantilla = rutaDeLecturaDirectorio;
                rutaPlantillaSeleccionada =rutaPlantilla;
                 ext = rutaPlantilla.substring(rutaPlantilla.lastIndexOf(".") + 1, rutaPlantilla.length());
            }
             checkTags.clear();      //Limpiamos al lista 
             panel.removeAll();   
            File myfile = new File(rutaPlantilla); 
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

            DocumentBuilder db = dbf.newDocumentBuilder();
            Document mydoc = db.parse(myfile);
            
    DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory
        .newInstance();
    DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
    Document document = docBuilder.parse(myfile);
    NodeList nodeList = document.getElementsByTagName("*");
    for (int i = 0; i < nodeList.getLength(); i++) {
        Node currentNode = nodeList.item(i);
        if (currentNode.getNodeType() == Node.ELEMENT_NODE) {
            if (currentNode!=null) {
        if (currentNode.getNodeType() == Node.ELEMENT_NODE) {
            //calls this method for all the children which is Element
         
                JCheckBox jCheckBox2= new JCheckBox(currentNode.getNodeName());
                        checkTags.add(jCheckBox2);
                        panel.add(jCheckBox2).revalidate();
                        if (currentNode.getNodeValue()!=null) {
                    if (currentNode.getNodeValue().contains("si")) {
                    //Se checkea con si
                    checkTags.get(i).setSelected(true);
                        }else{
                            //se checkea con no
                          checkTags.get(i).setSelected(false);
                        }
                        
            }
        }
    }
}
    }}
    
            public void guardarTxt() throws IOException{
            String ruta = "XMLs/configuracion/factura/configuracion.txt";
        File archivo = new File(ruta);
            BufferedWriter bw;
            String strGuardarFiltros="";
            if(archivo.exists()) {
          bw = new BufferedWriter(new FileWriter(archivo));
          for (int i = 0; i < checkTags.size(); i++) {
                    if (checkTags.get(i).isSelected()) {
                        strGuardarFiltros+=checkTags.get(i).getText().toUpperCase() + ";";
                    }
		}
          bw.write(strGuardarFiltros);
            } else {
                  bw = new BufferedWriter(new FileWriter(archivo));
                  for (int i = 0; i < checkTags.size(); i++) {
                    if (checkTags.get(i).isSelected()) {
                        strGuardarFiltros+=checkTags.get(i).getText().toUpperCase() + ";";
                    }
		}
                  bw.write(strGuardarFiltros);
            }
            bw.close();
            JOptionPane.showMessageDialog(null, "Transaccion Exitosa");
            }
}