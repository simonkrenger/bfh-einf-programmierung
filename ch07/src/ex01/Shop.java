package ex01;

import java.util.ArrayList;

import ex01.panini.PicturePackage;
import ex01.panini.PicturePackageBox;

/**
 * Class to represent a shop that sells picture packages. Implements the
 * Singleton pattern, since there is only one shop in the simulation
 * 
 * @author simon
 * @since 16.12.2011
 * 
 */
public class Shop {

	/**
	 * Stock of the shop that holds packages
	 */
	private ArrayList<PicturePackage> stock = new ArrayList<PicturePackage>();

	/**
	 * Sale price of one package with pictures in it
	 */
	private final static int PACKAGE_SALE_PRICE = 1;

	/**
	 * Money that the shop has
	 */
	private int balance = 0;

	/**
	 * Instance of the shop (singleton pattern)
	 */
	private static Shop instance;

	/**
	 * Constructor for the class
	 */
	private Shop() {

	}

	/**
	 * Gets the instance of the shop (Singleton pattern)
	 * 
	 * @return The instance of the shop
	 */
	public static Shop getInstance() {
		if (instance == null)
			instance = new Shop();
		return instance;
	}

	/**
	 * Method to sell a package. If there are no packages in stock, order a box
	 * of packages from the factory.
	 * 
	 * @return A single picture package
	 */
	public PicturePackage sellPackage() {
		if (stock.size() <= 0) {
			PicturePackageBox newBox = buyBoxFromFactory();
			for (PicturePackage p : newBox.unpack()) {
				stock.add(p);
			}
		}
		balance = balance + getPackagePrice();
		return stock.remove(stock.size() - 1);
	}

	/**
	 * Method to buy a box from the factory
	 * 
	 * @return A new box bought from the factory
	 */
	private PicturePackageBox buyBoxFromFactory() {
		balance = balance - Factory.getInstance().getBoxPrice();
		return Factory.getInstance().sellBox();
	}

	/**
	 * Gets the price for one package
	 * 
	 * @return The sale price of one package
	 */
	public int getPackagePrice() {
		return PACKAGE_SALE_PRICE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Shop [stock.size()=" + stock.size() + ", balance=" + balance
				+ "]";
	}

}
