package presentacion;

import com.sun.j3d.audioengines.javasound.JavaSoundMixer;
import com.sun.j3d.utils.behaviors.mouse.MouseRotate;
import com.sun.j3d.utils.behaviors.mouse.MouseTranslate;
import com.sun.j3d.utils.behaviors.mouse.MouseZoom;
import com.sun.j3d.utils.universe.SimpleUniverse;
import edu.ncsa.model.MeshLoader;
import edu.ncsa.model.graphics.jogl.ModelViewer;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsConfigTemplate;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.Hashtable;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.j3d.AmbientLight;
import javax.media.j3d.AudioDevice;
import javax.media.j3d.Background;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.Bounds;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.DirectionalLight;
import javax.media.j3d.GraphicsConfigTemplate3D;
import javax.media.j3d.Group;
import javax.media.j3d.Locale;
import javax.media.j3d.PhysicalBody;
import javax.media.j3d.PhysicalEnvironment;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.View;
import javax.media.j3d.ViewPlatform;
import javax.media.j3d.VirtualUniverse;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

/**
 *
 * @author andreaescribano
 */
public class VistaPrincipal extends javax.swing.JFrame {

    private final ControladorVistaPrincipal control;
    private final JDesktopPane desktop;

    /**
     * Creates new form Main
     */
    public VistaPrincipal() {
        initComponents();
        jMenu1.setEnabled(false);
        jMenu2.setEnabled(false);
        jMenu3.setEnabled(false);
        open.setEnabled(false);
        edit.setEnabled(false);
        control = new ControladorVistaPrincipal(this);

        desktop = new JDesktopPane();
        setContentPane(desktop);
        desktop.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);

