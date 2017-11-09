
import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author molin
 */
public class Connection {
    Datastore ds;
    
   public Connection(){
    MongoClient mongo = new MongoClient();
        Morphia morphia = new Morphia();
        // clases a guardar:
        morphia.map(Tanque.class);
        ds = morphia.createDatastore(mongo, "tanques"); // Base Datos    
   }
   
}
