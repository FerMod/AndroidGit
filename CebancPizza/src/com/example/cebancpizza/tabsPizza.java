package com.example.cebancpizza;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class tabsPizza extends FragmentPagerAdapter {

	public tabsPizza(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int indice) {
		// TODO Auto-generated method stub
		switch(indice) {
		case 0:
			return new Pantalla2();
		
		}
		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
