import Products.Product;
import Products.ProductsManager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner numbers = new Scanner(System.in);
        Scanner string = new Scanner(System.in);
        List<Product> productArrayList = new ArrayList<>();
        ProductsManager productsManager = new ProductsManager();
        int choice;


        do {
            System.out.println("Make your choice");
            System.out.println("1. Them san pham");
            System.out.println("2. Hien thi ds san pham");
            System.out.println("3. Tim kiem san pham");
            System.out.println("0. out");
            choice = numbers.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap id");
                    int id = numbers.nextInt();
                    System.out.println("Nhap name");
                    String name = string.nextLine();
                    System.out.println("Nhap money");
                    double money = numbers.nextDouble();
                    System.out.println("Nhap hangSanXuat");
                    String hangSanXuat = string.nextLine();
                    System.out.println("Nhap description");
                    String description = string.nextLine();
                    productsManager.addProduct(new Product(id, name, money, hangSanXuat, description));
                    System.out.println("Nhap thanh cong");
                    write("BaiTap_QuanLySanPhamLuuRaFileNhiPhan/src/Products/vc.dat",new Product(id, name, money, hangSanXuat, description));

                    break;
                case 2:
                    productsManager.showListProducts();
                    break;
                case 3:
                    id = numbers.nextInt();
                    productsManager.findById(id);
                    break;
                case 4:

//                    ObjectInputStream objectInputStream =new ObjectInputStream(new FileInputStream("BaiTap_QuanLySanPhamLuuRaFileNhiPhan/src/Products/vc.dat"));
//                    Product product = (Product) objectInputStream.readObject();
//                    System.out.println(product);
                read("BaiTap_QuanLySanPhamLuuRaFileNhiPhan/src/Products/vc.dat");
                    break;
            }
        } while (choice != 0);

        }
        private static void write (String path, Product products){
            try {
                FileOutputStream fos = new FileOutputStream(path);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(products);
                oos.close();
                fos.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        private static void read (String path){
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
                Product product = (Product) objectInputStream.readObject();
                System.out.println(product);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }