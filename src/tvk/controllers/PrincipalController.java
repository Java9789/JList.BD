package tvk.controllers;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.jvnet.substance.skin.SubstanceRavenGraphiteGlassLookAndFeel;
import tvk.models.Obra_Condominio;
import tvk.views.Principal;

public class PrincipalController implements ActionListener {
    private Principal principal;
    
    public PrincipalController(){
        EventQueue.invokeLater(() -> {
            try {
                JFrame.setDefaultLookAndFeelDecorated(true);
                UIManager.setLookAndFeel(new SubstanceRavenGraphiteGlassLookAndFeel());
            } catch(UnsupportedLookAndFeelException e){
                System.err.println(e.getMessage());
            }
            principal = new Principal();
            principal.setVisible(true);
            start();
        });
    }
    
    public void start(){
        ver_obras();
        principal.btnEnviar.setActionCommand("Enviar Obra");
        principal.btnEnviar.addActionListener(this);
        principal.btnXD.setActionCommand("Contraseña 1");
        principal.btnXD.addActionListener(this);
        principal.btnXDDD.setActionCommand("Contraseña 2");
        principal.btnXDDD.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();
        switch(command){
            case "Enviar Obra":
                enviar_obras();
                break;
            case "Contraseña 1":
                contraseña_1();
                break;
            case "Contraseña 2":
                contraseña_2();
                break;
        }
    }

    /**
     * Muestra la lista de obras de la base de datos "constructora-i" en un Jlist :D
     */
    private void ver_obras(){        
        principal.txtObras.append("Obras:");
        principal.txtObras.append(System.getProperty("line.separator"));
        for(Obra_Condominio obra : Obra_Condominio.name()){
            principal.list_obras.addElement(obra.getNombre());
        }
        principal.lstObra.setModel(principal.list_obras);
    }

    /**
     * Envia las obras a que se recojan de un JList a un JTextArea.
     */
    private void enviar_obras(){
        List<Object> re_obras = principal.lstObra.getSelectedValuesList();
        for(Object obra : re_obras){
            principal.txtObras.append(obra + "");
            principal.txtObras.append(System.getProperty("line.separator"));
        }
        // Usando el método obsoleto XD
        Object[] x = principal.lstObra.getSelectedValues();
        for(Object obra : x){
            System.out.println(obra);
        }
    }

    /**
     * Imprime la contraseña usando el método "getPassword" transformado a String.
     */
    private void contraseña_1(){
        String password = new String(principal.txtContraseña.getPassword());
        principal.txtReContraseña.setText(password);
    }

    /**
     * Imprime la contraseña usando el método "getPassword" recorriendo el
     * arreglo char devuelto y luego transformando el mismo a String
     */
    private void contraseña_2(){
        char[] password = principal.txtContraseña.getPassword();
        String new_password = "";
        for(int i=0;i<password.length;i++){
            new_password += password[i];
        }
        principal.txtReContraseña.setText(new_password);
    }
    
}