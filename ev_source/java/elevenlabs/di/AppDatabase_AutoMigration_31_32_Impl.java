package io.elevenlabs.di;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/elevenlabs/di/AppDatabase_AutoMigration_31_32_Impl;", "Lgb/b;", "<init>", "()V", "Lmb/a;", "connection", "Lsn/z;", "migrate", "(Lmb/a;)V", "Lgb/a;", "callback", "Lgb/a;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AppDatabase_AutoMigration_31_32_Impl extends gb.b {
    private final gb.a callback;

    public AppDatabase_AutoMigration_31_32_Impl() {
        super(31, 32);
        this.callback = new Migration31to32();
    }

    @Override // gb.b
    public void migrate(mb.a connection) {
        com.google.android.gms.internal.play_billing.b.x(connection, connection, "CREATE TABLE IF NOT EXISTS `_new_reads` (`read_id` TEXT NOT NULL, `sync_state` TEXT NOT NULL, `article_image_url` TEXT, `author` TEXT, `char_count` INTEGER NOT NULL, `created_at_unix` INTEGER NOT NULL, `updated_at_unix` INTEGER NOT NULL, `added_at_unix` INTEGER, `description` TEXT, `last_listened_char_offset` INTEGER NOT NULL, `source` TEXT, `title` TEXT, `url` TEXT, `word_count` INTEGER NOT NULL, `original_file_type` TEXT, `has_original_audio` INTEGER NOT NULL, `mature_content` INTEGER NOT NULL, `origin` TEXT, `content_type` TEXT, `genre` TEXT NOT NULL, `html_checksum` TEXT, `from_user_import` INTEGER NOT NULL, `rating_average` REAL, `rating_count` INTEGER, `user_rating` INTEGER, `last_used_voice_id` TEXT, `can_make_podcast` INTEGER NOT NULL, `creation_status` TEXT, `creation_progress` REAL, `is_archived` INTEGER NOT NULL, `marked_as_unread` INTEGER NOT NULL DEFAULT 0, `completed_at_unix` INTEGER DEFAULT NULL, PRIMARY KEY(`read_id`))", connection, "INSERT INTO `_new_reads` (`read_id`,`sync_state`,`article_image_url`,`author`,`char_count`,`created_at_unix`,`updated_at_unix`,`added_at_unix`,`description`,`last_listened_char_offset`,`source`,`title`,`url`,`word_count`,`original_file_type`,`has_original_audio`,`mature_content`,`origin`,`content_type`,`genre`,`html_checksum`,`from_user_import`,`rating_average`,`rating_count`,`user_rating`,`last_used_voice_id`,`can_make_podcast`,`creation_status`,`creation_progress`,`is_archived`,`marked_as_unread`,`completed_at_unix`) SELECT `read_id`,`sync_state`,`article_image_url`,`author`,`char_count`,`created_at_unix`,`updated_at_unix`,`added_at_unix`,`description`,`last_listened_char_offset`,`source`,`title`,`url`,`word_count`,`original_file_type`,`has_original_audio`,`mature_content`,`origin`,`content_type`,`genre`,`html_checksum`,`from_user_import`,`rating_average`,`rating_count`,`user_rating`,`last_used_voice_id`,`can_make_podcast`,`creation_status`,`creation_progress`,`is_archived`,`marked_as_unread`,`completed_at_unix` FROM `reads`");
        tb.a.s("DROP TABLE `reads`", connection);
        tb.a.s("ALTER TABLE `_new_reads` RENAME TO `reads`", connection);
        this.callback.onPostMigrate(connection);
    }
}
