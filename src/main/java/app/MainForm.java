package app;

import java.util.ArrayList;
import java.util.List;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.*;
import javax.swing.table.*;

/**
 * Начална форма за контролна работа № 1, вариант A (Книги).
 * Всички контроли са поставени и кръстени. Кодът ви влиза в конструктора
 * (след initComponents) и в методите на събитията. Блокът между
 * GEN-BEGIN и GEN-END се генерира от дизайнера и не се редактира.
 */
public class MainForm extends javax.swing.JFrame {
    private List<Book> items = new ArrayList<Book>();
    private DefaultListModel<Book> listModel = new DefaultListModel<>();
    private String[] COLUMNS = {"Заглавие", "Автор", "Жанр", "Цена"};
    private List<Book> shown;
    
    private DefaultTableModel tblModel = new DefaultTableModel(COLUMNS, 0)
    {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; 
        }
    };
    
    private void show(List<Book> data) {
        shown = data;
        listModel.clear();
        tblModel.setRowCount(0);
        
        for(Book item : data){
            listModel.addElement(item);
            tblModel.addRow(item.getProperties());
        }
        
        lblStatus.setText("Показани: " + listModel.getSize());
    }
    
    public MainForm() {
        initComponents();
        setLocationRelativeTo(null);
        
        tblItems.setModel(tblModel);
        
        items.add(new Book("Под игото", "Иван Вазов", "Роман", 18.90));
        items.add(new Book("Java за начинаещи", "Кети Сиера", "Учебник", 54.00));
        items.add(new Book("Ян Бибиян", "Елин Пелин", "Детска", 12.50));
        
        show(items);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFilter = new javax.swing.JPanel();
        lblFilter = new javax.swing.JLabel();
        cmbFilter = new javax.swing.JComboBox<>();
        scrItems = new javax.swing.JScrollPane();
        tblItems = new javax.swing.JTable();
        pnlBottom = new javax.swing.JPanel();
        pnlFields = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        lblAuthor = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        lblGenre = new javax.swing.JLabel();
        cmbGenre = new javax.swing.JComboBox<>();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        pnlButtons = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Контролна работа 1 — Книги");

        pnlFilter.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblFilter.setText("Филтър:");
        pnlFilter.add(lblFilter);
        pnlFilter.add(cmbFilter);

        getContentPane().add(pnlFilter, java.awt.BorderLayout.NORTH);

        tblItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrItems.setViewportView(tblItems);

        getContentPane().add(scrItems, java.awt.BorderLayout.CENTER);

        pnlBottom.setLayout(new java.awt.BorderLayout());

        pnlFields.setLayout(new java.awt.GridLayout(4, 2, 6, 6));

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitle.setText("Заглавие:");
        pnlFields.add(lblTitle);
        pnlFields.add(txtTitle);

        lblAuthor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAuthor.setText("Автор:");
        pnlFields.add(lblAuthor);
        pnlFields.add(txtAuthor);

        lblGenre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGenre.setText("Жанр:");
        pnlFields.add(lblGenre);
        pnlFields.add(cmbGenre);

        lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrice.setText("Цена:");
        pnlFields.add(lblPrice);
        pnlFields.add(txtPrice);

        pnlBottom.add(pnlFields, java.awt.BorderLayout.NORTH);

        pnlButtons.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnAdd.setText("Добави");
        pnlButtons.add(btnAdd);

        btnDelete.setText("Изтрий");
        pnlButtons.add(btnDelete);

        pnlBottom.add(pnlButtons, java.awt.BorderLayout.CENTER);

        lblStatus.setText("Готово.");
        pnlBottom.add(lblStatus, java.awt.BorderLayout.SOUTH);

        getContentPane().add(pnlBottom, java.awt.BorderLayout.SOUTH);

        setSize(new java.awt.Dimension(778, 598));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String[] args) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> new MainForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox<String> cmbFilter;
    private javax.swing.JComboBox<String> cmbGenre;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblFilter;
    private javax.swing.JLabel lblGenre;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlFields;
    private javax.swing.JPanel pnlFilter;
    private javax.swing.JScrollPane scrItems;
    private javax.swing.JTable tblItems;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
