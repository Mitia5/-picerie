import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Getdonnee 
{
    public static Connection connect() throws Exception 
    {
        // Implement your connection logic here and return the Connection object
        String URL = "jdbc:postgresql://localhost:5432/fifidianana";
        String USER = "postgres";
        String PASSWORD = "root";
        Connection con = null;
        // Example:
        con = DriverManager.getConnection(URL, USER, PASSWORD);
        return con;
    }

    public static ArrayList<Region> getListDonne() 
    {
        ArrayList<Region> regionList = new ArrayList<>();
        try {
            // Connection con = connect();
            Statement stmnt = connect().createStatement();
    
            ResultSet resultatRegion = stmnt.executeQuery("SELECT * FROM Region");
    
            while (resultatRegion.next()) 
            {
                Region reg = new Region();
                reg.setidregion(resultatRegion.getInt("idregion"));
                reg.setnom_rg(resultatRegion.getString("nom_rg"));
                regionList.add(reg);
            }
    
        } 
            catch (Exception e) 
        {
            e.printStackTrace();
        }
        return regionList;
    }

    public static void main(String[] args) 
    {
        ArrayList<Region> regionList = getListDonne();
        for (Region reg : regionList) 
        {
            System.out.println("Id region " + reg.getidregion());
            System.out.println("Nom region " + reg.getnom_rg());
        }
    }
}
