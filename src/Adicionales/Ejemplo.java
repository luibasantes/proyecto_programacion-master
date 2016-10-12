/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author 
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SAXException {
        try {
            cargarXml();
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Ejemplo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void cargarXml() throws SAXException, ParserConfigurationException {
       //Se crea un SAXBuilder para poder parsear el archivo
    
    File xmlFile = new File( "C:\\3009201601179141513200120330400000093414126153318\\Facturas.xml" );
    try
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                // Definimos nuevo arbol XML
                DocumentBuilder builder = factory.newDocumentBuilder();
                // Representamos el archivo XML especificado en el arbol
                Document document = builder.parse(xmlFile);
 
        //Se obtiene la raiz 'tables'
        NodeList nodeList;
        nodeList = document.getElementsByTagName("*");
//         for (int i = 0; i < nodeList.getLength(); i++){ 
//                Element element = (Element)nodeList.item(i);
//                System.out.println("Element " + i + " : " + element.getNodeName() + " Value: "+ element.getNodeValue());
//                if(element.getChildNodes().getLength()==1 && !element.getNodeName().contains(":")){
//                    if(element.getFirstChild().getNodeType() == Node.TEXT_NODE && !element.getNodeName().equals("comprobante")){
//                        System.out.println("Hola");
//                    }else{
//                        System.out.println("Chao");
//                    }
//                }
//         }
       List listaFiltros = new ArrayList();
       listaFiltros=obtenerFiltrosTxt();
       
         for (int x = 0; x < listaFiltros.size(); x++) {
        for (int i = 0; i < nodeList.getLength(); i++){
                Element element = (Element)nodeList.item(i);
                if(element.getChildNodes().getLength()==1 && !element.getNodeName().contains(":")){
                    if(element.getFirstChild().getNodeType() == Node.TEXT_NODE && !element.getNodeName().equals("comprobante")){
                         System.out.println("Element " + i + " : " + element.getNodeName() + " Value: "+ element.getFirstChild().getNodeValue());
                        if (listaFiltros.get(x).equals(element.getNodeName().toUpperCase())) {
                            System.out.println("VERDADERO");
                            System.out.println("Element " + i + " : " + element.getNodeName() + " Value: "+ element.getFirstChild().getNodeValue());
                            break;
                        }
                        }
                    else{
                        DocumentBuilderFactory sub_factory = DocumentBuilderFactory.newInstance();
                        DocumentBuilder sub_builder = sub_factory.newDocumentBuilder();
                        Document sub_document = sub_builder.parse(new InputSource(new StringReader(element.getFirstChild().getNodeValue())));
                        NodeList sub_nodeList = sub_document.getElementsByTagName("*");
                        for (int j = 0; j<sub_nodeList.getLength(); j++){
                            Element sub_element = (Element)sub_nodeList.item(j);
                            if(sub_element.getNodeName().equals("fechaEmision"))
                            {
                                 System.out.println("Nombre: " + sub_element.getFirstChild().getNodeValue());
                            }
                            if(sub_element.getNodeName().equals("Signature"))
                                break;
                            if(sub_element.getChildNodes().getLength()==1 && !sub_element.getNodeName().contains(":")){
                                if(sub_element.getFirstChild().getNodeType() == Node.TEXT_NODE){
                                                   System.out.println("Element " + i + " : " + sub_element.getNodeName() + " Value: "+ sub_element.getFirstChild().getNodeValue());
                                    if (listaFiltros.get(x).equals(sub_element.getNodeName().toUpperCase())) {
                            System.out.println("VERDADERO");
                            break;
                        }
                                }
                            }
                        }
                    }
                }
            }
         }
    }catch ( IOException io ) {
        System.out.println( io.getMessage() );
    }
    }

    private static List obtenerFiltrosTxt() {
         List listFiltro = new ArrayList();
         String strTexto="";
        try {   
            String cadena;
            FileReader f = new FileReader("XMLs/configuracion/factura/configuracion.txt");
            BufferedReader b = new BufferedReader(f);
            while((cadena = b.readLine())!=null) {
                //System.out.println(cadena);
                strTexto=strTexto +cadena;
            }
            b.close();
           StringTokenizer st = new StringTokenizer(strTexto, ";");

           while(st.hasMoreTokens()) {
            listFiltro.add(st.nextToken());
           }
        } catch (IOException ex) {
            Logger.getLogger(Ejemplo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listFiltro;
    }
}
