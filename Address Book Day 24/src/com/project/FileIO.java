package com.project;


import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class FileIO {

    public void writeData(Map<String, AddressBookMain> addressBook) {
        File file = new File("C:\\Users\\admin\\Desktop\\java\\Day27ADDRESSBOOK\\Java_Day27_AddressBookSystem_FileIO\\src\\com\\day27\\AddressBookSystem.java");
        BufferedWriter bw = null;

        try {

            bw = new BufferedWriter(new FileWriter(file));

            for (Map.Entry<String, AddressBookMain> entry : addressBook.entrySet()) {

                bw.write(entry.getKey() + ":" + entry.getValue());


                bw.newLine();
            }
            bw.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static Map<String,  String> readData() {

        Map<String, String> mapFileContents = new HashMap<>();
        BufferedReader br = null;

        try {

            File file = new File("Address Book.txt");


            br = new BufferedReader(new FileReader(file));

            String line = null;

            while ((line = br.readLine()) != null) {

                String[] parts = line.split(":");
                String bookName = parts[0].trim();
                String fname = parts[1].trim();
                mapFileContents.put(bookName, fname);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                }
            }
        }
        return mapFileContents;
    }
}