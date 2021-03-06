package org.schema;

/**
 * 
 * A short TV progam or a segment/part of a TV program.
 * 
 * @fullPath Thing > CreativeWork > Clip > TVClip
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class TVClip extends Clip {

	private Season partOfSeason;
	private Series partOfSeries;

	/**
	 * The season to which this episode belongs.
	 */
	public Season getPartOfSeason() {
		return this.partOfSeason;
	}

	/**
	 * The season to which this episode belongs.
	 */
	public void setPartOfSeason(Season partOfSeason) {
		this.partOfSeason = partOfSeason;
	}

	/**
	 * The series to which this episode or season belongs. Supercedes <a
	 * href="partOfTVSeries">partOfTVSeries</a>.
	 */
	public Series getPartOfSeries() {
		return this.partOfSeries;
	}

	/**
	 * The series to which this episode or season belongs. Supercedes <a
	 * href="partOfTVSeries">partOfTVSeries</a>.
	 */
	public void setPartOfSeries(Series partOfSeries) {
		this.partOfSeries = partOfSeries;
	}
}
