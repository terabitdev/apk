package io.elevenlabs.di.migrations;

import gb.b;
import io.elevenlabs.data.database.entities.offline.OfflineChapterEntity;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import nb.a;
import wq.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0001\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lgb/b;", "MIGRATION_56_57", "Lgb/b;", "getMIGRATION_56_57", "()Lgb/b;", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class Migration56to57Kt {
    private static final b MIGRATION_56_57 = new b() { // from class: io.elevenlabs.di.migrations.Migration56to57Kt$MIGRATION_56_57$1
        @Override // gb.b
        public void migrate(a db2) {
            db2.getClass();
            db2.l("DELETE FROM offline_read\nWHERE id NOT IN (SELECT MAX(id) FROM offline_read GROUP BY read_id)");
            db2.l("CREATE TABLE IF NOT EXISTS offline_chapter (\n    offline_read_id INTEGER NOT NULL,\n    read_id TEXT NOT NULL,\n    chapter_index INTEGER NOT NULL,\n    file_number TEXT DEFAULT NULL,\n    status TEXT NOT NULL,\n    progress INTEGER NOT NULL DEFAULT 0,\n    cached_manifest_url TEXT DEFAULT NULL,\n    drm_key_set_id TEXT DEFAULT NULL,\n    created_at_unix INTEGER NOT NULL,\n    expires_at_unix INTEGER NOT NULL,\n    PRIMARY KEY(offline_read_id, chapter_index),\n    FOREIGN KEY(offline_read_id) REFERENCES offline_read(id) ON DELETE CASCADE\n)");
            db2.l("CREATE INDEX IF NOT EXISTS index_offline_chapter_read_id ON offline_chapter(read_id)");
            long currentTimeMillis = System.currentTimeMillis();
            long j4 = OfflineChapterEntity.EXPIRY_MILLIS + currentTimeMillis;
            StringBuilder q = com.google.android.gms.internal.play_billing.b.q("\n            INSERT INTO offline_chapter (offline_read_id, read_id, chapter_index, file_number, status, progress, created_at_unix, expires_at_unix)\n            SELECT o.id, o.read_id, rc.chapter_index, rc.audio_file_number, 'READY', 100, ", currentTimeMillis, ", ");
            q.append(j4);
            q.append("\n            FROM offline_read o\n            INNER JOIN reads_chapters rc ON o.read_id = rc.read_id\n            WHERE o.type = 'MEDIA' AND o.status = 'READY' AND rc.audio_file_number IS NOT NULL\n            ");
            db2.l(o.J(q.toString()));
            db2.l("UPDATE offline_read SET status = 'ERROR'\nWHERE status != 'READY'");
        }
    };

    public static final b getMIGRATION_56_57() {
        return MIGRATION_56_57;
    }
}
