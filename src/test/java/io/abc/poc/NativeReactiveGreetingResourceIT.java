package io.abc.poc;

import io.abc.poc.resource.ReactiveGreetingResourceTest;
import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeReactiveGreetingResourceIT extends ReactiveGreetingResourceTest {

    // Execute the same tests but in native mode.
}