package login;
import java.io.*;
import java.nio.file.Files;
import javax.swing.*;
import java.util.ArrayList;

import javax.swing.event.ListSelectionListener;

import java.awt.FlowLayout;
import java.awt.List;
import java.awt.event.*;


public class notasPrueba extends javax.swing.JFrame {

    /**
     * Creates new form NotasApp
     */
    private String usuario;
    private DefaultListModel<String> modeloLista = new DefaultListModel<>();
    public notasPrueba(String usuario) {
        this.usuario=usuario;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jList1 = new JList<>(modeloLista);
        
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel1.setText("CONTENIDO");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 360, 10));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setBorder(null);
        bg.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 360, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 360, 290));

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel2.setText("TÍTULO");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jList1.setBorder(null);
        jList1.setModel(modeloLista);

        jScrollPane2.setViewportView(jList1);

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                if (cambiarSeleccion) {
                    cancelarEdicion();
                }
            }
        });


        bg.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 190, 330));

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        jLabel3.setText("FILTRAR");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel4.setText("NOTAS");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 150, 10));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jTextField2.setBorder(null);
        bg.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 200, 150, 40));


        jPanel8.setBackground(new java.awt.Color(83, 0, 0));
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel11.setBackground(new java.awt.Color(202, 68, 68));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CERRAR SESIÓN");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesion();
            }

        });

        bg.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 510, 100, 40));




        jPanel7.setBackground(new java.awt.Color(202, 68, 68));

        jLabel10.setBackground(new java.awt.Color(202, 68, 68));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("LIMPIAR TODO");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 100, 50));
        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jList1.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jPanel6.setBackground(new java.awt.Color(255, 72, 72));
            }
        });

        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }

        });

        

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ELIMINAR");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 100, 50));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jList1.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jPanel5.setBackground(new java.awt.Color(77, 138, 88));
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (editado) {
                    editado=false;
                } else {
                    jPanel5MouseClicked(evt);
                }
                
            }

        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("EDITAR");
        
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (editado) {
                    jPanel5MouseClicked2(evt);
                } else {
                    jPanel5MouseClicked(evt);
                }
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 100, 50));

        jPanel4.setBackground(new java.awt.Color(0, 25, 111));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("GUARDAR");
        
        

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }

        });





        bg.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 100, 50));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }

        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LIMPIAR");
        

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 250, 70, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BUSCAR");
        jLabel5.setToolTipText("");
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }

        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 250, 70, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        cargarNotas();

        pack();
    }// </editor-fold>                        

    private boolean cambiarSeleccion = true;
    public boolean editado = false;
    public int indiceLista;

    private void jPanel4MouseClicked(MouseEvent evt) {    
        cambiarSeleccion = false;                                 
        try{
            if (jTextField1.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debe ingresar un titulo", "Notas App", JOptionPane.PLAIN_MESSAGE);
                //etiqueta.setText("Debe ingresar un titulo");
                return;
                
            }

            FileWriter writer = new FileWriter("data/usuarios/"+usuario+"/"+jTextField1.getText()+".txt", false);
            writer.write(jTextArea1.getText());
            writer.close();

            
                if (!editado) {
                    if (!modeloLista.contains(jTextField1.getText()+".txt")){
                    modeloLista.addElement(jTextField1.getText()+".txt");
               
                    jTextField1.setText("");
                    jTextArea1.setText("");
                    //etiqueta.setText("Guardado");
                    editado=false;
                    jLabel8.setText("EDITAR");
                    jLabel7.setText("GUARDAR");
                    }else{
                        JOptionPane.showMessageDialog(null, "Ya existe una nota con ese nombre", "Notas App", JOptionPane.PLAIN_MESSAGE);
                    }
                }else {
                    
                    File archivo = new File("data/usuarios/"+usuario+"/"+modeloLista.getElementAt(indiceLista));
                    
                    if (!modeloLista.contains(jTextField1.getText()+".txt")){
                        modeloLista.removeElementAt(indiceLista);
                        archivo.delete();

                        modeloLista.add(indiceLista, jTextField1.getText()+".txt");
                        jTextField1.setText("");
                        jTextArea1.setText("");
                    } else if (modeloLista.getElementAt(indiceLista).equals(jTextField1.getText()+".txt")){
                        jTextField1.setText("");
                        jTextArea1.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ya existe una nota con ese nombre", "Notas App", JOptionPane.PLAIN_MESSAGE);
                        
                    }
                    
                    
                    
                    
    
                    editado = false;
                    indiceLista = -1;
                    jLabel8.setText("EDITAR");
                    jLabel7.setText("GUARDAR");
                    //etiqueta.setText("Editado");
                }
            
            jList1.repaint();
            
        } catch(IOException ex){
            ventanaError("Error al guardar");
        } finally {
            cambiarSeleccion = true;
        }

    }

    private void jPanel6MouseClicked(MouseEvent evt) {                                     
        try{
            if (jList1.getSelectedValue()==null){
                
                JOptionPane.showMessageDialog(null, "Seleccione un archivo de la lista", "Notas App", JOptionPane.PLAIN_MESSAGE);
                return;
                
            }
            File archivo = new File("data/usuarios/"+usuario+"/"+jList1.getSelectedValue());
            archivo.delete();
            modeloLista.removeElement(jList1.getSelectedValue());
            jList1.repaint();
            jTextField1.setText("");
            jTextArea1.setText("");
        } catch(Exception ex){
            ventanaError("Error al eliminar");
        }
    }

    private void jPanel7MouseClicked(MouseEvent evt) {
    int confirm = JOptionPane.showConfirmDialog(this, 
        "¿Estás seguro de que quieres eliminar TODAS las notas?", 
        "Confirmar eliminación", 
        JOptionPane.YES_NO_OPTION);
    
    if (confirm == JOptionPane.YES_OPTION) {
        File carpeta = new File("data/usuarios/"+usuario);
        File[] archivos = carpeta.listFiles();
        
        if (archivos != null) {
            for (File archivo : archivos) {
                archivo.delete();
            }
        }

        
        modeloLista.clear();
        jTextArea1.setText("");
        jTextField1.setText("");

        JOptionPane.showMessageDialog(this, "Todas las notas fueron eliminadas.");
    }
}

    private void jPanel5MouseClicked(MouseEvent evt){
        cambiarSeleccion = false;
        String archivoSeleccionado = jList1.getSelectedValue();
        try{
            if (archivoSeleccionado==null){
                JOptionPane.showMessageDialog(null, "Seleccione un archivo de la lista", "Notas App", JOptionPane.PLAIN_MESSAGE);
                return;
                
            }
            File archivo = new File("data/usuarios/"+usuario+"/"+archivoSeleccionado);
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            jTextField1.setText(archivoSeleccionado.replace(".txt", ""));
            jTextArea1.read(reader, null);
            reader.close();
            editado = true;
            indiceLista = jList1.getSelectedIndex();
            jLabel8.setText("CANCEL EDICION");
            jLabel7.setText("SAVE EDICION");


        } catch(IOException ex){
            ventanaError("Error al editar");
        } finally {
            cambiarSeleccion = true;
        }
    }

    private void jPanel5MouseClicked2(MouseEvent evt){
        if (editado) {
            editado = false;

            jLabel8.setText("EDITAR");
            jLabel7.setText("GUARDAR");
            jTextField1.setText("");
            jTextArea1.setText("");
        }
       
    }


    public void jPanel2MouseClicked(MouseEvent evt) {
        try{
          if (jTextField2.getText().equals("")){
              JOptionPane.showMessageDialog(null, "Debe ingresar una palabra para buscar sus notas.", "Notas App", JOptionPane.PLAIN_MESSAGE);
              return;
          }
          ArrayList<String> listaFiltro = new ArrayList<>();
          for (int i = 0; i < modeloLista.getSize(); i++) {
            String nombreArchivo = modeloLista.getElementAt(i);
            listaFiltro.add(nombreArchivo);
          }

          modeloLista.clear();
          for (int i = 0; i < listaFiltro.size(); i++) {
              String nombreArchivo=listaFiltro.get(i);
              File archivo = new File("data/usuarios/"+usuario+"/"+nombreArchivo);
              BufferedReader reader = new BufferedReader(new FileReader(archivo));
              String linea;
              while ((linea =reader.readLine()) != null){
                  if (linea.contains(jTextField2.getText())){
                      modeloLista.addElement(nombreArchivo);
                      break;
                  }
                 
              }
              reader.close();
          }
          
        } catch(Exception ex){
            ventanaError("Error al buscar");
        }
  };


    private void jPanel3MouseClicked(MouseEvent evt) {
        jTextField2.setText("");
        modeloLista.clear();
        cargarNotas();
    }

    private void cancelarEdicion() {
        if (editado) {
            editado = false;
            jLabel8.setText("EDITAR");
            jLabel7.setText("GUARDAR");
            jTextField1.setText("");
            jTextArea1.setText("");
        }
    }


    private void cerrarSesion(){
        int confirm = JOptionPane.showConfirmDialog(this, 
        "¿Estás seguro de que quieres cerrar sesión? (Se guardaran los cambios automáticamente)", 
        "Confirmar cierre de sesión", 
        JOptionPane.YES_NO_OPTION);
    
        if (confirm == JOptionPane.YES_OPTION) {
            jPanel4MouseClicked(null);
            this.dispose();
            new Login().setVisible(true);
        }
    }



    private void cargarNotas(){
        try{
            File carpeta = new File("data/usuarios/"+usuario);
            File[] archivos = carpeta.listFiles();
            for (File archivo : archivos){
                modeloLista.addElement(archivo.getName());
            }
        } catch(Exception ex){
            ventanaError("Error al cargar las notas");
        }
    }


    public static void ventanaError(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }



    // Variables declaration - do not modify                     
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration                   
}
