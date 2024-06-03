
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class PurchaseTicket extends javax.swing.JFrame {

    ArrayList<Movie> movieList;
    ArrayList<ShowTime> showTimeList;
    /**
     * Creates new form PurchaseTicket
     */
    public PurchaseTicket() {
        initComponents();
        movieList=new ArrayList<>();
        showTimeList=new ArrayList<>();
        try{
            BufferedReader reader=new BufferedReader(new FileReader("movie.txt"));
            String line="";
            while((line=reader.readLine())!=null){
                String[] token=line.split(",");
                movieList.add(new Movie(Integer.parseInt(token[0]),token[1],token[2],Double.parseDouble(token[3])));
            }
            reader.close();
            reader=new BufferedReader(new FileReader("show_time.txt"));
            while((line=reader.readLine())!=null){
                String[] token=line.split(",");
                showTimeList.add(new ShowTime(Integer.parseInt(token[0]),token[1],token[2],Integer.parseInt(token[3])));
            }
            reader.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ticketCountSpinner = new javax.swing.JSpinner();
        timeSlotComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();
        movieIDTextField = new javax.swing.JTextField();
        purchaseButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        ticketTypeComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cinema Ticket Machine");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Purchase Ticket");

        jLabel2.setText("Movie ID: ");

        jLabel3.setText("Date (MM/dd/yyyy):");

        jLabel4.setText("Time Slot:");

        timeSlotComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning", "Afternoon", "Evening", "Night" }));

        jLabel5.setText("Number of Tickets:");

        purchaseButton.setText("Purchase");
        purchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        ticketTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adult", "Senior", "Student" }));

        jLabel6.setText("Ticket Type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(purchaseButton)
                .addGap(45, 45, 45)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(72, 72, 72))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(66, 66, 66)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(timeSlotComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(movieIDTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ticketTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ticketCountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(movieIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(timeSlotComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ticketTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(ticketCountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purchaseButton)
                    .addComponent(cancelButton)
                    .addComponent(clearButton))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        try{
            BufferedWriter writer=new BufferedWriter(new FileWriter("show_time.txt"));
            for(ShowTime showTime:showTimeList){
                writer.write(showTime.getMovieID()+","+showTime.getDate()+","+showTime.getTimeSlot()+","+showTime.getAvailableTicket()+"\n");
            }
            writer.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        new CinemaTicketMachine().setVisible(true);        
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed
    private void clearBoxes(){
        movieIDTextField.setText("");
        dateTextField.setText("");
        timeSlotComboBox.setSelectedIndex(0);
        ticketCountSpinner.setValue(0);
    }
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clearBoxes();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void purchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButtonActionPerformed
        boolean found=false;
        try{            
            int enteredID=Integer.parseInt(movieIDTextField.getText());
            for(ShowTime showTime:showTimeList){
                if(enteredID==showTime.getMovieID() && 
                    showTime.getTimeSlot().equals(timeSlotComboBox.getSelectedItem().toString()) &&
                    showTime.getDate().equals(dateTextField.getText())){                    
                    for(Movie movie:movieList){
                        if(showTime.getMovieID()== movie.getId()){
                            found=true;
                            if(showTime.purchaseTicket(Integer.parseInt(ticketCountSpinner.getValue().toString()))){
                                double amount=movie.getPrice()*Integer.parseInt(ticketCountSpinner.getValue().toString());
                                BufferedWriter writer=new BufferedWriter(new FileWriter("transaction.txt",true));
                                writer.append(showTime.getMovieID()+","+showTime.getDate()+","+showTime.getTimeSlot()
                                    +","+ticketTypeComboBox.getSelectedItem()+","+ticketCountSpinner.getValue().toString()+","+amount +"\n");
                                writer.flush();
                                writer.close();
                                JOptionPane.showMessageDialog(rootPane, "The ticket is purchased successfully with $"+amount, "Information", JOptionPane.INFORMATION_MESSAGE);
                                clearBoxes();
                            }
                            else{
                                JOptionPane.showMessageDialog(rootPane, "Only "+showTime.getAvailableTicket() +" tickets are available", "Error", JOptionPane.ERROR_MESSAGE);                         
                            }
                        }
                    }
                }   
            }
            if(!found)
                JOptionPane.showMessageDialog(rootPane, "The movie is not available in the particular timeslot", "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        catch(Exception ex){
            ex.printStackTrace();
            //JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_purchaseButtonActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField movieIDTextField;
    private javax.swing.JButton purchaseButton;
    private javax.swing.JSpinner ticketCountSpinner;
    private javax.swing.JComboBox<String> ticketTypeComboBox;
    private javax.swing.JComboBox<String> timeSlotComboBox;
    // End of variables declaration//GEN-END:variables
}