
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.border.Border;
import javax.swing.event.InternalFrameListener;
public class retailci extends JFrame implements ActionListener,ItemListener
{
    HashMap<String, String> product_and_price;
    String a[] = { "Select category", "Dalls", "Dairy products", "Snacks","HomeCare","Beverages","Rice and Flours" };
    DefaultListModel<String> product_name_bill, product_quantity_bill,product_price_bill;
    JLabel title, category_list, product_name, price_per_unit, quantity_label, price_of_product, price_per_unit_label, total, total_amount, bill_product,   bill_quantity, bill_price,thanks;
    JComboBox product_list,cat_list;
    JList product_bill, product_quantity, product_price;
    JButton add_product,buy_now;
    JTextField quantity_list=new JTextField();
    JScrollBar s;
    
    public retailci()
    {
        product_and_price = new HashMap<String, String>();
       
        getContentPane().setBackground(new Color(178,190,181));
        setForeground(Color.WHITE);
        
        title = new JLabel("(-:A to Z RETAIL STORE:-)",JLabel.CENTER);
        title.setFont(new Font("Serif", Font.BOLD, 30));
        title.setBackground(new Color(247,206,178));
        title.setForeground(new Color(210,4,45));
        title.setOpaque(true);
        title.setBounds(20,20,390,50);
        thanks = new JLabel("");
        thanks.setFont(new Font("Serif", Font.BOLD, 20));
        thanks.setBounds(2,700,370,40);
        category_list = new JLabel("Category list");
        category_list.setBounds(10,80,100,20);
        cat_list = new JComboBox(a);
        cat_list.setBackground(new Color(211,230,216));
        cat_list.setForeground(new Color(0,0,0));
        cat_list.setBounds(10,100,100,20);
        cat_list.addItemListener(this);
        add(cat_list);

        product_list = new JComboBox();
        product_list.setEnabled(false);
        product_list.addItemListener(this);
        add(product_list);
        
      
        product_and_price.put("Redgram", "56");
        product_and_price.put("Blackgram", "120");
        product_and_price.put("Moong", "78");
        product_and_price.put("kova", "140");
        product_and_price.put("Paneer", "62");
        product_and_price.put("Curd", "57");
        product_and_price.put("Lays", "121");
        product_and_price.put("kitkat", "79");
        product_and_price.put("Cake", "141");
       product_and_price.put("Ghee","600");
       product_and_price.put("Cheese","435");
       product_and_price.put("Butter","460");
       product_and_price.put("Rice","50");
       product_and_price.put("Basmati Rice","92");
       product_and_price.put("Tur","110");
       product_and_price.put("Urad","139");
       product_and_price.put("Wheat","55");
       product_and_price.put("Sooji","43");
       product_and_price.put("Besan","80");
       product_and_price.put("Maida","40");
       product_and_price.put("Masoor","125");
       product_and_price.put("Chana","118");
       product_and_price.put("Tea packet","510");
       product_and_price.put("Coffee packet","150");
       product_and_price.put("Boost packet","160");
       product_and_price.put("Horlicks packet","170");
       product_and_price.put("Detergent","100");
       product_and_price.put("Dishwash","190");
       product_and_price.put("Room Freshner","265");
       product_and_price.put("Surface Cleaner","180");
       product_and_price.put("Noodles","145");
       product_and_price.put("Ketchup","108");
      
        product_name_bill = new DefaultListModel<>();
        product_price_bill = new DefaultListModel<>();
        product_quantity_bill = new DefaultListModel<>();
        
        product_name = new JLabel("Product Name");
        quantity_label = new JLabel("Unit Quantity");
        price_per_unit = new JLabel("Unit Price");
        price_per_unit_label = new JLabel();
        
        product_list = new JComboBox();
        bill_product = new JLabel("Item");
        bill_quantity = new JLabel("Unit Quantity");
        bill_price = new JLabel("Cost in Rupees");
        
        product_bill = new JList(product_name_bill);
        product_price = new JList(product_price_bill);
        product_quantity = new JList(product_quantity_bill);
        Icon icon = new ImageIcon("C:\\Users\\Yateesh Tangudu\\Downloads\\25486-3-add-to-cart-button.jpeg");
        add_product = new JButton(icon);
        buy_now = new JButton("BUY NOW");
        buy_now.addActionListener(this);
        buy_now.setBounds(140,665,100,40);
        total = new JLabel("        Total Amount : Rupees ");
        total_amount = new JLabel();
        product_name.setBounds(160, 80, 100, 20);
        price_per_unit.setBounds(15, 140, 100, 20);
        quantity_label.setBounds(310, 80, 100, 20);
        price_per_unit_label.setBounds(15, 155, 100, 20);
        
        quantity_list.setBounds(310, 100, 100, 20);    
        add_product.setBounds(310, 140, 100, 40);
        
        bill_product.setBounds(10, 200, 150, 20);
        bill_quantity.setBounds(170, 200, 90, 20);
        bill_price.setBounds(270, 200, 140, 20);
        
        product_bill.setBounds(10, 225, 150, 400);
        product_bill.setBackground(new Color(204,204,255));
        product_quantity.setBounds(170, 225, 90, 400);
        product_quantity.setBackground(new Color(204,255,204));
        product_price.setBounds(270, 225, 140, 400);
        product_price.setBackground(new Color(204,255,204));
        
        total.setBounds(140, 635, 170, 20);
        total_amount.setBounds(300, 635, 90, 20);

        product_list.setBounds(160,100,100,20);
        
        add(title);
        add(category_list);
        add(product_name);
        add(price_per_unit);
        add(quantity_label);
        add(buy_now);
        add(price_per_unit_label);
        add(product_list);
        add(quantity_list);
        
        add(add_product);
      
        add(bill_product);
        add(bill_quantity);
        add(bill_price);
        
        add(product_bill);
        add(product_quantity);
        add(product_price);
        add(thanks); 
        add(total);
        add(total_amount); 
        product_list.addActionListener(this);
        add_product.addActionListener(this);
        setSize(450,1200);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void itemStateChanged(ItemEvent e) {
        
        String b[] = { "select Dalls","Redgram","Blackgram", "Moong" };
        String c[] = {"select Dairies", "kova", "Paneer", "Curd"};
        String d[] = {"select Snacks", "Lays", "kitkat", "Cake" };
        String v[] = {"select HomeCare","Detergent","Dishwash","Room Freshner","Surface Cleaner"};
        String f[] = {"select Beverages","Tea packet","Coffee packet","Boost packet","Horlicks packet"};
        String g[] = {"select Rice and Flours","Rice","Basmati Rice","Sooji","Maida","Wheat","Besan"};
        if (e.getSource() == cat_list) {
                if (cat_list.getSelectedItem().equals("Select category")) {
                        product_list.setEnabled(false);
                } else if (cat_list.getSelectedItem().equals("Dalls")) {
                    product_list.setEnabled(true);
                    product_list.removeAllItems();
                        for (int i = 0; i < b.length; i++) {
                            product_list.addItem(b[i]);
                        }
                } else if (cat_list.getSelectedItem().equals("Dairy products")) {
                    product_list.setEnabled(true);
                    product_list.removeAllItems();
                        for (int i = 0; i < c.length; i++) {
                            product_list.removeItem(c[i]);
                            product_list.addItem(c[i]);
                        }
                } else if (cat_list.getSelectedItem().equals("Snacks")) {
                    product_list.setEnabled(true);
                    product_list.removeAllItems();
                        for (int i = 0; i < d.length; i++) {
                            product_list.addItem(d[i]);
                        }
                    }
               else if (cat_list.getSelectedItem().equals("HomeCare")) {
                    product_list.setEnabled(true);
                    product_list.removeAllItems();
                        for (int i = 0; i < v.length; i++) {
                            product_list.addItem(v[i]);
                        }
                    }
                    else if (cat_list.getSelectedItem().equals("Beverages")) {
                    product_list.setEnabled(true);
                    product_list.removeAllItems();
                        for (int i = 0; i < f.length; i++) {
                            product_list.addItem(f[i]);
                        }
                    }
                     else if (cat_list.getSelectedItem().equals("Rice and Flours")) {
                    product_list.setEnabled(true);
                    product_list.removeAllItems();
                        for (int i = 0; i < g.length; i++) {
                            product_list.addItem(g[i]);
                        }
                    }
                }
                        //product_list.setForeground(Color.white);//new Color(230,230,250));
                        product_list.setBackground(new Color(211,230,216));
                        product_list.setForeground(new Color(0,0,0));          
        }


   public void actionPerformed(ActionEvent e)
    {
      
      
    
        if(e.getSource()==add_product)
        {
            thanks.setText("");
            if(quantity_list.getText().isEmpty())
          {
            JOptionPane.showMessageDialog(null,"Please Select The Quantity");
          }
           else {
           float total_for_product=0;
           float total_cost = 0;
            try
             {
            
            
            int unit_price = Integer.parseInt(product_and_price.get(product_list.getSelectedItem()));
           
            float product_quantity = Float.parseFloat((String)quantity_list.getText());
            if(product_quantity<=0)
            {
               throw new NumberFormatException();
            }
           
            total_for_product = unit_price*product_quantity;  
           
            product_price_bill.addElement(Float.toString(total_for_product));
            product_name_bill.addElement((String) product_list.getSelectedItem());
            
            product_quantity_bill.addElement((String)quantity_list.getText());
        }
    
            
     
catch(Exception ae)
{
 JOptionPane.showMessageDialog(null,"Please Select The valid Quantity");
}   
  
            
            
            for(int i=0;i<product_price_bill.getSize();i++)
            {
                total_cost += Float.parseFloat(product_price_bill.getElementAt(i));
            }
            
            total_amount.setText(Float.toString(total_cost));
        }
    }
        else if(e.getSource()==product_list)
        {
            price_per_unit_label.setText(product_and_price.get(product_list.getSelectedItem()));
        }
   if(e.getSource()==buy_now)
   {
     thanks.setText("                THANK YOU...VISIT AGAIN!");
   }
     
   }

public static void main(String[] args)
{
        new retailci();
}
}