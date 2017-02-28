package com.example.home.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

/**
 * Created by Home on 28.02.17.
 */



    public class JsonParseTest {

        private static final String filePath = "/Users/Home/Documents/offers.json";

        public static void main(String[] args) {

            try {

                FileReader reader = new FileReader(filePath);

                JSONParser jsonParser = new JSONParser();
                org.json.simple.JSONObject jsonObject =  (org.json.simple.JSONObject)jsonParser.parse(reader);
                System.out.println(jsonObject);

                JSONArray kategorieliste= (JSONArray) jsonObject.get("kategorie");


                System.out.println(kategorieliste.toString());

                System.out.println(kategorieliste.get(1).toString());

                for (Object jo : kategorieliste) {
                    JSONObject jso = (JSONObject) jo;
                    System.out.println(jso.get("name"));
                }




            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ParseException ex) {
                ex.printStackTrace();
            } catch (NullPointerException ex) {
                ex.printStackTrace();
            }


        }

    }




