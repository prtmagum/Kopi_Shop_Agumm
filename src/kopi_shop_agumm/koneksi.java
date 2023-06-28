/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kopi_shop_agumm;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class koneksi {
    private String url="jdbc:mysql://localhost/penjualan";
    private String username_laragon = "root";
    private String password_laragon = "";
    private Connection con;
    
    public void connect(){
        try{
            con = DriverManager.getConnection(url,username_laragon,password_laragon);
            System.out.println("Koneksi Berhasil");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public Connection getCon(){
        return con;
    }
}
