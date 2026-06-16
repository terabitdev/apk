package io.elevenlabs.data.database.entities.player;

import a2.t;
import ae.l;
import androidx.room.d;
import androidx.room.e;
import androidx.room.f;
import androidx.room.j0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import mb.a;
import mb.c;
import sn.z;
import us.g;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/data/database/entities/player/PersistentPlayerQueueDao_Impl;", "Lio/elevenlabs/data/database/entities/player/PersistentPlayerQueueDao;", "Landroidx/room/j0;", "__db", "<init>", "(Landroidx/room/j0;)V", "", "Lio/elevenlabs/data/database/entities/player/PersistentPlayerQueueEntity;", "entities", "Lsn/z;", "replaceAll", "(Ljava/util/List;Lwn/c;)Ljava/lang/Object;", "insertAll", "getAll", "(Lwn/c;)Ljava/lang/Object;", "deleteAll", "Landroidx/room/j0;", "Landroidx/room/f;", "__upsertAdapterOfPersistentPlayerQueueEntity", "Landroidx/room/f;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PersistentPlayerQueueDao_Impl implements PersistentPlayerQueueDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final j0 __db;
    private final f __upsertAdapterOfPersistentPlayerQueueEntity;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/player/PersistentPlayerQueueDao_Impl$1", "Landroidx/room/e;", "Lio/elevenlabs/data/database/entities/player/PersistentPlayerQueueEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/player/PersistentPlayerQueueEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.player.PersistentPlayerQueueDao_Impl$1 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends e {
        @Override // androidx.room.e
        public void bind(c statement, PersistentPlayerQueueEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getReadId());
            statement.c(2, entity.getPosition());
        }

        @Override // androidx.room.e
        public String createQuery() {
            return "INSERT INTO `persistent_player_queue` (`read_id`,`position`) VALUES (?,?)";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/player/PersistentPlayerQueueDao_Impl$2", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/player/PersistentPlayerQueueEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/player/PersistentPlayerQueueEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.player.PersistentPlayerQueueDao_Impl$2 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends d {
        @Override // androidx.room.d
        public void bind(c statement, PersistentPlayerQueueEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getReadId());
            statement.c(2, entity.getPosition());
            statement.s(3, entity.getReadId());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "UPDATE `persistent_player_queue` SET `read_id` = ?,`position` = ? WHERE `read_id` = ?";
        }
    }

    public PersistentPlayerQueueDao_Impl(j0 j0Var) {
        j0Var.getClass();
        this.__db = j0Var;
        this.__upsertAdapterOfPersistentPlayerQueueEntity = new f(new e() { // from class: io.elevenlabs.data.database.entities.player.PersistentPlayerQueueDao_Impl.1
            @Override // androidx.room.e
            public void bind(c statement, PersistentPlayerQueueEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getReadId());
                statement.c(2, entity.getPosition());
            }

            @Override // androidx.room.e
            public String createQuery() {
                return "INSERT INTO `persistent_player_queue` (`read_id`,`position`) VALUES (?,?)";
            }
        }, new d() { // from class: io.elevenlabs.data.database.entities.player.PersistentPlayerQueueDao_Impl.2
            @Override // androidx.room.d
            public void bind(c statement, PersistentPlayerQueueEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getReadId());
                statement.c(2, entity.getPosition());
                statement.s(3, entity.getReadId());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "UPDATE `persistent_player_queue` SET `read_id` = ?,`position` = ? WHERE `read_id` = ?";
            }
        });
    }

    public static /* synthetic */ z a(a aVar) {
        return deleteAll$lambda$0("DELETE from persistent_player_queue", aVar);
    }

    public static /* synthetic */ z b(PersistentPlayerQueueDao_Impl persistentPlayerQueueDao_Impl, List list, a aVar) {
        return insertAll$lambda$0(persistentPlayerQueueDao_Impl, list, aVar);
    }

    public static /* synthetic */ List c(a aVar) {
        return getAll$lambda$0("SELECT * from persistent_player_queue", aVar);
    }

    public static final z deleteAll$lambda$0(String str, a aVar) {
        aVar.getClass();
        c l02 = aVar.l0(str);
        try {
            l02.h0();
            l02.close();
            return z.f31622a;
        } catch (Throwable th) {
            l02.close();
            throw th;
        }
    }

    public static final List getAll$lambda$0(String str, a aVar) {
        aVar.getClass();
        c l02 = aVar.l0(str);
        try {
            int F = l.F(l02, "read_id");
            int F2 = l.F(l02, "position");
            ArrayList arrayList = new ArrayList();
            while (l02.h0()) {
                arrayList.add(new PersistentPlayerQueueEntity(l02.Y(F), (int) l02.getLong(F2)));
            }
            return arrayList;
        } finally {
            l02.close();
        }
    }

    public static final z insertAll$lambda$0(PersistentPlayerQueueDao_Impl persistentPlayerQueueDao_Impl, List list, a aVar) {
        aVar.getClass();
        persistentPlayerQueueDao_Impl.__upsertAdapterOfPersistentPlayerQueueEntity.c(aVar, list);
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.player.PersistentPlayerQueueDao
    public Object deleteAll(wn.c<? super z> cVar) {
        Object E = g.E(this.__db, false, true, new fm.d(14), cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.player.PersistentPlayerQueueDao
    public Object getAll(wn.c<? super List<PersistentPlayerQueueEntity>> cVar) {
        return g.E(this.__db, true, false, new fm.d(15), cVar);
    }

    @Override // io.elevenlabs.data.database.entities.player.PersistentPlayerQueueDao
    public Object insertAll(List<PersistentPlayerQueueEntity> list, wn.c<? super z> cVar) {
        Object E = g.E(this.__db, false, true, new t(this, list, 20), cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.player.PersistentPlayerQueueDao
    public Object replaceAll(List<PersistentPlayerQueueEntity> list, wn.c<? super z> cVar) {
        Object D = g.D(this.__db, new PersistentPlayerQueueDao_Impl$replaceAll$2(this, list, null), cVar);
        if (D == xn.a.f37986a) {
            return D;
        }
        return z.f31622a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/data/database/entities/player/PersistentPlayerQueueDao_Impl$Companion;", "", "<init>", "()V", "", "Loo/d;", "getRequiredConverters", "()Ljava/util/List;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final List<oo.d> getRequiredConverters() {
            return tn.t.f33547a;
        }

        private Companion() {
        }
    }
}
