package element;


public class Achat
{
    int idAchat;
    int idProduit;
    String date;

    public Achat()
    {
        
    }
    public void setidAchat(int i) 
    {
        this.idAchat = i;

    }

    public int getidAchat() 
    {
        return this.idAchat;
    }

    public void setidProduit(int i) 
    {
        this.idProduit = i;

    }

    public int getidProduit() 
    {
        return this.idProduit;
    }

    public void setdate(String n) 
    {
        this.date = n;
    }

    public String getdate() 
    {
        return this.date;
    }
}