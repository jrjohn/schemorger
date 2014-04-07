package com.texelz.schemorger.model;

/**
 *
 * Any part of the human body, typically a component of an anatomical system. Organs, tissues, and cells are all anatomical structures.
 * @fullPath Thing > MedicalEntity > AnatomicalStructure
 *
 * @author Texelz (by Onhate)
 *
 */
public class AnatomicalStructure extends MedicalEntity {

	private String associatedPathophysiology;
	private String bodyLocation;
	private AnatomicalStructure connectedTo;
	private ImageObject diagram;
	private String function;
	private AnatomicalSystem partOfSystem;
	private MedicalCondition relatedCondition;
	private MedicalTherapy relatedTherapy;
	private AnatomicalStructure subStructure;
	/**
	 * If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system.
	 */
	public String getAssociatedPathophysiology() {
		return this.associatedPathophysiology;
	}
	public void setAssociatedPathophysiology(String associatedPathophysiology) {
		this.associatedPathophysiology = associatedPathophysiology;
	}
	/**
	 * Location in the body of the anatomical structure.
	 */
	public String getBodyLocation() {
		return this.bodyLocation;
	}
	public void setBodyLocation(String bodyLocation) {
		this.bodyLocation = bodyLocation;
	}
	/**
	 * Other anatomical structures to which this structure is connected.
	 */
	public AnatomicalStructure getConnectedTo() {
		return this.connectedTo;
	}
	public void setConnectedTo(AnatomicalStructure connectedTo) {
		this.connectedTo = connectedTo;
	}
	/**
	 * An image containing a diagram that illustrates the structure and/or its component substructures and/or connections with other structures.
	 */
	public ImageObject getDiagram() {
		return this.diagram;
	}
	public void setDiagram(ImageObject diagram) {
		this.diagram = diagram;
	}
	/**
	 * Function of the anatomical structure.
	 */
	public String getFunction() {
		return this.function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	/**
	 * The anatomical or organ system that this structure is part of.
	 */
	public AnatomicalSystem getPartOfSystem() {
		return this.partOfSystem;
	}
	public void setPartOfSystem(AnatomicalSystem partOfSystem) {
		this.partOfSystem = partOfSystem;
	}
	/**
	 * A medical condition associated with this anatomy.
	 */
	public MedicalCondition getRelatedCondition() {
		return this.relatedCondition;
	}
	public void setRelatedCondition(MedicalCondition relatedCondition) {
		this.relatedCondition = relatedCondition;
	}
	/**
	 * A medical therapy related to this anatomy.
	 */
	public MedicalTherapy getRelatedTherapy() {
		return this.relatedTherapy;
	}
	public void setRelatedTherapy(MedicalTherapy relatedTherapy) {
		this.relatedTherapy = relatedTherapy;
	}
	/**
	 * Component (sub-)structure(s) that comprise this anatomical structure.
	 */
	public AnatomicalStructure getSubStructure() {
		return this.subStructure;
	}
	public void setSubStructure(AnatomicalStructure subStructure) {
		this.subStructure = subStructure;
	}
}