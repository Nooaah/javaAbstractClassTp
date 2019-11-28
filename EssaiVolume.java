import java.util.ArrayList;

class EssaiVolume {
    public static void main(String[] args) {
        ArrayList<Volume> object = new ArrayList<Volume>();

        for (int i = 0 ; i < 10 ; i++) {
            int maximum = 4;
            int nombreAleatoire = (int)(0 + (Math.random() * (maximum - 0)));
            if (nombreAleatoire == 0) {
                object.add(new Sphere(0.5, "Carton", 1));
            }
            else if (nombreAleatoire == 1) {
                object.add(new Parallelepipede(2, 2, 1, "Carton", 1.6));
            }
            else if (nombreAleatoire == 2) {
                object.add(new Cylindre(2, 2, "Carton", 1));
            }
            else if (nombreAleatoire == 3) {
                object.add(new CylindreCreux(2, 2, 1, "Carton", 1));
            }
        }

        System.out.println("\n");
        for (int i = 0 ; i < object.size() ; i++) {
            System.out.println(object.get(i));
        }
        System.out.print("\n");

        Sphere s1 = new Sphere(2.0, "verre", 5.0);
        Sphere s2 = new Sphere(2.0, "verre", 5.0);

        Parallelepipede p1 = new Parallelepipede(2, 2, 1, "Carton", 1.6);
        Parallelepipede p2 = new Parallelepipede(2, 2, 1, "Carton", 1.6);

        Cylindre c1 = new Cylindre(2, 2, "Carton", 1);
        Cylindre c2 = new Cylindre(2, 2, "Carton", 1);

        CylindreCreux cc1 = new CylindreCreux(2, 2, 1, "Carton", 1);
        CylindreCreux cc2 = new CylindreCreux(2, 2, 1, "Carton", 1);

        System.out.println("les Spheres sont egales : " + s1.equals(s2));
        System.out.println("les Parallelepipede sont egaux : " + p1.equals(p2));
        System.out.println("les Cylindres sont egaux : " + c1.equals(c2));
        System.out.println("les Cylindres Creux sont egaux : " + cc1.equals(cc2));

/*

        Sphere s1 = new Sphere(1.3, "Test", 1.6);
        Parallelepipede p1 = new Parallelepipede(2, 2, 1, "Test", 1.6);
        double volumeS, surfaceS, poidsS;
        double volumeP, surfaceP, poidsP;
        String toStringSphere, toStringParallelepipede;

        volumeS = s1.volume();
        surfaceS = s1.surface();
        poidsS = s1.poids();
        toStringSphere = s1.toString();

        volumeP = p1.volume();
        surfaceP = p1.surface();
        poidsP = p1.poids();
        toStringParallelepipede = p1.toString();

        System.out.println(s1.toString());
        System.out.println("La sphere a un volume de " + object.get(O).surface() + ", sa surface est de " + surfaceS + " et son poids de " + poidsS + "\n");
        System.out.println(p1.toString());
        System.out.println("Le Parallelepipede a un volume de " + volumeP + ", sa surface est de " + surfaceP + " et son poids de " + poidsP + "\n");

*/
    }
}