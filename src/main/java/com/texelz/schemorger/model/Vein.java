package com.texelz.schemorger.model;

/**
 *
 * A type of blood vessel that specifically carries blood to the heart.
 * @fullPath Thing > MedicalEntity > AnatomicalStructure > Vessel > Vein
 *
 * @author Texelz (by Onhate)
 *
 */
public class Vein extends Vessel {

	private Vessel drainsTo;
	private Object regionDrained;
	private AnatomicalStructure tributary;
	/**
	 * The vasculature that the vein drains into.
	 */
	public Vessel getDrainsTo() {
		return this.drainsTo;
	}
	public void setDrainsTo(Vessel drainsTo) {
		this.drainsTo = drainsTo;
	}
	/**
	 * The anatomical or organ system drained by this vessel; generally refers to a specific part of an organ.
	 * @see AnatomicalStructure
	 * @see AnatomicalSystem
	 */
	public Object getRegionDrained() {
		return this.regionDrained;
	}
	public void setRegionDrained(Object regionDrained) {
		this.regionDrained = regionDrained;
	}
	/**
	 * The anatomical or organ system that the vein flows into; a larger structure that the vein connects to.
	 */
	public AnatomicalStructure getTributary() {
		return this.tributary;
	}
	public void setTributary(AnatomicalStructure tributary) {
		this.tributary = tributary;
	}
}