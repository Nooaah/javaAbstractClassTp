class CylindreCreux extends Cylindre {
    private double diametreInterne;

    public CylindreCreux(double hauteur, double diametre, double diametreInterne, String matiere, double densite)
    {
        super(hauteur, diametre, matiere, densite);
        this.diametreInterne = diametreInterne;
    }
    public CylindreCreux(CylindreCreux cylindreCreux) {
        super(cylindreCreux);
        this.diametreInterne = cylindreCreux.diametreInterne;
    }

    @Override
    public double volume() {
        double volume, volumeInterne;
        volume = Math.PI * Math.pow(((this.diametre)/2.0), 2) * this.hauteur; //π × R^2 × h
        volumeInterne = Math.PI * Math.pow(((this.diametreInterne)/2.0), 2) * this.hauteur; //π × R^2 × h
        return volume - volumeInterne;
    }

    @Override
    public double surface()
    {
        double surface, cerclesSuperieur;
        cerclesSuperieur = (Math.PI * Math.pow(this.diametre/2.0, 2.0)) * 2 - (Math.PI * Math.pow(this.diametreInterne/2.0, 2.0)) * 2;
        surface = this.hauteur * 2 * Math.PI * (this.diametre/2) + this.hauteur * 2 * Math.PI * (this.diametreInterne/2);
        return cerclesSuperieur + surface;
    }

    @Override
    public String toString() 
    {
        return "Cylindre Creux de dimensions h : " + this.hauteur + " et d : " + this.diametre + " et un ceux de diametre : " + this.diametreInterne + " et un poids de " + Math.round(this.poids() * 100.00)/100.00;
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
            if (object instanceof CylindreCreux)
            {
                CylindreCreux castedObject = (CylindreCreux)object;
                if (this.densite == (castedObject.densite) && this.matiere == (castedObject.matiere) && this.hauteur == (castedObject.hauteur) && this.diametreInterne == (castedObject.diametreInterne) && this.diametre == (castedObject.diametre)) 
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