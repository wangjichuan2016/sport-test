package com.lesports.wangjichuan.util.mongo;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import static com.mongodb.client.model.Filters.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by wangjichuan on 16-5-9.
 */
public class MongoTest {
    public static void main(String[] args) throws Exception{
        File file = new File("d:/1.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(file,false));
        ServerAddress serverAddress = new ServerAddress("10.180.91.126",9267);
        List<ServerAddress> addrs = new ArrayList<ServerAddress>();
        addrs.add(serverAddress);

        MongoCredential credential = MongoCredential.createScramSha1Credential("lesports-sns", "lesports_topic", "lesports!2016".toCharArray());
        List<MongoCredential> credentials = new ArrayList<MongoCredential>();
        credentials.add(credential);
        MongoClient mongoClient = new MongoClient(addrs,credentials);

        MongoDatabase mongoDatabase = mongoClient.getDatabase("lesports_topic");

        MongoCollection<Document> mongoCollection =   mongoDatabase.getCollection("topicReply");
        MongoCollection<Document> replyCollection =   mongoDatabase.getCollection("replyWateringUser");
        FindIterable<Document> findIterable1 = replyCollection.find();
        MongoCursor<Document> mongoCursor1 = findIterable1.iterator();
        Set<String> waterUserSet = new HashSet<String>();
        while (mongoCursor1.hasNext()){
            Document document = mongoCursor1.next();
            waterUserSet.add(document.getString("uid"));
        }
        FindIterable<Document> findIterable = mongoCollection.find(eq("tid","1755023411462686511054182"));
        MongoCursor<Document> mongoCursor = findIterable.iterator();
        while(mongoCursor.hasNext()){
            Document document = mongoCursor.next();
            if(!document.getBoolean("isDeleted") && !waterUserSet.contains(document.getString("uid"))){
//                writer.write(document.get("ip") + "\t" + document.get("uid") + "\t" + document.get("uname") + "\t" + ((Document) document.get("msgContent")).get("content"));
                writer.write(document.get("uid") + "\t" + document.get("uname"));
                writer.newLine();
            }
        }
        writer.flush();
        writer.close();

    }
}
