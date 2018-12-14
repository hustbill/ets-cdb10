package org.opengis.cite.cdb10.cdbStructure;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.opengis.cite.cdb10.TestFixture;

public class VerifyGTModelStructureTests extends StructureTestFixture<GTModelStructureTests> {

	public VerifyGTModelStructureTests() throws IOException {
		this.testSuite = new GTModelStructureTests();
	}

	@Test(expected = AssertionError.class)
	public void verifyDataset_BadShort() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "5_GTModelGeometry")));

		// execute
		this.testSuite.verifyDataset();
	}

	@Test(expected = AssertionError.class)
	public void verifyDataset_BadNumber() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "5xx_GTModelGeometry")));

		// execute
		this.testSuite.verifyDataset();
	}

	@Test(expected = AssertionError.class)
	public void verifyDataset_BadRange() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "-1_GTModelGeometry")));

		// execute
		this.testSuite.verifyDataset();
	}

	@Test(expected = AssertionError.class)
	public void verifyDataset_BadValue() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "999_GTModelGeometry")));

		// execute
		this.testSuite.verifyDataset();
	}

	@Test
	public void verifyDataset_Good() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry")));

		// execute
		this.testSuite.verifyDataset();
	}

	@Test
	public void verifyDataset_Skip() throws IOException {
		// setup
		// execute
		this.testSuite.verifyDataset();
	}



	@Test(expected = AssertionError.class)
	public void verifyCategory_WrongCategory() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"B_Culture")));

		// execute
		this.testSuite.verifyCategory();
	}

	@Test(expected = AssertionError.class)
	public void verifyCategory_WrongLabel() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Hydrography")));

		// execute
		this.testSuite.verifyCategory();
	}

	@Test(expected = AssertionError.class)
	public void verifyCategory_UnspecifiedCategory() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"Z_Culture")));

		// execute
		this.testSuite.verifyCategory();
	}

	@Test(expected = AssertionError.class)
	public void verifyCategory_UnspecifiedLabel() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Bogus")));

		// execute
		this.testSuite.verifyCategory();
	}

	@Test
	public void verifyCategory_Good() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture")));

		// execute
		this.testSuite.verifyCategory();
	}

	@Test
	public void verifyCategory_Skip() throws IOException {
		// setup
		// execute
		this.testSuite.verifyCategory();
	}



	@Test(expected = AssertionError.class)
	public void verifySubcategory_WrongCategory() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "B_Extraction")));

		// execute
		this.testSuite.verifySubcategory();
	}

	@Test(expected = AssertionError.class)
	public void verifySubcategory_WrongLabel() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "A_Disposal")));

		// execute
		this.testSuite.verifySubcategory();
	}

	@Test(expected = AssertionError.class)
	public void verifySubcategory_UnspecifiedCategory() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "ZZZZ_Extraction")));

		// execute
		this.testSuite.verifySubcategory();
	}

	@Test(expected = AssertionError.class)
	public void verifySubcategory_UnspecifiedLabel() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "A_Bogus")));

		// execute
		this.testSuite.verifySubcategory();
	}

	@Test
	public void verifySubcategory_Good() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "A_Extraction")));

		// execute
		this.testSuite.verifySubcategory();
	}

	@Test
	public void verifySubcategory_Skip() throws IOException {
		// setup
		// execute
		this.testSuite.verifySubcategory();
	}



	@Test(expected = AssertionError.class)
	public void verifyFeatureType_WrongCategory() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "A_Extraction", "001_Mine")));

		// execute
		this.testSuite.verifyFeatureType();
	}

	@Test(expected = AssertionError.class)
	public void verifyFeatureType_WrongLabel() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Quarry_Wall")));

		// execute
		this.testSuite.verifyFeatureType();
	}

	@Test(expected = AssertionError.class)
	public void verifyFeatureType_UnspecifiedCategory() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "A_Extraction", "999_Mine")));

		// execute
		this.testSuite.verifyFeatureType();
	}

	@Test(expected = AssertionError.class)
	public void verifyFeatureType_UnspecifiedLabel() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Bogus")));

		// execute
		this.testSuite.verifyFeatureType();
	}

	@Test
	public void verifyFeatureType_Good() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine")));

		// execute
		this.testSuite.verifyFeatureType();
	}

	@Test
	public void verifyFeatureType_Skip() throws IOException {
		// setup
		// execute
		this.testSuite.verifyFeatureType();
	}



	@Test(expected = AssertionError.class)
	public void verifyLOD_BadLevel() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine", "LA")));

		// execute
		this.testSuite.verifyLOD();
	}

	@Test(expected = AssertionError.class)
	public void verifyLOD_TooHigh() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine", "L99")));

		// execute
		this.testSuite.verifyLOD();
	}

	@Test(expected = AssertionError.class)
	public void verifyLOD_NoPadding() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine", "L9")));

		// execute
		this.testSuite.verifyLOD();
	}

	@Test
	public void verifyLOD_Good() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine", "L23")));

		// execute
		this.testSuite.verifyLOD();
	}

	@Test
	public void verifyLOD_Skip() throws IOException {
		// setup
		// execute
		this.testSuite.verifyLOD();
	}
	
	
	/*
	 * GTModelGeometry Entry File Naming
	 */
	@Test(expected = AssertionError.class)
	public void verifyGeometryEntryFile_invalid() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine",
				"asdf")));

		// execute
		this.testSuite.verifyGeometryEntryFile();
	}

	@Test(expected = AssertionError.class)
	public void verifyGeometryEntryFile_invalidDataset() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine",
				"D501_S001_T001_12345_001_amodelname.flt")));

		// execute
		this.testSuite.verifyGeometryEntryFile();
	}

	@Test(expected = AssertionError.class)
	public void verifyGeometryEntryFile_invalidExtension() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine",
				"D500_S001_T001_12345_001_amodelname.txt")));

		// execute
		this.testSuite.verifyGeometryEntryFile();
	}

	@Test(expected = AssertionError.class)
	public void verifyGeometryEntryFile_badCS1Length() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine",
				"D500_S1_T001_12345_001_amodelname.flt")));

		// execute
		this.testSuite.verifyGeometryEntryFile();
	}

	@Test(expected = AssertionError.class)
	public void verifyGeometryEntryFile_badCS1Type() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine",
				"D500_SABC_T001_12345_001_amodelname.flt")));

		// execute
		this.testSuite.verifyGeometryEntryFile();
	}

	@Test(expected = AssertionError.class)
	public void verifyGeometryEntryFile_badCS2Length() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine",
				"D500_S001_T1_12345_001_amodelname.flt")));

		// execute
		this.testSuite.verifyGeometryEntryFile();
	}

	@Test(expected = AssertionError.class)
	public void verifyGeometryEntryFile_badCS2Type() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine",
				"D500_S001_TABC_12345_001_amodelname.flt")));

		// execute
		this.testSuite.verifyGeometryEntryFile();
	}
	
	@Test(expected = AssertionError.class)
	public void verifyGeometryEntryFile_badFCLength() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine",
				"D500_S001_T001_45_001_amodelname.flt")));

		// execute
		this.testSuite.verifyGeometryEntryFile();
	}
	
	@Test(expected = AssertionError.class)
	public void verifyGeometryEntryFile_badFSCLength() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine",
				"D500_S001_T001_12345_1_amodelname.flt")));

		// execute
		this.testSuite.verifyGeometryEntryFile();
	}
	
	@Test(expected = AssertionError.class)
	public void verifyGeometryEntryFile_badFSCType() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine",
				"D500_S001_T001_12345_ABC_amodelname.flt")));

		// execute
		this.testSuite.verifyGeometryEntryFile();
	}
	
	@Test(expected = AssertionError.class)
	public void verifyGeometryEntryFile_badMODLLength() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine",
				"D500_S001_T001_12345_001_amodelnameamodelnameamodelnameamodelname.flt")));

		// execute
		this.testSuite.verifyGeometryEntryFile();
	}

	@Test
	public void verifyGeometryEntryFile_Good() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "500_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine",
				"D500_S001_T001_12345_001_amodelname.flt")));

		// execute
		this.testSuite.verifyGeometryEntryFile();
	}

	@Test
	public void verifyGeometryEntryFile_Skip() throws IOException {
		// setup
		// execute
		this.testSuite.verifyGeometryEntryFile();
	}
	
	/*
	 * GTModelGeometry LoD Naming
	 */
	
	@Test(expected = AssertionError.class)
	public void verifyGeometryLoDFile_invalid() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "510_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine", "L10",
				"asdf")));

		// execute
		this.testSuite.verifyGeometryLoDFile();
	}

	@Test(expected = AssertionError.class)
	public void verifyGeometryLoDFile_invalidDataset() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "510_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine", "L10",
				"D501_S001_T001_L10_12345_001_amodelname.flt")));

		// execute
		this.testSuite.verifyGeometryLoDFile();
	}

	@Test(expected = AssertionError.class)
	public void verifyGeometryLoDFile_invalidExtension() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "510_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine", "L10",
				"D510_S001_T001_L10_12345_001_amodelname.txt")));

		// execute
		this.testSuite.verifyGeometryLoDFile();
	}

	@Test(expected = AssertionError.class)
	public void verifyGeometryLoDFile_badCS1Length() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "510_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine", "L10",
				"D510_S1_T001_L10_12345_001_amodelname.flt")));

		// execute
		this.testSuite.verifyGeometryLoDFile();
	}

	@Test(expected = AssertionError.class)
	public void verifyGeometryLoDFile_badCS1Type() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "510_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine", "L10",
				"D510_SABC_T001_L10_12345_001_amodelname.flt")));

		// execute
		this.testSuite.verifyGeometryLoDFile();
	}

	@Test(expected = AssertionError.class)
	public void verifyGeometryLoDFile_badCS2Length() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "510_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine", "L10",
				"D510_S001_T1_L10_12345_001_amodelname.flt")));

		// execute
		this.testSuite.verifyGeometryLoDFile();
	}

	@Test(expected = AssertionError.class)
	public void verifyGeometryLoDFile_badCS2Type() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "510_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine", "L10",
				"D510_S001_TABC_L10_12345_001_amodelname.flt")));

		// execute
		this.testSuite.verifyGeometryLoDFile();
	}
	
	@Test(expected = AssertionError.class)
	public void verifyGeometryLoDFile_badFCLength() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "510_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine", "L10",
				"D510_S001_T001_L10_45_001_amodelname.flt")));

		// execute
		this.testSuite.verifyGeometryLoDFile();
	}
	
	@Test(expected = AssertionError.class)
	public void verifyGeometryLoDFile_badFSCLength() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "510_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine", "L10",
				"D510_S001_T001_L10_12345_1_amodelname.flt")));

		// execute
		this.testSuite.verifyGeometryLoDFile();
	}
	
	@Test(expected = AssertionError.class)
	public void verifyGeometryLoDFile_badFSCType() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "510_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine", "L10",
				"D510_S001_T001_L10_12345_ABC_amodelname.flt")));

		// execute
		this.testSuite.verifyGeometryLoDFile();
	}
	
	@Test(expected = AssertionError.class)
	public void verifyGeometryLoDFile_badMODLLength() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "510_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine", "L10",
				"D510_S001_T001_L10_12345_001_amodelnameamodelnameamodelnameamodelname.flt")));

		// execute
		this.testSuite.verifyGeometryLoDFile();
	}

	@Test
	public void verifyGeometryLoDFile_Good() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("GTModel", "510_GTModelGeometry",
				"A_Culture", "A_Extraction", "010_Mine", "L10",
				"D510_S001_T001_L10_12345_001_amodelname.flt")));

		// execute
		this.testSuite.verifyGeometryLoDFile();
	}

	@Test
	public void verifyGeometryLoDFile_Skip() throws IOException {
		// setup
		// execute
		this.testSuite.verifyGeometryLoDFile();
	}
}
