package pc;

import input.Input;
import arrange.Arrange;


import java.io.*;
import java.util.*;

public class PcManager {

    Scanner string = new Scanner(System.in);
    private static PcManager instance = null;

    Input input = new Input();

    private final List<Pc> listPc;


    private PcManager() {
        this.listPc = new ArrayList<>();
        readFile();
    }
    public static PcManager getInstance() {
        if(instance == null) {
            instance = new PcManager();
        }
        return instance;
    }
    private boolean isExistPc(String name) {
        for (Pc item : listPc) {
            if (Objects.equals(name, item.getName())) {
                return true;
            }
        }
        return false;
    }
    public Pc getPcByName() {
        String name = string.nextLine();
        for (Pc item : listPc) {
            if (Objects.equals(name, item.getName())) {
                return item;
            }
        }
        return null;
    }
    public Pc getPcByName2(String name) {
        for (Pc item : listPc) {
            if (Objects.equals(name, item.getName())) {
                return item;
            }
        }
        return null;
    }
    public void showListPc() {
        if(listPc.isEmpty()){
            System.out.println("Ko có máy nào, vui lòng thêm máy");
        } else {
            arrangeList();
            System.out.println("Hiện tại có "+listPc.size()+" Pc trong quán");
            for (Pc item : listPc) {
                System.out.println(item);
            }
        }

    }
    private void arrangeList(){
    listPc.sort(new Arrange());
    }

