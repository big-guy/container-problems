plugins {
	id("my-plugin")
}

first {
	element1 {

	}
	// allowed, but wrong
	// element2
}

second {
	element2 {

	}
	// allowed, but wrong
	// element1
}
