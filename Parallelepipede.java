class Parallelepipede extends Volume {
    private double longueur, largeur, hauteur;

    public Parallelepipede(double longueur, double largeur, double hauteur, String matiere, double densite)
    {
        super(matiere, densite);
        this.longueur = longueur;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    public Parallelepipede(Parallelepipede parallelepipede) {
        super(parallelepipede);
        this.longueur = parallelepipede.longueur;
        this.largeur = parallelepipede.largeur;
        this.hauteur = parallelepipede.hauteur;
    }

    @Override
    public double volume() {
        double volume;
        volume = this.largeur * this.longueur * this.hauteur;
        return volume;
    }

    @Override
    public double surface()
    {
        double surface;
        surface = (this.longueur * this.hauteur) * 2 + (this.largeur * this.hauteur) * 2 + (this.longueur * this.largeur) * 2;
        return surface;
    }

    @Override
    public String toString() 
    {
        return "Parallelepipede de dimensions L : " + this.largeur + " x l : " + this.longueur + " x H : " + this.hauteur + " avec un poids de " + this.volume() + super.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        } else {
            if (object instanceof Parallelepipede) 
            {
                Parallelepipede castedObject = (Parallelepipede)object;
                if (this.densite == (castedObject.densite) && this.matiere == (castedObject.matiere) && this.longueur == (castedObject.longueur) && this.largeur == (castedObject.largeur) && this.hauteur == (castedObject.hauteur)) 
                {
                    return true;
                }
                else 
                {                 
                    return false;
                }
            } 
            else 
            {                 
                return false;
            }
        }
    }
}