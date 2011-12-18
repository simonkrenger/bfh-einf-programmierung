package ex01;

import java.util.ArrayList;

import ex01.football.Tournament;
import ex01.panini.Album;
import ex01.panini.Picture;
import ex01.panini.PicturePackage;
import ex01.panini.PicturePackageBox;

/**
 * Factory class for representing a factory that produces and sells Panini
 * pictures. Implemented with a Singleton pattern.
 * 
 * @author simon
 * @since 09.12.2011
 * 
 */
public class Factory {

	/**
	 * Constant to hold the size of a batch that is produced by the factory
	 */
	private static final int BATCH_SIZE = 10;

	/**
	 * Sale price of a box that is sold by the factory
	 */
	private static final int BOX_SALE_PRICE = 25;

	/**
	 * Sale price of an album that is sold by the factory
	 */
	private static final int ALBUM_SALE_PRICE = 10;

	/**
	 * Money of the factory
	 */
	private int balance;

	/**
	 * Since the factory can only produce batches, it needs a stock of boxes
	 */
	private ArrayList<PicturePackageBox> stock;

	/**
	 * Series (tournament) the factory is producing pictures for
	 */
	private Tournament series;

	/**
	 * Singleton pattern: Holds the instance of the factory
	 */
	private static Factory instance;

	/**
	 * Private constructor for the factory.
	 */
	private Factory() {
		balance = 0;
		stock = new ArrayList<PicturePackageBox>();
	}

	/**
	 * Singleton pattern: Gets the instance of the factory
	 * 
	 * @return The instance of the factory
	 */
	public static Factory getInstance() {
		if (instance == null)
			instance = new Factory();
		return instance;
	}

	/**
	 * Method for producing a new batch of pictures. Attention: setSeries()
	 * needs to be called before using this method
	 */
	private void produceBatch() {

		for (int batch = 0; batch < BATCH_SIZE; batch++) {
			PicturePackageBox ppbox = new PicturePackageBox();
			for (int packs = 0; packs < PicturePackageBox.getPacksPerBox(); packs++) {
				PicturePackage pp = new PicturePackage();
				for (int pics = 0; pics < PicturePackage.getPicturesPerPack(); pics++) {
					pp.addPicture(new Picture(series.getRandomPlayer()));
				}
				ppbox.addPackage(pp);
			}
			stock.add(ppbox);
		}
		balance = balance - PicturePackageBox.getBoxProductionCost();
	}

	/**
	 * Method to sell a box to a shop. Attention: setSeries() needs to be called
	 * before using this method.
	 * 
	 * @return A box of packages
	 */
	public PicturePackageBox sellBox() {
		if (stock.size() <= 0) {
			produceBatch();
		}
		balance += getBoxPrice();
		return stock.remove(stock.size() - 1);
	}

	/**
	 * Method to sell a new album
	 * 
	 * @return An album for panini pictures
	 */
	public Album sellAlbum() {
		balance += getAlbumPrice();
		return new Album(series.getTotalPlayers());
	}

	/**
	 * Gets the price for a picture package box
	 * 
	 * @return Price for a box
	 */
	public int getBoxPrice() {
		return BOX_SALE_PRICE;
	}

	/**
	 * Gets the price for an album
	 * 
	 * @return The sale price for an album
	 */
	public int getAlbumPrice() {
		return ALBUM_SALE_PRICE;
	}

	/**
	 * Method to set the tournament for which the factory is producing boxes
	 * 
	 * @param tournament
	 *            The factory will produce pictures for this tournament
	 */
	public void setSeries(Tournament tournament) {
		this.series = tournament;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Factory [balance=" + balance + ", stock.size()=" + stock.size()
				+ ", getBoxPrice()=" + getBoxPrice() + ", getAlbumPrice()="
				+ getAlbumPrice() + "]";
	}

}
