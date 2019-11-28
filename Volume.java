public abstract class Volume implements VolumeCalculable {
    
    protected String matiere;
    protected double densite;

    public Volume(String matiere, double densite)
    {
      this.matiere = matiere;
      this.densite = densite;
    }

    public Volume(Volume volume)
    {
        this.matiere = volume.matiere;
        this.densite = volume.densite;
    }

    @Override
    public double poids()
    {
        return volume() * densite;
    }

    public String toString() 
    {
        return " en " + this.matiere;
    }



}