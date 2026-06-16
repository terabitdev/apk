package io.elevenlabs.di.migrations;

import gb.b;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import nb.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0001\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lgb/b;", "MIGRATION_49_50", "Lgb/b;", "getMIGRATION_49_50", "()Lgb/b;", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class Migration49to50Kt {
    private static final b MIGRATION_49_50 = new b() { // from class: io.elevenlabs.di.migrations.Migration49to50Kt$MIGRATION_49_50$1
        @Override // gb.b
        public void migrate(a db2) {
            db2.getClass();
            db2.l("ALTER TABLE reads_chapters RENAME TO reads_chapters_old");
            db2.l("CREATE TABLE IF NOT EXISTS reads_chapters (\n    read_id TEXT NOT NULL,\n    chapter_index INTEGER NOT NULL,\n    chapter_name TEXT NOT NULL,\n    char_count INTEGER NOT NULL,\n    has_summary INTEGER NOT NULL,\n    word_count INTEGER NOT NULL,\n    starting_char_offset INTEGER NOT NULL,\n    duration_seconds REAL DEFAULT NULL,\n    audio_file_number TEXT DEFAULT NULL,\n    PRIMARY KEY(read_id, chapter_index)\n)");
            db2.l("INSERT INTO reads_chapters \nSELECT \n    old.read_id,\n    (\n        SELECT COUNT(*) \n        FROM reads_chapters_old sub \n        WHERE sub.read_id = old.read_id \n        AND (\n            CASE\n                WHEN sub.audio_file_number IS NOT NULL AND old.audio_file_number IS NOT NULL THEN\n                    sub.audio_file_number < old.audio_file_number \n                    OR (sub.audio_file_number = old.audio_file_number AND sub.starting_char_offset < old.starting_char_offset)\n                WHEN sub.audio_file_number IS NULL AND old.audio_file_number IS NULL THEN\n                    sub.starting_char_offset < old.starting_char_offset\n                WHEN sub.audio_file_number IS NULL AND old.audio_file_number IS NOT NULL THEN\n                    1\n                ELSE\n                    0\n            END\n        )\n    ) as chapter_index,\n    old.chapter_name,\n    old.char_count,\n    old.has_summary,\n    old.word_count,\n    old.starting_char_offset,\n    old.duration_seconds,\n    old.audio_file_number\nFROM reads_chapters_old old");
            db2.l("DROP TABLE reads_chapters_old");
        }
    };

    public static final b getMIGRATION_49_50() {
        return MIGRATION_49_50;
    }
}
