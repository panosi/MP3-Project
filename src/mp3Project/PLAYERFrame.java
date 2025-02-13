package mp3Project;

import jaco.mp3.player.MP3Player;
import java.io.File;
import java.nio.file.Paths;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class PLAYERFrame extends javax.swing.JFrame {
    
    MP3Player PLAYER;
    File SONGF;
    String CURRTNETDR = "home.user";
    String CURRENTPATH;
    String IMAGEPATH;
    String APP = "MP3 PLAYER";
    
    boolean REPEAT = false;
    
    boolean WINDOWCOLLAPSED = false;
    
    int xMOUSE, yMOUSE;
    
    public PLAYERFrame() {
        initComponents();
        
        APPTITLE.setText(APP);
        
        SONGF = new File("./Led Zeppelin - Stairway To Heaven.mp3");
        
        String fileName = SONGF.getName();
        SONGDISPLAY.setText(fileName);
        
        PLAYER = mp3Player();
        PLAYER.addToPlayList(SONGF);
        
        CURRENTPATH = Paths.get(".").toAbsolutePath().normalize().toString();
        IMAGEPATH = "\\images";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SONGMAINPANEL = new javax.swing.JPanel();
        MAINPANEL = new javax.swing.JPanel();
        HEADERPANEL = new javax.swing.JPanel();
        APPTITLE = new javax.swing.JLabel();
        SETTINGSBTN = new javax.swing.JLabel();
        QUITBTN = new javax.swing.JLabel();
        CONTROLPANEL = new javax.swing.JPanel();
        SONGSUBPANEL = new javax.swing.JPanel();
        PLAYBTN = new javax.swing.JLabel();
        STOPBTN = new javax.swing.JLabel();
        PAUSEBTN = new javax.swing.JLabel();
        REPEATBTN = new javax.swing.JLabel();
        JPANEL = new javax.swing.JPanel();
        MUTEBTN = new javax.swing.JLabel();
        VOLUMEMAXBTN = new javax.swing.JLabel();
        VOLUMEDOWNBTN = new javax.swing.JLabel();
        VOLUMEUPBTN = new javax.swing.JLabel();
        OPENBTN = new javax.swing.JLabel();
        SONGDISPLAY = new javax.swing.JLabel();
        TASOULA = new javax.swing.JLabel();

        SONGMAINPANEL.setBackground(new java.awt.Color(7, 63, 86));

        javax.swing.GroupLayout SONGMAINPANELLayout = new javax.swing.GroupLayout(SONGMAINPANEL);
        SONGMAINPANEL.setLayout(SONGMAINPANELLayout);
        SONGMAINPANELLayout.setHorizontalGroup(
            SONGMAINPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        SONGMAINPANELLayout.setVerticalGroup(
            SONGMAINPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 89, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        MAINPANEL.setBackground(new java.awt.Color(0, 102, 102));

        HEADERPANEL.setBackground(new java.awt.Color(0, 51, 51));

        APPTITLE.setBackground(new java.awt.Color(102, 102, 255));
        APPTITLE.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        APPTITLE.setForeground(new java.awt.Color(255, 255, 255));
        APPTITLE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        APPTITLE.setText("Mp3 Player");
        APPTITLE.setToolTipText("");
        APPTITLE.setAlignmentX(0.5F);
        APPTITLE.setMaximumSize(new java.awt.Dimension(117, 23));
        APPTITLE.setPreferredSize(new java.awt.Dimension(117, 23));
        APPTITLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                APPTITLEMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                APPTITLEMousePressed(evt);
            }
        });
        APPTITLE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                APPTITLEMouseDragged(evt);
            }
        });

        SETTINGSBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SETTINGSBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3Project/images/final/settings.png"))); // NOI18N
        SETTINGSBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SETTINGSBTNMouseClicked(evt);
            }
        });

        QUITBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QUITBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3Project/images/final/exit.png"))); // NOI18N
        QUITBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QUITBTNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HEADERPANELLayout = new javax.swing.GroupLayout(HEADERPANEL);
        HEADERPANEL.setLayout(HEADERPANELLayout);
        HEADERPANELLayout.setHorizontalGroup(
            HEADERPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HEADERPANELLayout.createSequentialGroup()
                .addComponent(APPTITLE, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SETTINGSBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(QUITBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        HEADERPANELLayout.setVerticalGroup(
            HEADERPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(APPTITLE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HEADERPANELLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(HEADERPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QUITBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SETTINGSBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        CONTROLPANEL.setBackground(new java.awt.Color(0, 102, 102));

        SONGSUBPANEL.setBackground(new java.awt.Color(0, 51, 51));
        SONGSUBPANEL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        PLAYBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PLAYBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3Project/images/final/play.png"))); // NOI18N
        PLAYBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PLAYBTNMouseClicked(evt);
            }
        });

        STOPBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        STOPBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3Project/images/final/stop.png"))); // NOI18N
        STOPBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                STOPBTNMouseClicked(evt);
            }
        });

        PAUSEBTN.setBackground(new java.awt.Color(0, 204, 204));
        PAUSEBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PAUSEBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3Project/images/final/pause.png"))); // NOI18N
        PAUSEBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PAUSEBTNMouseClicked(evt);
            }
        });

        REPEATBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        REPEATBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3Project/images/final/loop.png"))); // NOI18N
        REPEATBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REPEATBTNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SONGSUBPANELLayout = new javax.swing.GroupLayout(SONGSUBPANEL);
        SONGSUBPANEL.setLayout(SONGSUBPANELLayout);
        SONGSUBPANELLayout.setHorizontalGroup(
            SONGSUBPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SONGSUBPANELLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(REPEATBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(STOPBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PLAYBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(PAUSEBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        SONGSUBPANELLayout.setVerticalGroup(
            SONGSUBPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SONGSUBPANELLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SONGSUBPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PAUSEBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PLAYBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SONGSUBPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(REPEATBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(STOPBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );

        JPANEL.setBackground(new java.awt.Color(0, 51, 51));
        JPANEL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        MUTEBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MUTEBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3Project/images/final/mute.png"))); // NOI18N
        MUTEBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MUTEBTNMouseClicked(evt);
            }
        });

        VOLUMEMAXBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VOLUMEMAXBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3Project/images/final/volumemax.png"))); // NOI18N
        VOLUMEMAXBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VOLUMEMAXBTNMouseClicked(evt);
            }
        });

        VOLUMEDOWNBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VOLUMEDOWNBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3Project/images/final/volumedown.png"))); // NOI18N
        VOLUMEDOWNBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VOLUMEDOWNBTNMouseClicked(evt);
            }
        });

        VOLUMEUPBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VOLUMEUPBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3Project/images/final/volumeup.png"))); // NOI18N
        VOLUMEUPBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VOLUMEUPBTNMouseClicked(evt);
            }
        });

        OPENBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OPENBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3Project/images/final/openfile.png"))); // NOI18N
        OPENBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OPENBTNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPANELLayout = new javax.swing.GroupLayout(JPANEL);
        JPANEL.setLayout(JPANELLayout);
        JPANELLayout.setHorizontalGroup(
            JPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VOLUMEDOWNBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VOLUMEUPBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OPENBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 254, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VOLUMEMAXBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MUTEBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        JPANELLayout.setVerticalGroup(
            JPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPANELLayout.createSequentialGroup()
                .addGroup(JPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPANELLayout.createSequentialGroup()
                        .addGroup(JPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VOLUMEMAXBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VOLUMEUPBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(JPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VOLUMEDOWNBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MUTEBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JPANELLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(OPENBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout CONTROLPANELLayout = new javax.swing.GroupLayout(CONTROLPANEL);
        CONTROLPANEL.setLayout(CONTROLPANELLayout);
        CONTROLPANELLayout.setHorizontalGroup(
            CONTROLPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(CONTROLPANELLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(CONTROLPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SONGSUBPANEL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPANEL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        CONTROLPANELLayout.setVerticalGroup(
            CONTROLPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CONTROLPANELLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SONGSUBPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SONGDISPLAY.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        SONGDISPLAY.setForeground(new java.awt.Color(255, 255, 255));
        SONGDISPLAY.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SONGDISPLAY.setText("PLAYING");

        TASOULA.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        TASOULA.setForeground(new java.awt.Color(255, 255, 255));
        TASOULA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TASOULA.setText("loop condition");

        javax.swing.GroupLayout MAINPANELLayout = new javax.swing.GroupLayout(MAINPANEL);
        MAINPANEL.setLayout(MAINPANELLayout);
        MAINPANELLayout.setHorizontalGroup(
            MAINPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAINPANELLayout.createSequentialGroup()
                .addComponent(HEADERPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(MAINPANELLayout.createSequentialGroup()
                .addGroup(MAINPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MAINPANELLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CONTROLPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MAINPANELLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SONGDISPLAY, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MAINPANELLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(TASOULA, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MAINPANELLayout.setVerticalGroup(
            MAINPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAINPANELLayout.createSequentialGroup()
                .addComponent(HEADERPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SONGDISPLAY, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TASOULA, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CONTROLPANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAINPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MAINPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PLAYBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PLAYBTNMouseClicked
        PLAYER.play();
    }//GEN-LAST:event_PLAYBTNMouseClicked

    private void STOPBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STOPBTNMouseClicked
        PLAYER.stop();
    }//GEN-LAST:event_STOPBTNMouseClicked

    private void PAUSEBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PAUSEBTNMouseClicked
        PLAYER.pause();
    }//GEN-LAST:event_PAUSEBTNMouseClicked

    private void REPEATBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPEATBTNMouseClicked
        if(REPEAT == false){
            REPEAT = true;
            PLAYER.setRepeat(REPEAT);
            TASOULA.setText("LOOPING");
           
        }else if(REPEAT == true){
            REPEAT = false;
            PLAYER.setRepeat(REPEAT);
            TASOULA.setText("LOOP STOPED");
                     
        }
    }//GEN-LAST:event_REPEATBTNMouseClicked

    private void APPTITLEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APPTITLEMousePressed
        xMOUSE = evt.getX();
        yMOUSE = evt.getY();
    }//GEN-LAST:event_APPTITLEMousePressed

    private void APPTITLEMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APPTITLEMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMOUSE, y - yMOUSE);
    }//GEN-LAST:event_APPTITLEMouseDragged

    private void QUITBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QUITBTNMouseClicked
        this.dispose();
       
    }//GEN-LAST:event_QUITBTNMouseClicked

    private void SETTINGSBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SETTINGSBTNMouseClicked
        JOptionPane.showMessageDialog(this, " SETTINGS DIALOGS!!!! ");
    }//GEN-LAST:event_SETTINGSBTNMouseClicked

    private void OPENBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OPENBTNMouseClicked
        JFileChooser openFileChooser = new JFileChooser(CURRTNETDR);
        openFileChooser.setFileFilter(new FileTypeFilter(".mp3", "Open MP3'S!"));
        int result = openFileChooser.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            SONGF = openFileChooser.getSelectedFile();
            PLAYER.addToPlayList(SONGF);
            PLAYER.skipForward();
            CURRTNETDR = SONGF.getAbsolutePath();
            SONGDISPLAY.setText("NOW PLAYING... : " + SONGF.getName());
        }
    }//GEN-LAST:event_OPENBTNMouseClicked

    private void APPTITLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APPTITLEMouseClicked
        if(evt.getClickCount() == 2){
            if(WINDOWCOLLAPSED == false){
                WINDOWCOLLAPSED = true;

            }else if(WINDOWCOLLAPSED == true){
                WINDOWCOLLAPSED = false;

            }
        }
    }//GEN-LAST:event_APPTITLEMouseClicked

    private void VOLUMEDOWNBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VOLUMEDOWNBTNMouseClicked
        volumeDownControl(0.2);
    }//GEN-LAST:event_VOLUMEDOWNBTNMouseClicked

    private void VOLUMEUPBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VOLUMEUPBTNMouseClicked
        volumeUpControl(0.2);
    }//GEN-LAST:event_VOLUMEUPBTNMouseClicked

    private void VOLUMEMAXBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VOLUMEMAXBTNMouseClicked
        volumeControl(1.0);
    }//GEN-LAST:event_VOLUMEMAXBTNMouseClicked

    private void MUTEBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MUTEBTNMouseClicked
        volumeControl(0.0);
    }//GEN-LAST:event_MUTEBTNMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PLAYERFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PLAYERFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PLAYERFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PLAYERFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new PLAYERFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel APPTITLE;
    private javax.swing.JPanel CONTROLPANEL;
    private javax.swing.JPanel HEADERPANEL;
    private javax.swing.JPanel JPANEL;
    private javax.swing.JPanel MAINPANEL;
    private javax.swing.JLabel MUTEBTN;
    private javax.swing.JLabel OPENBTN;
    private javax.swing.JLabel PAUSEBTN;
    private javax.swing.JLabel PLAYBTN;
    private javax.swing.JLabel QUITBTN;
    private javax.swing.JLabel REPEATBTN;
    private javax.swing.JLabel SETTINGSBTN;
    private javax.swing.JLabel SONGDISPLAY;
    private javax.swing.JPanel SONGMAINPANEL;
    private javax.swing.JPanel SONGSUBPANEL;
    private javax.swing.JLabel STOPBTN;
    private javax.swing.JLabel TASOULA;
    private javax.swing.JLabel VOLUMEDOWNBTN;
    private javax.swing.JLabel VOLUMEMAXBTN;
    private javax.swing.JLabel VOLUMEUPBTN;
    // End of variables declaration//GEN-END:variables

    private MP3Player mp3Player(){
        MP3Player mp3Player = new MP3Player();
        return mp3Player;
    }

    private void volumeDownControl(Double valueToPlusMinus){
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        for(Mixer.Info mixerInfo : mixers){
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            for(Line.Info lineInfo : lineInfos){
                Line line = null;
                boolean opened = true;
                try{
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    if(!opened){
                        line.open();
                    }
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    float currentVolume = volControl.getValue();
                    Double volumeToCut = valueToPlusMinus;
                    float changedCalc = (float) ((float)currentVolume-(double)volumeToCut);
                    volControl.setValue(changedCalc);
                    
                }catch (LineUnavailableException lineException){
                }catch (IllegalArgumentException illException){
                }finally{
                    if(line != null && !opened){
                        line.close();
                    }
                }
            }
        }
    }
    
    private void volumeUpControl(Double valueToPlusMinus){
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        for(Mixer.Info mixerInfo : mixers){
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            for(Line.Info lineInfo : lineInfos){
                Line line = null;
                boolean opened = true;
                try{
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    if(!opened){
                            line.open();
                    }
           
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    float currentVolume = volControl.getValue();
                    Double volumeToCut = valueToPlusMinus;
                    float changedCalc = (float) ((float)currentVolume+(double)volumeToCut);
                    volControl.setValue(changedCalc);
                    
                }catch (LineUnavailableException lineException){
                }catch (IllegalArgumentException illException){
                }finally{
                    if(line != null && !opened){
                        line.close();
                    }
                }
            }
        }
    }
    
    private void volumeControl(Double valueToPlusMinus){
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        for(Mixer.Info mixerInfo : mixers){
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            for(Line.Info lineInfo : lineInfos){
                Line line = null;
                boolean opened = true;
                try{
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    if(!opened){
                        line.open();
                    }
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    float currentVolume = volControl.getValue();
                    Double volumeToCut = valueToPlusMinus;
                    float changedCalc = (float) ((double)volumeToCut);
                    volControl.setValue(changedCalc);
                    
                }catch (LineUnavailableException lineException){
                }catch (IllegalArgumentException illException){
                }finally{
                    if(line != null && !opened){
                        line.close();
                    }
                }
            }
        }
    }
}
