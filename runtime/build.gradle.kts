plugins {
  maven
  `java-library`
  kotlin("jvm")
}

dependencies {
  implementation(kotlin("stdlib"))
  implementation(project(":utility"))
}
