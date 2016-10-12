/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivo;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import static pantallaprin.principal.strRut;


/**
 *
 * @author jperero
 */
public class consultar extends javax.swing.JInternalFrame {
   String Texto;
    /**
     * Creates new form consultar
     */
    public consultar() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        OptEst = new javax.swing.JRadioButton();
        OptRuc = new javax.swing.JRadioButton();
        OptNroFac = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaVerRes = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("CONSULTAR");
        setToolTipText("");

        buttonGroup1.add(OptEst);
        OptEst.setText(" ESTADO");
        OptEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptEstActionPerformed(evt);
            }
        });

        buttonGroup1.add(OptRuc);
        OptRuc.setText("RUC");
        OptRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptRucActionPerformed(evt);
            }
        });

        buttonGroup1.add(OptNroFac);
        OptNroFac.setText("# DE FACTURA");
        OptNroFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptNroFacActionPerformed(evt);
            }
        });

        jButton1.setText("EXPORTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));

        txaVerRes.setColumns(20);
        txaVerRes.setRows(5);
        jScrollPane1.setViewportView(txaVerRes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OptNroFac)
                    .addComponent(OptEst)
                    .addComponent(OptRuc)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(OptRuc)
                .addGap(18, 18, 18)
                .addComponent(OptEst)
                .addGap(18, 18, 18)
                .addComponent(OptNroFac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(51, 51, 51)
                .addComponent(jButton1)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        cargarXml();
        String var ="";
        abrirMenPan(var);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void OptEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptEstActionPerformed
        actionRadio(Texto);
    }//GEN-LAST:event_OptEstActionPerformed

    private void OptNroFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptNroFacActionPerformed
        actionRadio(Texto);
    }//GEN-LAST:event_OptNroFacActionPerformed

    private void OptRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptRucActionPerformed
        actionRadio(Texto);
    }//GEN-LAST:event_OptRucActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton OptEst;
    private javax.swing.JRadioButton OptNroFac;
    private javax.swing.JRadioButton OptRuc;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaVerRes;
    // End of variables declaration//GEN-END:variables

 public void cargarXml(File Path, File[] contenido ) throws ParserConfigurationException, SAXException {      
     
//     try { 
        //Se crea un SAXBuilder para poder parsear el archivo     
         int contador=0;
    for (File archivo_n : contenido) {
                File xmlFile = new File(Path.toString()+"\\"+archivo_n); 
                if (xmlFile.isFile() && archivo_n.getName().toLowerCase().endsWith(".xml")) {
                     //Se crea el documento a traves del archivo        
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                    // Definimos nuevo arbol XML
                    DocumentBuilder builder = factory.newDocumentBuilder();
                    // Representamos el archivo XML especificado en el arbol
                //    Document document = builder.parse(xmlFile);     
            //Se obtiene la lista de hijos de la raiz 'tables'                                                  
                //Se obtiene la lista de hijos del tag 'tabla'            
//                List lista_campos = rootNode.getChildren();               
            //    System.out.println( "\tNombre\t\tTipo\t\tValor" );    
            //    List lista_campos = rootNode.getChildren(title);
                //Se recorre la lista de campos   
                String valor = "";
         /*       for ( int j = 0; j < lista_campos.size(); j++ ) {                 
                //Se obtiene el elemento 'campo'                 
                    Element campo = (Element)lista_campos.get( j );                   
                //Se obtienen los valores que estan entre los tags '<campo></campo>'                
                //Se obtiene el valor que esta entre los tags '<nombre></nombre>'                 
                //    nombre = campo.getChildText("estado");
             
            }  */   
                
             //   valor = document.getNodeValue();
                     //  if (valor.equals("AUTORIZADO")) {
                           
                      // }
                }
               contador++; 
               txaVerRes.setText(">>"+archivo_n.getName());
            }
//        }
     /*catch ( IOException io ) {
            System.out.println( io.getMessage() );     
//        }catch ( JDOMException jdomex ) {         
//            System.out.println( jdomex.getMessage() );     
//            
      }*/
    }
 
 
 public void actionRadio(String Texto) {
   
   
    if(OptEst.isSelected()){
      Texto = JOptionPane.showInputDialog("Ingrese Estado Ej: Autorizado, Anulados..");   
      }else if(OptRuc.isSelected()){
      Texto = JOptionPane.showInputDialog("Ingrese Ruc de Factura!!..");
      }else if(OptNroFac.isSelected()){
       Texto = JOptionPane.showInputDialog("Ingresar nro. Factura!!..");
     }
   }
 
  private boolean abrirMenPan(String comprobante){
        File[] contenido = null;
        boolean blnRes=true;
        int cantidad=0;
        try{
            do{
                JFileChooser objFilCho=new JFileChooser(); //Creamos una nueva ventana de seleccion
                objFilCho.setDialogTitle("Abrir"); //Seteamos el titulo de la ventana "Abrir"
                objFilCho.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); //Se mostraran solo directorios(carpetas)
                objFilCho.setCurrentDirectory(new File(strRut)); //Nos ubicamos en el directorio por defecto
                if (objFilCho.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){ //Si se acepta la seleccion (boton "Abrir")
                    //Con el fin de mantener en memoria la ultima ubicacion visitada
                    strRut=objFilCho.getCurrentDirectory().getAbsolutePath(); //Actualizamos el directorio por defecto
                    File ruta = new File(strRut+"\\"+objFilCho.getSelectedFile().getName()); //Obtenemos carpeta seleccionada
                    contenido = ruta.listFiles(); //Obtenemos un arreglo con los archivos existentes de la carpeta seleccionada
                     //SI el directorio seleccionado no esta vacio
                    if(contenido.length > 0){
                        //Creamos la ventana para mostrar contenido del directorio seleccionado
                    //    Adicionales.Abrir_xml objDirUno = new Adicionales.Abrir_xml();
                        //Seteamos el titulo de la ventana con el nombre de la carpeta seleccionada
                 //       objDirUno.setTitle(objFilCho.getSelectedFile().getName());
               //         dskPrin.add(objDirUno, JLayeredPane.DEFAULT_LAYER);
                        //abrimos archivos XML que sean del mismo tipo que el comprobante seleccionado
                        if (OptEst.isSelected() || OptNroFac.isSelected() || OptRuc.isSelected()){
                            cargarXml(ruta,contenido );
                          }
//                        cantidad=abrirArcXml(comprobante, ruta, contenido, objDirUno);
                        //SI la cantidad de archivos encontrados es CERO
//                        if(cantidad == 0)
//                            JOptionPane.showMessageDialog(null, "No se encontro ningun(a) ");
                        //SI se encontro al menos un archivos
//                        else{
//                            JOptionPane.showMessageDialog(null, cantidad+" "+comprobante+"(s) existente(s)");
//                            objDirUno.setVisible(true);
//                        }
                        
                     //    txaVerRes.setText(">>"+objFilCho.getSelectedFile().getName());
                        
                    }
                    // en caso de que el directorio seleccionado este vacio
                    else JOptionPane.showMessageDialog(null, "Carpeta Vacia");
                }
                // en caso de que se presione CANCELAR
                else break;
            }while(contenido.length==0 || cantidad==0); // Repetimos la seleccion mientras el directorio este vacio
                                                        // o si no contiene ningun archivo especificado
        }
        catch(Exception e){
            System.out.println("Excepción: " + e.toString());
            blnRes=false;
        }
        return blnRes;
    }
}
