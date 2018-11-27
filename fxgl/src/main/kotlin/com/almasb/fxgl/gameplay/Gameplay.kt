/*
 * FXGL - JavaFX Game Library. The MIT License (MIT).
 * Copyright (c) AlmasB (almaslvl@gmail.com).
 * See LICENSE for details.
 */

package com.almasb.fxgl.gameplay

import com.almasb.fxgl.saving.UserProfile
import com.almasb.fxgl.saving.UserProfileSavable

/**
 * Contains access to various gameplay related managers / services
 * and data.
 *
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
class Gameplay : UserProfileSavable {

    val stats = GameplayStats()

//    val clock = InGameClock(FXGL.getSettings().secondsIn24h)
//
//    val QTE: QTE by lazy { QTEProvider() }
//
//    val questManager: QuestManager by lazy { QuestManagerProvider() }
//
//    val achievementManager: AchievementManager by lazy { AchievementManager() }
//
//    val cutsceneManager: CutsceneManager by lazy { CutsceneManager() }

    override fun save(profile: UserProfile) {
        stats.save(profile)
        //achievementManager.save(profile)
        //questManager.save(profile)
    }

    override fun load(profile: UserProfile) {
        stats.load(profile)
        //achievementManager.load(profile)
        //questManager.load(profile)
    }
}