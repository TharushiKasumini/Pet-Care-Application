package views;

// Import controller
import controllers.VolunteerController;
import controllers.PetController;
import controllers.AdoptionController;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;

// Import Mainframe 
import paws_and_care.MainFrame;

// Import Nono editable table
import models.NonEditableTableModel;
import models.SelectionModel;


public class AdoptionFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdoptionFrame
     */
    public AdoptionFrame() {
        initComponents();
    }
    
    // Variables realted to the adoption registration
    private String volunteer = "";
    private int volunteerId = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        secondaryPanel = new javax.swing.JPanel();
        petSelectionPanel = new javax.swing.JPanel();
        petSelectionLabel = new javax.swing.JLabel();
        petSelection = new javax.swing.JComboBox<>();
        petSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        petTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        VolunteerSelctionPanel = new javax.swing.JPanel();
        petSelectionLabel1 = new javax.swing.JLabel();
        volunteerSearch = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        volunteerName = new javax.swing.JTextField();
        VolunteerDetailsLabel = new javax.swing.JLabel();
        volunteerNameLabel = new javax.swing.JLabel();
        volunteerAgeLabel = new javax.swing.JLabel();
        volunteerAddressLabel = new javax.swing.JLabel();
        mobileNumber = new javax.swing.JLabel();
        registrationPanel = new javax.swing.JPanel();
        regsitrationLabel = new javax.swing.JLabel();
        volunteerConfirmLabel = new javax.swing.JLabel();
        petConfirmLabel = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        petIDField = new javax.swing.JLabel();
        petConfirmNameLabel = new javax.swing.JLabel();
        petNameField = new javax.swing.JLabel();
        seeAdoptions = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Adoption Management");

        secondaryPanel.setBackground(new java.awt.Color(255, 255, 204));

        petSelectionPanel.setBackground(new java.awt.Color(255, 255, 153));
        petSelectionPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        petSelectionLabel.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        petSelectionLabel.setText("Show Available Pets for Adoption");

        petSelection.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        petSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cat", "Dog" }));

        petSearch.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        petSearch.setText("Search");
        petSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petSearchActionPerformed(evt);
            }
        });

        petTable.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        petTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age", "Breed"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(petTable);
        if (petTable.getColumnModel().getColumnCount() > 0) {
            petTable.getColumnModel().getColumn(0).setResizable(false);
            petTable.getColumnModel().getColumn(0).setPreferredWidth(3);
            petTable.getColumnModel().getColumn(1).setResizable(false);
            petTable.getColumnModel().getColumn(2).setResizable(false);
            petTable.getColumnModel().getColumn(2).setPreferredWidth(2);
            petTable.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout petSelectionPanelLayout = new javax.swing.GroupLayout(petSelectionPanel);
        petSelectionPanel.setLayout(petSelectionPanelLayout);
        petSelectionPanelLayout.setHorizontalGroup(
            petSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, petSelectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(petSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, petSelectionPanelLayout.createSequentialGroup()
                        .addGroup(petSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(petSelectionLabel)
                            .addGroup(petSelectionPanelLayout.createSequentialGroup()
                                .addComponent(petSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(petSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 128, Short.MAX_VALUE)))
                .addContainerGap())
        );
        petSelectionPanelLayout.setVerticalGroup(
            petSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(petSelectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(petSelectionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(petSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(petSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(petSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addContainerGap())
        );

        VolunteerSelctionPanel.setBackground(new java.awt.Color(255, 255, 153));
        VolunteerSelctionPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        petSelectionLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        petSelectionLabel1.setText("Select the Volunteer");

        volunteerSearch.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        volunteerSearch.setText("Search");
        volunteerSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volunteerSearchActionPerformed(evt);
            }
        });

        volunteerName.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N

        VolunteerDetailsLabel.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        VolunteerDetailsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VolunteerDetailsLabel.setText("Volunteer Details");

        volunteerNameLabel.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        volunteerNameLabel.setText("Volunteer Name : ");

        volunteerAgeLabel.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        volunteerAgeLabel.setText("Volunteer Age : ");

        volunteerAddressLabel.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        volunteerAddressLabel.setText("Volunteer Address : ");

        mobileNumber.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        mobileNumber.setText("Mobile Number : ");

        javax.swing.GroupLayout VolunteerSelctionPanelLayout = new javax.swing.GroupLayout(VolunteerSelctionPanel);
        VolunteerSelctionPanel.setLayout(VolunteerSelctionPanelLayout);
        VolunteerSelctionPanelLayout.setHorizontalGroup(
            VolunteerSelctionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VolunteerSelctionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VolunteerSelctionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(volunteerNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(VolunteerSelctionPanelLayout.createSequentialGroup()
                        .addComponent(volunteerName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(volunteerSearch))
                    .addComponent(VolunteerDetailsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(VolunteerSelctionPanelLayout.createSequentialGroup()
                        .addComponent(petSelectionLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(volunteerAgeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(volunteerAddressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mobileNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        VolunteerSelctionPanelLayout.setVerticalGroup(
            VolunteerSelctionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VolunteerSelctionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(petSelectionLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VolunteerSelctionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volunteerSearch)
                    .addComponent(volunteerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VolunteerDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volunteerNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volunteerAgeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volunteerAddressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mobileNumber)
                .addContainerGap())
        );

        registrationPanel.setBackground(new java.awt.Color(255, 255, 153));
        registrationPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        regsitrationLabel.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        regsitrationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regsitrationLabel.setText("Adoption Confirmation");

        volunteerConfirmLabel.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        volunteerConfirmLabel.setText("Volunteer :");

        petConfirmLabel.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        petConfirmLabel.setText("Pet ID :");

        confirmButton.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        confirmButton.setText("Confirm Adoption");
        confirmButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        petIDField.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N

        petConfirmNameLabel.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        petConfirmNameLabel.setText("Pet Name :");

        petNameField.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N

        javax.swing.GroupLayout registrationPanelLayout = new javax.swing.GroupLayout(registrationPanel);
        registrationPanel.setLayout(registrationPanelLayout);
        registrationPanelLayout.setHorizontalGroup(
            registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(volunteerConfirmLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regsitrationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(confirmButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addComponent(petConfirmLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(petIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(petConfirmNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(petNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)))
                .addContainerGap())
        );
        registrationPanelLayout.setVerticalGroup(
            registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regsitrationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volunteerConfirmLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(petConfirmLabel)
                    .addComponent(petIDField)
                    .addComponent(petConfirmNameLabel)
                    .addComponent(petNameField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        seeAdoptions.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        seeAdoptions.setText("See Previous Adoptions");
        seeAdoptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeAdoptionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout secondaryPanelLayout = new javax.swing.GroupLayout(secondaryPanel);
        secondaryPanel.setLayout(secondaryPanelLayout);
        secondaryPanelLayout.setHorizontalGroup(
            secondaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondaryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(secondaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(secondaryPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(seeAdoptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(petSelectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(secondaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(VolunteerSelctionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registrationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        secondaryPanelLayout.setVerticalGroup(
            secondaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondaryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(secondaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(secondaryPanelLayout.createSequentialGroup()
                        .addComponent(petSelectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seeAdoptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(secondaryPanelLayout.createSequentialGroup()
                        .addComponent(VolunteerSelctionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(registrationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        homeButton.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(secondaryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(homeButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(secondaryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // Load the Main frame
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void volunteerSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volunteerSearchActionPerformed
        // Get the data from the Volunteer table
        try {
            // Get the volunteer name
            String name = volunteerName.getText();
            // Make sure to make DB case in-sensitive
            
            // Validating the name 
            if (name.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter a name", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // Create new volunteer controller
            VolunteerController controller = new VolunteerController();
            ResultSet results = controller.getSingleVolunteer(name);
            
            // Extract the data from
            String userName =  results.getString("name");
            int volunteerID = results.getInt("volunteer_id");
            String address = results.getString("address");
            String mobile= results.getString("mobile_number");
            int age = results.getInt("age");
            
            // Set the volunteer name and ID globally
            volunteer = name;
            volunteerId = volunteerID;
            
            // Set the values to the labels
            volunteerNameLabel.setText("Volunteer Name : " + userName);
            volunteerAgeLabel.setText("Volunteer Age : " + String.valueOf(age));
            volunteerAddressLabel.setText("Volunteer Address : " + address);
            mobileNumber.setText("Mobile Number : " + mobile);   
            
            // Set the Confirmation volunteer name
            volunteerConfirmLabel.setText("Volunteer : " + userName);
            
        }
        catch (HeadlessException | SQLException e){
            volunteerName.setText("");
            JOptionPane.showMessageDialog(null, "Volunteer search failed!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_volunteerSearchActionPerformed

    private void petSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petSearchActionPerformed
        // Search the available pets with pet type
        try {
            String type = (String)petSelection.getSelectedItem();
            
            PetController controller = new PetController();
            
            // Get the results from the database
            ResultSet results = controller.getAllPetsAtType(type);
                    
            NonEditableTableModel tableModel = new NonEditableTableModel(new Object[0][4], new String[]{"ID", "Name", "Age", "Breed"});
            
            // Extract the data into the table
            while (results.next()) {
                String name = results.getString("name");
                int age = Integer.parseInt(results.getString("age"));
                int ID = Integer.parseInt(results.getString("animal_id"));
                String breed = results.getString("breed");

                tableModel.addRow(new Object[]{ID, name, age, breed});
            }
        
        petTable.setModel(tableModel);
        if (petTable.getColumnModel().getColumnCount() > 0) {
            petTable.getColumnModel().getColumn(0).setResizable(false);
            petTable.getColumnModel().getColumn(0).setPreferredWidth(3);
            petTable.getColumnModel().getColumn(1).setResizable(false);
            petTable.getColumnModel().getColumn(2).setResizable(false);
            petTable.getColumnModel().getColumn(2).setPreferredWidth(2);
            petTable.getColumnModel().getColumn(3).setResizable(false);
        }
        
        // Get the selection Model
        SelectionModel selectionModel = new SelectionModel(petTable, petNameField, petIDField);
        petTable.getSelectionModel().addListSelectionListener(selectionModel);
        
            
        }
        catch (NumberFormatException | SQLException e){
            System.out.println("ERROR - Cannot load the pets from the database");
        }
        
        
    }//GEN-LAST:event_petSearchActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // Register the adoption
        
        // Get the required data to register the adopition
        // Get the volunteer data
        int volunteerID = volunteerId;
        String name = volunteer;
        
        if ((volunteerID == 0) || (name.equals(""))){
            JOptionPane.showMessageDialog(null, "Please select a regsitered volunteer", "Error", JOptionPane.ERROR_MESSAGE);
            volunteerName.setText("");
            return;
        }
        
        // Get Pet Data and validation
        String pet = petNameField.getText();
        String petIDValue = petIDField.getText();
        
        if((petIDValue.equals("")) || (pet.equals(""))){
            JOptionPane.showMessageDialog(null, "Please select a regsitered volunteer", "Error", JOptionPane.ERROR_MESSAGE);
            volunteerName.setText("");
            return;
        }
        
        int petId = Integer.parseInt(petIDValue);
        
        // Create adoption controller
        AdoptionController adoptionController = new AdoptionController();
        PetController petController = new PetController();
        
        // Register the adoption
        int rowsFromAdoption = adoptionController.insertAdoption(volunteerID, name, petId, pet);
        int rowsFromPet = petController.updatePet(petId);
        
        if ((rowsFromAdoption > 0) && (rowsFromPet > 0)){
            volunteerName.setText("");
            JOptionPane.showMessageDialog(null, "Adoption Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        else{
            JOptionPane.showMessageDialog(null, "Adoption Failed!", "Error", JOptionPane.ERROR_MESSAGE); 
            return;
        }
        
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void seeAdoptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeAdoptionsActionPerformed
        
        // Redirect to the all adoptions
        AllAdoptions allAdoptions = new AllAdoptions();
        allAdoptions.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_seeAdoptionsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdoptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdoptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdoptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdoptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdoptionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel VolunteerDetailsLabel;
    private javax.swing.JPanel VolunteerSelctionPanel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel mobileNumber;
    private javax.swing.JLabel petConfirmLabel;
    private javax.swing.JLabel petConfirmNameLabel;
    private javax.swing.JLabel petIDField;
    private javax.swing.JLabel petNameField;
    private javax.swing.JButton petSearch;
    private javax.swing.JComboBox<String> petSelection;
    private javax.swing.JLabel petSelectionLabel;
    private javax.swing.JLabel petSelectionLabel1;
    private javax.swing.JPanel petSelectionPanel;
    private javax.swing.JTable petTable;
    private javax.swing.JPanel registrationPanel;
    private javax.swing.JLabel regsitrationLabel;
    private javax.swing.JPanel secondaryPanel;
    private javax.swing.JButton seeAdoptions;
    private javax.swing.JLabel volunteerAddressLabel;
    private javax.swing.JLabel volunteerAgeLabel;
    private javax.swing.JLabel volunteerConfirmLabel;
    private javax.swing.JTextField volunteerName;
    private javax.swing.JLabel volunteerNameLabel;
    private javax.swing.JButton volunteerSearch;
    // End of variables declaration//GEN-END:variables
}