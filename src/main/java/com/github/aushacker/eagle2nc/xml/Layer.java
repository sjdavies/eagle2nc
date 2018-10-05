/*
 * Copyright 2018 Stephen Davies
 *
 * This file is part of Eagle2nc.
 *
 * Eagle2nc is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Eagle2nc is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Eagle2nc. If not, see <https://www.gnu.org/licenses/>.
 */
package com.github.aushacker.eagle2nc.xml;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Represents a layer in the Eagle board.
 * For example: dimension (20), top (1), bottom (16) etc.
 *
 * @author Stephen Davies
 * @since October 2018
 */
public class Layer {

	@XmlAttribute
	private String number;
	
	@XmlAttribute
	private String name;
	
	@XmlAttribute
	private String color;
	
	@XmlAttribute
	private String fill;
	
	@XmlAttribute
	private boolean visible;
	
	@XmlAttribute
	private boolean active;
	
	public boolean getActive() {
		return active;
	}
	
	public String getColor() {
		return color;
	}

	public String getFill() {
		return fill;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public boolean getVisible() {
		return visible;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("Layer(");
		result.append(number);
		result.append(", ");
		result.append(name);
		result.append(")");
		return result.toString();
	}
}
