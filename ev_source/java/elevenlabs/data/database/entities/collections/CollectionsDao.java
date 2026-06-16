package io.elevenlabs.data.database.entities.collections;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import ir.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import tr.b;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0001\u0018J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H'¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u000b\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H'¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000fH'¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H'¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/database/entities/collections/CollectionsDao;", "", "", "Lio/elevenlabs/data/database/entities/collections/CollectionEntity;", "collections", "Lsn/z;", "insertAll", "(Ljava/util/List;)V", "collection", "insert", "(Lio/elevenlabs/data/database/entities/collections/CollectionEntity;)V", "deleteAll", "delete", "", "id", "Lir/i;", "observeById", "(Ljava/lang/String;)Lir/i;", "getAll", "()Lir/i;", "Lio/elevenlabs/data/database/entities/collections/CollectionsDao$CollectionHasUnreadUpdate;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "updateHasUnread", "(Lio/elevenlabs/data/database/entities/collections/CollectionsDao$CollectionHasUnreadUpdate;)V", "CollectionHasUnreadUpdate", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface CollectionsDao {
    void delete(CollectionEntity collection);

    void deleteAll(List<CollectionEntity> collections);

    i getAll();

    void insert(CollectionEntity collection);

    void insertAll(List<CollectionEntity> collections);

    i observeById(String id2);

    void updateHasUnread(CollectionHasUnreadUpdate data);

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0019¨\u0006("}, d2 = {"Lio/elevenlabs/data/database/entities/collections/CollectionsDao$CollectionHasUnreadUpdate;", "", "", "id", "", "has_unread", "<init>", "(Ljava/lang/String;Z)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;ZLur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/database/entities/collections/CollectionsDao$CollectionHasUnreadUpdate;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lio/elevenlabs/data/database/entities/collections/CollectionsDao$CollectionHasUnreadUpdate;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Z", "getHas_unread", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public static final /* data */ class CollectionHasUnreadUpdate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean has_unread;
        private final String id;

        public /* synthetic */ CollectionHasUnreadUpdate(int i10, String str, boolean z6, c1 c1Var) {
            if (3 == (i10 & 3)) {
                this.id = str;
                this.has_unread = z6;
            } else {
                t0.j(i10, 3, CollectionsDao$CollectionHasUnreadUpdate$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ CollectionHasUnreadUpdate copy$default(CollectionHasUnreadUpdate collectionHasUnreadUpdate, String str, boolean z6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = collectionHasUnreadUpdate.id;
            }
            if ((i10 & 2) != 0) {
                z6 = collectionHasUnreadUpdate.has_unread;
            }
            return collectionHasUnreadUpdate.copy(str, z6);
        }

        public static final /* synthetic */ void write$Self$data_release(CollectionHasUnreadUpdate self, b output, SerialDescriptor serialDesc) {
            output.V(serialDesc, 0, self.id);
            output.T(serialDesc, 1, self.has_unread);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHas_unread() {
            return this.has_unread;
        }

        public final CollectionHasUnreadUpdate copy(String id2, boolean has_unread) {
            id2.getClass();
            return new CollectionHasUnreadUpdate(id2, has_unread);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CollectionHasUnreadUpdate)) {
                return false;
            }
            CollectionHasUnreadUpdate collectionHasUnreadUpdate = (CollectionHasUnreadUpdate) other;
            if (m.c(this.id, collectionHasUnreadUpdate.id) && this.has_unread == collectionHasUnreadUpdate.has_unread) {
                return true;
            }
            return false;
        }

        public final boolean getHas_unread() {
            return this.has_unread;
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return Boolean.hashCode(this.has_unread) + (this.id.hashCode() * 31);
        }

        public String toString() {
            return "CollectionHasUnreadUpdate(id=" + this.id + ", has_unread=" + this.has_unread + Separators.RPAREN;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/database/entities/collections/CollectionsDao$CollectionHasUnreadUpdate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/database/entities/collections/CollectionsDao$CollectionHasUnreadUpdate;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final KSerializer serializer() {
                return CollectionsDao$CollectionHasUnreadUpdate$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public CollectionHasUnreadUpdate(String str, boolean z6) {
            str.getClass();
            this.id = str;
            this.has_unread = z6;
        }
    }
}
