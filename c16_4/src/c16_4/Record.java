package c16_4;

public class Record {
	@Field_Method_Parameter_Annotation(describle = "���", type = int.class)
	//ע���ֶ�
	int id;
	@Field_Method_Parameter_Annotation(describle = "����", type = String.class)
	String name;
	
	@Constructor_Annotation()
	//����Ĭ��ֵע�͹��췽��
	public Record() {
		
	}
	
	@Constructor_Annotation("������ʼ�����췽��")
	public Record(		//ע�͹��췽��
			@Field_Method_Parameter_Annotation(describle = "���", type = int.class)
			int id, 
			@Field_Method_Parameter_Annotation(describle = "����", type = String.class)
			String name) {
		this.id = id;
		this.name = name;
	}
	
	@Field_Method_Parameter_Annotation(describle = "��ñ��", type = int.class)
	public int getId() {		//ע�ͷ���
		return id;
	}
	
	@Field_Method_Parameter_Annotation(describle = "���ñ��")
	public void setId(		//��Աtype����Ĭ��ֵע�ͷ���
			@Field_Method_Parameter_Annotation(describle = "���", type = int.class)
			int id) {
		this.id = id;
	}
	
	@Field_Method_Parameter_Annotation(describle = "�������", type = String.class)
	public String getName() {
		return name;
	}
	
	@Field_Method_Parameter_Annotation(describle = "��������")
	public void setName(
			@Field_Method_Parameter_Annotation(describle = "����", type = String.class)
			String name) {
		this.name = name;
	}
}
