/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Directorio;


import static configuracion.Configuracion.checkTags;
import static configuracion.Configuracion.rutXls;
import static configuracion.Configuracion.rutXml;
import static configuracion.Configuracion.strTags;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


/**
 *
 * @author alum_tes_a
 */
public class CarDir extends javax.swing.JInternalFrame {

    /**
     * Creates new form CarDir2
     */
    
    public static List<JCheckBox> checkPath = new ArrayList<>();
    public static List<String> strRuta = new ArrayList<>();
    public CarDir() {
    initComponents();
    checkArchivosXml();
    labelXml.setText(rutXml.getText());
    labelXls.setText(rutXls.getText());
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buProc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelArc = new javax.swing.JPanel();
        labelXls = new javax.swing.JLabel();
        labelXml = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        togButArc = new javax.swing.JToggleButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Abrir Directorio");

        buProc.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        buProc.setMnemonic('p');
        buProc.setText("Procesar");
        buProc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buProcActionPerformed(evt);
            }
        });

        panelArc.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(panelArc);

        jLabel1.setText("Directorio XML");

        jLabel2.setText("Directorio XLS");

        togButArc.setText("Marcar Todo");
        togButArc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togButArcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelXls, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelXml, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buProc, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(togButArc))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelXml, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(labelXls, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buProc)
                    .addComponent(togButArc))
                .addContainerGap())
        );

        setBounds(0, 0, 603, 386);
    }// </editor-fold>//GEN-END:initComponents

    private void buProcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buProcActionPerformed
        rutaSel();
        generarXLS();
        dispose();
    }//GEN-LAST:event_buProcActionPerformed

    private void togButArcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togButArcActionPerformed
            if(togButArc.isSelected()){
        for(int i=0; i<checkPath.size(); i++)
        {
          togButArc.setText("Desmarcar Todo");
        checkPath.get(i).setSelected(true);
        }
        } else{
        
        for(int i=0; i<checkPath.size(); i++)
        {
        togButArc.setText("Marcar Todo");
        checkPath.get(i).setSelected(false);
        }
        }
    }//GEN-LAST:event_togButArcActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buProc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelXls;
    private javax.swing.JLabel labelXml;
    private javax.swing.JPanel panelArc;
    private javax.swing.JToggleButton togButArc;
    // End of variables declaration//GEN-END:variables

    
    private void checkArchivosXml()
    {
      String strArc;
      strArc=rutXml.getText();  
      File dir=new File(strArc);
     
      File[]archivos=dir.listFiles();
      checkPath.clear();
      for(int i=0;i<archivos.length;i++)
      {
                JCheckBox jCheckBox= new JCheckBox(archivos[i].getPath());
                checkPath.add(jCheckBox);
                panelArc.add(jCheckBox).revalidate();                              
      }
    }
    
    private void rutaSel()
    {
        strRuta.clear();
    for (JCheckBox checkBox : checkPath) {
        if (checkBox.isSelected()) {
            strRuta.add(checkBox.getText());
        }
    }
    }
    
    private void generarXLS() 
    {
    try
    {
    HSSFWorkbook workbook = new HSSFWorkbook(); 
    HSSFSheet sheet = workbook.createSheet("Datos");
    for(int i=0; i<strRuta.size(); i++){
        
    File archivoXml=new File(strRuta.get(i)); 
    
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(archivoXml);
            NodeList nodeList = document.getElementsByTagName("*");
     
            HSSFRow rowTag = sheet.createRow(0); //Primera fila imprime Tags
            HSSFRow Row = sheet.createRow(i+1); //Segunda fila imprime valor de los Tags y sucesivamente a la siguiente
            
            for (int j = 0; j < strTags.size(); j++) 
             {   
                 String tagSel=strTags.get(j);
                for (int k = 0; k < nodeList.getLength(); k++) //Nombre de los Nodos
                {
                 String nodo=nodeList.item(k).getNodeName();
                   
                if(tagSel.equals(nodo))
                {
                 HSSFCell Cell = rowTag.createCell(j);
                 Cell.setCellValue(tagSel);
                }
                
                for (int l=0; l<nodeList.item(k).getChildNodes().getLength(); l++) //Valor de los Nodos
                {
                 if(tagSel.equals(nodo))
                {
                 HSSFCell Cell = Row.createCell(j);                     
                 Cell.setCellValue(nodeList.item(k).getChildNodes().item(l).getNodeValue());
                }
                }
                
                }

             }
            FileOutputStream output = new FileOutputStream(new File(rutXls.getText()+"\\Sheet.xls"));
            workbook.write(output);
            output.close();  
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
         System.out.println("SAXException " + e.getMessage());
        }
    }
}