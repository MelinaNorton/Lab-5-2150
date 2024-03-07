/**
 *
 *
 * @defines: legCount
 *
 * @constraints: 0 < legCount
 *
 * @initialization_ensures: a memmal object initialized with parameters
 */
public interface IMammal extends IAnimal
{
    /**
     *
     */
    public int getLegCount();
}
