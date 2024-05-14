package menu;

import drinkandfood.FAWManager;
import input.Input;
import pc.PcManager;

public class Menu {
    PcManager pcManager =  PcManager.getInstance();
    FAWManager fawManager = new FAWManager();

    public void menuMain() {
        Input input = new Input();
        int choice;
        while (true) {
            System.out.println("Bạn là ??\n" +
                    "1. Chủ\n" +
                    "2. Khách hàng\n" +
                    "3. Thoát");
            choice = input.getInt();
            switch (choice) {
                case 1:
                    menuManager();
                    break;
                case 2:
                    menuClient();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Nhập số 1->3");
                    break;
            }
        }


    }

    private void menuManager() {
        Input input = new Input();
        int choice;
        while (true) {
            System.out.println("---Hello---\n" +
                    "Chọn thao tác để tiếp tục\n" +
                    "1. Xem danh sách máy\n" +
                    "2. Xem danh sách đồ ăn nước uống\n" +
                    "3. Thêm máy\n" +
                    "4. Thêm món ăn nước uống\n" +
                    "5. Sửa thông tin đồ ăn nước uống\n" +
                    "6. Thay đổi thông tin máy\n" +
                    "7. Xóa máy\n" +
                    "8. Quay lại ");
            choice = input.getInt();
            switch (choice) {
                case 1:
                    pcManager.showListPc();
                    break;
                case 2:
                    fawManager.showListFAW();
                    break;
                case 3:
                    pcManager.addPc();
                    break;
                case 4:
                    fawManager.addFoodWater();
                    break;
                case 5:
                    fawManager.showListFAW();
                    fawManager.editFAW();
                    break;
                case 6:
                    pcManager.showListPc();
                    pcManager.editPc();
                    break;
                case 7:
                    pcManager.deletePc();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Nhập số từ 1->5");
            }
        }
    }

    private void menuClient() {
        Input input = new Input();
        int choice;
        while (true) {
            System.out.println("---Hello---\n" +
                    "Chọn thao tác để tiếp tục \n" +
                    "1. Danh sách tình trạng máy\n" +
                    "2. Danh sách món ăn và nước uống\n" +
                    "3. Kích hoạt máy \n" +
                    "4. Chọn món nước, món ăn\n" +
                    "5. Tính tiền\n" +
                    "6. Quay lại");
            choice = input.getInt();
            switch (choice) {
                case 1:
                    pcManager.showListPc();
                    break;
                case 2:
                    fawManager.showListFAW();
                    break;
                case 3:
                    pcManager.activePc();
                    break;
                case 4:
                    fawManager.orderFoodWater();
                    break;
                case 5:
                    pcManager.pay();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Nhập số từ 1->6");
                    break;
            }
        }

    }


}

