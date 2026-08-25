import java.util.Random;

class ConVat {
    protected String ten;
    protected String mauLong;

    public ConVat(String ten, String mauLong) {
        this.ten = ten;
        this.mauLong = mauLong;
    }

    public String getLoai() {
        return "Con Vật";
    }

    public void inThongTin(int stt) {
        System.out.println(stt + ". " + getLoai() + " " + ten + " màu " + mauLong);
    }
}
class ConMeo extends ConVat {
    public ConMeo(String ten, String mauLong) {
        super(ten, mauLong); // Gọi constructor của lớp cha
    }

    @Override
    public String getLoai() {
        return "Con Mèo";
    }
}
class ConCho extends ConVat {
    public ConCho(String ten, String mauLong) {
        super(ten, mauLong); // Gọi constructor của lớp cha
    }

    @Override
    public String getLoai() {
        return "Con Chó";
    }
}

public class Main {
    public static void main(String[] args) {
        ConVat[] danhSach = new ConVat[10];
        Random random = new Random();
        String[] dsTen = {"Tom", "Mimi", "Kiki", "Cún", "Lu", "Mực", "Bông", "Miu", "Đốm", "Béo"};
        String[] dsMau = {"xám", "trắng", "đen", "vàng", "vằn", "nâu"};
        for (int i = 0; i < 10; i++) {
            String ten = dsTen[random.nextInt(dsTen.length)];
            String mau = dsMau[random.nextInt(dsMau.length)];
            if (random.nextBoolean()) {
                danhSach[i] = new ConMeo(ten, mau);
            } else {
                danhSach[i] = new ConCho(ten, mau);
            }
        }
        for (int i = 0; i < danhSach.length; i++) {
            danhSach[i].inThongTin(i + 1);
        }
    }
}