/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.DefaultListModel;

/**
 *
 * @author katidid
 */
public class TournamentSimulator extends javax.swing.JFrame {
    TourneyController controller = new TourneyController();
    int CompetitorYes = 2; // Check if adding a judge or competitor; 1 if true, 0 if false
    /**
     * Creates new form TournamentSimulator
     */
    public TournamentSimulator() {
        initComponents();
        populateListBox();
        populateJudgeListBox();
    }
    
    private void populateListBox()
    {
        File outFile = new File("/Users/katidid/desktop/COMPETITORS.txt");
        if (ListOfCompetitors.getModel().getSize() == 0)
        {
            try (BufferedReader reader = new BufferedReader(new FileReader(outFile))) 
            {
                String line = null;
                while ((line = reader.readLine()) != null) 
                {
                    Competitor newCompetitor = parseNewCompetitor(line);
                    
                    ((DefaultListModel)ListOfCompetitors.getModel()).addElement(newCompetitor);
                    
                }
            } 
            catch (IOException x) 
            {
                System.err.format("IOException: %s%n", x);
            }
        }
    }
    
    private void populateJudgeListBox()
    {
        File outFile = new File("/Users/katidid/desktop/JUDGES.txt");
        if (ListOfJudges.getModel().getSize() == 0)
        {
            try (BufferedReader reader = new BufferedReader(new FileReader(outFile))) 
            {
                String line = null;
                while ((line = reader.readLine()) != null) 
                {
                    Judge newJ = parseNewJudge(line);
                    
                    ((DefaultListModel)ListOfJudges.getModel()).addElement(newJ);
                    
                }
            } 
            catch (IOException x) 
            {
                System.err.format("IOException: %s%n", x);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        AddTypeBG = new javax.swing.ButtonGroup();
        newPersonButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListOfCompetitors = new javax.swing.JList();
        NameTextField = new javax.swing.JTextField();
        SchoolTextField = new javax.swing.JTextField();
        NoviceButton = new javax.swing.JRadioButton();
        JuniorButton = new javax.swing.JRadioButton();
        OpenButton = new javax.swing.JRadioButton();
        MessageLabel = new javax.swing.JLabel();
        AddCompRButton = new javax.swing.JRadioButton();
        AddJudgeRButton = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListOfJudges = new javax.swing.JList();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        newPersonButton.setText("Add competitor");
        newPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPersonButtonActionPerformed(evt);
            }
        });

        ListOfCompetitors.setModel(new DefaultListModel<Competitor>()
            {
                public int getSize(){
                    return controller.getNumComps();
                }
                public Competitor getElementAt(int i) {
                    return controller.getCompetitor(i);
                }
                public void addElement(Competitor e) {
                    super.addElement(e);
                    controller.addStu(e);
                }
                public void add(int i, Competitor e) {
                    super.add(i,e);
                    controller.addStu(e);
                }
            });
            jScrollPane1.setViewportView(ListOfCompetitors);

            NameTextField.setText("Name");

            SchoolTextField.setText("School");

            buttonGroup1.add(NoviceButton);
            NoviceButton.setText("Novice");

            buttonGroup1.add(JuniorButton);
            JuniorButton.setText("Junior");

            buttonGroup1.add(OpenButton);
            OpenButton.setText("Open");

            MessageLabel.setText("Message");

