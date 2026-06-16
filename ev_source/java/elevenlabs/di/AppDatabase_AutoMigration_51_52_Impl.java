package io.elevenlabs.di;

import io.elevenlabs.di.AppDatabase;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/elevenlabs/di/AppDatabase_AutoMigration_51_52_Impl;", "Lgb/b;", "<init>", "()V", "Lmb/a;", "connection", "Lsn/z;", "migrate", "(Lmb/a;)V", "Lgb/a;", "callback", "Lgb/a;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AppDatabase_AutoMigration_51_52_Impl extends gb.b {
    private final gb.a callback;

    public AppDatabase_AutoMigration_51_52_Impl() {
        super(51, 52);
        this.callback = new AppDatabase.DeleteCanSubscribeMigration();
    }

    @Override // gb.b
    public void migrate(mb.a connection) {
        com.google.android.gms.internal.play_billing.b.x(connection, connection, "CREATE TABLE IF NOT EXISTS `_new_collections` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `subtitle` TEXT, `has_unread` INTEGER NOT NULL, `description` TEXT, `image_url` TEXT, `last_opened_at_unix` INTEGER, `updated_at_unix` INTEGER, `category` TEXT, `item_count` INTEGER, `is_owner` INTEGER DEFAULT NULL, `icon` TEXT DEFAULT NULL, PRIMARY KEY(`id`))", connection, "INSERT INTO `_new_collections` (`id`,`title`,`subtitle`,`has_unread`,`description`,`image_url`,`last_opened_at_unix`,`updated_at_unix`,`category`,`item_count`,`is_owner`,`icon`) SELECT `id`,`title`,`subtitle`,`has_unread`,`description`,`image_url`,`last_opened_at_unix`,`updated_at_unix`,`category`,`item_count`,`is_owner`,`icon` FROM `collections`");
        tb.a.s("DROP TABLE `collections`", connection);
        tb.a.s("ALTER TABLE `_new_collections` RENAME TO `collections`", connection);
        this.callback.onPostMigrate(connection);
    }
}
