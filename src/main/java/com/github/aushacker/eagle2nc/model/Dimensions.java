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

package com.github.aushacker.eagle2nc.model;

import java.awt.geom.Point2D;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Stephen Davies
 * @since October 2018
 */
public class Dimensions implements Iterable<Point2D> {

	private List<Point2D> points;

	public Dimensions() {
		this.points = new LinkedList<>();
	}

	public void add(Point2D p) {
		points.add(p);
	}

	public Point2D start() {
		return points.get(0);
	}

	@Override
	public Iterator<Point2D> iterator() {
		return points.iterator();
	}
}