        setSlider();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layerDialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        thicknessLabel = new javax.swing.JLabel();
        thicknessSlider = new javax.swing.JSlider();
        nLayersLabel = new javax.swing.JLabel();
        numberLayLabel = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        open = new javax.swing.JMenu();
        edit = new javax.swing.JMenu();
        saveOptions = new javax.swing.JMenu();
        save = new javax.swing.JMenuItem();
        saveAs = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        print3D = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        scale = new javax.swing.JMenu();
        rotate = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        layers = new javax.swing.JMenu();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Layers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 24))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(548, 545));
        jPanel1.setSize(new java.awt.Dimension(560, 300));

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        thicknessLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        thicknessLabel.setText("Thickness:");

        nLayersLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        nLayersLabel.setText("Number of layers:");

        numberLayLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        numberLayLabel.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nLayersLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(thicknessLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(thicknessSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(numberLayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(okButton)))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(thicknessLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thicknessSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nLayersLabel)
                    .addComponent(numberLayLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton))
                .addGap(15, 15, 15))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        thicknessSlider.setMajorTickSpacing(1);
        thicknessSlider.setMaximum(10);
        thicknessSlider.setPaintLabels(true);
        thicknessSlider.setPaintTicks(true);
        thicknessSlider.setPreferredSize(new java.awt.Dimension(400, 46));
        getContentPane().add(thicknessSlider, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layerDialogLayout = new javax.swing.GroupLayout(layerDialog.getContentPane());
        layerDialog.getContentPane().setLayout(layerDialogLayout);
        layerDialogLayout.setHorizontalGroup(
            layerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layerDialogLayout.setVerticalGroup(
            layerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setPreferredSize(new java.awt.Dimension(5000, 1000));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(370, 50));

        file.setText("File");
        file.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileMouseClicked(evt);
            }
        });
        jMenuBar1.add(file);

        open.setText("Open");
        jMenuBar1.add(open);

        edit.setText("Edit");
        jMenuBar1.add(edit);

        saveOptions.setText("Save");

        save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        saveOptions.add(save);

        saveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveAs.setText("Save as");
        saveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsActionPerformed(evt);
            }
        });
        saveOptions.add(saveAs);

        jMenuBar1.add(saveOptions);

        jMenu1.setText(" ");
        jMenuBar1.add(jMenu1);

        print3D.setText("Print 3D");
        print3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print3DActionPerformed(evt);
            }
        });
        jMenuBar1.add(print3D);

        jMenu2.setText(" ");
        jMenuBar1.add(jMenu2);

        scale.setText("Scale");
        scale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scaleActionPerformed(evt);
            }
        });
        jMenuBar1.add(scale);

        rotate.setText("Rotate");
        rotate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotateActionPerformed(evt);
            }
        });
        jMenuBar1.add(rotate);

        jMenu3.setText(" ");
        jMenuBar1.add(jMenu3);

        layers.setText("Layers");
        layers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                layersMouseClicked(evt);
            }
        });
        jMenuBar1.add(layers);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileMouseClicked
        manageFileChooser(1);
    }//GEN-LAST:event_fileMouseClicked

    private void saveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsActionPerformed
        manageFileChooser(2);
    }//GEN-LAST:event_saveAsActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

    private void print3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print3DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_print3DActionPerformed

    private void scaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scaleActionPerformed

    private void rotateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rotateActionPerformed

    private void layersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_layersMouseClicked
        layerDialog.setSize(5000, 1000);
        layerDialog.setVisible(true);
        //Make sure we have nice window decorations.
        //JFrame.setDefaultLookAndFeelDecorated(true);

        //Create and set up the window.
        //javax.swing.JInternalFrame frame = new javax.swing.JInternalFrame();
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Display the window.
        //frame.setVisible(true);
        //createFrame();
    }//GEN-LAST:event_layersMouseClicked

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        layerDialog.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        layerDialog.setVisible(false);
    }//GEN-LAST:event_okButtonActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JMenu edit;
    private javax.swing.JMenu file;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDialog layerDialog;
    private javax.swing.JMenu layers;
    private javax.swing.JLabel nLayersLabel;
    private javax.swing.JLabel numberLayLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JMenu open;
    private javax.swing.JPanel panel;
    private javax.swing.JMenu print3D;
    private javax.swing.JMenu rotate;
    private javax.swing.JMenuItem save;
    private javax.swing.JMenuItem saveAs;
    private javax.swing.JMenu saveOptions;
    private javax.swing.JMenu scale;
    private javax.swing.JLabel thicknessLabel;
    private javax.swing.JSlider thicknessSlider;
    // End of variables declaration//GEN-END:variables

    //Let double values in slider
    private void setSlider() {
        Format f = new DecimalFormat("0.0");
        Hashtable<Integer, JComponent> labels = new Hashtable<Integer, JComponent>();
        for (int i = 0; i <= 10; i++) {
            JLabel label = new JLabel(f.format(i * 0.1));
            label.setFont(label.getFont().deriveFont(Font.PLAIN));
            labels.put(i, label);
        }
        thicknessSlider.setLabelTable(labels);
    }

    //Get extension from FileFilter description
    private String getExtension(String s) {
        String ext, ext1;
        ext1 = "";
        int i = s.lastIndexOf('.');
        if (i > 0 && i < s.length() - 1) {
            ext1 = s.substring(i + 1).toLowerCase();
        }
        ext = ext1.substring(0, ext1.length() - 1);
        return ext;
    }

    //Create a new window inside the Main
    private JInternalFrame createFrame() {
        JInternalFrame frame = new JInternalFrame();
        frame.setResizable(true);
        frame.setClosable(true);
        frame.setMaximizable(true);
        frame.setIconifiable(true);

        frame.setSize(300, 300);
        frame.setLocation(WIDTH, HEIGHT);
        frame.setVisible(true); //necessary as of 1.3
        desktop.add(frame);
        try {
            frame.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
        return frame;
    }

    private void openFileChooser(JFileChooser fc) {
        int returnVal = fc.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File fileSelec = fc.getSelectedFile();
            final String filename = fileSelec.getAbsolutePath();
            if (getExtension(fileSelec).equals("obj") || getExtension(fileSelec).equals("wrl")|| getExtension(fileSelec).equals("stl")) {
                Canvas3D c1 = new Canvas3D(SimpleUniverse.getPreferredConfiguration());
                setLayout(new FlowLayout());
                c1.setSize(this.getWidth(), this.getHeight());
                add(c1);
                

                BranchGroup scene = control.abrirArchivosO1(filename);

                SimpleUniverse u = new SimpleUniverse(c1);
                // This will move the ViewPlatform back a bit so the
                // objects in the scene can be viewed.
                //u.getViewingPlatform().setNominalViewingTransform();
                u.addBranchGraph(scene);
            } else {
                JPanel viewer_panel = new JPanel();
                viewer_panel.setLayout(null);
                viewer_panel.setLocation(0, 0);
                viewer_panel.setSize(5000, 1000);
                viewer_panel.add(control.abrirArchivosO2(filename));

                add(viewer_panel);
            }
        } else if (returnVal == JFileChooser.ERROR_OPTION || returnVal == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "It has not opened any file", "Alert", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error opening file", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void saveFileChooser(JFileChooser fc) {
        int returnVal = fc.showSaveDialog(null);
        //BufferedImage image = null;
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File fileSelec = fc.getSelectedFile();
//            try {
//                ImageIO.write(image, "obj", new File(fc
//                    .getSelectedFile().getAbsolutePath()));
//                
//                FileWriter fw = new FileWriter(fileSelec.getPath() + "." + getExtension(fc.getFileFilter().getDescription()));
//                fw.write("Hola");
//                fw.flush();
//                fw.close();
//            } catch (IOException ex) {
//                Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//            }
        } else if (returnVal == JFileChooser.ERROR_OPTION || returnVal == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "It has not opened any file", "Alert", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error opening file", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Manage the options of the fileChooser: Open and Save
    private void manageFileChooser(int val) {
        JFileChooser fc = new JFileChooser();

        int randomValue = (int) (Math.random() * new FileExtensions().getExtensions().length);

        String[] filesExtensions = new FileExtensions().getExtensions();
        String[] filesDescriptions = new FileExtensions().getDescriptions();

        fc.addChoosableFileFilter(new FileTypeFilter(filesExtensions[randomValue], filesDescriptions[randomValue])); //Filter file types 

        fc.setAcceptAllFileFilterUsed(false);//disable the Accept All filter
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fc.setMultiSelectionEnabled(false);//disable multiple files selected

        //Set FileFilters
        for (int i = 0; i < filesExtensions.length; i++) {
            if (i != randomValue) {
                FileFilter ff = new FileNameExtensionFilter(filesDescriptions[i] + String.format(" (*.%s)", filesExtensions[i]), filesExtensions[i]);
                fc.setFileFilter(ff);
            }
        }
        fc.setVisible(true);
        if (val == 1) {
            openFileChooser(fc);
        } else if (val == 2) {
            saveFileChooser(fc);
        }
    }

    private String getExtension(File f) {
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 && i < s.length() - 1) {
            ext = s.substring(i + 1).toLowerCase();
        }
        return ext;
    }

    
}
