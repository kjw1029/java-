import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class GeoLocation {
	int x;
	int y;

	public GeoLocation(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "GeoLocation [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof GeoLocation)) {
			return false;
		}
		GeoLocation other = (GeoLocation) obj;
		if (x != other.x) {
			return false;
		}
		if (y != other.y) {
			return false;
		}
		return true;
	}
	
	
	
}

public class Main9 {
	public static void main(String[] args) {
		// 위도 경도 주소지
		// 35 128 밀양시 활성동
		// 34 127 남해군 서면
		GeoLocation loc1 = new GeoLocation(35, 128);
		System.out.println(loc1);
		
		Map<GeoLocation, String> map = new HashMap<>();
		map.put(loc1, "밀양시 활성동");
		map.put(new GeoLocation(34, 127), "남해군 서면");
		
		System.out.println(map);
		
		System.out.println(map.get(new GeoLocation(34, 127)));
		
		for(Entry<GeoLocation, String> e : map.entrySet()) {
			String address = e.getValue();
			if(address.equals("남해군 서면")) { // value 중복가능
				System.out.println(e.getKey());
			}
		}
	}

}
