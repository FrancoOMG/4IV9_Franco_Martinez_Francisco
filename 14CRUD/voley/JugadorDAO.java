import java.sql.*;
import java.util.ArrayList;

public class JugadorDAO {

    public void insertarJugador(Jugador jugador) throws Exception {

        Connection con = ConexionBD.getConexion();

        String sql =
        "INSERT INTO Jugadores(nombre,posicion,numero_camiseta,edad) VALUES(?,?,?,?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, jugador.getNombre());
        ps.setString(2, jugador.getPosicion());
        ps.setInt(3, jugador.getNumeroCamiseta());
        ps.setInt(4, jugador.getEdad());

        ps.executeUpdate();
    }

    public ArrayList<Jugador> obtenerJugadores() throws Exception {

        ArrayList<Jugador> lista = new ArrayList<>();

        Connection con = ConexionBD.getConexion();

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM Jugadores");

        while(rs.next()) {

            lista.add(
                new Jugador(
                    rs.getInt("id_jugador"),
                    rs.getString("nombre"),
                    rs.getString("posicion"),
                    rs.getInt("numero_camiseta"),
                    rs.getInt("edad")
                )
            );
        }

        return lista;
    }

    public void eliminarJugador(int id) throws Exception {

        Connection con = ConexionBD.getConexion();

        PreparedStatement ps =
        con.prepareStatement(
        "DELETE FROM Jugadores WHERE id_jugador=?");

        ps.setInt(1,id);

        ps.executeUpdate();
    }

    public void actualizarJugador(Jugador jugador) throws Exception {

        Connection con = ConexionBD.getConexion();

        PreparedStatement ps =
        con.prepareStatement(
        "UPDATE Jugadores SET nombre=?,posicion=?,numero_camiseta=?,edad=? WHERE id_jugador=?");

        ps.setString(1, jugador.getNombre());
        ps.setString(2, jugador.getPosicion());
        ps.setInt(3, jugador.getNumeroCamiseta());
        ps.setInt(4, jugador.getEdad());
        ps.setInt(5, jugador.getId());

        ps.executeUpdate();
    }
}