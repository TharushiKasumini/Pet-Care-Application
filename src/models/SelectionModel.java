
package models;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;

// Implement the ListSelectionListener interface
public class SelectionModel implements ListSelectionListener {

    private JTable table;
    private JLabel NameField;
    private JLabel IDField;


    public SelectionModel(JTable table, JLabel NameField, JLabel IDField) {
        this.table = table;
        this.NameField = NameField;
        this.IDField = IDField;
    }

    @Override
    public void valueChanged(ListSelectionEvent event) {
        if (!event.getValueIsAdjusting()) {
            int selectedRow = table.getSelectedRow();
            if (selectedRow >= 0) {
                TableModel model = table.getModel();
                // Get the value from the desired column (adjust column index accordingly)
                String name = (String) model.getValueAt(selectedRow, 1);
                int idValue =  (int) model.getValueAt(selectedRow, 0);
                NameField.setText(name);
                IDField.setText("" + idValue);
            }
        }
    }
}


