package com.customcheckin.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.StringProperty;

public class MetadataFile {
	private StringProperty name;
	private String relativeFilePath;
	private String gitPath;
	private String sfPath;
	private BooleanProperty isSelected = new SimpleBooleanProperty(false);
	
	public MetadataFile(StringProperty name, BooleanProperty isSelected) {
		this.setName(name);
		this.setIsSelected(isSelected);
	}
	
	public MetadataFile(StringProperty name, String filePath, String gitPath, String sfPath, BooleanProperty isSelected) {
		this.setName(name);
		this.setIsSelected(isSelected);
		this.relativeFilePath = filePath;
		this.gitPath = gitPath;
		this.sfPath = sfPath;
	}

	/**
	 * @return the name
	 */
	public StringProperty getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(StringProperty name) {
		this.name = name;
	}

	/**
	 * @return the isSelected
	 */
	public BooleanProperty getIsSelected() {
		return isSelected;
	}

	/**
	 * @param isSelected the isSelected to set
	 */
	public void setIsSelected(BooleanProperty isSelected) {
		this.isSelected = isSelected;
	}
	
	public Boolean getChecked() {
		return true;
	}

	/**
	 * @return the filePath
	 */
	public String getRelativeFilePath() {
		return relativeFilePath;
	}

	/**
	 * @param filePath the filePath to set
	 */
	public void setRelativeFilePath(String filePath) {
		this.relativeFilePath = filePath;
	}

	/**
	 * @return the gitPath
	 */
	public String getGitPath() {
		return gitPath;
	}

	/**
	 * @param gitPath the gitPath to set
	 */
	public void setGitPath(String gitPath) {
		this.gitPath = gitPath;
	}

	/**
	 * @return the sfPath
	 */
	public String getSfPath() {
		return sfPath;
	}

	/**
	 * @param sfPath the sfPath to set
	 */
	public void setSfPath(String sfPath) {
		this.sfPath = sfPath;
	}
}
