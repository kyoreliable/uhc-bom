rootProject.name = "uhc-bom"

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
  repositoriesMode = RepositoriesMode.FAIL_ON_PROJECT_REPOS

  repositories {
    maven("https://jitpack.io")
  }
}
