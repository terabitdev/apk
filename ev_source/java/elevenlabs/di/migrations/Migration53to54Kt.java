package io.elevenlabs.di.migrations;

import gb.b;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import nb.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0001\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lgb/b;", "MIGRATION_53_54", "Lgb/b;", "getMIGRATION_53_54", "()Lgb/b;", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class Migration53to54Kt {
    private static final b MIGRATION_53_54 = new b() { // from class: io.elevenlabs.di.migrations.Migration53to54Kt$MIGRATION_53_54$1
        @Override // gb.b
        public void migrate(a db2) {
            db2.getClass();
            db2.l("DROP TABLE IF EXISTS `consumption_spans`");
            db2.l("CREATE TABLE IF NOT EXISTS `consumption_spans` (\n    `id` TEXT NOT NULL,\n    `read_id` TEXT NOT NULL,\n    `audio_file_number` TEXT,\n    `start_seconds` REAL NOT NULL,\n    `end_seconds` REAL NOT NULL,\n    `start_char_offset` INTEGER,\n    `end_char_offset` INTEGER,\n    `listened_at_unix` INTEGER NOT NULL,\n    `playback_speed` REAL NOT NULL,\n    `real_time_duration_seconds` REAL NOT NULL,\n    `type` TEXT NOT NULL,\n    PRIMARY KEY(`id`)\n)");
            db2.l("CREATE INDEX IF NOT EXISTS `index_consumption_spans_read_id` ON `consumption_spans` (`read_id`)");
        }
    };

    public static final b getMIGRATION_53_54() {
        return MIGRATION_53_54;
    }
}
