/**
 *
 *
 * @defines: finCount, this is a fin count for fish
 *
 * @constraints: 0 < finCount
 *
 * @initialization_ensures: a fish object with members initialized by parameters
 */
public interface IFish extends IAnimal
{
    /**
     * standard getter for fin count
     * @pre none
     * @post getFinCount = finCount
     */
    public int getFinCount();
}
