package wc;

// “世界杯”实体类
public class WorldCup {
	private String year;
	private String address;
	private String winner;

	public WorldCup() {
	}

	public WorldCup(String year, String address, String winner) {
		super();
		this.year = year;
		this.address = address;
		this.winner = winner;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

}
