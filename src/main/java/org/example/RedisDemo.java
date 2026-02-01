package org.example;

import redis.clients.jedis.Jedis;

public class RedisDemo {
    public static void main(String[] args) {

        // Connect to Redis server
        Jedis jedis = new Jedis("localhost", 6379);

        // Store some data
        jedis.set("user:1:name", "Mayank");
        jedis.set("user:1:role", "Backend Engineer");

        // Retrieve data
        String name = jedis.get("user:1:name");
        String role = jedis.get("user:1:role");

        System.out.println("Name from Redis: " + name);
        System.out.println("Role from Redis: " + role);

        jedis.close();
    }
}
