package org.mk.tests;

import java.lang.reflect.Method;

import org.mk.testdata.TestData;

import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;

public class DataProvider {

	@DataSupplier(runInParallel = true)
	public static StreamEx<TestData> getNewData(Method method) {
		StreamEx<TestData> data = TestDataReader.use(XlsxReader.class).withTarget(TestData.class)
				.withSource("test_data.xlsx").read().filter(testdata-> testdata.testcasename.equalsIgnoreCase(method.getName()));
		return data;
	}

}
