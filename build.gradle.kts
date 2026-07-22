plugins {
  `java-platform`
  `maven-publish`
}

dependencies {
  constraints {
    api(libs.uhc)
  }
}

publishing {
  publications {
    create<MavenPublication>("maven") {
      from(components["javaPlatform"])
    }
  }
}
