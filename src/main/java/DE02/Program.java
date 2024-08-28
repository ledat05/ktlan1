/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DE02;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        QuanlyCD qlCD = new QuanlyCD();
        Scanner sc = new Scanner(System.in);
        int luaChon = 0;
        do {
            System.out.println("1. Xuat toan bo va tong gia tri cd");
            System.out.println("2.Lay cac cd phat hanh ra truoc nam 2020");
            System.out.println("3.Tim cac cd ma ten cd co chu tinh");
            System.out.println("4.Sap xep cac cd giam dan");
            System.out.println("5.Xoa cd theo ma so");
            System.out.println("6.Sua gia ban cua cd theo ma so");
            System.out.println("7.Tinh tong gia cac cd theo ma hang");
            System.out.println("8.Ket Thuc!");
            System.out.print("Chon chuc nang: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            switch (luaChon) {
                case 1:
                    xuatDanhSachCD(qlCD.DanhSachCD);
                    break;
                case 2:
                    qlCD.layCDTruocNam(2020);
                    break;
                case 3:
                    
                    break;
                case 4:
                    qlCD.SapXepTheoGiaGiam();
                    System.out.println("Danh sách CD sau khi sap xep theo gia giam dan:");
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ!");
            }
        } while (luaChon != 5);
    }

}
