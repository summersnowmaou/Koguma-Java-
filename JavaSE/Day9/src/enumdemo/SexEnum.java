package enumdemo;

public enum SexEnum{
    
	MALE("我是男生",1), FEMALE("我是女生",0); // 枚举对象必须写在第一行
	private String name;
	private int id;
	
	private SexEnum(){
	}
	
	// 枚举的构造方法必须是private
    private SexEnum(String name,int id){   
		this.name=name;
		this.id=id;
	}
    
    // 自定义的方法，通过id查找枚举对象
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
