package c5_3;

import java.util.Date;

/**
 * ��ʽ���ַ�����ϰ
 * @author Administrator
 *
 */
public class c5_3 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		/*	���ڸ�ʽ��ת����	*/
		System.out.println("%te һ�����е�ĳһ�죨1~31��:\t" + String.format("%te", date));
		System.out.println("%tb ָ�����Ի������·ݼ��:\t" + String.format("%tb", date));
		System.out.println("%tB ָ�����Ի������·�ȫ��:\t" + String.format("%tB", date));
		System.out.println("%tA ָ�����Ի��������ڼ�ȫ��:\t" + String.format("%tA", date));
		System.out.println("%ta ָ�����Ի��������ڼ����:\t" + String.format("%ta", date));
		System.out.println("%tc ����ȫ�����ں�ʱ����Ϣ:\t" + String.format("%tc", date));
		System.out.println("%tY 4λ���:\t" + String.format("%tY", date));
		System.out.println("%tj һ���еĵڼ��죨001~366��:\t" + String.format("%tj", date));
		System.out.println("%tm �·�:\t" + String.format("%tm", date));
		System.out.println("%td һ�����еĵڼ��죨01~31��:\t" + String.format("%td", date));
		System.out.println("%ty 2λ���:\t" + String.format("%ty", date));
		
		/*	ʱ���ʽ��ת����	*/
		System.out.println("\n%tH 2λ���ֵ�24ʱ�Ƶ�Сʱ��00~23��:\t" + String.format("%tH", date));
		System.out.println("%tI 2λ���ֵ�12ʱ�Ƶ�Сʱ��01~12��:\t" + String.format("%tI", date));
		System.out.println("%tk 2λ���ֵ�24ʱ�Ƶ�Сʱ��0~23��:\t" + String.format("%tk", date));
		System.out.println("%tl 2λ���ֵ�12ʱ�Ƶ�Сʱ��1~12��:\t" + String.format("%tl", date));
		System.out.println("%tM 2λ���ֵķ��ӣ�00~59��:\t" + String.format("%tM", date));
		System.out.println("%tS 2λ���ֵ�������00~60��:\t" + String.format("%tS", date));
		System.out.println("%tL 3λ���ֵĺ�������000~999��:\t" + String.format("%tL", date));
		System.out.println("%tN 9λ���ֵ�΢������000000000~999999999��:\t" + String.format("%tN", date));
		System.out.println("%tp ָ�����Ի����������������:\t" + String.format("%tp", date));
		System.out.println("%tz �����GMT RFC 82��ʽ������ʱ��ƫ����:\t" + String.format("%tz", date));
		System.out.println("%tZ ʱ����д��ʽ���ַ���:\t" + String.format("%tZ", date));
		System.out.println("%ts 1970-01-01 00:00:00�����ھ���������:\t" + String.format("%ts", date));
		System.out.println("%tQ 1970-01-01 00:00:00�����ھ����ĺ�����:\t" + String.format("%tQ", date));
		
		/*	���ں�ʱ����ϵĸ�ʽ	*/
		System.out.println("\n%tF ����-��-�ա���ʽ��4λ��ݣ�:\t" + String.format("%tF", date));
		System.out.println("%tD ����/��/�ꡱ��ʽ��2λ��ݣ�:\t" + String.format("%tD", date));
		System.out.println("%tc ȫ�����ں�ʱ����Ϣ:\t" + String.format("%tc", date));
		System.out.println("%tr ��ʱ:��:�� PM(AM)����ʽ��12ʱ�ƣ�:\t" + String.format("%tr", date));
		System.out.println("%tT ��ʱ:��:�롱��ʽ��24ʱ�ƣ�:\t" + String.format("%tT", date));
		System.out.println("%tR ��ʱ:�֡���ʽ��24ʱ�ƣ�:\t" + String.format("%tR", date));
		
		/*	����ת����	*/
		System.out.println("\n%b��%B �������ʽ��Ϊ�������ͣ�\t" + String.format("%b", 1 > 2));
		System.out.println("%h��%H �������ʽ��Ϊɢ���룺\t" + String.format("%h", 1 > 2));
		System.out.println("%s��%S �������ʽ��Ϊ�ַ������ͣ�\t" + String.format("%s", 012));
		System.out.println("%c��%C �������ʽ��Ϊ�ַ����ͣ�\t" + String.format("%c", 'q'));
		System.out.println("%d �������ʽ��Ϊʮ����������\t" + String.format("%d", 012));
		System.out.println("%o �������ʽ��Ϊ�˽���������\t" + String.format("%o", 211));
		System.out.println("%x��%X �������ʽ��Ϊʮ������������\t" + String.format("%x", 985));
		System.out.println("%e �������ʽ��Ϊ�ü������ѧ��������ʾ��ʮ��������\t" + String.format("%.2e", 1995.0110F));
		System.out.println("%a �������ʽ��Ϊ����Чλ����ָ����ʮ�����Ƹ���ֵ��\t" + String.format("%a", 1995.0110F));
		System.out.println("%n ���Ϊ�ض���ƽ̨���зָ�����\t[" + String.format("%n") + ']');
		System.out.println("%% ���Ϊ����ֵ'%'��\t" + String.format("%%"));
	}
}
