package enumdemo;

public enum SexEnum{
    
	MALE("��������",1), FEMALE("����Ů��",0); // ö�ٶ������д�ڵ�һ��
	private String name;
	private int id;
	
	private SexEnum(){
	}
	
	// ö�ٵĹ��췽��������private
    private SexEnum(String name,int id){   
		this.name=name;
		this.id=id;
	}
    
    // �Զ���ķ�����ͨ��id����ö�ٶ���
    public static SexEnum findSexById(int id){
    	for(SexEnum sex:SexEnum.values()){
    		if(sex.id==id){
    			return sex;
    		}
    	}
    	return null;
    }
    
    

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setAge(int id) {
		this.id = id;
	}

}
