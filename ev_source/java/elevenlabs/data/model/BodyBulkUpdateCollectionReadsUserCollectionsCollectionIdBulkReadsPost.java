package io.elevenlabs.data.model;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.h;
import sn.i;
import tr.b;
import ur.c1;
import ur.d;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J0\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0017¨\u0006+"}, d2 = {"Lio/elevenlabs/data/model/BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost;", "", "", "", "readsToAdd", "readsToRemove", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lio/elevenlabs/data/model/BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getReadsToAdd", "getReadsToAdd$annotations", "()V", "getReadsToRemove", "getReadsToRemove$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost {
    private static final h[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<String> readsToAdd;
    private final List<String> readsToRemove;

    static {
        io.elevenlabs.data.database.entities.reads.a aVar = new io.elevenlabs.data.database.entities.reads.a(6);
        i iVar = i.f31597b;
        $childSerializers = new h[]{sn.a.d(iVar, aVar), sn.a.d(iVar, new io.elevenlabs.data.database.entities.reads.a(7))};
    }

    public /* synthetic */ BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost(int i10, List list, List list2, c1 c1Var) {
        if (3 == (i10 & 3)) {
            this.readsToAdd = list;
            this.readsToRemove = list2;
        } else {
            t0.j(i10, 3, BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(g1.f34588a, 0);
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(g1.f34588a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost copy$default(BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost bodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = bodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost.readsToAdd;
        }
        if ((i10 & 2) != 0) {
            list2 = bodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost.readsToRemove;
        }
        return bodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost.copy(list, list2);
    }

    public static final /* synthetic */ void write$Self$data_release(BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost self, b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.g(serialDesc, 0, (KSerializer) hVarArr[0].getValue(), self.readsToAdd);
        output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.readsToRemove);
    }

    public final List<String> component1() {
        return this.readsToAdd;
    }

    public final List<String> component2() {
        return this.readsToRemove;
    }

    public final BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost copy(List<String> readsToAdd, List<String> readsToRemove) {
        readsToAdd.getClass();
        readsToRemove.getClass();
        return new BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost(readsToAdd, readsToRemove);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost)) {
            return false;
        }
        BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost bodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost = (BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost) other;
        if (m.c(this.readsToAdd, bodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost.readsToAdd) && m.c(this.readsToRemove, bodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost.readsToRemove)) {
            return true;
        }
        return false;
    }

    public final List<String> getReadsToAdd() {
        return this.readsToAdd;
    }

    public final List<String> getReadsToRemove() {
        return this.readsToRemove;
    }

    public int hashCode() {
        return this.readsToRemove.hashCode() + (this.readsToAdd.hashCode() * 31);
    }

    public String toString() {
        return "BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost(readsToAdd=" + this.readsToAdd + ", readsToRemove=" + this.readsToRemove + Separators.RPAREN;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getReadsToAdd$annotations() {
    }

    public static /* synthetic */ void getReadsToRemove$annotations() {
    }

    public BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost(List<String> list, List<String> list2) {
        list.getClass();
        list2.getClass();
        this.readsToAdd = list;
        this.readsToRemove = list2;
    }
}
