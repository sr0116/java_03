package lesson12;

public class WrapperXEx {
	public static void main(String[] args) {
		int i = 10;
		Integer i2 = 20;
		
		System.out.println(i+i2);
		
		//기본형 >> wrapper
		Integer i3 = Integer.valueOf(i);
		//wrapper> 기본형(unboxing)
		int i4 = i3.intValue();
		
		// auto boxing
		Integer i5 = i;
		Integer i6 = i5;
		
		m(10L);
		m(Long.valueOf(10));
		m((long) i6);
		int i7 = Integer.parseInt("1234");
		Integer i8 = Integer.valueOf("1234");
		Long l = Long.parseLong("1234");
		
		//boolean b = Boolean.parseBoolean("true");
		boolean b = "true".equals("y");
		System.out.println(b);
	}
	
	static void m (Long l){
				
	}	
}
