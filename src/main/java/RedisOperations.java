import redis.clients.jedis.Jedis;

import java.util.Map;
import java.util.Set;

public class RedisOperations {

    public static void main(String[] args) {
        //Connecting to Redis server on localhost
        try{
            Jedis jedis = new Jedis("localhost");
            System.out.println("Connection to server sucessfully");
            //set the data in redis string
            jedis.set("tutorial-name", "Redis tutorial");
            // Get the stored data and print it
            System.out.println("Stored string in redis:: "+ jedis.get("tutorial-name"));

            // set operations

            jedis.sadd("nicknames", "Ram");
            jedis.sadd("nicknames", "Shyam");
            jedis.sadd("nicknames", "Jay");

            Set<String> nicknames = jedis.smembers("nicknames");
            boolean exists = jedis.sismember("nicknames", "Ram");
            System.out.println("Stored set in redis:: "+ exists);

            int count = Math.toIntExact(jedis.scard("nicknames"));

            System.out.println("Set count in redis:: "+ count);

            // Hash operations

            jedis.hset("user1", "name", "Peter");
            jedis.hset("user1", "job", "politician");

            String name = jedis.hget("user1", "name");

            System.out.println("Hash data redis :: "+ name);

            Map<String, String> fields = jedis.hgetAll("user1");
            String job = fields.get("job");
            System.out.println("Hash data 2 redis :: "+ job);
        } catch(Exception e){
            System.out.println("Unable to Connect with redis server"+e);
        }
        // String Operations



    }
}