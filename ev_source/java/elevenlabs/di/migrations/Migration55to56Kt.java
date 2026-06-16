package io.elevenlabs.di.migrations;

import gb.b;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import nb.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0001\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lgb/b;", "MIGRATION_55_56", "Lgb/b;", "getMIGRATION_55_56", "()Lgb/b;", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class Migration55to56Kt {
    private static final b MIGRATION_55_56 = new b() { // from class: io.elevenlabs.di.migrations.Migration55to56Kt$MIGRATION_55_56$1
        @Override // gb.b
        public void migrate(a db2) {
            db2.getClass();
            db2.l("ALTER TABLE `offline_read` ADD COLUMN `drm_key_set_ids` TEXT DEFAULT NULL");
        }
    };

    public static final b getMIGRATION_55_56() {
        return MIGRATION_55_56;
    }
}
