/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universityenrollmentsystem;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;


public class UniversityTableGUI extends JFrame {
    
    JTable myTable;
    UniversityTableModel tableModel;
    ArrayList<Person> list;
    
    // contructor
    public UniversityTableGUI(ArrayList<Person> list){
        
        //set the title
        this.setTitle("People in University Enrollment System");
        
        // initialise and instantiate the instance variable 
        this.list = list;
        tableModel = new UniversityTableModel(list);
        myTable =  new JTable(tableModel);
        
        // set the size of the frame 
        setBounds(20,20,800,600); 
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Changed to DISPOSE to avoid closing main console
     
        // sorting
        myTable.setAutoCreateRowSorter(true);
      
        // add the table to the panel
        JScrollPane scrollPane = new JScrollPane(myTable); 
        scrollPane.setPreferredSize(new Dimension(380,280)); 

        // add a button on the bottom
        JButton button = new JButton("Statistics");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                int studentCount = 0;
                int lecturerCount = 0;

                for (Person person : list){
                    if (person instanceof Student){
                        studentCount ++;
                    } else if (person instanceof Lecturer ){
                        lecturerCount++ ;
                    }
                }
                String msg = "The total number of Students: " + studentCount +
                        "\n The total number of Lecturers: " + lecturerCount ;

                JOptionPane.showMessageDialog(null, msg);
            }
        });
        
        // add the panel to the frame
        add(scrollPane,BorderLayout.CENTER); 
        add(button, BorderLayout.SOUTH);
    }
    
}

