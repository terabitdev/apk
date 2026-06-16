package io.elevenlabs.di;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/elevenlabs/di/AppDatabase_AutoMigration_52_53_Impl;", "Lgb/b;", "<init>", "()V", "Lmb/a;", "connection", "Lsn/z;", "migrate", "(Lmb/a;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AppDatabase_AutoMigration_52_53_Impl extends gb.b {
    public AppDatabase_AutoMigration_52_53_Impl() {
        super(52, 53);
    }

    @Override // gb.b
    public void migrate(mb.a connection) {
        com.google.android.gms.internal.play_billing.b.x(connection, connection, "CREATE TABLE IF NOT EXISTS `consumption_spans` (`id` TEXT NOT NULL, `read_id` TEXT NOT NULL, `audio_file_number` TEXT NOT NULL, `start_seconds` REAL NOT NULL, `end_seconds` REAL NOT NULL, `start_char_offset` INTEGER, `end_char_offset` INTEGER, `listened_at_unix` INTEGER NOT NULL, `playback_speed` REAL NOT NULL, `real_time_duration_seconds` REAL NOT NULL, `synced` INTEGER NOT NULL, PRIMARY KEY(`id`))", connection, "CREATE INDEX IF NOT EXISTS `index_consumption_spans_read_id` ON `consumption_spans` (`read_id`)");
        tb.a.s("CREATE INDEX IF NOT EXISTS `index_consumption_spans_synced` ON `consumption_spans` (`synced`)", connection);
    }
}
