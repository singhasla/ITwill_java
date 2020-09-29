package ch09;

public class P423_Q5_CheckBoxExample {

	public static void main(String[] args) {

		P423_Q5_CheckBox checkBox = new P423_Q5_CheckBox();
		checkBox.setOnSelectListener(new P423_Q5_BackgroundChangeListener());
		checkBox.select();
	}

}
