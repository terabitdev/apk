package io.elevenlabs.di;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/elevenlabs/di/AppDatabase_AutoMigration_44_45_Impl;", "Lgb/b;", "<init>", "()V", "Lmb/a;", "connection", "Lsn/z;", "migrate", "(Lmb/a;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AppDatabase_AutoMigration_44_45_Impl extends gb.b {
    public AppDatabase_AutoMigration_44_45_Impl() {
        super(44, 45);
    }

    @Override // gb.b
    public void migrate(mb.a connection) {
        connection.getClass();
        tb.a.s("ALTER TABLE `reads` ADD COLUMN `in_user_library` INTEGER NOT NULL DEFAULT 0", connection);
    }
}
