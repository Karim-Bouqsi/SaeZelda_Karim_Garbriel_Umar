package sae.saezelda.modele;
public class Terrain {
    String nom;
    private int largeur = 640;
    private int hauteur = 320;
    private int[] terrain = {
            0,0,0,0,0,0,0,0,0,0,3,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,3,3,3,3,3,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,3,0,0,0,0,0,0,0,0,2,2,0,0,0,
            3,3,3,3,3,3,3,0,0,0,0,0,0,0,0,3,3,3,3,3,
            0,0,0,0,0,0,3,3,3,3,3,3,3,0,0,3,0,0,0,0,
            1,1,1,1,1,0,0,0,0,0,0,0,3,3,3,3,0,2,0,0,
            0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,2,0,0,0,
            0,0,2,0,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,2,
            0,0,0,2,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,
            0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,2,0,1,1,
    };

    public Terrain() {

        this.nom = "Demo";

    }


    public int getWidth() {
        return largeur;
    }

    public int getHeight() {
        return hauteur;
    }

    public int[] getTerrain() {
        return this.terrain;
    }
    public String getNom(){
        return nom;
    }
}