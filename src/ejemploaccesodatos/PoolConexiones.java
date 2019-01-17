/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploaccesodatos;

import java.sql.Connection;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author Joaquin
 */
public class PoolConexiones {

    Connection con;

    public PoolConexiones() {

        BasicDataSource bdSource = new BasicDataSource();
        bdSource.setUrl("jdbc:mysql://localhost:3306/discografica");
        bdSource.setUsername("root");
        bdSource.setPassword("root");

        try {
            con = bdSource.getConnection();

            if (con != null) {
                System.out.println("Conexion creada satisfactoriamente");

            } else {
                System.out.println("No se puede crear una nueva conexion");
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
    }

    public void cerrar_conexion() {

        try {
            con.close();
            System.out.println("Conexion cerrada");
        } catch (Exception e) {
            System.out.println("Error al cerrar la conexion");
            e.printStackTrace();
        }

    }
}
