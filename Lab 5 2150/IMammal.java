/**
 *
 *
 * @defines: legCount, this is the leg count for mammal
 *
 * @constraints: 0 < legCount
 *
 * @initialization_ensures: a mammal object initialized with parameters
 */
public interface IMammal extends IAnimal
{
    /**
     *
     */
    public int getLegCount();
}
