package configuracion;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class Configuracion extends javax.swing.JInternalFrame {
    public static List<JCheckBox> checkTags = new ArrayList<>();
    public static List<String> strTags = new ArrayList<>();
    public static String rutaDeEscrituraDirectorio;
    public static String rutaDeLecturaDirectorio;
    
    public Configuracion() {
        initComponents();
        checkEtiquetasXml();
        System.out.print("");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Buscar2 = new javax.swing.JButton();
        rutXls = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rutXml = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        togBut = new javax.swing.JToggleButton();

        setClosable(true);
        setTitle("Personalizar");

        Buscar2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Buscar2.setText("Buscar");
        Buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ruta XLS:");

        Guardar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Guardar.setMnemonic('g');
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        panel.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane2.setViewportView(panel);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ruta XML:");

        jButton1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton1.setText("Buscar");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rutXls, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(rutXml))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Buscar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(togBut)))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rutXml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rutXls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Buscar2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(togBut, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar2ActionPerformed
        asignarDirectorio();
    }//GEN-LAST:event_Buscar2ActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
     etiquetasSel();
     dispose();
    }//GEN-LAST:event_GuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    buscarDirectorio();
    }//GEN-LAST:event_jButton1ActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar2;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton jButton1;
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
            File xmlDocument = new File("factura.xml"); //Crea el objeto directorio de tipo File a partir del valor de pathname.
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlDocument);
            NodeList nodeList = document.getElementsByTagName("*");

             checkTags.clear();      //Limpiamos al lista 
            for (int i = 0; i < nodeList.getLength(); i++)         
            { 
                
                JCheckBox jCheckBox= new JCheckBox(nodeList.item(i).getNodeName());
                checkTags.add(jCheckBox);
                panel.add(jCheckBox).revalidate();

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
    
    private void etiquetasSel(){
        strTags.clear();
        for (JCheckBox checkBox : checkTags) {
            if (checkBox.isSelected()) {
                strTags.add(checkBox.getText());
            }
        }
    }
   

}
