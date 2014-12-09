import com.mongodb.MongoClient;
import org.mongodb.morphia.Morphia;
import play.GlobalSettings;
import play.Logger;
import utils.MorphiaObject;

import java.net.UnknownHostException;

/**
 * Created by siwananda on 12/9/2014.
 * Global settings override
 */
public class Global extends GlobalSettings {
    @Override
    public void onStart(play.Application arg) {
        super.beforeStart(arg);

        Logger.debug("onStart");


        //Starts off mongo connection on load
        try {
            MorphiaObject.mongo = new MongoClient("127.0.0.1", 27017);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        MorphiaObject.morphia = new Morphia();
        MorphiaObject.datastore = MorphiaObject.morphia.createDatastore(MorphiaObject.mongo, "kSpicy");
        MorphiaObject.datastore.ensureIndexes();
        MorphiaObject.datastore.ensureCaps();

        Logger.debug("** Morphia datastore: " + MorphiaObject.datastore.getDB());
    }
}
