package GUI;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 * 
 * @author Raleigh Martin
 *
 */

public class ImageHandler extends JPanel{

  private static final long serialVersionUID = 1L;
    private BufferedImage image;

    public ImageHandler(String filepath) {
      
      Dimension imageSize = new Dimension(30, 28);     
      
      Border imageBufferBorder = BorderFactory.createEmptyBorder( 0, 20, 0, 0 );
      
      this.setBorder(imageBufferBorder);
      this.setPreferredSize(imageSize);
      
       try {                
          image = ImageIO.read(new File(filepath));
       } catch (IOException e) {
           System.out.println(e.getMessage());
       }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }

}