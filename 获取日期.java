package m;

import java.util.Calendar;

public class ��ȡ���� {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        int dow = cal.get(Calendar.DAY_OF_WEEK);
        int dom = cal.get(Calendar.DAY_OF_MONTH);
        int doy = cal.get(Calendar.DAY_OF_YEAR);

        System.out.println("����ʱ��: " + cal.getTime());
        System.out.println("����: " + day);
        System.out.println("�·�: " + month);
        System.out.println("���: " + year);
        System.out.println("һ�ܵĵڼ���: " + dow);  // ������Ϊһ�ܵĵ�һ�����Ϊ 1������һ���Ϊ 2���Դ�����
        System.out.println("һ���еĵڼ���: " + dom);
        System.out.println("һ��ĵڼ���: " + doy);
    }
}
