package DE02;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class QuanlyCD {

    private static void NhapDanhSachCD(ArrayList<CD> DanhSachCD) {
        DanhSachCD.add(new CD("CD01", "Noi buon gac tro", "QuangLinh", 195000, 2018));
        DanhSachCD.add(new CD("CD02", "Bai tinh ca dem", "Duc Tuan", 185000, 2021));
        DanhSachCD.add(new CD("CD03", "Cau ho chieu que", "Nhieu ca si", 172000, 2022));
        DanhSachCD.add(new CD("CD04", "Tinh dau tinh cuoi", "Van Khanh", 139000, 2022));
        DanhSachCD.add(new CD("CD05", "Thanh pho mua bay", "Dan Nguyen", 182000, 2019));

    }

    ArrayList<CD> DanhSachCD = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public static void xuatDanhSachCD(ArrayList<CD> danhSachCD) {
        for (CD cd : danhSachCD) {
            System.out.println(cd);
        }
    }

    public void SapXepTheoGiaGiam() {
        Collections.sort(DanhSachCD, new Comparator<CD>() {
            @Override
            public int compare(CD cd1, CD cd2) {
                return Double.compare(cd2.giaban, cd1.giaban);
            }
        });
    }

    public void layCDTruocNam(int nam) {
        List<CD> cdTruocNam = new ArrayList<>();
        for (CD cd : DanhSachCD) {
            if (cd.namphathanh < nam) {
                cdTruocNam.add(cd);
            }
        }
        System.out.println("Danh sach CD phat hanh truoc nam " + nam + ":");
        for (CD cd : cdTruocNam) {
            System.out.println(cd);
        }
    }

    public double tinhTongGiaCD() {
        double tongGia = 0;
        for (CD cd : DanhSachCD) {
            tongGia += cd.giaban;
        }
        return tongGia;
    }
    }
