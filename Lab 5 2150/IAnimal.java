/**
 *
 * @defines
 *
 * @constraints
 *
 * @initialization_ensures
 */
public interface IAnimal
{
    /**
     *
     */
    public String getCommonName();

    /**
     *
     *
     *
     */
    public String getGenus();

    /**
     *
     *
     *
     */
    public String getSpecies();

    /**
     *
     *
     *
     */
    public default String getDescription(){
        String properGenusFormatting = getGenus().substring(0,1).toUpperCase() + getGenus().substring(1).toLowerCase();
        return getCommonName() + " (" + properGenusFormatting + " " + getSpecies().toLowerCase() + ")";
    }


}
