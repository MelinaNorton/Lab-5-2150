
/**
 * This will create the name, genus, species, and the leg count for the mammal which will be used
 * to get and return these descriptions. This inheritance structure is getting the description
 * of the animal from IAnimal.java for the common name, genus, and species but it is getting
 * the leg count from IMammal.java.
 *
 * @invariant 0 < |commonName| AND 0 < |genus| AND 0 < |species| AND 0 < legCount
 *
 *
 * @corresponds common_ name = commonName AND genus = genus AND species = species
 * AND leg_count = legCount
 *
 */
public class Mammal implements IMammal{

    private String commonName;
    private String genus;
    private String species;
    private int legCount;

    /**
     * This constructor will use commonName, genus, species, and legCount to create the
     * instance of the class and assign values to the object's members.
     *
     * @param aCommonName a string, the common name of the mammal
     * @param aGenus a string, the genus of the mammal
     * @param aSpecies a string, the species of the mammal
     * @param aLegCount an int, the leg count of the mammal
     *
     * @pre 0 < |aCommonName| AND 0 < |Genus| AND 0 < |Species| AND 0 < aLegCount
     *
     * @post commonName = #aCommonName AND genus = #aGenus AND species = #aSpecies
     * AND legCount = #alegCount
     *
     */
    public Mammal(String aCommonName, String aGenus, String aSpecies, int aLegCount)
    {
        commonName = aCommonName;
        genus = aGenus;
        species = aSpecies;
        legCount = aLegCount;
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

    public int getLegCount()
    {
        return legCount;
    }
}
