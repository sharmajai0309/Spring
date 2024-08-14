package com.example.demo.Runner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.dao.IJobSeaker;
import com.example.demo.entity.JobSeaker;

@Component
public class TestRunner implements CommandLineRunner {

    @Autowired
    private IJobSeaker repo;
    
    @Override
    public void run(String... args) throws Exception {
        Optional<JobSeaker> optional = repo.findById((long) 2);
        if (optional.isPresent()) {
            JobSeaker js = optional.get();
            System.out.println(js);

            // Define paths
            String imagePath = "imageRetrived.jpg";
            String bioDataPath = "BioData.text";
            
            // Save image data
            try (OutputStream os = new FileOutputStream(new File(imagePath))) {
                if (js.getPhoto() != null) {
                    os.write(js.getPhoto());
                    os.flush();
                    System.out.println("Image data saved successfully to " + imagePath);
                } else {
                    System.err.println("No image data available to save.");
                }
            } catch (IOException e) {
                System.err.println("Error saving image: " + e.getMessage());
            }

            // Save bio data
            try (Writer writer = new FileWriter(new File(bioDataPath))) {
                if (js.getBioDate() != null) {
                    writer.write(js.getBioDate());
                    writer.flush();
                    System.out.println("Bio data saved successfully to " + bioDataPath);
                } else {
                    System.err.println("No bio data available to save.");
                }
            } catch (IOException e) {
                System.err.println("Error saving bio data: " + e.getMessage());
            }
        } else {
            System.out.println("Record not found");
        }
    }
}
