class Sphere extends Volume {
    private double rayon;

    public Sphere(double rayon, String matiere, double densite)
    {
        super(matiere, densite);
        this.rayon = rayon;
    }
    public Sphere(Sphere sphere) {
        super(sphere);
        this.rayon = sphere.rayon;
    }

    @Override
    public double volume() {
        double volume;
        volume = (4.0 * Math.PI * Math.pow(rayon, 3.0)) / 3.0; // (4π×(R^3))/3
        return volume;
    }

    @Override
    public double surface()
    {
        double surface;
        surface = 4.0 * Math.PI * Math.pow(rayon, 2.0); // 4×π×(R^2)
        return surface;
    }

    @Override
    public String toString() 
    {
        return "Sphere de rayon " + this.rayon + " de volume " + Math.round(this.volume() * 100.00)/100.00 + super.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        } else {
            if (object instanceof Sphere) 
            {
                Sphere castedObject = (Sphere)object;
                if (this.matiere == (castedObject.matiere) && this.densite == (castedObject.densite) && this.rayon == (castedObject.rayon)) 
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