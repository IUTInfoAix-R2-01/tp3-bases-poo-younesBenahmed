package tp3;

public class live {

    private String name;
    private double price;
    private int quantite;

    public live(String name, double price, int quantite) {
        this.name = name;
        this.price = price;
        this.quantite = quantite; 
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantite() { 
        return quantite; 
    } 
    
    public String toString() {
        return "nom : " + name + ", prix :  " + price + ", quantite : " + quantite;
    }
}
