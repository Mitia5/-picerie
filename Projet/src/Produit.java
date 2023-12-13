package element;


public class Produit
{
    int idproduit;
    String nomproduit;
    int idtypeproduit;
    int idcategorie;
    double prix;
    public Produit()
    {
        
    }
    public void setidproduit(int i) 
    {
        this.idproduit = i;

    }

    public int getidproduit() 
    {
        return this.idproduit;
    }

    public void setnomproduit(String n) 
    {
        this.nomproduit = n;
    }

    public String getnomproduit() 
    {
        return this.nomproduit;
    }

    public void setidproduit(int i) 
    {
        this.idproduit = i;

    }

    public int getidproduit() 
    {
        return this.idtypeproduit;
    }

    public void setidcategorie(int i) 
    {
        this.idcategorie = i;

    }

    public int getidcategorie() 
    {
        return this.idcategorie;
    }

    public void setprix(double i) 
    {
        this.prix = i;

    }

    public double getprix() 
    {
        return this.prix;
    }

}