    public void addPc() {
        String name;
        while (true) {
            System.out.println("Loại máy cần thêm??" +
                    "1. Máy vip\n" +
                    "2. Máy cận víp\n" +
                    "3. Máy thường\n" +
                    "4. Trở lại\n");
            int number = input.getInt();
            switch (number) {
                case 1:
                    while (true){
                        System.out.println("Nhập tên máy");
                        name = string.nextLine();
                        if(name.matches(".*[0-9].*")){
                            if (isExistPc(name)) {
                                System.out.println("Tên tồn tại, nhập tên khác!");
                            }else{break;}
                        }
                    }
                    listPc.add(new VipPc(name));
                    System.out.println("Thêm thành công");
                    writeFile();
                    break;
                case 2:
                    while (true){
                        System.out.println("Nhập tên máy");
                        name = string.nextLine();
                        if(name.matches(".*[0-9].*")){
                            if (isExistPc(name)) {
                                System.out.println("Tên tồn tại, nhập tên khác!!");
                            }else{break;}
                        }
                    }
                    listPc.add(new MediumPc(name));
                    System.out.println("Thêm thành công");
                    writeFile();
                    break;
                case 3:
                    while (true){
                        System.out.println("Nhập tên máy");
                        name = string.nextLine();
                        if(name.matches(".*[0-9].*")){
                            if (isExistPc(name)) {
                                System.out.println("Tên tồn tại, nhập tên khác");
                            }else{break;}
                        }
                    }
                    listPc.add(new NormalPc(name));
                    System.out.println("Thêm máy thành công");
                    writeFile();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Vui lòng nhập số từ 1->4");
                    break;
            }
        }
    }
    public void writeFile() {
        try {
            arrangeList();
            File file = new File("data/Data.csv");
            FileWriter fr = new FileWriter(file);
            BufferedWriter bf = new BufferedWriter(fr);
            String line;
            bf.write("name,quality,price,activate,money Of Food\n");
            for (Pc item : listPc) {
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
            FileReader fr = new FileReader("data/Data.csv");
            BufferedReader bf = new BufferedReader(fr);
            bf.readLine();
            String line;
            while ((line = bf.readLine()) != null) {
                String[] data = line.split(",");
                if (Objects.equals(data[1], "vip")) {
                    listPc.add(new VipPc(data[0], Double.parseDouble(data[2]), Boolean.parseBoolean(data[3])));
                } else if (Objects.equals(data[1], "medium")) {
                    listPc.add(new MediumPc(data[0], Double.parseDouble(data[2]), Boolean.parseBoolean(data[3])));
                } else {
                    listPc.add(new NormalPc(data[0], Double.parseDouble(data[2]), Boolean.parseBoolean(data[3])));
                }
            }
            bf.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public void deletePc () {
        if(!listPc.isEmpty()){
            showListPc();
            System.out.println("Nhập máy muốn xóa");
            listPc.remove(getPcByName());
            System.out.println("Xóa thành công");
            writeFile();
        } else {
            System.out.println(" Không có máy nào trong quán. Vui lòng thêm máy!");
        }


    }

    public void activePc() {
        if(!listPc.isEmpty()){
            showListPc();
            System.out.println("Máy muốn mở là ??");
            String name;
            while (true) {
                name = string.nextLine();
                if (!isExistPc(name)) {
                    System.out.println("Máy không tồn tại. Nhập máy khác!!");
                } else {
                    break;
                }
            }

            for (Pc item : listPc) {
                if (Objects.equals(name, item.getName())) {
                    if (!item.isActivate()) {
                        item.setActivate(true);
                        item.setStartTime(System.currentTimeMillis());
                    }

                }
            }
        }else {
            System.out.println("ko có máy nào, thêm máy đi");
        }

    }

    public void pay() {
        double money =0.0;
        showListPc();
        System.out.println("Nhập máy cần tính tiền!");
        String name = string.nextLine();
        for (Pc item : listPc) {
            if (Objects.equals(name, item.getName())) {
                if (item.isActivate()) {
                    item.setActivate(false);
                    item.setEndTime(System.currentTimeMillis());
                    if (Objects.equals(item.getQuality(), "vip")) {

                        money = ( (((double) (item.getEndTime() - item.getStartTime())) / (60 * 60 * 1000)) * 10000)+item.getMoneyOfFood();
                    } else if (Objects.equals(item.getQuality(), "medium")) {

                        money =  ( (((double) (item.getEndTime() - item.getStartTime())) / (60 * 60 * 1000)) * 7500)+item.getMoneyOfFood();
                    } else {
//
                        money = ( (((double) (item.getEndTime() - item.getStartTime())) / (60 * 60 * 1000)) * 5000)+item.getMoneyOfFood();
                    }
                }
            }
        }
        System.out.println(money + " vnd");
    }
    public void editPc() {
        if (!listPc.isEmpty()) {
            String name;
            System.out.println("Nhập tên máy muốn sửa");
            while (true) {
                name = string.nextLine();
                if (!isExistPc(name)) {
                    System.out.println("Không tồn tại máy này. Nhập tên máy khác");
                } else {
                    break;
                }
            }
            for (Pc item : listPc) {
                if (Objects.equals(item.getName(), name)) {
                    while (true) {
                        System.out.println("Chọn thứ muốn sửa\n" +
                                "1. Tên\n" +
                                "2. Chất lượng\n" +
                                "3. Giá\n" +
                                "4. Trở lại");
                        int choice = input.getInt();
                        switch (choice) {
                            case 1:
                                while (true) {
                                    System.out.println("Nhập tên mới");
                                    name = string.nextLine();
                                    if (name.matches(".*[0-9].*")) {
                                        if (isExistPc(name)) {
                                            System.out.println("Tên tồn tại, nhập tên khác");
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                item.setName(name);
                                writeFile();
                                break;
                            case 2:
                                System.out.println("Nhập chất lượng máy");
                                String quality = string.nextLine();
                                item.setQuality(quality);
                                writeFile();
                                break;
                            case 3:
                                System.out.println("Nhập giá giờ chơi");
                                double price = input.getDouble();
                                item.setPrice(price);
                                writeFile();
                                break;
                            case 4:
                                return;

                        }
                    }
                }
            }
        }else {
            System.out.println("Không có máy nào trong quán, vui lòng thêm máy!");
        }
    }

}
