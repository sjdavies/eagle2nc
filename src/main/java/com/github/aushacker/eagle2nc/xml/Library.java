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

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 * @author Stephen Davies
 * @since October 2018
 */
public class Library {

	@XmlAttribute
	private String name;

	// FQ name required because java.lang.Package exists
	@XmlElementWrapper(name="packages")
	@XmlElement(name="package")
	private List<com.github.aushacker.eagle2nc.xml.Package> packages;

	public String getName() {
		return name;
	}

	public List<com.github.aushacker.eagle2nc.xml.Package> getPackages() {
		return packages;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("Library(");
		result.append(name);
		result.append(")");
		return result.toString();
	}
}
