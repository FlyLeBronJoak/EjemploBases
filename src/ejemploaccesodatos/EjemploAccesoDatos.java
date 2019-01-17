/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploaccesodatos;

/**
 *
 * @author Joaquin
 */
public class EjemploAccesoDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorConexion gc = new GestorConexion();
        
//        PoolConexiones pc = new PoolConexiones();
//        gc.insertar();
//        gc.borrarColumna();
//        gc.annadirColumna();
//        gc.consulta_Statement();
//        gc.consulta_preparedStatement();
//        gc.insertar();
//        gc.insertar_con_commit();
          gc.cerrar_conexion();

//        pc.cerrar_conexion();
    }

}
