package Launcher;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public final class Fondobase extends javax.swing.JFrame {

    public JLabel[] escudos;
    
    
    public Fondobase() {
        initComponents();
        
        escudos = new JLabel[] {escudo0, escudo1, escudo2, escudo3, escudo4, escudo5, escudo6, escudo7, escudo8, escudo9, escudo10, escudo11, escudo12, escudo13};
        
        for(int i = 0; i < 14; i++){
           Utility.SetImageLabelForced(escudos[i], "src/Pics/LauncherButton"+i+".png", new Dimension(80, 80));
           
           addHoverEffect(escudos[i], i);
        }
        
        ColocarPanelHome();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cabecera = new javax.swing.JPanel();
        escudo0 = new javax.swing.JLabel();
        escudo1 = new javax.swing.JLabel();
        escudo2 = new javax.swing.JLabel();
        escudo3 = new javax.swing.JLabel();
        escudo4 = new javax.swing.JLabel();
        escudo5 = new javax.swing.JLabel();
        escudo6 = new javax.swing.JLabel();
        escudo7 = new javax.swing.JLabel();
        escudo8 = new javax.swing.JLabel();
        escudo9 = new javax.swing.JLabel();
        escudo10 = new javax.swing.JLabel();
        escudo11 = new javax.swing.JLabel();
        escudo12 = new javax.swing.JLabel();
        escudo13 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cabecera.setOpaque(false);
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 15);
        flowLayout1.setAlignOnBaseline(true);
        Cabecera.setLayout(flowLayout1);

        escudo0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escudo0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/LauncherButton0.png"))); // NOI18N
        escudo0.setMaximumSize(new java.awt.Dimension(100, 100));
        escudo0.setMinimumSize(new java.awt.Dimension(100, 100));
        escudo0.setPreferredSize(new java.awt.Dimension(100, 100));
        Cabecera.add(escudo0);

        escudo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escudo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/LauncherButton1.png"))); // NOI18N
        escudo1.setMaximumSize(new java.awt.Dimension(100, 100));
        escudo1.setMinimumSize(new java.awt.Dimension(100, 100));
        escudo1.setPreferredSize(new java.awt.Dimension(100, 100));
        Cabecera.add(escudo1);

        escudo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escudo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/LauncherButton2.png"))); // NOI18N
        escudo2.setMaximumSize(new java.awt.Dimension(100, 100));
        escudo2.setMinimumSize(new java.awt.Dimension(100, 100));
        escudo2.setPreferredSize(new java.awt.Dimension(100, 100));
        Cabecera.add(escudo2);

        escudo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escudo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/LauncherButton3.png"))); // NOI18N
        escudo3.setMaximumSize(new java.awt.Dimension(100, 100));
        escudo3.setMinimumSize(new java.awt.Dimension(100, 100));
        escudo3.setPreferredSize(new java.awt.Dimension(100, 100));
        Cabecera.add(escudo3);

        escudo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escudo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/LauncherButton4.png"))); // NOI18N
        escudo4.setMaximumSize(new java.awt.Dimension(100, 100));
        escudo4.setMinimumSize(new java.awt.Dimension(100, 100));
        escudo4.setPreferredSize(new java.awt.Dimension(100, 100));
        Cabecera.add(escudo4);

        escudo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escudo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/LauncherButton5.png"))); // NOI18N
        escudo5.setMaximumSize(new java.awt.Dimension(100, 100));
        escudo5.setMinimumSize(new java.awt.Dimension(100, 100));
        escudo5.setPreferredSize(new java.awt.Dimension(100, 100));
        Cabecera.add(escudo5);

        escudo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escudo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/LauncherButton6.png"))); // NOI18N
        escudo6.setMaximumSize(new java.awt.Dimension(100, 100));
        escudo6.setMinimumSize(new java.awt.Dimension(100, 100));
        escudo6.setPreferredSize(new java.awt.Dimension(100, 100));
        Cabecera.add(escudo6);

        escudo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escudo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/LauncherButton7.png"))); // NOI18N
        escudo7.setMaximumSize(new java.awt.Dimension(100, 100));
        escudo7.setMinimumSize(new java.awt.Dimension(100, 100));
        escudo7.setPreferredSize(new java.awt.Dimension(100, 100));
        Cabecera.add(escudo7);

        escudo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escudo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/LauncherButton8.png"))); // NOI18N
        escudo8.setMaximumSize(new java.awt.Dimension(100, 100));
        escudo8.setMinimumSize(new java.awt.Dimension(100, 100));
        escudo8.setPreferredSize(new java.awt.Dimension(100, 100));
        Cabecera.add(escudo8);

        escudo9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escudo9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/LauncherButton9.png"))); // NOI18N
        escudo9.setMaximumSize(new java.awt.Dimension(100, 100));
        escudo9.setMinimumSize(new java.awt.Dimension(100, 100));
        escudo9.setPreferredSize(new java.awt.Dimension(100, 100));
        Cabecera.add(escudo9);

        escudo10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escudo10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/LauncherButton10.png"))); // NOI18N
        escudo10.setMaximumSize(new java.awt.Dimension(100, 100));
        escudo10.setMinimumSize(new java.awt.Dimension(100, 100));
        escudo10.setPreferredSize(new java.awt.Dimension(100, 100));
        Cabecera.add(escudo10);

        escudo11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escudo11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/LauncherButton11.png"))); // NOI18N
        escudo11.setMaximumSize(new java.awt.Dimension(100, 100));
        escudo11.setMinimumSize(new java.awt.Dimension(100, 100));
        escudo11.setPreferredSize(new java.awt.Dimension(100, 100));
        Cabecera.add(escudo11);

        escudo12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escudo12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/LauncherButton12.png"))); // NOI18N
        escudo12.setMaximumSize(new java.awt.Dimension(100, 100));
        escudo12.setMinimumSize(new java.awt.Dimension(100, 100));
        escudo12.setPreferredSize(new java.awt.Dimension(100, 100));
        Cabecera.add(escudo12);

        escudo13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escudo13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/LauncherButton13.png"))); // NOI18N
        escudo13.setMaximumSize(new java.awt.Dimension(100, 100));
        escudo13.setMinimumSize(new java.awt.Dimension(100, 100));
        escudo13.setPreferredSize(new java.awt.Dimension(100, 100));
        Cabecera.add(escudo13);

        getContentPane().add(Cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 1550, 130));

        content.setOpaque(false);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1550, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 1550, 880));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Fondo base.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2005, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Fondobase().setVisible(true);
        });
    }

   // Método para añadir el efecto de mover a un JLabel
    private void addHoverEffect(JLabel paco, int index) {
        
        paco.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
               Utility.SetImageLabelForced(paco, "src/Pics/LauncherButton" + index + ".png");
            }
            @Override
            public void mouseExited(MouseEvent e) {
               Utility.SetImageLabelForced(paco, "src/Pics/LauncherButton" + index + ".png", new Dimension(80, 80));
            }
            @Override
            public void mouseClicked(MouseEvent e) {
               ColocarPanelHome();
            }
        });
    }
    
    public void ColocarPanelHome(){
        VistaHome paco = new VistaHome ();
        paco.setSize(1550, 880);
        paco.setLocation(0, 0);
        paco.padre = this;
        
        content.removeAll();
        content.add(paco, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
   
    public void ColocarPanelCarrusel(int indexSimulador){
        VistaCarrusel andrea = new VistaCarrusel (indexSimulador);
        andrea.setSize(1550, 880);
        andrea.setLocation(0, 0);
        
        content.removeAll();
        content.add(andrea, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cabecera;
    private javax.swing.JPanel content;
    private javax.swing.JLabel escudo0;
    private javax.swing.JLabel escudo1;
    private javax.swing.JLabel escudo10;
    private javax.swing.JLabel escudo11;
    private javax.swing.JLabel escudo12;
    private javax.swing.JLabel escudo13;
    private javax.swing.JLabel escudo2;
    private javax.swing.JLabel escudo3;
    private javax.swing.JLabel escudo4;
    private javax.swing.JLabel escudo5;
    private javax.swing.JLabel escudo6;
    private javax.swing.JLabel escudo7;
    private javax.swing.JLabel escudo8;
    private javax.swing.JLabel escudo9;
    private javax.swing.JLabel fondo;
    // End of variables declaration//GEN-END:variables
}
