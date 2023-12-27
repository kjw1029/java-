
public class Documents {
	private String write;
	private int day;
	private String summ;
	private int impo;
	
	public Documents(String write, int day, String summ, int impo) {
		this.write = write;
		this.day = day;
		this.summ = summ;
		this.impo = impo;
	}
	public String getWrite() {
		return write;
	}
	public int getDay() {
		return day;
	}
	public String getSumm() {
		return summ;
	}
	public int getImpo() {
		return impo;
	}
	public void setWrite(String write) {
		this.write = write;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setSumm(String summ) {
		this.summ = summ;
	}
	public void setImpo(int impo) {
		this.impo = impo;
	}
}