            AddTypeBG.add(AddCompRButton);
            AddCompRButton.setText("Add Competitor");
            AddCompRButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    AddCompRButtonActionPerformed(evt);
                }
            });

            AddTypeBG.add(AddJudgeRButton);
            AddJudgeRButton.setText("Add Judge");
            AddJudgeRButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    AddJudgeRButtonActionPerformed(evt);
                }
            });

            ListOfJudges.setModel(new DefaultListModel<Judge>()
                {
                    public int getSize(){
                        return controller.getNumJudges();
                    }
                    public Judge getElementAt(int i) {
                        return controller.getJudge(i);
                    }
                    public void addElement(Judge e) {
                        super.addElement(e);
                        controller.addJudge(e);
                    }
                    public void add(int i, Judge e) {
                        super.add(i,e);
                        controller.addJudge(e);
                    }
                });
                jScrollPane2.setViewportView(ListOfJudges);

                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                jComboBox1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jComboBox1ActionPerformed(evt);
                    }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(newPersonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NameTextField)
                                .addComponent(SchoolTextField))
                            .addComponent(NoviceButton)
                            .addComponent(JuniorButton)
                            .addComponent(OpenButton)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(298, 298, 298))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(MessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(AddCompRButton)
                                .addGap(18, 18, 18)
                                .addComponent(AddJudgeRButton)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SchoolTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NoviceButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JuniorButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(OpenButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(newPersonButton))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(AddCompRButton)
                                    .addComponent(AddJudgeRButton))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(25, 25, 25)
                        .addComponent(MessageLabel)
                        .addContainerGap())
                );

                pack();
            }// </editor-fold>//GEN-END:initComponents

    private void newPersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPersonButtonActionPerformed
        if (CompetitorYes == 1) 
        {
            buttonForAddingCompetitors();
        }
        else if (CompetitorYes == 0)
        {
            buttonForAddingJudges();
        }
        else
            MessageLabel.setText("Please select 'add judge' or 'add competitor.'");
    }//GEN-LAST:event_newPersonButtonActionPerformed
    public void buttonForAddingCompetitors()
{
    File studentOutFile = new File("/Users/katidid/desktop/COMPETITORS.txt");
        try
        {
            String name = NameTextField.getText();
            String school = SchoolTextField.getText();
            int level;
            if(NoviceButton.isSelected())
                level = 1;
            else if(JuniorButton.isSelected())
                level = 2;
            else if(OpenButton.isSelected())
                level = 3;
            else
                level = 0;
        
            Competitor newStu = new Competitor(name, school, level);
            ((DefaultListModel)ListOfCompetitors.getModel()).addElement(newStu);
          
            try
            {
                FileWriter writer = new FileWriter(studentOutFile, true);
                try
                {
                    writer.write(newStu.toString() + "\n");
                }
                catch(IOException ex)
                {
                    MessageLabel.setText("Didn't output.");
                }
                writer.close();
            }
            catch(IOException ex)
            {
                MessageLabel.setText("Didn't make file");
            }
        }
        catch(NumberFormatException e) // If they don't fill out all the blanks properly
        {
            if (allFieldsFilled() == true)
            {
                MessageLabel.setText("Please don't mix numbers and words."); 
            }
            else
            {
                MessageLabel.setText("Please enter text in all boxes.");
            }
        }
        populateListBox();
    }
    public void buttonForAddingJudges()
    {
        File judgeOutFile = new File("/Users/katidid/desktop/JUDGES.txt");
        try
        {
            String name = NameTextField.getText();
            String school = SchoolTextField.getText();
            int level;

            Judge newJudge = new Judge(name, school);
            ((DefaultListModel)ListOfJudges.getModel()).addElement(newJudge);

            try
            {
                FileWriter writer = new FileWriter(judgeOutFile, true);
                try
                {
                    writer.write(newJudge.toString() + "\n");
                }
                catch(IOException ex)
                {
                    MessageLabel.setText("Didn't output.");
                }
                writer.close();
            }
            catch(IOException ex)
            {
                MessageLabel.setText("Didn't make file");
            }
        }
        catch(NumberFormatException e) // If they don't fill out all the blanks properly
        {
            if (allFieldsFilled() == true)
            {
                MessageLabel.setText("Please don't mix numbers and words."); 
            }
            else
            {
                MessageLabel.setText("Please enter text in all boxes.");
            }
        }
        populateJudgeListBox();
    }

    private void AddCompRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCompRButtonActionPerformed
        CompetitorYes = 1;
        newPersonButton.setText("Add Competitor");
        JuniorButton.setVisible(true);
        OpenButton.setVisible(true);
        NoviceButton.setVisible(true);
    }//GEN-LAST:event_AddCompRButtonActionPerformed

    private void AddJudgeRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddJudgeRButtonActionPerformed
        CompetitorYes = 0;
        newPersonButton.setText("Add Judge");
        JuniorButton.setVisible(false);
        OpenButton.setVisible(false);
        NoviceButton.setVisible(false);
    }//GEN-LAST:event_AddJudgeRButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
public static Competitor parseNewCompetitor(String line) throws NumberFormatException
    {
        Competitor newStu = new Competitor();
        
        String phrase = line;
        String delims = "; ";
        String[] phrases = phrase.split(delims);
        
        newStu.setName(phrases[0].trim());
        newStu.setSchool(phrases[1].trim());
        
        int level = Integer.parseInt(phrases[2].trim());
//        if (level == 0)
//        {
//            throw new NumberFormatException();
//        }
        newStu.setLevel(level);
        
        return newStu;
    }
public static Judge parseNewJudge(String line) throws NumberFormatException
    {
        Judge newJ = new Judge();
        
        String phrase = line;
        String delims = ";";
        String[] phrases = phrase.split(delims);
        
        newJ.setName(phrases[0].trim());
        newJ.setSchool(phrases[1].trim());
        
        return newJ;
    }

public boolean allFieldsFilled() // So the exception message can be specific 
            // about the type of error it's encountering (wrong text or no text)
    {
        return NameTextField.getText().length() != 0 && 
                SchoolTextField.getText().length() != 0; // COME BACK TO THISSSSSSSS!
    }
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
            java.util.logging.Logger.getLogger(TournamentSimulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TournamentSimulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TournamentSimulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TournamentSimulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TournamentSimulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AddCompRButton;
    private javax.swing.JRadioButton AddJudgeRButton;
    private javax.swing.ButtonGroup AddTypeBG;
    private javax.swing.JRadioButton JuniorButton;
    private javax.swing.JList ListOfCompetitors;
    private javax.swing.JList ListOfJudges;
    private javax.swing.JLabel MessageLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JRadioButton NoviceButton;
    private javax.swing.JRadioButton OpenButton;
    private javax.swing.JTextField SchoolTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton newPersonButton;
    // End of variables declaration//GEN-END:variables
}
