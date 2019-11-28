class Cylindre extends Volume {
    protected double hauteur, diametre;

    public Cylindre(double hauteur, double diametre, String matiere, double densite)
    {
        super(matiere, densite);
        this.hauteur = hauteur;
        this.diametre = diametre;
    }
    public Cylindre(Cylindre cylindre) {
        super(cylindre);
        this.hauteur = cylindre.hauteur;
        this.diametre = cylindre.diametre;
    }

    @Override
    public double volume() {
        double volume;
        volume = Math.PI * Math.pow(((this.diametre)/2.0), 2) * this.hauteur; //π × R^2 × h
        return volume;
    }

    @Override
    public double surface()
    {
        double surface;
        surface = (Math.PI * Math.pow(this.diametre/2.0, 2.0)) * 2 + this.hauteur * 2 * Math.PI * (this.diametre/2); // (π * R²) * 2 + h * 2 x π x R
        return surface;
    }

    @Override
    public String toString() 
    {
        return "Cylindre de dimensions h : " + this.hauteur + " et d : " + this.diametre + " et un poids de " + Math.round(this.poids() * 100.00)/100.00 + super.toString();
    }

    @Override
    public boolean equals(Object object) 
    {
        if (object == null) 
        {
            return false;
        } 
        else 
        {
            if (object instanceof Cylindre) 
            {
                Cylindre castedObject = (Cylindre)object;
                if (this.densite == (castedObject.densite) && this.matiere == (castedObject.matiere) && this.diametre == (castedObject.diametre) && this.hauteur == (castedObject.hauteur)) {
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