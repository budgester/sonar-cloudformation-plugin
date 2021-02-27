/*
 * Cloudformation Plugin for SonarQube
 * Copyright (C) 2019 James Pether Sörling
 * james@hack23.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package com.hack23.sonar.cloudformation.parser.checkov;

import java.io.ByteArrayInputStream;

import org.junit.Assert;
import org.junit.Test;

public class CheckovReportReaderTest extends Assert {


	
	/**
	 * Read report test.
	 */
	@Test
	public void readReportTest() {
		final CheckovReport cfnNagReport = new CheckovReportReader().readReport(CheckovReportReaderTest.class.getResourceAsStream("/aws-cross-account-manager-master.yml.nag"));
		assertNotNull(cfnNagReport);
	}

	/**
	 * Read report failure test.
	 */
	@Test
	public void readReportFailureTest() {
		final CheckovReport cfnNagReport = new CheckovReportReader().readReport(new ByteArrayInputStream("".getBytes()));
		assertNotNull(cfnNagReport);
	}

}
