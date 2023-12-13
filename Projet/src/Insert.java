import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Insert
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
    public static void Inserdonne (String namereg) 
    {
        try 
        {
            Statement stmnt = connect().createStatement();
            stmnt.executeUpdate("INSERT INTO Region (nom_rg) VALUES ('"+namereg+"')");
            stmnt.executeUpdate("commit");
    
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

    }
    public static  String Todaydate()
    {
        Date currentDate = new Date();
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
    }
    public  int getidprodbyprodname(String n)
    {
        int Idprod = null;
        try {
            // Connection con = connect();
            Statement stmnt = connect().createStatement();
    
            ResultSet findid = stmnt.executeQuery("select idproduit from Produits where nomproduit ='"+n+"';");
    
            while (resultatRegion.next()) 
            {
                Idprod = findid.getInt("idregion");
            }
            return Idprod;
    
        } 
            catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public static void InserdonnePannier (String namereg) 
    {
        try 
        {
            Statement stmnt = connect().createStatement();
            stmnt.executeUpdate("INSERT INTO Achat (IdProduits,DateAchat) VALUES ('"+namereg+"')");
            stmnt.executeUpdate("commit");
    
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) 
    {
        String vari = "Marseille";
        Inserdonne(vari);
        System.out.println("Success upload");
    }
}