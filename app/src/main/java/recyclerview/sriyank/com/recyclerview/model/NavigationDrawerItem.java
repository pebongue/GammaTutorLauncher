package recyclerview.sriyank.com.recyclerview.model;

import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

import recyclerview.sriyank.com.recyclerview.R;

public class NavigationDrawerItem {

	private String title;
	private int imageId;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public static List<NavigationDrawerItem> getData() {
		List<NavigationDrawerItem> dataList = new ArrayList<>();

		int[] imageIds = getImages();
		String[] titles = getTitles();

		for (int i = 0; i < titles.length; i++) {
			NavigationDrawerItem navItem = new NavigationDrawerItem();
			navItem.setTitle(titles[i]);
			navItem.setImageId(imageIds[i]);
			dataList.add(navItem);
		}
		return dataList;
	}

	private static int[] getImages() {

		return new int[]{
							R.drawable.educational, R.drawable.powerpoint,
							R.drawable.physics, R.drawable.textbook,
							R.drawable.casp, R.drawable.mathsm,
		                    R.drawable.mathsl,R.drawable.steam,R.drawable.geo};
	}

	private static String[] getTitles() {

		return new String[] {
				"Educational App", "Maths PowerPoints Lesson", "Physical Science Materials",
				"Maths Texbooks", "CAPS Exams Supports", "Maths Reference Materials","Maths Literacy Resources",
				"STEAM Education Support","GeoGebra Materials"
		};
	}
}
