/**
 *
 *
 * @defines: commonName, species, genus, finCount
 *
 * @constraints: 0 < finCount
 *
 * @initialization_ensures: a fish object with members initialized by parameters
 */
public interface IFish extends IAnimal
{
    /**
     *
     */
    public int getFinCount();
}
