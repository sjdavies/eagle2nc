/*
 * Copyright 2019 Stephen Davies
 *
 * This file is part of eagle2nc.
 *
 * eagle2nc is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * eagle2nc is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with eagle2nc. If not, see <https://www.gnu.org/licenses/>.
 */

package com.github.aushacker.eagle2nc.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * Utility class to provide top level access to the
 * XML parser output.
 *
 * @author Stephen Davies
 * @since MArch 2019
 */
public class Parser {

    public static XEagle parse(File f) throws JAXBException {
        System.setProperty("javax.xml.accessExternalDTD", "all");
        JAXBContext jc = JAXBContext.newInstance(XEagle.class);
        Unmarshaller u = jc.createUnmarshaller();
        return (XEagle) u.unmarshal(f);
    }
}
