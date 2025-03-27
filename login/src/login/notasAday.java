package login;

import java.io.*;
import java.nio.file.Files;
import javax.swing.*;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionListener;

import java.awt.FlowLayout;
import java.awt.List;
import java.awt.event.*;

public class notasAday extends JFrame {
    private String usuario;
    private DefaultListModel<String> modeloLista = new DefaultListModel<>();
    private JLabel etiqueta = new JLabel("");
    public notasAday(String usuario){
        this.usuario = usuario;
        JFrame ventana = new JFrame("Notas "+usuario);
        ventana.setSize(1000, 450);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JPanel panel = new JPanel();
        ventana.add(panel);
        panel.setLayout(new FlowLayout(10,10,10));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        panel.add(panel1);
        panel.add(panel2);

        

        
        JLabel etiquetaFiltro = new JLabel("");
        etiqueta.setBounds(10, 20, 80, 25);
        JTextField titulo = new JTextField(15);
        JTextField filtro = new JTextField(9);
        JTextArea contenido = new JTextArea(5, 20);
        
        JList<String> lista = new JList<>(modeloLista);
        JScrollPane scrollLista = new JScrollPane(lista);
        JButton guardar = new JButton("Guardar");
        JButton editar = new JButton("Editar");
        JButton eliminar = new JButton("Eliminar");
        JButton limpiar = new JButton("Limpiar");
        JButton buscar = new JButton("Buscar");

        DefaultListModel<String> listaFiltro = new DefaultListModel<>();
        JList<String> listaFiltrada = new JList<>(listaFiltro);
        JScrollPane scrollListaFiltrada = new JScrollPane(listaFiltrada);
        JButton limpiarLista = new JButton("Limpiar lista");

        panel1.add(etiqueta);
        panel1.add(titulo);
        panel1.add(contenido);
        panel1.add(guardar); 
        panel1.add(editar);
        panel1.add(eliminar);
        panel1.add(limpiar);
        panel1.add(new JScrollPane(scrollLista));


        panel2.add(etiquetaFiltro);
        panel2.add(filtro);
        panel2.add(new JScrollPane(scrollListaFiltrada));
        panel2.add(buscar);
        panel2.add(limpiarLista);

        cargarNotas();

//limpia la etiqueta al hacer click en el titulo. no se si es la mejor forma pero no se que hacer
        titulo.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiqueta.setText("");
            }

            @Override
            public void mousePressed(MouseEvent e) {    
            }

            @Override
            public void mouseReleased(MouseEvent e) {    
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
            
        });
//limpia la lista
        limpiarLista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filtro.setText("");
                listaFiltro.clear();
                etiquetaFiltro.setText("");
            }
        });

//guarda la nota o la edita si ya existe y la añade a la lista si es nueva o no si ya existe
        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                try{
                    if (titulo.getText().equals("")){
                        etiqueta.setText("Debe ingresar un titulo");
                        return;
                        
                    }
                    FileWriter writer = new FileWriter("data/usuarios/"+usuario+"/"+titulo.getText()+".txt", true);
                    writer.write(contenido.getText());
                    writer.close();
                    
                    if (!modeloLista.contains(titulo.getText()+".txt")){
                        modeloLista.addElement(titulo.getText()+".txt");
                       
                        titulo.setText("");
                        contenido.setText("");
                        etiqueta.setText("Guardado");
                    } else {
                        titulo.setText("");
                        contenido.setText("");
                        etiqueta.setText("Editado");
                    }
                    
                } catch(IOException ex){
                    etiqueta.setText("Error al guardar");
                }
            }
        });

//elimina la nota que está seleccionada en la lista
        eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String archivoSeleccionado = lista.getSelectedValue();
                try{
                    if (archivoSeleccionado==null){
                        etiqueta.setText("Debe seleccionar un archivo");
                        return;
                        
                    }
                    File archivo = new File("data/usuarios/"+usuario+"/"+archivoSeleccionado);
                    archivo.delete();
                    etiqueta.setText("Eliminado");
                    titulo.setText("");
                    contenido.setText("");
                    modeloLista.removeElement(archivoSeleccionado);
                } catch(Exception ex){
                    etiqueta.setText("Error al eliminar");
                }
            }
        });

//limpia los campos del titulo y contenido
        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                titulo.setText("");
                contenido.setText("");
                etiqueta.setText("Contenido limpiado");
            }
        });
        

//al seleccionar una nota y darle al boton, te muestra el contenido y el titulo para poder modificarla
        editar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String archivoSeleccionado = lista.getSelectedValue();
                try {
                    if (archivoSeleccionado == null) {
                        etiqueta.setText("Selecciona un archivo en la lista.");
                        return;
                    }
        
                    File archivo = new File("data/usuarios/"+usuario+"/"+archivoSeleccionado);
                    BufferedReader reader = new BufferedReader(new FileReader(archivo));
                    titulo.setText(archivoSeleccionado.replace(".txt", ""));
                    contenido.read(reader, null);
                    reader.close();
                } catch (IOException ex) {
                    etiqueta.setText("Error al editar");
                }
            }
        });

//escribes una palabra en el campo y buscas a ver si alguan nota contiene esa palabra entre sus lineas y te las lista
        buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              try{
                if (filtro.getText().equals("")){
                    etiqueta.setText("Debe ingresar una palabra para buscar sus notas.");
                    return;
                }
                listaFiltro.clear();
                for (int i = 0; i < modeloLista.getSize(); i++) {
                    String nombreArchivo=modeloLista.getElementAt(i);
                    File archivo = new File("data/"+usuario+"/"+nombreArchivo);
                    BufferedReader reader = new BufferedReader(new FileReader(archivo));
                    String linea;
                    while ((linea =reader.readLine()) != null){
                        if (linea.contains(filtro.getText())){
                            listaFiltro.addElement(nombreArchivo);
                            etiquetaFiltro.setText("Notas encontradas");
                            break;
                        }
                       
                    }
                    reader.close();
                }
                
              } catch(Exception ex){
                etiquetaFiltro.setText("Error al buscar");
              }
        }});



        
        

        ventana.setVisible(true);
    }
    
    private void cargarNotas(){
        try{
            File carpeta = new File("data/usuarios/"+usuario);
            File[] archivos = carpeta.listFiles();
            for (File archivo : archivos){
                modeloLista.addElement(archivo.getName());
            }
        } catch(Exception ex){
            etiqueta.setText("Error al cargar las notas");
        }
    }
}