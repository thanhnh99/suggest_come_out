// package com.k62j.uet.suggest_come_out.util;
//
// import com.k62j.uet.suggest_come_out.dao.IDecisiveTreeConditionDAO;
// import com.k62j.uet.suggest_come_out.models.entity.DecisiveTreeCondition;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Bean;
// import org.springframework.stereotype.Component;
//
//
// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;
//
// @Component
// public class ID3Seed {
//     @Autowired
//     IDecisiveTreeConditionDAO decisiveTreeConditionDAO;
//     @Bean
//     public void readCSV()
//     {
//         String csvFile = "D:\\Java\\SPRING\\suggest_come_out\\src\\main\\resources\\data\\weather.csv";
//         BufferedReader br = null;
//         BufferedReader pre_count = null;
//
//         String line = "";
//         String cvsSplitBy = ",";
//
//         int row=0;
//         int col=0;
//         try {
//             pre_count = new BufferedReader(new FileReader(csvFile));
//             while ((line = pre_count.readLine()) != null) {
//                 // use comma as separator
//                 String[] attributes = line.split(cvsSplitBy);
//                 col = attributes.length - 1;
//                 row++;
//             }
//             // size of table
// //            table  = new String [row][col];
//             int rows =0;
//             br = new BufferedReader(new FileReader(csvFile));
//             while ((line = br.readLine()) != null) {
//                 String[] attributes = line.split(cvsSplitBy);
// //                for(int i = 1 ; i < col+1 ; i++){
// //                    table[rows][i-1] = attributes[i];
// //                }
//                 DecisiveTreeCondition decisiveTreeCondition = new DecisiveTreeCondition();
//                 decisiveTreeCondition.setOutlook(attributes[1]);
//                 decisiveTreeCondition.setTemp(attributes[2]);
//                 decisiveTreeCondition.setWind(attributes[3]);
//                 decisiveTreeCondition.setDate(attributes[4]);
//                 decisiveTreeCondition.setDecisive(attributes[5]);
//                 decisiveTreeConditionDAO.save(decisiveTreeCondition);
//
//             }
//
//         }
//         catch (IOException e) {
//             System.out.println("File not found Exception");
//         } finally {
//             if (br != null) {
//                 try {
//                     br.close();
//                 } catch (IOException e) {
//                     System.out.println("File not found Exception Finally");
//                 }
//             }
//         }
//     }
// }
