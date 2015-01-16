/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;


/**
 *
 * @author kshaw
 */
public class EventPlanner extends javax.swing.JFrame {
    EventsController econtroller = new EventsController();
    /**
     * Creates new form EventPlanner
     */
    public EventPlanner() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListOfEvents = new javax.swing.JList();
        NameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        LocationTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        DateTextField = new javax.swing.JTextField();
        MonthTextField = new javax.swing.JTextField();
        YearTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        MessageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jButton1.setBackground(new java.awt.Color(255, 153, 204));
        jButton1.setFont(new java.awt.Font("Snell Roundhand", 0, 36)); // NOI18N
        jButton1.setText("Save the Date");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ListOfEvents.setModel(new DefaultListModel<Event>()
            {
                public int getSize(){
                    return econtroller.getNumEvents();
                }
                public Event getElementAt(int i) {
                    return econtroller.getEvent(i);
                }
                public void addElement(Event e) {
                    super.addElement(e);
                    econtroller.addEvent(e);
                }
                public void add(int i, Event e) {
                    super.add(i,e);
                    econtroller.addEvent(e);
                }
            });
            jScrollPane1.setViewportView(ListOfEvents);

            jLabel1.setFont(new java.awt.Font("Snell Roundhand", 0, 22)); // NOI18N
            jLabel1.setText("Name of event");

            jLabel2.setFont(new java.awt.Font("Snell Roundhand", 0, 22)); // NOI18N
            jLabel2.setText("Month / Day / Year");

            jLabel3.setFont(new java.awt.Font("Snell Roundhand", 0, 22)); // NOI18N
            jLabel3.setText("Location");

            MessageLabel.setFont(new java.awt.Font("Muna", 1, 12)); // NOI18N
            MessageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            MessageLabel.setText(".");
            MessageLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(LocationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(MonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(YearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(109, 109, 109)
                            .addComponent(MessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(133, 133, 133)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(38, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LocationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(YearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MessageLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        File outFile = new File("/Users/katidid/desktop/EVENTS.txt");

        if (ListOfEvents.getModel().getSize() == 0)
        {
            try (BufferedReader reader = new BufferedReader(new FileReader(outFile))) 
            {
                String line = null;
                while ((line = reader.readLine()) != null) 
                {
                    Event newEvent = parseNewEvent(line);
                    
                    ((DefaultListModel)ListOfEvents.getModel()).addElement(newEvent);
                }
            } 
            catch (IOException x) 
            {
                System.err.format("IOException: %s%n", x);
            }
        }
        try
        {
            String name = NameTextField.getText();
            String loc = LocationTextField.getText();
            int mon = Integer.parseInt(MonthTextField.getText().toString());
            int date = Integer.parseInt(DateTextField.getText());
            int year = Integer.parseInt(YearTextField.getText());
        
            Event newEvent = new Event(name, loc, mon, date, year);
            ((DefaultListModel)ListOfEvents.getModel()).addElement(newEvent);
            clearTextFields();
            try
            {
                //File outFile = new File("/Users/katidid/desktop/EVENTS.txt");
                FileWriter writer = new FileWriter(outFile, true);
                econtroller.outputToFile(newEvent, writer);
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
                MessageLabel.setText("Please enter text in all five boxes.");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * 
     */
    public void clearTextFields() // To make the interface more clean
    {
        YearTextField.setText(null);
        DateTextField.setText(null);
        MonthTextField.setText(null);
        LocationTextField.setText(null);
        NameTextField.setText(null); 
        MessageLabel.setText(null);
    }
    /**
     * 
     * @return 
     */
    public boolean allFieldsFilled() // So the exception message can be specific 
            // about the type of error it's encountering (wrong text or no text)
    {
        return YearTextField.getText().length() != 0 && 
                DateTextField.getText().length() != 0 &&
                MonthTextField.getText().length() != 0 &&
                LocationTextField.getText().length() != 0 &&
                NameTextField.getText().length() != 0;
    }
    /**
     * 
     * @param line
     * @return 
     */
    public static Event parseNewEvent(String line)
    {
        Event newEvent = new Event();
        
        String phrase = line;
        String delims = " ";
        String[] phrases = phrase.split(delims);
        
        newEvent.setName(phrases[0]);
        newEvent.setLocation(phrases[2]);
        
        String datesPhrase = phrases[4];
        String delims2 = "/";
        String[] dates = datesPhrase.split(delims2);
        
        int month = Integer.parseInt(dates[0]);
        int date = Integer.parseInt(dates[1]);
        int year = Integer.parseInt(dates[2]);
        newEvent.setMonth(month);
        newEvent.setDate(date);
        newEvent.setYear(year);
        
        return newEvent;
    }
    
    public ArrayList sortListByDate(ArrayList list)
    {
        ArrayList sortedArray = new ArrayList<Event>();
        //if ()
        
        return sortedArray;
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
            java.util.logging.Logger.getLogger(EventPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventPlanner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DateTextField;
    private javax.swing.JList ListOfEvents;
    private javax.swing.JTextField LocationTextField;
    private javax.swing.JLabel MessageLabel;
    private javax.swing.JTextField MonthTextField;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JTextField YearTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
