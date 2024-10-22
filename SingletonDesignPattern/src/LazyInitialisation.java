/**
 * This class implements the Singleton design pattern using lazy initialization.
 * The Singleton pattern ensures that only one instance of a class is created and provides a global point of access to it.
 */
public class LazyInitialisation {
    /**
     * The single instance of the LazyInitialisation class.
     */
    private static LazyInitialisation instance;

    /**
     * Private constructor to prevent instantiation from outside the class.
     */
    private LazyInitialisation() {
        // Private constructor to prevent instantiation from outside the class
    }
    /**
     * Returns the single instance of the LazyInitialisation class.
     * If the instance is not yet created, it will be created and returned.
     *
     * @return The single instance of the LazyInitialisation class.
     */
    public static LazyInitialisation getInstance() {
        if (instance == null) { 
            instance = new LazyInitialisation(); 
        }
        return instance;
    }
}
