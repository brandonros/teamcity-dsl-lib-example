package com.brandonros.test

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object CustomProject : Project({
    vcsRoot(Sources)
    buildType(Pipeline)
    sequential {
        buildType(Pipeline)
    }
})
