
package Adicionales;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Joe Marcillo
 */
public class panelImagen extends JPanel {
     private Image imagen ;
     
     public panelImagen(){
     
         imagen=null;
     }
    
   public panelImagen( String nombreImagen)
   {
    if(nombreImagen != null ){
    imagen = new ImageIcon(getClass().getResource(nombreImagen)).getImage();
    }
   }
   public void setImage (String nombreImagen){
        if(nombreImagen != null ){
           imagen = new ImageIcon(getClass().getResource(nombreImagen)).getImage();
            }
        else{
        imagen = null;
        }
        repaint();
   } 
   
   @Override
   public  void paint( Graphics g){
       
        if( imagen != null){    
            
            g.drawImage(imagen, 0, 0,getWidth(),getHeight(),this);
   
            setOpaque(false);
        }
                else
                {
                   setOpaque(true);
                    }
   
   super.paint(g);
   }
}
