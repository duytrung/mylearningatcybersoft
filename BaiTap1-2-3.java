import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //Bài tập 1

      final int SoLanCanNhap = 5;
      Scanner scannr = new Scanner(System.in);
      int TongSo = 0;
      for (int i = 1; i <= SoLanCanNhap; i++) {
          System.out.print("Nhập vào một số nguyên thứ " + i + ": ");
          TongSo += scannr.nextInt();
      }
      System.out.print("Trung bình của năm số bạn đã nhập là: ");
      System.out.println(TongSo/SoLanCanNhap);

        // Bài tập 2
        // Chuyển đổi USD sang VND

       final int TyGiaHoiDoai = 23500;
       Scanner sc = new Scanner(System.in);
       // Giả sử người đổi tiền không đổi số tiền lớn nên chọn kiểu int cho dễ
       System.out.println("Bạn cần đổi bao nhiêu USD? ");
       int SoTienMuonDoi = Integer.parseInt(sc.nextLine());
       int SoTienVietTuongDuong = SoTienMuonDoi * TyGiaHoiDoai;
       System.out.println("Số tiền bạn muốn đổi sang VND là: " + SoTienVietTuongDuong + "VND");

        // Bài tập 3:
        // Xác định vị trí điểm M so với đường tròn
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tọa độ x của tâm đường tròn: ");
        float x = Float.parseFloat(sc.nextLine());
        // Nhập tọa độ y của tâm đường tròn
        System.out.println("Nhập tọa độ y của tâm đường tròn: ");
        float y = Float.parseFloat(sc.nextLine());
        // nhập bán kính đường tròn
        System.out.println("Nhập bán kính đường tròn: ");
        float r = Float.parseFloat(sc.nextLine());

        // Nhập tọa độ điểm:
        System.out.println("Nhập tọa độ x của điểm M: ");
        float Mx = Float.parseFloat(sc.nextLine());
        // Nhập tọa độ y của tâm đường tròn
        System.out.println("Nhập tọa độ y của điểm M: ");
        float My = Float.parseFloat(sc.nextLine());
        
        // so sánh khoảng cách
        double d = Math.sqrt((Mx - x)*(Mx - x) + (My - y)*(My - y));

        if (d < r ){
            //  Điểm M nằm trong vòng tròn
            System.out.println("Điểm M nằm trong vòng tròn");
        } else {
            System.out.println("Điểm M nằm ngoài vòng tròn");

        }


    }
}
