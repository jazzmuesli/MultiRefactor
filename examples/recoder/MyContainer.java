package recoder;

public class MyContainer {

	private Integer myInteger = new Integer(30).plus(new Integer(4));
	private Long myLong = new Long(2019).minus(new Long(34));

	class Integer {
		private int i;

		Integer(int i) {
			this.i = i;
		}

		Integer plus(Integer i) {
			return new Integer(this.i + i.i);
		}

		Integer minus(Integer i) {
			return new Integer(this.i - i.i);
		}
	}

	class Long {
		private int i;

		Long(int i) {
			this.i = i;
		}

		Long plus(Long i) {
			return new Long(this.i + i.i);
		}

		Long minus(Long i) {
			return new Long(this.i - i.i);
		}
	}

}
