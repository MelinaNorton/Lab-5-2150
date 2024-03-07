/**
 *
 * @defines
 *  - commonName: a String representing the commonly used name of the animal
 *  - genus: a String representing the genus part of the scientific name of the animal
 *  - species: a String representing the species part of the scientific name of the animal
 *
 * @constraints
 *  - commonName, genus, and species cannot be null or empty.
 *  - genus and species should follow the binomial nomenclature, where genus is capitalized and species is lowercase.
 *
 * @initialization_ensures
 * *  - That the animal is initialized with its common name, genus, and species as provided by the implementing class.
 */
public interface IAnimal
/**
 * Returns the common name of the animal.
 *
 * @return the common name of the animal, which is not null or empty.
 */
    public String getCommonName();

/**
 * Returns the genus part of the scientific name of the animal.
 *
 * @return a non-null, non-empty String representing the genus of the animal, capitalized according to
 *         scientific naming conventions.
 */
    public String getGenus();

/**
 * Returns the species part of the scientific name of the animal.
 *
 * @return a non-null, non-empty String representing the species of the animal, in lowercase according to
 *         scientific naming conventions.
 */
    public String getSpecies();

/**
 * Provides a default description of the animal, combining its common name and scientific name in a readable format.
 * This method showcases how default methods can be utilized in interfaces to provide common functionality across all implementing classes.
 *
 * @return a String that combines the animal's common name and its scientific name (genus capitalized, species lowercase), facilitating easy and consistent identification.
 */
    public default String getDescription(){
        String properGenusFormatting = getGenus().substring(0,1).toUpperCase() + getGenus().substring(1).toLowerCase();
        return getCommonName() + " (" + properGenusFormatting + " " + getSpecies().toLowerCase() + ")";
    }


}
