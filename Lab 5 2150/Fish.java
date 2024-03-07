
/**
 * This will create the name, genus, species, and the fin count for the fish which will be used
 * to get and return these descriptions. This inheritance structure is getting the description
 * of the animal from IAnimal.java for the common name, genus, and species but it is getting
 * the fin count from IFish.java.
 *
 * @invariant commonName != null AND genus != null AND species != null AND 0 < legCount
 *
 * @corresponds  common_ name = commonName AND genus = genus AND species = species
 * AND fin_count = finCount
 *
 */
public class Fish implements IFish {

    private String commonName;
    private String genus;
    private String species;
    private int finCount;

    /**
     * This constructor will use commonName, genus, species, and finCount to create the
     * instance of the class and assign values to the object's members.
     *
     * @param aCommonName a string, the common name of the fish
     * @param aGenus a string, the genus of the fish
     * @param aSpecies a string, the species of the fish
     * @param aFinCount an int, the fin count of the fish
     *
     * @pre aCommonName != null AND aGenus != null AND  aSpecies != null AND 0 < aFinCount
     *
     * @post commonName = #aCommonName AND genus = #aGenus AND species = #aSpecies
     * AND finCount = #aFinCount
     */
    public Fish(String aCommonName, String aGenus, String aSpecies, int aFinCount)
    {
        commonName = aCommonName;
        genus = aGenus;
        species = aSpecies;
        finCount = aFinCount;
    }

    public String getGenus()
    {
        return genus;
    }

    public String getSpecies()
    {
        return species;
    }

    public String getCommonName()
    {
        return commonName;
    }

    public int getFinCount()
    {
        return finCount;
    }
}
