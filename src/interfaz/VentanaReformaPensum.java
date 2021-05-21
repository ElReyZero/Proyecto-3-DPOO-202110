package interfaz;

import javax.swing.JButton;
import javax.swing.JPanel;

import IdentificadorUsuario.Estudiante;
import Sistema.systemMain;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

public class VentanaReformaPensum extends JPanel implements ActionListener
{
 private Estudiante estudiante;
 private Estudiante copia;
 private systemMain sistema;
 private VentanaPrincipal ventanaMain;
 private JButton volver;
 private JButton nuevo;
 private JButton viejo;


 public VentanaReformaPensum(VentanaPrincipal pVentanaMain, systemMain pSistema, Estudiante pEstudiante, Estudiante pCopia)
 {
     estudiante = pEstudiante;
     copia = pCopia;
     ventanaMain = pVentanaMain;
     sistema = pSistema;
     volver = new JButton("volver");
     nuevo = new JButton("Acogerme al nuevo pensum");
     viejo = new JButton("Quedarme con el pensum antiguo");
     setLayout(new BorderLayout());
    ///Botones y paneles
    add(panelOld(ventanaMain,sistema,estudiante), BorderLayout.EAST);
    add(panelNew(ventanaMain,sistema,copia),BorderLayout.WEST);
    add(volver, BorderLayout.SOUTH);
 }
 public JPanel panelOld(VentanaPrincipal pVentanaMain, systemMain pSistema, Estudiante pEstudiante)
 {
     JPanel old = new VentanaReporteNotas(ventanaMain, sistema, estudiante, true, null, false, null, false);
     return old;
 }
 public JPanel panelNew(VentanaPrincipal pVentanaMain, systemMain pSistema, Estudiante pCopia)
 {
    JPanel reformed = new VentanaReporteNotas(ventanaMain, sistema, copia, true, null, false, null, false);
    return reformed;
 }
@Override
public void actionPerformed(ActionEvent e) 
{
    if(e.getSource() == volver)
    {
        ventanaMain.actualizarMain(new VentanaEstudiante(estudiante.darNombre(), estudiante.darCodigo(), estudiante.darCodigo(), ventanaMain, sistema , estudiante));
    }
}
}
