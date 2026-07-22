plugins {
  `java-platform`
  `maven-publish`
}

dependencies {
  constraints {
    api(libs.uhc)
  }
}
