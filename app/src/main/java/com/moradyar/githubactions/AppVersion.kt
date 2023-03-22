package com.moradyar.githubactions

const val versionCode = 18

const val major = 6
const val minor = 0
const val patch = 0
const val isSnapshot = false
const val isRc = false
const val rcVersion = 1
const val versionName = "$major.$minor.$patch"
val fullVersionName: String
    get() {
        val extension = if (isSnapshot) {
            "-SNAPSHOT"
        } else if (isRc) {
            "-RC.$rcVersion"
        } else ""
        return "$versionName$extension"
    }