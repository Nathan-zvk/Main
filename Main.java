public class Main{
    private int valeur;
    Main(int uneValeur){
        this.valeur=uneValeur;
    }

    private void afficher(){
        System.out.println(this.valeur+"codddd");
    }

    public void main(String[] args){
        Main main=new Main(5);
        main.afficher();
    }
    
}