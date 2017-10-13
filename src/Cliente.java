
/**
 * Clase cliente correspondiente a la vista del usuario.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class Cliente extends JFrame implements ActionListener {

    //Variables a utilizar
    
    //Variables correspondientes a los titulos
    private JLabel titulo;
    private JLabel subtitulo;
    private JLabel tv1;
    private JLabel tv2;
    //Variables correspondientes a los labels que contendrán las imagenes de cada figura.
    private JLabel cubo;
    private JLabel esfera;
    private JLabel cilindro;
    private JLabel cono;
    //Variables correspondientes a las entradas donde se ingresarán los valores.
    private JTextField v1;
    private JTextField v2;
    //Variable correspondientes al botón que leera cuándo realizar la acción.
    private JButton boton;
    //Variables correspondientes a los check para seleccionar sobre qué figura trabajar.
    private JCheckBox checkCubo;
    private JCheckBox checkEsfera;
    private JCheckBox checkCilindro;
    private JCheckBox checkCono;
    //Variables correspondientes a los check para seleccionar qué operación realizar.
    private JCheckBox checkA;
    private JCheckBox checkV;
    //Variable auxiliar correspondiente al check seleccionado
    private JCheckBox checkAux;

    /**
     * Método constructor que usará el constructor de JFrame e inicializará los componentes a utilizar.
     */
    public Cliente() {
        super();
        configurarVentana();
        inicializarComponentes();
    }

    /**
     * Método de configuración general de la ventana.
     */
    private void configurarVentana() {
        this.setTitle("Calcular áreas y volúmenes");
        this.setSize(600, 500);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Método para crear los componentes y asignarle sus respectivos valores y posiciones.
     * Además se agregarán al Frame.
     */
    private void inicializarComponentes() {
        // creación de los componentes
        titulo = new JLabel();
        subtitulo = new JLabel();
        tv1 = new JLabel();
        tv2 = new JLabel();
        cubo = new JLabel();
        esfera = new JLabel();
        cilindro = new JLabel();
        cono = new JLabel();
        v1 = new JTextField();
        v2 = new JTextField();
        boton = new JButton();
        checkCubo = new JCheckBox();
        checkEsfera = new JCheckBox();
        checkCilindro = new JCheckBox();
        checkCono = new JCheckBox();
        checkA = new JCheckBox();
        checkV = new JCheckBox();
        checkAux = new JCheckBox();

        // configuramos los componentes
        titulo.setText("Calcula el área o volúmen de alguna de las siguientes figuras:");
        titulo.setBounds(50, 30, 400, 25);
        subtitulo.setText("Seleccione la operación e ingrese los valores.");
        subtitulo.setBounds(250, 120, 400, 25);
        
        checkA.setBounds(300, 180, 80, 20);
        checkA.setText("Área");
        checkV.setBounds(300, 200, 80, 20);
        checkV.setText("Volumen");
        
        tv1.setText("Lado:");
        tv1.setBounds(300, 250, 50, 25);
        v1.setBounds(350, 250, 50, 25);
        
        tv2.setText("Altura:");
        tv2.setBounds(300, 300, 50, 25);
        v2.setBounds(350, 300, 50, 25);

        cubo.setBounds(50, 70, 110, 90);
        cubo.setIcon(new ImageIcon(getClass().
                getResource("cubo.jpg")));
        checkCubo.setBounds(30, 100, 20, 20);
        checkCubo.setSelected(true); //Selecciona cubo por defecto
        checkAux = checkCubo;
        
        esfera.setBounds(50, 170, 110, 90);
        esfera.setIcon(new ImageIcon(getClass().
                getResource("esfera.jpg")));
        checkEsfera.setBounds(30, 200, 20, 20);
        
        cilindro.setBounds(50, 270, 110, 90);
        cilindro.setIcon(new ImageIcon(getClass().
                getResource("cilindro.jpg")));
        checkCilindro.setBounds(30, 300, 20, 20);
        
        cono.setBounds(50, 370, 110, 90);
        cono.setIcon(new ImageIcon(getClass().
                getResource("cono.jpg")));
        checkCono.setBounds(30, 400, 20, 20);

        boton.setText("Calcular");
        boton.setBounds(350, 350, 100, 30);
        
        //Agregamos un escuchador de eventos al botón y los checkbox de las imágenes para controlar que sólo seleccione una.
        boton.addActionListener(this);
        checkCubo.addActionListener(this);
        checkEsfera.addActionListener(this);
        checkCilindro.addActionListener(this);
        checkCono.addActionListener(this);
        
        // Agregamos los componentes a la ventana.
        this.add(titulo);
        this.add(subtitulo);
        this.add(checkA);
        this.add(checkV);
        this.add(tv1);
        this.add(tv2);
        this.add(v1);
        this.add(v2);
        this.add(boton);
        this.add(cubo);
        this.add(esfera);
        this.add(cilindro);
        this.add(cono);
        this.add(checkCubo);
        this.add(checkEsfera);
        this.add(checkCilindro);
        this.add(checkCono);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton){
            JOptionPane.showMessageDialog(this, "Soy el botón");  
        } else if (e.getSource() == checkCubo){
            checkAux.setSelected(false);
            checkCubo.setSelected(true);
            checkAux = checkCubo;
        } else if(e.getSource() == checkEsfera){
            checkAux.setSelected(false);
            checkEsfera.setSelected(true);
            checkAux = checkEsfera;
        } else if(e.getSource() == checkCilindro){
            checkAux.setSelected(false);
            checkCilindro.setSelected(true);
            checkAux = checkCilindro;
        } else if(e.getSource() == checkCono){
            checkAux.setSelected(false);
            checkCono.setSelected(true);
            checkAux = checkCono;
        }
    }

    public static void main(String[] args) {
        Cliente V = new Cliente();      // creamos una ventana
        V.setVisible(true);             // hacemos visible la ventana creada
    }
}
