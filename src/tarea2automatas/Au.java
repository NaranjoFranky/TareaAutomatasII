
package tarea2automatas;

import com.jtattoo.plaf.aero.AeroLookAndFeel;
import javax.swing.UIManager;
import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
public class Au {

    public static void main(String[] args) {
         try {
           AeroLookAndFeel.setTheme("Large-Font");
              //System.out.println(MintLookAndFeel.getThemes());
           UIManager.setLookAndFeel(new AeroLookAndFeel());
         
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
         Expre r=new Expre();
         r.setVisible(true);
    }
    
}
