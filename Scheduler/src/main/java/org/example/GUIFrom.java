package org.example;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileInputStream;


public class GUIFrom {
    private JPanel rootPanel;
    private JTextField filePath;
    private JButton selectButton;
    private JButton actionButton;
    private File selectedFile;

    public GUIFrom() {
        selectButton.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {

                JFileChooser chooser = new JFileChooser();
                chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                chooser.showOpenDialog(rootPanel);
                String files = String.valueOf(selectedFile = chooser.getSelectedFile());
                filePath.setText(selectedFile.getAbsolutePath());


                try {

                    POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(files));
                    HSSFWorkbook wb = new HSSFWorkbook(fs);
                    HSSFSheet sheet = wb.getSheetAt(0);
                    HSSFRow row;
                    HSSFCell cell;
                    int rows;
                    rows = sheet.getPhysicalNumberOfRows();

                    int cols = 0;
                    int tmp = 0;
                    for (int i = 0; i < 10 || i < rows; i++) {
                        row = sheet.getRow(i);
                        if (row != null) {
                            tmp = sheet.getRow(i).getPhysicalNumberOfCells();
                            if (tmp > cols) cols = tmp;
                        }
                    }
                    for (int r = 0; r < rows; r++) {
                        row = sheet.getRow(r);
                        if (row != null) {
                            for (int c = 0; c < cols; c++) {
                                cell = row.getCell((short) c);
                                if (cell != null) {
                                    // Your code here
                                }
                            }
                        }
                    }
                } catch (Exception ioe) {
                    ioe.printStackTrace();
                }

            }

        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        rootPanel = new JPanel();
        rootPanel.setLayout(new BorderLayout(0, 0));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        rootPanel.add(spacer1, BorderLayout.NORTH);
        final com.intellij.uiDesigner.core.Spacer spacer2 = new com.intellij.uiDesigner.core.Spacer();
        rootPanel.add(spacer2, BorderLayout.EAST);
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        rootPanel.add(panel1, BorderLayout.CENTER);
        filePath = new JTextField();
        filePath.setEditable(false);
        filePath.setPreferredSize(new Dimension(500, 30));
        panel1.add(filePath);
        selectButton = new JButton();
        selectButton.setText("?????????????????? ????????");
        panel1.add(selectButton);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }

}
