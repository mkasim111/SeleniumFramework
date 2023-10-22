package org.mk.testdata;

import io.github.sskorol.data.Column;
import io.github.sskorol.data.Source;


@Source(path = "test_data.xlsx")
public class TestData {

	@Column(name = "testcasename")
	public String testcasename;

	@Column(name = "username")
	public String username;

	@Column(name = "password")
	public String password;

	@Column(name = "expected")
	public String expected;

}
