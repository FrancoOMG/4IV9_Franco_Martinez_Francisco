import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class VentanaVoleibol extends JFrame {

    JTextField txtId, txtNombre, txtPosicion, txtNumero, txtEdad;

    JButton btnAgregar, btnMostrar, btnBuscar,
            btnActualizar, btnEliminar;

    JTable tabla;
    DefaultTableModel modelo;

    JugadorDAO dao = new JugadorDAO();

    public VentanaVoleibol() {

        setTitle("CRUD Jugadores Voleibol");
        setSize(900,550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new FlowLayout());

        txtId = new JTextField(5);
        txtNombre = new JTextField(10);
        txtPosicion = new JTextField(10);
        txtNumero = new JTextField(5);
        txtEdad = new JTextField(5);

        btnAgregar = new JButton("Agregar");
        btnMostrar = new JButton("Mostrar");
        btnBuscar = new JButton("Buscar");
        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");

        add(new JLabel("ID"));
        add(txtId);

        add(new JLabel("Nombre"));
        add(txtNombre);

        add(new JLabel("Posicion"));
        add(txtPosicion);

        add(new JLabel("Numero"));
        add(txtNumero);

        add(new JLabel("Edad"));
        add(txtEdad);

        add(btnAgregar);
        add(btnMostrar);
        add(btnBuscar);
        add(btnActualizar);
        add(btnEliminar);

        modelo = new DefaultTableModel();

        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Posicion");
        modelo.addColumn("Numero");
        modelo.addColumn("Edad");

        tabla = new JTable(modelo);

        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setPreferredSize(new Dimension(850,350));

        add(scroll);

        btnAgregar.addActionListener(e -> agregar());
        btnMostrar.addActionListener(e -> mostrar());
        btnBuscar.addActionListener(e -> buscar());
        btnActualizar.addActionListener(e -> actualizar());
        btnEliminar.addActionListener(e -> eliminar());

        mostrar();
    }

    private void agregar() {

        try {

            Jugador j = new Jugador();

            j.setNombre(txtNombre.getText());
            j.setPosicion(txtPosicion.getText());
            j.setNumeroCamiseta(Integer.parseInt(txtNumero.getText()));
            j.setEdad(Integer.parseInt(txtEdad.getText()));

            dao.insertarJugador(j);

            mostrar();

        } catch(Exception e) {

            JOptionPane.showMessageDialog(null,e.getMessage());

        }
    }

    private void mostrar() {

        try {

            modelo.setRowCount(0);

            for(Jugador j : dao.obtenerJugadores()) {

                modelo.addRow(new Object[]{
                    j.getId(),
                    j.getNombre(),
                    j.getPosicion(),
                    j.getNumeroCamiseta(),
                    j.getEdad()
                });
            }

        } catch(Exception e) {

            JOptionPane.showMessageDialog(null,e.getMessage());

        }
    }

    private void buscar() {

        try {

            int id = Integer.parseInt(txtId.getText());

            for(Jugador j : dao.obtenerJugadores()) {

                if(j.getId() == id) {

                    txtNombre.setText(j.getNombre());
                    txtPosicion.setText(j.getPosicion());
                    txtNumero.setText(
                            String.valueOf(j.getNumeroCamiseta()));
                    txtEdad.setText(
                            String.valueOf(j.getEdad()));
                }
            }

        } catch(Exception e) {

            JOptionPane.showMessageDialog(null,e.getMessage());

        }
    }

    private void actualizar() {

        try {

            Jugador j = new Jugador();

            j.setId(Integer.parseInt(txtId.getText()));
            j.setNombre(txtNombre.getText());
            j.setPosicion(txtPosicion.getText());
            j.setNumeroCamiseta(Integer.parseInt(txtNumero.getText()));
            j.setEdad(Integer.parseInt(txtEdad.getText()));

            dao.actualizarJugador(j);

            mostrar();

        } catch(Exception e) {

            JOptionPane.showMessageDialog(null,e.getMessage());

        }
    }

    private void eliminar() {

        try {

            dao.eliminarJugador(
                    Integer.parseInt(txtId.getText()));

            mostrar();

        } catch(Exception e) {

            JOptionPane.showMessageDialog(null,e.getMessage());

        }
    }

    public static void main(String[] args) {

        new VentanaVoleibol().setVisible(true);

    }
}