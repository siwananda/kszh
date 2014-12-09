package utils;


import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

/**
 * Created by siwananda on 12/9/2014.
 * Helper for morphia - connects to mongo client
 */
public class MorphiaObject {

    static public MongoClient mongo;

    static public Morphia morphia;

    static public Datastore datastore;
}
