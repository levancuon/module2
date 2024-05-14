package drinkandfood;

import input.Input;
import pc.Pc;
import pc.PcManager;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class FAWManager {
    PcManager pm = PcManager.getInstance();
    private final ArrayList<FoodAndWater> foodAndWatersList;

    Input input = new Input();

    public FAWManager() {
        this.foodAndWatersList = new ArrayList<>();
        this.listOrder = new ArrayList<>();
        readFile();
    }

    public void showListFAW() {
        if (!foodAndWatersList.isEmpty()) {
            for (FoodAndWater item : foodAndWatersList) {
                System.out.println(item);
            }
        } else {
            System.out.println("Không có món nào, thêm món gấp!");
        }
    }

    public void addFoodWater() {
        System.out.println("Nhập tên");
        String name = input.getStr();
        System.out.println("Nhập giá ");
        double price = input.getDouble();
        System.out.println("Nhập số lượng");
        int quantity = input.getInt();
        System.out.println("Nhập loại:\n 1. Đồ ăn \n 2. Nước");
        String type = getType();
        foodAndWatersList.add(new FoodAndWater(name, price, type, quantity));
        writeFile();
        System.out.println("Thêm thành công");
    }
    private FoodAndWater getFWAByName(String name) {
        for (FoodAndWater item : foodAndWatersList) {
            if (Objects.equals(name, item.getName())) {
                return item;
            }
        }
        return null;
    }
    private String getType() {
        while (true) {
            int choice = input.getInt();
            switch (choice) {
                case 1:
                    return "Food";
                case 2:
                    return "Water";
            }
        }
    }

    public void editFAW() {
        if (!foodAndWatersList.isEmpty()) {
            System.out.println("nhập tên món cần chỉnh sửa");
            String name = input.getStr();
            if (getFWAByName(name) != null) {
                while (true) {
                    System.out.println("nhập mục cần sửa\n" +
                            "1. Tên \n" +
                            "2. Giá\n" +
                            "3. Số lượng\n" +
                            "4. Loại\n" +
                            "5. Thoát");
                    int choice = input.getInt();
                    switch (choice) {
                        case 1:
                            System.out.println("nhập tên mới");
                            String name1 = input.getStr();
                            getFWAByName(name).setName(name1);
                            writeFile();
                            System.out.println("thay đổi thành công");
                            break;
                        case 2:
                            System.out.println("nhập giá mới");
                            double price = input.getDouble();
                            getFWAByName(name).setPrice(price);
                            writeFile();
                            System.out.println("thay đổi thành công");
                            break;
                        case 3:
                            System.out.println("nhập số lượng mới");
                            int quantity = input.getInt();
                            getFWAByName(name).setQuantity(quantity);
                            writeFile();
                            System.out.println("thay đổi thành công");
                            break;
                        case 4:
                            System.out.println("nhập loại mới");
                            String type = getType();
                            getFWAByName(name).setType(type);
                            writeFile();
                            System.out.println("thay đổi thành công");
                            break;
                        case 5:
                            return;
                        default:
                            System.out.println("Nhập số từ 1->5");
                            break;
                    }
                }
            } else {
                System.out.println("không có món này, chọn lại món");
            }
        } else {
            System.out.println("kho trống, thêm món");
        }
    }

    public void writeFile() {
        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter("data/DataFoodWater.csv"));
            String line;
            bf.write("name,price,quantity,activate\n");
            for (FoodAndWater item : foodAndWatersList) {
                line = item.toData();
                bf.write(line);
                bf.newLine();
            }
            bf.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void readFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("data/DataFoodWater.csv")));
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                foodAndWatersList.add(new FoodAndWater(data[0], Double.parseDouble(data[1]), data[2],
                        Integer.parseInt(data[3])));
            }
            br.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void orderFoodWater() {
        if (!foodAndWatersList.isEmpty()) {
            System.out.println("Nhập máy đặt món ??");
            String namePc = input.getStr();
            if(pm.getPcByName2(namePc)!=null){
                showListFAW();
                System.out.println("chọn món");
                String name = input.getStr();
                for (FoodAndWater item : foodAndWatersList) {
                    if (Objects.equals(name, item.getName())) {
                        double money = item.getPrice();
//                        System.out.println(money);
                        pm.getPcByName2(namePc).setMoneyOfFood(money);
//                        System.out.println(pm.getPcByName2(namePc).hashCode());
//                        System.out.println(pm.getPcByName2(namePc).getMoneyOfFood());
                        item.setQuantity(item.getQuantity() - 1);
                    }
                }
                System.out.println("đặt món thành công");
                writeFile();
            } else {
                System.out.println("Máy không tồn tại");
            }
        } else {
            System.out.println("kho rỗng,vui lòng thêm đồ ăn");
        }
    }





}
