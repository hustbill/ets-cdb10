package org.opengis.cite.cdb10.cdbStructure;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;
import org.opengis.cite.cdb10.TestFixture;

public class VerifyMModelGeometryStructureTests extends TestFixture<MModelGeometryStructureTests> {

	public VerifyMModelGeometryStructureTests() {
		this.testSuite = new MModelGeometryStructureTests();
	}

	@Test(expected = AssertionError.class)
	public void verifyDISEntityKind_InvalidCode() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("MModel", "600_MModelGeometry",
				"999_Kind")));

		// execute
		this.testSuite.verifyDISEntityKind();
	}

	@Test(expected = AssertionError.class)
	public void verifyDISEntityKind_InvalidName() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("MModel", "600_MModelGeometry",
				"1_Bogus")));

		// execute
		this.testSuite.verifyDISEntityKind();
	}

	@Test(expected = AssertionError.class)
	public void verifyDISEntityKind_Mismatch() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("MModel", "600_MModelGeometry",
				"1_Other")));

		// execute
		this.testSuite.verifyDISEntityKind();
	}

	@Test(expected = AssertionError.class)
	public void verifyDISEntityKind_InvalidFile() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("MModel", "600_MModelGeometry",
				"asdf")));

		// execute
		this.testSuite.verifyDISEntityKind();
	}

	@Test
	public void verifyDISEntityKind_Good() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("MModel", "600_MModelGeometry",
				"1_Platform")));

		// execute
		this.testSuite.verifyDISEntityKind();
	}



	@Test(expected = AssertionError.class)
	public void verifyDISDomain_InvalidCode() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("MModel", "600_MModelGeometry",
				"1_Platform", "999_Other")));

		// execute
		this.testSuite.verifyDISDomain();
	}

	@Test(expected = AssertionError.class)
	public void verifyDISDomain_InvalidName() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("MModel", "600_MModelGeometry",
				"1_Platform", "0_Bogus")));

		// execute
		this.testSuite.verifyDISDomain();
	}

	@Test(expected = AssertionError.class)
	public void verifyDISDomain_Mismatch() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("MModel", "600_MModelGeometry",
				"1_Platform", "0_Land")));

		// execute
		this.testSuite.verifyDISDomain();
	}

	@Test(expected = AssertionError.class)
	public void verifyDISDomain_InvalidFile() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("MModel", "600_MModelGeometry",
				"1_Platform", "asdf")));

		// execute
		this.testSuite.verifyDISDomain();
	}

	@Test
	public void verifyDISDomain_Good() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("MModel", "600_MModelGeometry",
				"1_Platform", "0_Other")));

		// execute
		this.testSuite.verifyDISDomain();
	}



	@Test(expected = AssertionError.class)
	public void verifyDISCountry_InvalidCode() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("MModel", "600_MModelGeometry",
				"1_Platform", "0_Other", "999_Other")));

		// execute
		this.testSuite.verifyDISCountry();
	}

	@Test(expected = AssertionError.class)
	public void verifyDISCountry_InvalidName() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("MModel", "600_MModelGeometry",
				"1_Platform", "0_Other", "0_Bogus")));

		// execute
		this.testSuite.verifyDISCountry();
	}

	@Test(expected = AssertionError.class)
	public void verifyDISCountry_Mismatch() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("MModel", "600_MModelGeometry",
				"1_Platform", "0_Other", "0_Afghanistan")));

		// execute
		this.testSuite.verifyDISCountry();
	}

	@Test(expected = AssertionError.class)
	public void verifyDISCountry_InvalidFile() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("MModel", "600_MModelGeometry",
				"1_Platform", "0_Other", "asdf")));

		// execute
		this.testSuite.verifyDISCountry();
	}

	@Test
	public void verifyDISCountry_Good() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("MModel", "600_MModelGeometry",
				"1_Platform", "0_Other", "0_Other")));

		// execute
		this.testSuite.verifyDISCountry();
	}



	@Test(expected = AssertionError.class)
	public void verifyDISCategory_InvalidCode() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("MModel", "600_MModelGeometry",
				"1_Platform", "0_Other", "0_Other", "999_Other")));

		// execute
		this.testSuite.verifyDISCategory();
	}

	@Test(expected = AssertionError.class)
	public void verifyDISCategory_InvalidName() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("MModel", "600_MModelGeometry",
				"1_Platform", "0_Other", "0_Other", "0_Bogus")));

		// execute
		this.testSuite.verifyDISCategory();
	}

	@Test(expected = AssertionError.class)
	public void verifyDISCategory_Mismatch() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("MModel", "600_MModelGeometry",
				"1_Platform", "0_Other", "0_Other", "0_Tank")));

		// execute
		this.testSuite.verifyDISCategory();
	}

	@Test(expected = AssertionError.class)
	public void verifyDISCategory_InvalidFile() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("MModel", "600_MModelGeometry",
				"1_Platform", "0_Other", "0_Other", "asdf")));

		// execute
		this.testSuite.verifyDISCategory();
	}

	@Test
	public void verifyDISCategory_Good() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("MModel", "600_MModelGeometry",
				"1_Platform", "0_Other", "0_Other", "0_Other")));

		// execute
		this.testSuite.verifyDISCategory();
	}



	@Test(expected = AssertionError.class)
	public void verifyDISEntity_InvalidFile() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("MModel", "600_MModelGeometry",
				"1_Platform", "0_Other", "0_Other", "0_Other", "asdf")));

		// execute
		this.testSuite.verifyDISEntity();
	}

	@Test(expected = AssertionError.class)
	public void verifyDISEntity_Mismatch() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("MModel", "600_MModelGeometry",
				"1_Platform", "0_Other", "0_Other", "0_Other", "0_0_0_0_0_0_0")));

		// execute
		this.testSuite.verifyDISEntity();
	}

	@Test
	public void verifyDISEntity_Good() throws IOException {
		// setup
		Files.createDirectories(this.cdb_root.resolve(Paths.get("MModel", "600_MModelGeometry",
				"1_Platform", "0_Other", "0_Other", "0_Other", "1_0_0_0_0_0_0")));

		// execute
		this.testSuite.verifyDISEntity();
	}

}