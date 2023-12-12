/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_estru_2;

/**
 *
 * @author diego
 */
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class DisabledItemsListModel extends DefaultListModel<String> {
    private boolean[] enabledItems;

    public DisabledItemsListModel() {
        super();
    }

    public void setEnabledItems(boolean[] enabledItems) {
        this.enabledItems = enabledItems.clone();
        fireContentsChanged(this, 0, getSize() - 1);
    }

    public boolean isEnabled(int index) {
        return enabledItems[index];
    }
}
