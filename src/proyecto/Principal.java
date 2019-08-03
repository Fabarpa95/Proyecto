
package proyecto;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import javax.swing.JOptionPane;


public class Principal extends javax.swing.JFrame {
   
 
    Arbol llamar= new Arbol();// Declaracion del Objeto,arrastra 
    //los datos de la clase ARBOL.
        
   
     
    public Principal() {
        initComponents();
            this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Eliminar = new javax.swing.JButton();
        PostOrden = new javax.swing.JButton();
        InOrden = new javax.swing.JButton();
        PreOrden = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtAgregar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Eliminar.setBackground(new java.awt.Color(204, 204, 204));
        Eliminar.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(51, 51, 255));
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 90, 30));

        PostOrden.setBackground(new java.awt.Color(204, 204, 204));
        PostOrden.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        PostOrden.setForeground(new java.awt.Color(51, 51, 255));
        PostOrden.setText("PostOrden");
        PostOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(PostOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, 110, 30));

        InOrden.setBackground(new java.awt.Color(204, 204, 204));
        InOrden.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        InOrden.setForeground(new java.awt.Color(51, 51, 255));
        InOrden.setText("InOrden");
        InOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(InOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, 100, 30));

        PreOrden.setBackground(new java.awt.Color(204, 204, 204));
        PreOrden.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        PreOrden.setForeground(new java.awt.Color(51, 51, 255));
        PreOrden.setText("PreOrden");
        PreOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(PreOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 110, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 102, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 690, 410));

        txtAgregar.setBackground(new java.awt.Color(204, 204, 204));
        txtAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(txtAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 204));
        jButton1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("SALIR ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 550, 80, 40));

        Agregar.setBackground(new java.awt.Color(204, 204, 204));
        Agregar.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        Agregar.setForeground(new java.awt.Color(0, 0, 255));
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 90, 30));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 310, 50));

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Arboles Binarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 350, 60));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/imagenes/fon (1).jpeg"))); // NOI18N
        lblFondo.setText("jLabel2");
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        String recorrido = null;
        
    private void InOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InOrdenActionPerformed
       LinkedList rec = new LinkedList();
       llamar.InOrden(llamar.getRaiz(),rec);
       String cad ="Recorrido InOrden;\n ";
       
       for(Object rec1: rec)
       {
           cad += rec1+ ",  ";
       }
       jTextArea1.setText(cad);
    }//GEN-LAST:event_InOrdenActionPerformed
   
    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
      llamar= null;
      llamar= new Arbol();
      paint(jPanel1.getGraphics());
        
    }//GEN-LAST:event_EliminarActionPerformed

    private void PreOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreOrdenActionPerformed
         
        LinkedList rec= new LinkedList();
        llamar.PreOrden(llamar.getRaiz(), rec);
        String cad= "Recorrido Preorden: \n";
        
        for (Object rec1: rec)
        {
        cad+= rec1+ ", ";
        }
        jTextArea1.setText(cad);
    }//GEN-LAST:event_PreOrdenActionPerformed

    private void txtAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgregarActionPerformed
      
        
    }//GEN-LAST:event_txtAgregarActionPerformed
  
    private void PostOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostOrdenActionPerformed
         
        LinkedList rec= new LinkedList();
        llamar.PostOrden(llamar.getRaiz(), rec);
        String cad= "Recorrido PostOrden:\n ";
        
        for (Object rec1: rec)
        {
        cad += rec1+ ", ";
        }
        jTextArea1.setText(cad);
    }//GEN-LAST:event_PostOrdenActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
       
        try 
            {
            int dato = Integer.parseInt(txtAgregar.getText());
            txtAgregar.setText("");
            llamar.insertar(dato);
            paint(jPanel1.getGraphics());
            } 
        catch (Exception e) 
            {
            JOptionPane.showMessageDialog(this,"Error al insertar el dato");
            }
    }//GEN-LAST:event_AgregarActionPerformed

        
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    //Metodopara pintar el arbol
    private void pintaArbol (Graphics g, Nodo n, int x,int y,int xoff,int yoff, int nivel)
    {
    if (n== null)return;
    
        g.setColor(Color.BLACK);
        if ((n.getIzq()) != null)
            {
            g.drawLine(x, y, x - xoff+(nivel*2), y + yoff);
            }
        
            if(n.getDer()!= null)
            {
                g.drawLine(x, y, x + xoff-(nivel *2), y + yoff);
            }

            g.fillOval(x-10, y-20, 30,30);
            
            g.setColor(Color.WHITE);
            g.drawString(n.getInfo() + "" ,x , y);
            
            pintaArbol(g, n.getIzq(),(int)(x-xoff), (y+yoff),xoff+ nivel *2,yoff,nivel+1);
            pintaArbol(g, n.getDer(),(int)(x+xoff), (y+yoff),xoff- nivel *2,yoff,nivel+1);
    }
        public void paint (Graphics g){
            jPanel1.revalidate();
            super.paint(g);
            int X=(getWidth()/5)* llamar.getAltura();
            int X2= (getWidth()/12);
            int Y= getHeight()/12;
            pintaArbol(jPanel1.getGraphics(),llamar.getRaiz(),jPanel1.getWidth()/2,Y,X2,Y,1);
           }
            
    
    public static void main(String args[]) 
    {    
     
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
            new Principal().setVisible(true);
            }
        });
    
    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton InOrden;
    private javax.swing.JButton PostOrden;
    private javax.swing.JButton PreOrden;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTextField txtAgregar;
    // End of variables declaration//GEN-END:variables

}
