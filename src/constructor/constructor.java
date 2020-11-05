package constructor;


class Car{
	
	String color;
	String size;
	
	// 기본 생성자, 생성자가 없을 경우 자동으로 생성해야혹 변수가 있는 생성자가 존재할 경우 따로 명시해줘야 기본 생성자를 사용할 수 있다.
	Car() {
		
		this("red", "big"); // 다른 생성자를 접근할 때는 this()를 사용한다.
	}
	
	Car(String color, String size){
		
		// this는  인스턴스를 자기자신을 가리키는 참조변수이다.
		// 인스턴스 주소가 저장되어 있어서 인스턴스 변수 접근가능.
		this.color = color; 
		this.size = size;
		
	}
	
	//getter, setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	// toString
	@Override
	public String toString() {
		return "Car [color=" + color + ", size=" + size + "]";
	}
		
}
public class constructor {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		System.out.println(car.toString()); // Car [color=red, size=big]
	}

}
